package org.esupportail.pstagedata.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;

import org.springframework.util.StringUtils;

/**
 * Utils Class.
 *
 */
public class Utils {
	/* ***************************************************************
	 * REGEX
	 ****************************************************************/

	/**
	 * Regex du code naf
	 */
	public static final String REGEX_CODE_NAF = "^([0-9]{2}\\.?[0-9]{2}[a-zA-Z]{1})$";

	/**
	 * Regex d'une adresse mail
	 */
	public static final String REGEX_MAIL = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$";

	/**
	 * Regex d'un site internet
	 */
	public static final String REGEX_SITE_WEB = "^([h]{1}[t]{1}[t]{1}[p]{1}[s]?[:]{1}[/]{2}(\\w([\\w\\-]{0,61}\\w)?\\.)+[a-zA-Z]{2,6}([/]{1}.*)?)$";

	/**
	 * Regex d'un code postal français
	 */
	public static final String REGEX_CODE_POSTAL = "^((0[1-9]|[1-9][0-9])[0-9]{3})$";

	/**
	 * expression reguliere pour la validation d'un numero INSEE
	 */
	public static final String REGEX_INSEE="[0-9]{6}[0-9AB][0-9]{8}$";
	
	/* ***************************************************************
	 * DATE
	 ****************************************************************/

	/**
	 *
	 */
	public static final String TIMESTAMP_PATTERN = "dd/MM/yyyy hh:mm:ss";
	/**
	 *
	 */
	public static final String TIMESTAMP_PATTERN_SQL = "yyyy-MM-dd hh:mm:ss";
	/**
	 *
	 */
	public static final String DATE_PATTERN = "dd/MM/yyyy";
	/**
	 *
	 */
	public static final String DATE_PATTERN_SQL = "yyyy-MM-dd";
	/**
	 *
	 */
	public static final String MONTH_PATTERN = "MM";
	/**
	 *
	 */
	public static final String DAY_PATTERN = "dd";
	/**
	 *
	 */
	public static final String YEAR_PATTERN = "yyyy";
	/**
	 *
	 */
	public static final String DATE_YEAR2000= "2000-01-01";
	/**
	 * The current year for university is :
	 * July to December = year = n + 1.
	 * January to June = year = n.
	 * @param period id true return current year - current year + 1 (Ex.: 2009 - 2010)
	 * @return String
	 */
	public static String getCurrentYear(final Boolean period) {
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		if (month <= Calendar.JULY) {
			year -= 1;
		}
		if (period) {
			return String.valueOf(year) + "/" + String.valueOf(year + 1);
		}
		return String.valueOf(year);
	}

	/**
	 * convert the type date to string.
	 * @param d
	 * @param format
	 * @return String
	 */
	public static String convertDateToString(final Date d, final String format) {
		SimpleDateFormat s = new SimpleDateFormat(format);
		return s.format(d);
	}

	/**
	 * @param strDate
	 * @param format
	 * @return Date
	 */
	public static Date convertStringToDate(final String strDate, final String format) {
		Date date = null;

		try {
			SimpleDateFormat formatter = new SimpleDateFormat(format);
			ParsePosition pos = new ParsePosition(0);
			date = formatter.parse(strDate, pos);
		} catch (RuntimeException e) {
			throw e;
		}

		return date;
	}

