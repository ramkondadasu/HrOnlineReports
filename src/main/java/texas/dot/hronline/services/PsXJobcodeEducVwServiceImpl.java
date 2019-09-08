package texas.dot.hronline.services;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Service;

import texas.dot.hronline.domain.JobcodeProfileDataMvw;
import texas.dot.hronline.domain.PsCmRoleCompsVw;
import texas.dot.hronline.domain.PsEditableTrgHistoryMvw;
import texas.dot.hronline.domain.PsTrn023CoursesMvw;
import texas.dot.hronline.domain.PsXJobcodeDutyVw;
import texas.dot.hronline.domain.PsXJobcodeEducVw;
import texas.dot.hronline.domain.PsXJobcodeExprVw;
import texas.dot.hronline.domain.PsXJobcodeSubsVw;
import texas.dot.hronline.domain.PsXTrnhistMvw;
import texas.dot.hronline.domain.TrainingHistoryMvw;

@Service
public class PsXJobcodeEducVwServiceImpl implements PsXJobcodeEducVwService {

	@PersistenceContext
	private EntityManager entityManager;

	// @Autowired
	// public PsXJobcodeEducVwServiceImpl(PsXJobcodeEducVwRepository
	// psXTrnhistMvwRepository) {
	// this.psXTrnhistMvwRepository = psXTrnhistMvwRepository;
	// }

	@Override
	public List<PsXJobcodeEducVw> findByjobcode(String jobcode,String singlejobcode,String jobTitle) {
		List<PsXJobcodeEducVw> psXJobcodeEducVws = new ArrayList<>();
		Criteria criteria = entityManager.unwrap(Session.class).createCriteria(PsXJobcodeEducVw.class);

		if(jobTitle!=null && !jobTitle.equalsIgnoreCase("")){			
			criteria.add(Restrictions.sqlRestriction("lower(JOB_TITLE) like " + "'%" + jobTitle.toLowerCase() + "%'"));
		}
		
		if(singlejobcode!=null && !singlejobcode.equalsIgnoreCase("")){
			criteria.add(Restrictions.eq("jobcode",singlejobcode));	
		}else{
		
		//if (jobcode != null && !jobcode.equalsIgnoreCase("") && jobcode.length() > 0) {
			// Rama working
			// criteria.add(Restrictions.or(Restrictions.sqlRestriction("regexp_like(course,
			// " + "'^A|^D'" + ")")));
			if (jobcode != null && !jobcode.equalsIgnoreCase("") ) {
			criteria.add(
					Restrictions.or(Restrictions.sqlRestriction("regexp_like(jobcode, " + "'" + jobcode + "'" + ")")));
			}
		}
		criteria.setMaxResults(20000);
		psXJobcodeEducVws = criteria.list();
		return psXJobcodeEducVws;
	}

	// 19
	@Override
	public List<PsXJobcodeExprVw> findByjobcode19(String jobcode,String singlejobcode,String jobTitle) {
		List<PsXJobcodeExprVw> psXJobcodeEducVws = new ArrayList<>();
		Criteria criteria = entityManager.unwrap(Session.class).createCriteria(PsXJobcodeExprVw.class);
		if(jobTitle!=null && !jobTitle.equalsIgnoreCase("")){			
			criteria.add(Restrictions.sqlRestriction("lower(JOB_TITLE) like " + "'%" + jobTitle.toLowerCase() + "%'"));
		}
		if(singlejobcode!=null && !singlejobcode.equalsIgnoreCase("")){
			criteria.add(Restrictions.eq("jobcode",singlejobcode));	
			
			
			
		}else{
		
			if (jobcode != null && !jobcode.equalsIgnoreCase("") ) {
				criteria.add(
						Restrictions.or(Restrictions.sqlRestriction("regexp_like(jobcode, " + "'" + jobcode + "'" + ")")));
				}
			
		}
		criteria.setMaxResults(20000);
		psXJobcodeEducVws = criteria.list();
		return psXJobcodeEducVws;
	}

	// 20
	@Override
	public List<PsXJobcodeDutyVw> findByjobcode20(String jobcode,String singlejobcode,String jobTitle) {
		List<PsXJobcodeDutyVw> psXJobcodeEducVws = new ArrayList<>();
		Criteria criteria = entityManager.unwrap(Session.class).createCriteria(PsXJobcodeDutyVw.class);
		if(jobTitle!=null && !jobTitle.equalsIgnoreCase("")){			
			criteria.add(Restrictions.sqlRestriction("lower(JOB_TITLE) like " + "'%" + jobTitle.toLowerCase() + "%'"));
		}
		if(singlejobcode!=null && !singlejobcode.equalsIgnoreCase("")){
			criteria.add(Restrictions.eq("jobcode",singlejobcode));	
			
		}else{
		
			if (jobcode != null && !jobcode.equalsIgnoreCase("") ) {
				criteria.add(
						Restrictions.or(Restrictions.sqlRestriction("regexp_like(jobcode, " + "'" + jobcode + "'" + ")")));
				}
			
		}
		criteria.setMaxResults(20000);
		psXJobcodeEducVws = criteria.list();
		return psXJobcodeEducVws;
	}

