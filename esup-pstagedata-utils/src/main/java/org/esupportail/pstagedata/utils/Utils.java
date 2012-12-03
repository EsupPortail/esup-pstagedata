package org.esupportail.pstagedata.utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;

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
	public static String REGEX_CODE_NAF = "^([0-9]{2}\\.?[0-9]{2}[a-zA-Z]{1})$";
	
	/**
	 * Regex d'une adresse mail
	 */
	public static String REGEX_MAIL = "^(\\w([-]?[.]?[\\w]*\\w)*@(\\w[-\\w]*\\w\\.)+[a-zA-Z]{2,9})$";
	
	/**
	 * Regex d'un site internet
	 */
	public static String REGEX_SITE_WEB = "^([h]{1}[t]{1}[t]{1}[p]{1}[s]?[:]{1}[/]{2}(\\w([\\w\\-]{0,61}\\w)?\\.)+[a-zA-Z]{2,6}([/]{1}.*)?)$";

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
	public static String TIMESTAMP_PATTERN = "dd/MM/yyyy hh:mm:ss";	
	/**
	 * 
	 */
	public static String TIMESTAMP_PATTERN_SQL = "yyyy-MM-dd hh:mm:ss";	
	/**
	 * 
	 */
	public static String DATE_PATTERN = "dd/MM/yyyy";
	/**
	 * 
	 */
	public static String DATE_PATTERN_SQL = "yyyy-MM-dd";
	/**
	 * 
	 */
	public static String MONTH_PATTERN = "MM";
	/**
	 * 
	 */
	public static String DAY_PATTERN = "dd";
	/**
	 * 
	 */
	public static String DATE_YEAR2000= "2000-01-01";	
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
		if (month >= Calendar.JULY && month <= Calendar.DECEMBER) {
			year += 1;
		}
		if (period) {
			return String.valueOf(year) + " - " + String.valueOf(year + 1);
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
		}
		catch (RuntimeException e) {
			e.printStackTrace();
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
	 * Retourne vrai si le numéro siret est valide
	 * @param numSiret
	 * @return boolean
	 */
	public static boolean validateNumSiret(String numSiret){
		if(numSiret.length()!=14 || !isNumber(numSiret)) return false;
		
		int total = 0;
		int nb = 0;		
		for (int i = 0; i<numSiret.length(); i++) {
			/** Recherche les positions impaires : 1er, 3e, 5e, etc... que l'on multiplie par 2*/
			if ((i % 2) == 0) {
				nb = convertStringToInt(String.valueOf(numSiret.charAt(i))) * 2;
			/** si le r�sultat est >9 alors il est compos� de deux chiffres et ne pouvant �tre >19 le calcule devient : 1 + (nb -10) ou : nb - 9 */
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
	 * Retourne vrai si le numéro siren est valide
	 * @param numSiren
	 * @return boolean
	 */
	public static boolean validateNumSiren(String numSiren){
		if(numSiren.length()!=9 || !isNumber(numSiren)) return false;
		
		int total = 0;
		int nb = 0;		
		for (int i = 0; i<numSiren.length(); i++) {
			/** Recherche les positions impaires : 1er, 3e, 5e, etc... que l'on multiplie par 2*/
			if ((i % 2) != 0) {
				nb = convertStringToInt(String.valueOf(numSiren.charAt(i))) * 2;
			/** si le r�sultat est >9 alors il est compos� de deux chiffres et ne pouvant �tre >19 le calcule devient : 1 + (nb -10) ou : nb - 9 */
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
				int cleSaisie = Integer.valueOf(numSS.substring(13));
				
				
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
	 * Retourne vrai si la chaine en param�tre est un nombre
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
	 * Converti une chaine de caract�re String en entier Int
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
	
	/** Index du 1er caractere accentu� **/
    private static final int MIN = 192;
    /** Index du dernier caractere accentu� **/
    private static final int MAX = 255;
    /** Vecteur de correspondance entre accent / sans accent **/
    private static final Vector<String> map = initMap();
    
    /** Initialisation du tableau de correspondance entre les caract�res accentu�s et leur homologues non accentu�s 
     * @return result
     **/
    private static Vector<String> initMap(){  
    	Vector<String> Result         = new Vector<String>();
    	String car  = null;
    	car = new java.lang.String("A");
    	Result.add( car );            /* '\u00C0'   �   alt-0192  */  
    	Result.add( car );            /* '\u00C1'   �   alt-0193  */
    	Result.add( car );            /* '\u00C2'   �   alt-0194  */
    	Result.add( car );            /* '\u00C3'   �   alt-0195  */
    	Result.add( car );            /* '\u00C4'   �   alt-0196  */
    	Result.add( car );            /* '\u00C5'   �   alt-0197  */
    	car = new java.lang.String("AE");
    	Result.add( car );            /* '\u00C6'   �   alt-0198  */
    	car = new java.lang.String("C");
    	Result.add( car );            /* '\u00C7'   �   alt-0199  */
    	car = new java.lang.String("E");
    	Result.add( car );            /* '\u00C8'   �   alt-0200  */
    	Result.add( car );            /* '\u00C9'   �   alt-0201  */
    	Result.add( car );            /* '\u00CA'   �   alt-0202  */
    	Result.add( car );            /* '\u00CB'   �   alt-0203  */
    	car = new java.lang.String("I");
    	Result.add( car );            /* '\u00CC'   �   alt-0204  */
    	Result.add( car );            /* '\u00CD'   �   alt-0205  */
    	Result.add( car );            /* '\u00CE'   �   alt-0206  */
    	Result.add( car );            /* '\u00CF'   �   alt-0207  */
    	car = new java.lang.String("D");
    	Result.add( car );            /* '\u00D0'   �   alt-0208  */
    	car = new java.lang.String("N");
    	Result.add( car );            /* '\u00D1'   �   alt-0209  */
    	car = new java.lang.String("O");
    	Result.add( car );            /* '\u00D2'   �   alt-0210  */
    	Result.add( car );            /* '\u00D3'   �   alt-0211  */
    	Result.add( car );            /* '\u00D4'   �   alt-0212  */
    	Result.add( car );            /* '\u00D5'   �   alt-0213  */
    	Result.add( car );            /* '\u00D6'   �   alt-0214  */
    	car = new java.lang.String("*");
    	Result.add( car );            /* '\u00D7'   �   alt-0215  */
    	car = new java.lang.String("0");
    	Result.add( car );            /* '\u00D8'   �   alt-0216  */
    	car = new java.lang.String("U");
    	Result.add( car );            /* '\u00D9'   �   alt-0217  */
    	Result.add( car );            /* '\u00DA'   �   alt-0218  */
    	Result.add( car );            /* '\u00DB'   �   alt-0219  */
    	Result.add( car );            /* '\u00DC'   �   alt-0220  */
    	car = new java.lang.String("Y");
    	Result.add( car );            /* '\u00DD'   �   alt-0221  */
    	car = new java.lang.String("�");
    	Result.add( car );            /* '\u00DE'   �   alt-0222  */
    	car = new java.lang.String("B");
    	Result.add( car );            /* '\u00DF'   �   alt-0223  */
    	car = new java.lang.String("a");
    	Result.add( car );            /* '\u00E0'   �   alt-0224  */
    	Result.add( car );            /* '\u00E1'   �   alt-0225  */
    	Result.add( car );            /* '\u00E2'   �   alt-0226  */
    	Result.add( car );            /* '\u00E3'   �   alt-0227  */
    	Result.add( car );            /* '\u00E4'   �   alt-0228  */
    	Result.add( car );            /* '\u00E5'   �   alt-0229  */
    	car = new java.lang.String("ae");
    	Result.add( car );            /* '\u00E6'   �   alt-0230  */
    	car = new java.lang.String("c");
    	Result.add( car );            /* '\u00E7'   �   alt-0231  */
    	car = new java.lang.String("e");
    	Result.add( car );            /* '\u00E8'   �   alt-0232  */
    	Result.add( car );            /* '\u00E9'   �   alt-0233  */
    	Result.add( car );            /* '\u00EA'   �   alt-0234  */
    	Result.add( car );            /* '\u00EB'   �   alt-0235  */
    	car = new java.lang.String("i");
    	Result.add( car );            /* '\u00EC'   �   alt-0236  */
    	Result.add( car );            /* '\u00ED'   �   alt-0237  */
    	Result.add( car );            /* '\u00EE'   �   alt-0238  */
    	Result.add( car );            /* '\u00EF'   �   alt-0239  */
    	car = new java.lang.String("d");
    	Result.add( car );            /* '\u00F0'   �   alt-0240  */
    	car = new java.lang.String("n");
    	Result.add( car );            /* '\u00F1'   �   alt-0241  */
    	car = new java.lang.String("o");
    	Result.add( car );            /* '\u00F2'   �   alt-0242  */
    	Result.add( car );            /* '\u00F3'   �   alt-0243  */
    	Result.add( car );            /* '\u00F4'   �   alt-0244  */
    	Result.add( car );            /* '\u00F5'   �   alt-0245  */
    	Result.add( car );            /* '\u00F6'   �   alt-0246  */
    	car = new java.lang.String("/");
    	Result.add( car );            /* '\u00F7'   �   alt-0247  */
    	car = new java.lang.String("0");
    	Result.add( car );            /* '\u00F8'   �   alt-0248  */
    	car = new java.lang.String("u");
    	Result.add( car );            /* '\u00F9'   �   alt-0249  */
    	Result.add( car );            /* '\u00FA'   �   alt-0250  */
    	Result.add( car );            /* '\u00FB'   �   alt-0251  */
    	Result.add( car );            /* '\u00FC'   �   alt-0252  */
    	car = new java.lang.String("y");
    	Result.add( car );            /* '\u00FD'   �   alt-0253  */
    	car = new java.lang.String("�");
    	Result.add( car );            /* '\u00FE'   �   alt-0254  */
    	car = new java.lang.String("y");
    	Result.add( car );            /* '\u00FF'   �   alt-0255  */
    	Result.add( car );            /* '\u00FF'       alt-0255  */
    	return Result;
    }
	
	/** Transforme une chaine pouvant contenir des accents dans une version sans accent 
     *  @param chaine Chaine a convertir sans accent
     *  @return chaine sans accent
     **/
    public static String sansAccent(String chaine){  
    	if(!StringUtils.hasText(chaine)) return null;
    	StringBuffer Result  = new StringBuffer(chaine);
    	for(int bcl = 0 ; bcl < Result.length() ; bcl++){  
    		int carVal = chaine.charAt(bcl);
    		if( carVal >= MIN && carVal <= MAX ){ 
    			// Remplacement
    			String newVal = map.get( carVal - MIN );
    			Result.replace(bcl, bcl+1,newVal);
    		}   
    	}
    	return Result.toString();       
    }

    /**
     * @param chaine
     * @return chaine sans accent en majuscules
     */
    public static String sansAccentEnMAJ(String chaine){
    	if(!StringUtils.hasText(chaine)) return null;
    	return sansAccent(chaine).toUpperCase();
    }
    
    /**
     * @param chaine
     * @return chaine avec la premi�re lettre en majuscules
     */
    public static String premiereLettreMAJ(String chaine){
    	if(!StringUtils.hasText(chaine)) return null;
    	String s = chaine.toLowerCase();
    	String preL = s.charAt(0)+"";
    	StringBuffer sb  = new StringBuffer(s);
    	sb.replace(0, 1, preL.toUpperCase());
    	return sb.toString();
    }    

	/* ***************************************************************
	 * MD5
	 ****************************************************************/   

	/**
     * Encode une chaine avec l'algo MD5    
     * @param chaine
     * @return chaine crypt�e md5
     */
    public static String encodeMD5(String chaine) {
		byte[] uniqueKey = chaine.getBytes();
		byte[] hash = null;
		try {
			hash = MessageDigest.getInstance("MD5").digest(uniqueKey);
		}catch (NoSuchAlgorithmException e) {
			throw new Error("no MD5 support in this VM");
		}
		StringBuffer hashString = new StringBuffer();
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
	 * G�n�ration d'un login
	 * @param sn
	 * @param num
	 * @return un login g�n�r� � partir de sn et num (ex. : login0023)
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
		if(num != null && num != "" && isNumber(num)){
			String n="000"+num;
			login = login + ((n.length()>4) ? n.substring(n.length()-4, n.length()): n); 
		}
		return login;
	}
	
	/**
	 * @param src
	 * @return la chaine src sans caract�res sp�ciaux ni accents
	 */
	public static String sansCaractSpe(String src){
		StringBuffer result = new StringBuffer();
		if(src!=null && src.length()!=0){
			char c = (char)0;
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