	/**
	 * @param str
	 * @return Timestamp
	 * @throws ParseException
	 */
	public static Timestamp parseTimestamp(final String str) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(TIMESTAMP_PATTERN);
		return new Timestamp(sdf.parse(str).getTime());
	}

	/**
	 * @param str
	 * @return Timestamp
	 * @throws ParseException
	 */
	public static Timestamp parseTimestampSql(final String str) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(TIMESTAMP_PATTERN_SQL);
		return new Timestamp(sdf.parse(str).getTime());
	}

	/**
	 * @param calendar
	 * @return String
	 */
	public static String getMonth(final Calendar calendar) {
		SimpleDateFormat sdf = new SimpleDateFormat(MONTH_PATTERN);
		return sdf.format(calendar.getTime());
	}

	/**
	 * @param calendar
	 * @return String
	 */
	public static String getDay(final Calendar calendar) {
		SimpleDateFormat sdf = new SimpleDateFormat(DAY_PATTERN);
		return sdf.format(calendar.getTime());
	}

	/**
	 * @param calendar
	 * @return String
	 */
	public static String getYear(final Calendar calendar) {
		SimpleDateFormat sdf = new SimpleDateFormat(YEAR_PATTERN);
		return sdf.format(calendar.getTime());
	}

	/**
	 * Renvoie la date du jour au format java.sql.Date
	 * @return GregorianCalendar
	 */
	public static GregorianCalendar getToday() {
		GregorianCalendar result = new GregorianCalendar();
		result.setFirstDayOfWeek(Calendar.MONDAY);
		return result;
	}

	/* ***************************************************************
	 * CONTROLES
	 ****************************************************************/

	/**
	 * Retourne vrai si le numero siret est valide
	 * @param numSiret
	 * @return boolean
	 */
	public static boolean validateNumSiret(String numSiret){
		if(numSiret.length()!=14 || !isNumber(numSiret)) return false;

		int total = 0;
		int nb;

		/** Cas de la Poste, nouvel algo en 2012 car plus de 10000 établissement, nombre limite de l'algo de Luhn **/
		if ("356000000".equals(numSiret.substring(0, 9))) {
			for (int i = 0; i<numSiret.length(); i++) {
				/** somme simple des chiffres du SIRET */
				nb = convertStringToInt(String.valueOf(numSiret.charAt(i)));
				total += nb;
			}
			boolean ret=true;
			if(isNumber(numSiret) && Long.parseLong(numSiret)==0)ret=false;
			/** Si la somme est un multiple de 5 alors le SIRET de la Poste est valide */
			if (total % 5 == 0 || ret==false) {
			  	return ret;
			} else {  	// doit passer par la verification du cas classique (ex de siret concerné: 35600000000048)
			   	total = 0;
				nb = 0;
			}
		}
		/** Cas classique **/
		for (int i = 0; i<numSiret.length(); i++) {
			/** Recherche les positions impaires : 1er, 3e, 5e, etc... que l'on multiplie par 2*/
			if ((i % 2) == 0) {
				nb = convertStringToInt(String.valueOf(numSiret.charAt(i))) * 2;
				/** si le résultat est >9 alors il est composé de deux chiffres et ne pouvant être >19 le calcule devient : 1 + (nb -10) ou : nb - 9 */
				if (nb > 9) nb -= 9;
			}else{
				nb = convertStringToInt(String.valueOf(numSiret.charAt(i)));
			}
			total += nb;
		}
		boolean ret=true;
		if(isNumber(numSiret) && Long.parseLong(numSiret)==0)ret=false;
		/** Si la somme est un multiple de 10 alors le SIRET est valide */
		return (total % 10 == 0) ? ret : false;
	}

	/**
	 * Retourne vrai si le numero siren est valide
	 * @param numSiren
	 * @return boolean
	 */
	public static boolean validateNumSiren(String numSiren){
		if(numSiren.length()!=9 || !isNumber(numSiren)) return false;

		int total = 0;
		int nb;
		for (int i = 0; i<numSiren.length(); i++) {
			/** Recherche les positions impaires : 1er, 3e, 5e, etc... que l'on multiplie par 2*/
			if ((i % 2) != 0) {
				nb = convertStringToInt(String.valueOf(numSiren.charAt(i))) * 2;
				/** si le resultat est >9 alors il est compose de deux chiffres et ne pouvant etre >19 le calcule devient : 1 + (nb -10) ou : nb - 9 */
				if (nb > 9) nb -= 9;
			}else{
				nb = convertStringToInt(String.valueOf(numSiren.charAt(i)));
			}
			total += nb;
		}
		boolean ret=true;
		if(isNumber(numSiren) && Long.parseLong(numSiren)==0)ret=false;
		/** Si la somme est un multiple de 10 alors le SIRET est valide */
		return (total % 10 == 0) ? ret : false;
	}


	/**
	 * @param numSS
	 * @return boolean inseeOK
	 */
	public static boolean validateInsee(String numSS){
		boolean inseeOK = true;
		if (StringUtils.hasText(numSS)) {
			if (!numSS.matches(Utils.REGEX_INSEE)) {
				inseeOK = false;
			}else {
				//on regarde si la cle est correcte
				String nirSansCle = numSS.substring(0, 13);
				int cleSaisie = Integer.parseInt(numSS.substring(13));


				long nirAjuste ;

				if (nirSansCle.contains("A")){
					nirSansCle=nirSansCle.replace("A", "0");

					nirAjuste=Long.parseLong(nirSansCle)-1000000;
				}
				else{
					if (nirSansCle.contains("B")){
						nirSansCle=nirSansCle.replace("B", "0");
						nirAjuste=Long.parseLong(nirSansCle)-2000000;
					}
					else{
						nirAjuste=Long.parseLong(nirSansCle);
					}
				}
				int cleCalculee=97-((int)(nirAjuste % 97));

				if (cleCalculee!=cleSaisie){
					inseeOK = false;
				}
			}
		}
		return inseeOK;
	}

	/* ***************************************************************
	 * STRING
	 ****************************************************************/

	/**
	 * Retourne vrai si la chaine en parametre est un nombre
	 * @param nb
	 * @return boolean
	 */
	public static boolean isNumber(String nb){
		try{
			Long.parseLong(nb);
			return true;
		}catch(NumberFormatException nfe){
			return false;
		}
	}

	/**
	 * Converti une chaine de caractere String en entier Int
	 * dans la mesure du possible
	 * @param s
	 * @return int
	 */
	public static int convertStringToInt(String s){
		int r = 0;
		try{
			r = Integer.parseInt(s);
		}catch (NumberFormatException e) {
			//nothing
		}
		return r;
	}

	/** Index du 1er caractere accentue **/
	private static final int MIN = 192;
	/** Index du dernier caractere accentue **/
	private static final int MAX = 255;
	/** Vecteur de correspondance entre accent / sans accent **/
	private static final ArrayList<String> map = initMap();

	/** Initialisation du tableau de correspondance entre les caracteres accentues et leur homologues non accentues
	 * @return result
	 **/
	private static ArrayList<String> initMap(){
		ArrayList<String> Result = new ArrayList<String>();
		String car = "A";
		Result.add(car);            /* '\u00C0'   e   alt-0192  */
		Result.add(car);            /* '\u00C1'   e   alt-0193  */
		Result.add(car);            /* '\u00C2'   e   alt-0194  */
		Result.add(car);            /* '\u00C3'   e   alt-0195  */
		Result.add(car);            /* '\u00C4'   e   alt-0196  */
		Result.add(car);            /* '\u00C5'   e   alt-0197  */
		car = "AE";
		Result.add(car);            /* '\u00C6'   e   alt-0198  */
		car = "C";
		Result.add(car);            /* '\u00C7'   e   alt-0199  */
		car = "E";
		Result.add(car);            /* '\u00C8'   e   alt-0200  */
		Result.add(car);            /* '\u00C9'   e   alt-0201  */
		Result.add(car);            /* '\u00CA'   e   alt-0202  */
		Result.add(car);            /* '\u00CB'   e   alt-0203  */
		car = "I";
		Result.add(car);            /* '\u00CC'   e   alt-0204  */
		Result.add(car);            /* '\u00CD'   e   alt-0205  */
		Result.add(car);            /* '\u00CE'   e   alt-0206  */
		Result.add(car);            /* '\u00CF'   e   alt-0207  */
		car = "D";
		Result.add(car);            /* '\u00D0'   e   alt-0208  */
		car = "N";
		Result.add(car);            /* '\u00D1'   e   alt-0209  */
		car = "O";
		Result.add(car);            /* '\u00D2'   e   alt-0210  */
		Result.add(car);            /* '\u00D3'   e   alt-0211  */
		Result.add(car);            /* '\u00D4'   e   alt-0212  */
		Result.add(car);            /* '\u00D5'   e   alt-0213  */
		Result.add(car);            /* '\u00D6'   e   alt-0214  */
		car = "*";
		Result.add(car);            /* '\u00D7'   e   alt-0215  */
		car = "0";
		Result.add(car);            /* '\u00D8'   e   alt-0216  */
		car = "U";
		Result.add(car);            /* '\u00D9'   e   alt-0217  */
		Result.add(car);            /* '\u00DA'   e   alt-0218  */
		Result.add(car);            /* '\u00DB'   e   alt-0219  */
		Result.add(car);            /* '\u00DC'   e   alt-0220  */
		car = "Y";
		Result.add(car);            /* '\u00DD'   e   alt-0221  */
		car = "e";
		Result.add(car);            /* '\u00DE'   e   alt-0222  */
		car = "B";
		Result.add(car);            /* '\u00DF'   e   alt-0223  */
		car = "a";
		Result.add(car);            /* '\u00E0'   e   alt-0224  */
		Result.add(car);            /* '\u00E1'   e   alt-0225  */
		Result.add(car);            /* '\u00E2'   e   alt-0226  */
		Result.add(car);            /* '\u00E3'   e   alt-0227  */
		Result.add(car);            /* '\u00E4'   e   alt-0228  */
		Result.add(car);            /* '\u00E5'   e   alt-0229  */
		car = "ae";
		Result.add(car);            /* '\u00E6'   e   alt-0230  */
		car = "c";
		Result.add(car);            /* '\u00E7'   e   alt-0231  */
		car = "e";
		Result.add(car);            /* '\u00E8'   e   alt-0232  */
		Result.add(car);            /* '\u00E9'   e   alt-0233  */
		Result.add(car);            /* '\u00EA'   e   alt-0234  */
		Result.add(car);            /* '\u00EB'   e   alt-0235  */
		car = "i";
		Result.add(car);            /* '\u00EC'   e   alt-0236  */
		Result.add(car);            /* '\u00ED'   e   alt-0237  */
		Result.add(car);            /* '\u00EE'   e   alt-0238  */
		Result.add(car);            /* '\u00EF'   e   alt-0239  */
		car = "d";
		Result.add(car);            /* '\u00F0'   e   alt-0240  */
		car = "n";
		Result.add(car);            /* '\u00F1'   e   alt-0241  */
		car = "o";
		Result.add(car);            /* '\u00F2'   e   alt-0242  */
		Result.add(car);            /* '\u00F3'   e   alt-0243  */
		Result.add(car);            /* '\u00F4'   e   alt-0244  */
		Result.add(car);            /* '\u00F5'   e   alt-0245  */
		Result.add(car);            /* '\u00F6'   e   alt-0246  */
		car = "/";
		Result.add(car);            /* '\u00F7'   e   alt-0247  */
		car = "0";
		Result.add(car);            /* '\u00F8'   e   alt-0248  */
		car = "u";
		Result.add(car);            /* '\u00F9'   e   alt-0249  */
		Result.add(car);            /* '\u00FA'   e   alt-0250  */
		Result.add(car);            /* '\u00FB'   e   alt-0251  */
		Result.add(car);            /* '\u00FC'   e   alt-0252  */
		car = "y";
		Result.add(car);            /* '\u00FD'   e   alt-0253  */
		car = "e";
		Result.add(car);            /* '\u00FE'   e   alt-0254  */
		car = "y";
		Result.add(car);            /* '\u00FF'   e   alt-0255  */
		Result.add(car);            /* '\u00FF'       alt-0255  */
		return Result;
	}

	/** Transforme une chaine pouvant contenir des accents dans une version sans accent 
	 *  @param chaine Chaine a convertir sans accent
	 *  @return chaine sans accent
	 **/
	public static String sansAccent(String chaine){
		if(!StringUtils.hasText(chaine)) return null;
		StringBuilder result = new StringBuilder(chaine);
		for(int bcl = 0 ; bcl < result.length() ; bcl++){
			int carVal = chaine.charAt(bcl);
			if( carVal >= MIN && carVal <= MAX ){
				// Remplacement
				String newVal = map.get( carVal - MIN );
				result.replace(bcl, bcl+1,newVal);
			}
		}
		return result.toString();
	}

	/**
	 * @param chaine
	 * @return chaine sans accent en majuscules
	 */
	public static String sansAccentEnMAJ(String chaine){
		String retour = null;
		if(StringUtils.hasText(chaine)){
			retour = sansAccent(chaine);
			if (retour != null){
				retour = retour.toUpperCase();
			}
		}
		return retour;
	}

	/**
	 * @param chaine
	 * @return chaine avec la premiere lettre en majuscules
	 */
	public static String premiereLettreMAJ(String chaine){
		if(!StringUtils.hasText(chaine)){
			return null;
		}
		String s = chaine.toLowerCase();
		String preL = Character.toString(s.charAt(0));
		StringBuilder sb  = new StringBuilder(s);
		sb.replace(0, 1, preL.toUpperCase());
		return sb.toString();
	}

	/* ***************************************************************
	 * MD5
	 ****************************************************************/

	/**
	 * Encode une chaine avec l'algo MD5
	 * @param chaine
	 * @return chaine cryptee md5
	 */
	public static String encodeMD5(String chaine) throws NoSuchAlgorithmException {
		byte[] uniqueKey = chaine.getBytes();
		byte[] hash;
		try {
			hash = MessageDigest.getInstance("MD5").digest(uniqueKey);
		}catch (NoSuchAlgorithmException e) {
			throw e;
		}
		StringBuilder hashString = new StringBuilder();
		for (int i = 0; i < hash.length; ++i) {
			String hex = Integer.toHexString(hash[i]);
			if (hex.length() == 1) {
				hashString.append('0');
				hashString.append(hex.charAt(hex.length() - 1));
			}else{
				hashString.append(hex.substring(hex.length() - 2));
			}
		}
		return hashString.toString();
	}

	/**
	 * Generation d'un login
	 * @param sn
	 * @param num
	 * @return un login genere e partir de sn et num (ex. : login0023)
	 */
	public static String loginGeneration(String sn,String num){
		String tmp = sn;
		String tmpTab[]= new String[2];
		String login = "";
		String[] result = tmp.split("\\s");
		int j=0;
		for (int i=0; i<result.length && i<2; i++){
			if(result[i].length()>1){
				tmpTab[j] = result[i];
			}
			j++;
		}
		if(tmpTab[0] != null && tmpTab[0]!=""){
			if(tmpTab[1]!=null && tmpTab[1]!=""){
				login = login + ((tmpTab[0].length()>3) ? tmpTab[0].substring(0, 3) : tmpTab[0]);
				login = login + ((tmpTab[1].length()>3) ? tmpTab[1].substring(0, 3) : tmpTab[1]);
			}else{
				login = login + ((tmpTab[0].length()>6) ? tmpTab[0].substring(0, 6) : tmpTab[0]);
			}
		}
		login=sansAccent(login);
		login=sansCaractSpe(login);
		login=login.toLowerCase();
		login=login.toLowerCase();
		if(num != null && !"".equals(num) && isNumber(num)){
			String n="000"+num;
			login = login + ((n.length()>4) ? n.substring(n.length()-4, n.length()): n);
		}
		return login;
	}

	/**
	 * @param src
	 * @return la chaine src sans caracteres speciaux ni accents
	 */
	public static String sansCaractSpe(String src){
		StringBuilder result = new StringBuilder();
		if(src!=null && src.length()!=0){
			char c;
			String chars= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
			String replace= "";
			for(int i=0; i<src.length(); i++){
				c = src.charAt(i);
				if( (chars.indexOf(c))==-1 )
					result.append(replace);
				else
					result.append(c);
			}
		}
		return result.toString();
	}

}
