package texas.dot.hronline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.HrworkPositiveHistoryVw;

public interface HrworkPositiveHistoryVwRepository extends CrudRepository<HrworkPositiveHistoryVw, Long> {
	
	 @Query("select p from HrworkPositiveHistoryVw AS p  where rownum < 20000")
		List<HrworkPositiveHistoryVw> findAllRecords();
	 
	 @Query("SELECT t FROM HrworkPositiveHistoryVw t WHERE " +						    
			    "LOWER(t.ssnNumber) LIKE LOWER(CONCAT('%',:ssnNumber, '%'))")
	 List<HrworkPositiveHistoryVw> findBySsnNumber(@Param("ssnNumber") String ssnNumber);

}