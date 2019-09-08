package texas.dot.hronline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.HrworkDrugTestVw;

public interface HrworkDrugTestVwRepository extends CrudRepository<HrworkDrugTestVw, Long> {
	
	 @Query("select p from HrworkDrugTestVw AS p  where rownum < 20000")
		List<HrworkDrugTestVw> findAllRecords();
	 
	 @Query("SELECT t FROM HrworkDrugTestVw t WHERE " +						    
			    "LOWER(t.ssnNumber) LIKE LOWER(CONCAT('%',:ssnNumber, '%'))")
	 List<HrworkDrugTestVw> findBySsnNumber(@Param("ssnNumber") String ssnNumber);

}