package texas.dot.hronline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.HrworkAlcoholScreeningVw;

public interface HrworkAlcoholScreeningVwRepository extends CrudRepository<HrworkAlcoholScreeningVw, Long> {
	
	 @Query("select p from HrworkAlcoholScreeningVw AS p  where rownum < 20000")
		List<HrworkAlcoholScreeningVw> findAllRecords();
	 
	 @Query("SELECT t FROM HrworkAlcoholScreeningVw t WHERE " +						    
			    "LOWER(t.ssnNumber) LIKE LOWER(CONCAT('%',:ssnNumber, '%'))")
	 List<HrworkAlcoholScreeningVw> findBySsnNumber(@Param("ssnNumber") String ssnNumber);

}