	// 21
	@Override
	public List<PsXJobcodeSubsVw> findByjobcode21(String jobcode,String singlejobcode) {
		List<PsXJobcodeSubsVw> psXJobcodeEducVws = new ArrayList<>();
		Criteria criteria = entityManager.unwrap(Session.class).createCriteria(PsXJobcodeSubsVw.class);
		if(singlejobcode!=null && !singlejobcode.equalsIgnoreCase("")){
			criteria.add(Restrictions.eq("jobcode",singlejobcode));	
		}else{
		
			if (jobcode != null && !jobcode.equalsIgnoreCase("") ) {
				criteria.add(
						Restrictions.or(Restrictions.sqlRestriction("regexp_like(jobcode, " + "'" + jobcode + "'" + ")")));
				}
		}
		criteria.setMaxResults(20000);
		psXJobcodeEducVws = criteria.list();
		return psXJobcodeEducVws;
	}
	
	// 23
		@Override
		public List<PsTrn023CoursesMvw> findByjobcode23(String jobcode,String singlejobcode) {
			List<PsTrn023CoursesMvw> psTrn023CoursesMvws = new ArrayList<>();
			Criteria criteria = entityManager.unwrap(Session.class).createCriteria(PsTrn023CoursesMvw.class);
			if(singlejobcode!=null && !singlejobcode.equalsIgnoreCase("")){
				criteria.add(Restrictions.eq("jobcode",singlejobcode));	
			}else{
			
			//if (jobcode != null && !jobcode.equalsIgnoreCase("") && jobcode.length() > 0) {
				// Rama working
				// criteria.add(Restrictions.or(Restrictions.sqlRestriction("regexp_like(course,
				// " + "'^A|^D'" + ")")));
				criteria.add(
						Restrictions.or(Restrictions.sqlRestriction("regexp_like(course, " + "'" + jobcode + "'" + ")")));
			}
			criteria.setMaxResults(20000);
			psTrn023CoursesMvws = criteria.list();
			return psTrn023CoursesMvws;
		}

	// 22
	@Override
	public List<PsCmRoleCompsVw> findByjobcode22(String jobcode,String singlejobcode,String jobTitle) {
		List<PsCmRoleCompsVw> psXJobcodeEducVws = new ArrayList<>();
		Criteria criteria = entityManager.unwrap(Session.class).createCriteria(PsCmRoleCompsVw.class);
		if(jobTitle!=null && !jobTitle.equalsIgnoreCase("")){			
			criteria.add(Restrictions.sqlRestriction("lower(JOB_TITLE) like " + "'%" + jobTitle.toLowerCase() + "%'"));
		}
		if(singlejobcode!=null && !singlejobcode.equalsIgnoreCase("")){
			criteria.add(Restrictions.eq("jobcode",singlejobcode));	
			
		}else{
		
			if (jobcode != null && !jobcode.equalsIgnoreCase("") ) {
				criteria.add(
						Restrictions.or(Restrictions.sqlRestriction("regexp_like(jobcode, " + "'" + jobcode + "'" + ")")));
				}
			
		}
		criteria.setMaxResults(20000);
		psXJobcodeEducVws = criteria.list();
		return psXJobcodeEducVws;
	}
	
