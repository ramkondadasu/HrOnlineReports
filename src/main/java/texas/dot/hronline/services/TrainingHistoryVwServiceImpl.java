package texas.dot.hronline.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import texas.dot.hronline.domain.PsCmRoleCompsVw;
import texas.dot.hronline.domain.TrainingHistoryMvw;
import texas.dot.hronline.domain.TrainingHistoryVw;
import texas.dot.hronline.repositories.TrainingHistoryVwRepository;

@Service
public class TrainingHistoryVwServiceImpl implements TrainingHistoryVwService {

	private TrainingHistoryVwRepository trainingHistoryVwRepository;
	
	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	public TrainingHistoryVwServiceImpl(TrainingHistoryVwRepository trainingHistoryVwRepository) {
		this.trainingHistoryVwRepository = trainingHistoryVwRepository;
	}

	@Override
	public List<TrainingHistoryVw> listAll() {
		List<TrainingHistoryVw> trainingHistoryVws = new ArrayList<>();
		trainingHistoryVwRepository.findAll().forEach(trainingHistoryVws::add); // fun with Java 8	
		trainingHistoryVws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return trainingHistoryVws;
	}
	
	@Override
	public List<TrainingHistoryVw> findByEmplid(String empid) {
		List<TrainingHistoryVw> trainingHistoryVws = new ArrayList<>();
		trainingHistoryVwRepository.findByEmplid(empid).forEach(trainingHistoryVws::add); // fun with Java 8	
		trainingHistoryVws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return trainingHistoryVws;
	}
	
	@Override
	public List<TrainingHistoryVw> findByTraningHistReport(@Param("bunit") String bunit,
															@Param("cstdt") String cstdt,
															@Param("csenddt") String csenddt){
		List<TrainingHistoryVw> trainingHistoryVws = new ArrayList<>();
		
		
		
		//trainingHistoryVwRepository.findByTraningHistReport(deptid,businessUnit).forEach(trainingHistoryVws::add); // fun with Java 8	
		
		if((cstdt!=null && !cstdt.equalsIgnoreCase(""))&&(csenddt!=null && !csenddt.equalsIgnoreCase(""))){
			//between query 
			trainingHistoryVwRepository.findByTraningHistReportByBunitAndDts(bunit,cstdt,csenddt).forEach(trainingHistoryVws::add);
		}else if(cstdt!=null && !cstdt.equalsIgnoreCase("")){
			trainingHistoryVwRepository.findByTraningHistReportByBunitAndStDt(bunit,cstdt).forEach(trainingHistoryVws::add);
		}else if(csenddt!=null && !csenddt.equalsIgnoreCase("")){
			trainingHistoryVwRepository.findByTraningHistReportByBunitAndEndDt(bunit,csenddt).forEach(trainingHistoryVws::add);
		}else{
			//only bunit
			trainingHistoryVwRepository.findByTraningHistReportByBunit(bunit).forEach(trainingHistoryVws::add);
		}
		
		trainingHistoryVws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return trainingHistoryVws;
	}
	
	@Override
	public List<TrainingHistoryMvw> findByTraningMvwHistReport( String bunit,
															 String cstdt,
															 String csenddt){
		List<TrainingHistoryMvw> trainingHistoryVws = new ArrayList<>();
		
		
		ProjectionList projList = Projections.projectionList();
		projList.add(Projections.sum("durationTime"));
		projList.add(Projections.groupProperty("fy"));
		projList.add(Projections.groupProperty("businessUnit"));
		projList.add(Projections.groupProperty("demandId"));
		projList.add(Projections.groupProperty("emplid"));
		projList.add(Projections.groupProperty("employeeName"));
		

		projList.add(Projections.property("businessUnit"));
		projList.add(Projections.property("demandId"));
		projList.add(Projections.property("emplid"));
		projList.add(Projections.property("employeeName"));
		projList.add(Projections.property("fy"));
		//add other fields you need in the projection list

//		Criteria criteria = createEntityCriteria(TrainingHistoryVw.class, "tr")
//		                .createAlias("tr.client", "cl")
//		                .createAlias("tr.security", "se")
//		                .add(Restrictions.eq("cl.id", clientId))
//		                .setProjection(projList);
		
		
		
		Criteria criteria = entityManager.unwrap(Session.class).createCriteria(TrainingHistoryMvw.class);
		//criteria.add(Restrictions.like("businessUnit", bunit, MatchMode.ANYWHERE));
		criteria.setProjection(projList);
		//criteria.add(Restrictions.like("courseStartDt", cstdt, MatchMode.ANYWHERE));
		//criteria.add(Restrictions.like("courseEndDt", csenddt, MatchMode.ANYWHERE));
		
		
		criteria.setMaxResults(20000);
		trainingHistoryVws = criteria.list();
		trainingHistoryVws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		
		
		return trainingHistoryVws;
	}
	
	
	
}