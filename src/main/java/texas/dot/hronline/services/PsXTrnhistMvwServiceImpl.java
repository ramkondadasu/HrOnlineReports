package texas.dot.hronline.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;

import org.hibernate.Criteria;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import texas.dot.hronline.domain.PsXTrnhistMvw;
import texas.dot.hronline.repositories.PsXTrnhistMvwRepository;

@Service
public class PsXTrnhistMvwServiceImpl implements PsXTrnhistMvwService {

	private PsXTrnhistMvwRepository psXTrnhistMvwRepository;
	
	@PersistenceContext
    private EntityManager entityManager;

	@Autowired
	public PsXTrnhistMvwServiceImpl(PsXTrnhistMvwRepository psXTrnhistMvwRepository) {
		this.psXTrnhistMvwRepository = psXTrnhistMvwRepository;
	}

	@Override
	public List<PsXTrnhistMvw> listAll() {
		List<PsXTrnhistMvw> psXTrnhistMvws = new ArrayList<>();
		psXTrnhistMvwRepository.findAll().forEach(psXTrnhistMvws::add); // fun
																		// with
																		// Java
																		// 8
		psXTrnhistMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return psXTrnhistMvws;
	}

	@Override
	public List<PsXTrnhistMvw> findByEmplid(String empid) {
		List<PsXTrnhistMvw> psXTrnhistMvws = new ArrayList<>();
		psXTrnhistMvwRepository.findByEmplid(empid).forEach(psXTrnhistMvws::add); // fun
																					// with
																					// Java
																					// 8
		psXTrnhistMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return psXTrnhistMvws;
	}

	@Override
	public List<PsXTrnhistMvw> findByTraningHistReport(String bunit, String cstdt, String csenddt) {
		List<PsXTrnhistMvw> PsXTrnhistMvws = new ArrayList<>();

		// PsXTrnhistMvwRepository.findByTraningHistReport(deptid,businessUnit).forEach(PsXTrnhistMvws::add);
		// // fun with Java 8

		if ((cstdt != null && !cstdt.equalsIgnoreCase("")) && (csenddt != null && !csenddt.equalsIgnoreCase(""))) {
			// between query
			psXTrnhistMvwRepository.findByTraningHistReportByBunitAndDts(bunit, cstdt, csenddt)
					.forEach(PsXTrnhistMvws::add);
		} else if (cstdt != null && !cstdt.equalsIgnoreCase("")) {
			psXTrnhistMvwRepository.findByTraningHistReportByBunitAndStDt(bunit, cstdt).forEach(PsXTrnhistMvws::add);
		} else if (csenddt != null && !csenddt.equalsIgnoreCase("")) {
			psXTrnhistMvwRepository.findByTraningHistReportByBunitAndEndDt(bunit, csenddt).forEach(PsXTrnhistMvws::add);
		} else {
			// only bunit
			psXTrnhistMvwRepository.findByTraningHistReportByBunit(bunit).forEach(PsXTrnhistMvws::add);
		}
		PsXTrnhistMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		return PsXTrnhistMvws;
	}

	@Override
	public List<PsXTrnhistMvw> findByCourse(String businessUnit, String courseStDate,
			String course, String courseEndDate, String empid, String singleCourseCodes1) {
		List<PsXTrnhistMvw> psXTrnhistMvws = new ArrayList<>();
		if(courseEndDate!=null && courseEndDate.equalsIgnoreCase("")){
			courseEndDate = "01/01/2018";
		}
		
//		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//		
//		Criteria criteria = cb.createQuery(PsXTrnhistMvw.class)
//
//		 // CriteriaQuery<Country> q = cb.createQuery(PsXTrnhistMvw.class);
//		
//		Criteria criteria = session.createCriteria(StockDailyRecord.class);
//		if(startDate!=null){
//			criteria.add(Expression.ge("date",startDate));
//		}
//		if(endDate!=null){
//			criteria.add(Expression.le("date",endDate));
//		}
//		if(volume!=null){
//			criteria.add(Expression.ge("volume",volume));
//		}
//		criteria.addOrder(Order.asc("date"));
//
//		return criteria.list();
		
		Criteria criteria = entityManager.unwrap(Session.class).createCriteria(PsXTrnhistMvw.class);
		if(course!=null && !course.equalsIgnoreCase("") && course.length()>0){
		//Rama working criteria.add(Restrictions.or(Restrictions.sqlRestriction("regexp_like(course, " + "'^A|^D'" + ")")));
		criteria.add(Restrictions.or(Restrictions.sqlRestriction("regexp_like(course, " + "'"+course+"'" + ")")));
		}
		//04-28-2010
//		if(courseStDate!=null && !courseStDate.equalsIgnoreCase("") && courseStDate.length()>0){
//            criteria.add(Restrictions.sqlRestriction("TRUNC(COURSE_START_DT) >= TO_DATE('" + courseStDate + "','mm/dd/yyyy')"));
//        }
//		if(courseEndDate!=null && !courseEndDate.equalsIgnoreCase("") && courseEndDate.length()>0){
//            criteria.add(Restrictions.sqlRestriction("TRUNC(COURSE_END_DT) <= TO_DATE('" + courseEndDate + "','mm/dd/yyyy')"));
//        }
		
		
		if(courseEndDate!=null && !courseEndDate.equalsIgnoreCase("") && courseEndDate.length()>0){
			criteria.add(Restrictions.sqlRestriction("TRUNC(course_date) between TO_DATE('" + courseStDate + "','mm/dd/yyyy') and TO_DATE('" + courseEndDate + "','mm/dd/yyyy')"));
		}else{
			criteria.add(Restrictions.sqlRestriction("TRUNC(course_date) between TO_DATE('" + courseStDate + "','mm/dd/yyyy') and TO_DATE('" + "05/01/2018" + "','mm/dd/yyyy')"));
		}
		
		
		
		
		if(empid!=null && !empid.equalsIgnoreCase("") && empid.length()>0){
            criteria.add(Restrictions.sqlRestriction("TRIM(emplid) = "+empid+""));
        }
		if(singleCourseCodes1!=null && !singleCourseCodes1.equalsIgnoreCase("") && singleCourseCodes1.length()>0){
            criteria.add(Restrictions.sqlRestriction("TRIM(course) = '"+singleCourseCodes1+"'"));
        }
		if (businessUnit != null && !businessUnit.equalsIgnoreCase("")) {			
			criteria.add(Restrictions.eq("businessUnit",businessUnit));
		}
		//Restrictions.sqlRestriction("regexp_like(NODE_1, " + re + ")"

		criteria.setMaxResults(20000);
		
		//psXTrnhistMvwRepository.findByTraningHistReportByBunitAndEndDt(bunit, csenddt).forEach(PsXTrnhistMvws::add);
		
		//criteria.list().forEach(PsXTrnhistMvws::add);
		
		psXTrnhistMvws = criteria.list();
		psXTrnhistMvws.forEach(f -> f.setEmplid(String.format("%0"+ (11 - f.getEmplid().length() )+"d%s",0 ,f.getEmplid())));
		
		//select word from words where w_id > 100 AND word REGEXP '^[A-Z][A-Za-z]*$' limit 2000;
//		List words = session.createCriteria(Word.class)
//				.setProjection(Projections.property("word"))
//				.add(Restrictions.and(Restrictions.gt("w_id",100), Restrictions.sqlRestriction(word REGEXP '^[A-Z][A-Za-z]*$')))
//				.setMaxResults(2000).list();



		
		return psXTrnhistMvws;
	}

}