	// 29
		@Override
		public List<JobcodeProfileDataMvw> findByjobcode29(String jobcode,String singlejobcode,String jobTitle) {
			List<JobcodeProfileDataMvw> psXJobcodeEducVws = new ArrayList<>();
			Criteria criteria = entityManager.unwrap(Session.class).createCriteria(JobcodeProfileDataMvw.class);
			if(jobTitle!=null && !jobTitle.equalsIgnoreCase("")){			
				criteria.add(Restrictions.sqlRestriction("lower(JOB_TITLE) like " + "'%" + jobTitle.toLowerCase() + "%'"));
			}
			if(singlejobcode!=null && !singlejobcode.equalsIgnoreCase("")){
				//criteria.add(Restrictions.eq("jobcode",singlejobcode));
				criteria.add(Restrictions.sqlRestriction("JOBCODE = " + "'" + singlejobcode + "'"));
				
			}else{
			
				if (jobcode != null && !jobcode.equalsIgnoreCase("") ) {
					criteria.add(
							Restrictions.or(Restrictions.sqlRestriction("regexp_like(jobcode, " + "'" + jobcode + "'" + ")")));
					}
				
			}
			criteria.setMaxResults(20000);
			psXJobcodeEducVws = criteria.list();
			return psXJobcodeEducVws;
		}
	
	
	//28
	@Override
	public List<PsEditableTrgHistoryMvw> findByjobcode28(String course,
			 String cstdt,
			 String csenddt,String empid, String singleCourseCodes28) {
		if(csenddt!=null && csenddt.equalsIgnoreCase("")){
			csenddt = "01/01/2018";
		}
		
		List<PsEditableTrgHistoryMvw> psEditableTrgHistoryMvws = new ArrayList<>();
		Criteria criteria = entityManager.unwrap(Session.class).createCriteria(PsEditableTrgHistoryMvw.class);
		if (course != null && !course.equalsIgnoreCase("") && course.length() > 0) {
			// Rama working
			// criteria.add(Restrictions.or(Restrictions.sqlRestriction("regexp_like(course,
			// " + "'^A|^D'" + ")")));
			criteria.add(
					Restrictions.or(Restrictions.sqlRestriction("regexp_like(course, " + "'" + course + "'" + ")")));
		}
		if(cstdt != null && !cstdt.equalsIgnoreCase("")){
			//String date="09/08/1980";    // take a string  date
		    Timestamp ts=null;  //declare timestamp
		    Date d=new Date(cstdt); // Intialize date with the string date
		    if(d!=null){  // simple null check
		        ts=new java.sql.Timestamp(d.getTime()); // convert gettime from date and assign it to your timestamp.
		    }			
			criteria.add(Restrictions.gt("courseStartDt",ts));
		}
		if(csenddt != null && !csenddt.equalsIgnoreCase("")){
			Timestamp tse=null;  //declare timestamp
		    Date de=new Date(csenddt); // Intialize date with the string date
		    if(de!=null){  // simple null check
		        tse=new java.sql.Timestamp(de.getTime()); // convert gettime from date and assign it to your timestamp.
		    }		
			criteria.add(Restrictions.lt("courseEndDt",tse));
		}
		if (empid != null && !empid.equalsIgnoreCase("")) {			
			criteria.add(Restrictions.eq("emplid",empid));
		}
		if (singleCourseCodes28 != null && !singleCourseCodes28.equalsIgnoreCase("")) {			
			criteria.add(Restrictions.eq("course",singleCourseCodes28));
		}
		//criteria.add(Restrictions.like("courseStartDt", cstdt, MatchMode.ANYWHERE));
		//criteria.add(Restrictions.like("courseStartDt", cstdt, MatchMode.ANYWHERE));
		criteria.setMaxResults(20000);
		psEditableTrgHistoryMvws = criteria.list();
		psEditableTrgHistoryMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return psEditableTrgHistoryMvws;
	}
	
