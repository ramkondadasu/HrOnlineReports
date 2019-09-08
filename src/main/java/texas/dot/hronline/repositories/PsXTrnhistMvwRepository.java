package texas.dot.hronline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.PsXTrnhistMvw;

public interface PsXTrnhistMvwRepository extends CrudRepository<PsXTrnhistMvw, Long>{
	
	List<PsXTrnhistMvw> findByEmplid(String empid);
	
	 @Query("select p from PsXTrnhistMvw AS p"		       
		       + " where p.businessUnit = :businessUnit ")		       	       
	 List<PsXTrnhistMvw> findByTraningHistReportByBunit(@Param("businessUnit") String businessUnit);
	 
	 @Query("select p from PsXTrnhistMvw AS p"		       
		       + " where p.businessUnit = :businessUnit and p.courseEndDt between to_date(:courseStDate,'mm/dd/yyyy') and to_date(:courseEndDate,'mm/dd/yyyy')")		       	       
	 List<PsXTrnhistMvw> findByTraningHistReportByBunitAndDts(@Param("businessUnit") String businessUnit,
			 													  @Param("courseStDate") String courseStDate,
			 													 @Param("courseEndDate") String courseEndDate);
	 
	 
	 @Query("select p from PsXTrnhistMvw AS p"		       
		       + " where p.businessUnit = :businessUnit and p.courseEndDt = to_date(:courseStDate,'mm/dd/yyyy') ")		       	       
	 List<PsXTrnhistMvw> findByTraningHistReportByBunitAndStDt(@Param("businessUnit") String businessUnit,
			 													  @Param("courseStDate") String courseStDate);
	 
	 
	 @Query("select p from PsXTrnhistMvw AS p"		       
		       + " where p.businessUnit = :businessUnit and p.courseEndDt = to_date(:courseEndDate,'mm/dd/yyyy') ")		       	       
	 List<PsXTrnhistMvw> findByTraningHistReportByBunitAndEndDt(@Param("businessUnit") String businessUnit,
			 													 @Param("courseEndDate") String courseEndDate);
	 
	 
     List<PsXTrnhistMvw> findByCourse(@Param("businessUnit") String businessUnit,
			 													  @Param("courseStDate") String courseStDate,
			 													 @Param("empFirstName")	String empFirstName);
	 
	 
	 
//	 @Query("SELECT t FROM Todo t WHERE " +
//	            "LOWER(t.title) LIKE LOWER(CONCAT('%',:searchTerm, '%')) OR " +
//	            "LOWER(t.description) LIKE LOWER(CONCAT('%',:searchTerm, '%'))")
//	    List<PsXTrnhistMvw> findBySearchTerm(@Param("searchTerm") String searchTerm);
	 
	 
	 

}
