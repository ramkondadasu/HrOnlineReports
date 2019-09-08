package texas.dot.hronline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.TrainingHistoryVw;

public interface TrainingHistoryVwRepository extends CrudRepository<TrainingHistoryVw, Long>{
	
	List<TrainingHistoryVw> findByEmplid(String empid);
	
	 @Query("select p from TrainingHistoryVw AS p"		       
		       + " where p.businessUnit = :businessUnit ")		       	       
	 List<TrainingHistoryVw> findByTraningHistReportByBunit(@Param("businessUnit") String businessUnit);
	 
	 @Query("select p from TrainingHistoryVw AS p"		       
		       + " where p.businessUnit = :businessUnit and p.courseEndDt between to_date(:courseStDate,'mm/dd/yyyy') and to_date(:courseEndDate,'mm/dd/yyyy')")		       	       
	 List<TrainingHistoryVw> findByTraningHistReportByBunitAndDts(@Param("businessUnit") String businessUnit,
			 													  @Param("courseStDate") String courseStDate,
			 													 @Param("courseEndDate") String courseEndDate);
	 
	 
	 @Query("select p from TrainingHistoryVw AS p"		       
		       + " where p.businessUnit = :businessUnit and p.courseEndDt = to_date(:courseStDate,'mm/dd/yyyy') ")		       	       
	 List<TrainingHistoryVw> findByTraningHistReportByBunitAndStDt(@Param("businessUnit") String businessUnit,
			 													  @Param("courseStDate") String courseStDate);
	 
	 
	 @Query("select p from TrainingHistoryVw AS p"		       
		       + " where p.businessUnit = :businessUnit and p.courseEndDt = to_date(:courseEndDate,'mm/dd/yyyy') ")		       	       
	 List<TrainingHistoryVw> findByTraningHistReportByBunitAndEndDt(@Param("businessUnit") String businessUnit,
			 													 @Param("courseEndDate") String courseEndDate);
	 
	 
//	 @Query("SELECT t FROM Todo t WHERE " +
//	            "LOWER(t.title) LIKE LOWER(CONCAT('%',:searchTerm, '%')) OR " +
//	            "LOWER(t.description) LIKE LOWER(CONCAT('%',:searchTerm, '%'))")
//	    List<TrainingHistoryVw> findBySearchTerm(@Param("searchTerm") String searchTerm);
	 
	 
	 

}