	@Override
	public List<TrainingHistoryMvw> findByTraningMvwHistReport( String bunit,
															 String cstdt,
															 String csenddt, String coursecode, String empid){
		
		if(csenddt!=null && csenddt.equalsIgnoreCase("")){
			csenddt = "01/01/2018";
		}
		
		List<TrainingHistoryMvw> trainingHistoryVws = new ArrayList<>();
		
		
		ProjectionList projList = Projections.projectionList();
		projList.add(Projections.sum("durationTime"));
		projList.add(Projections.groupProperty("fy"));
		projList.add(Projections.groupProperty("businessUnit"));
		projList.add(Projections.groupProperty("demandId"));
		projList.add(Projections.groupProperty("emplid"));
		projList.add(Projections.groupProperty("employeeName"));
		projList.add(Projections.groupProperty("course"));
		projList.add(Projections.groupProperty("emplid"));
		
//
//		projList.add(Projections.property("businessUnit"));
//		projList.add(Projections.property("demandId"));
//		projList.add(Projections.property("emplid"));
//		projList.add(Projections.property("employeeName"));
//		projList.add(Projections.property("fy"));
		//add other fields you need in the projection list

//		Criteria criteria = createEntityCriteria(TrainingHistoryVw.class, "tr")
//		                .createAlias("tr.client", "cl")
//		                .createAlias("tr.security", "se")
//		                .add(Restrictions.eq("cl.id", clientId))
//		                .setProjection(projList);
		
		
		
		Criteria criteria = entityManager.unwrap(Session.class).createCriteria(TrainingHistoryMvw.class);
		if(bunit!= null && !bunit.equalsIgnoreCase("")){
			criteria.add(Restrictions.like("businessUnit", bunit));
			}

		if(csenddt!= null && !csenddt.equalsIgnoreCase("") && cstdt!= null && !cstdt.equalsIgnoreCase("")){
			//String date="09/08/1980";    // take a string  date
		    Timestamp ts=null;  //declare timestamp
		    Date d=new Date(cstdt); // Intialize date with the string date
		    if(d!=null){  // simple null check
		        ts=new java.sql.Timestamp(d.getTime()); // convert gettime from date and assign it to your timestamp.
		    }
		    Timestamp tse=null;  //declare timestamp
		    Date de=new Date(csenddt); // Intialize date with the string date
		    if(de!=null){  // simple null check
		        tse=new java.sql.Timestamp(de.getTime()); // convert gettime from date and assign it to your timestamp.
		    }
		//criteria.add(Restrictions.between("courseDate", cstdt, csenddt));
		//criteria.add(Restrictions.eq("courseStartDt",ts)); 
		criteria.add(Restrictions.gt("courseStartDt",ts));
		
		//criteria.add(Restrictions.eq("courseEndDt",ts)); 
		criteria.add(Restrictions.lt("courseEndDt",tse));
		
		

		}
		if (coursecode != null && !coursecode.equalsIgnoreCase("") && coursecode.length() > 0) {			
			criteria.add(
					Restrictions.or(Restrictions.sqlRestriction("regexp_like(course, " + "'" + coursecode + "'" + ")")));
		}
		if (empid != null && !empid.equalsIgnoreCase("")) {			
			criteria.add(Restrictions.eq("emplid",empid));
		}
		//criteria.add(Restrictions.like("businessUnit", bunit, MatchMode.ANYWHERE));
		criteria.setProjection(projList);
		//criteria.add(Restrictions.like("courseStartDt", cstdt, MatchMode.ANYWHERE));
		//criteria.add(Restrictions.like("courseEndDt", csenddt, MatchMode.ANYWHERE));
//		if(bunit!= null && !bunit.equalsIgnoreCase("")){
//			criteria.setProjection(Projections.alias(Projections.groupProperty("businessUnit"), bunit));
//		}
		
		criteria.setMaxResults(20000);
		//criteria.setResultTransformer(Transformers.aliasToBean(TrainingHistoryMvw.class));
		//List<TrainingHistoryMvw> objectList = (List<TrainingHistoryMvw>) criteria.list();
		//trainingHistoryVws = criteria.list();
		List<Object[]> results=criteria.list();
		TrainingHistoryMvw bn = null;
		
		for (Object[] result : results) {
			bn = new TrainingHistoryMvw();
			if(result[0]!=null)bn.setDurationTime(new BigDecimal((result[0].toString())));
			if(result[1]!=null)bn.setFy(new BigDecimal((result[1].toString())));
			if(result[2]!=null)bn.setBusinessUnit(result[2].toString());
			if(result[3]!=null)bn.setDemandId(result[3].toString());
			if(result[4]!=null)bn.setEmplid(result[4].toString());
			if(result[5]!=null)bn.setEmployeeName(result[5].toString());
			if(result[6]!=null)bn.setCourse(result[6].toString());
			if(result[7]!=null)bn.setEmplid(result[7].toString());
			trainingHistoryVws.add(bn);
			//System.out.println("==================================");
			
//		    Integer maxPrice = (Integer)result[0];
//		    Integer minPrice = (Integer)result[1];
//		    Long count = (Long)result[2];
		}
		
//		for(int i=0; i<results.size(); i++){
//			//TrainingHistoryMvw downloadState = (TrainingHistoryMvw) results.get(i);
//			trainingHistoryVws.add(results[i])
//		}
//		
//		for (Object[] obj : results) {
//			TrainingHistoryMvw downloadState = (TrainingHistoryMvw) obj[0];
//			trainingHistoryVws.add()
//	        //stateMap.put(downloadState.getDescription().toLowerCase() (Integer) obj[1]);
//	    }
		
//		List<Object[]> list=criteria.list();
//        for (Object[] objects : list) {
//           System.out.println("Name : "+objects[0]);
//           System.out.println("Designation : "+objects[1]);
//        }
		
		//System.out.println("GGGG");
		trainingHistoryVws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return trainingHistoryVws;
	}
	
	//23
	//24
	//25
	//26
	//27
	//28

}
