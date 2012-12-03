package org.esupportail.pstagedata.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.esupportail.pstagedata.dao.AbstractIBatisDaoService;
import org.esupportail.pstagedata.domain.beans.Critere;
import org.esupportail.pstagedata.domain.beans.Niveau;

public class CritereDaoServiceImpl extends AbstractIBatisDaoService implements CritereDaoService {

	private Logger logger = Logger.getLogger(CritereDaoServiceImpl.class);
	
	@Override
	public List<Critere> getCriteres() {
		
		 List<Critere> list = (List<Critere>)getSqlMapClientTemplate().queryForList("getCriteres");
		
		 return list;
	}

	@Override
	public List<Critere> getFirstLevelStatCriteriaForConvention() {
		// TODO  a faire
		return null;
	}

	@Override
	public List<Critere> getCriteresByNiveau(Integer niveau) {
		 List<Critere> list = (List<Critere>)getSqlMapClientTemplate().queryForList("getCriteresByNiveau",niveau);
			
		 return list;
	}

	@Override
	public List<Niveau> getNiveauParValeur(Integer val) {
	//
		 List<Niveau> list = (List<Niveau>)getSqlMapClientTemplate().queryForList("niveauParValeur",val);
			
		 return list;
		
	}

	@Override
	public List<Critere> getCriteresParCategorie(Integer categorie) {
		 List<Critere> list =(List<Critere>)getSqlMapClientTemplate().queryForList("criteresParCategorie",categorie);
			
		 return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Critere> getCriteresParCategorieEtParNiveau(Integer typeCategorie, Integer niveau) {
		Map<String, Integer> parametres = new HashMap<String, Integer>();
		parametres.put("typeCategorie",typeCategorie);
		parametres.put("niveau", niveau);
		List<Critere> criteresParTypeEtParNiveau =(List<Critere>)getSqlMapClientTemplate().queryForList("criteresParCategorieEtParNiveau",parametres);
	
		return criteresParTypeEtParNiveau;
	}

}
