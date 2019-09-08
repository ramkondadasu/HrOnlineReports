package texas.dot.hronline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import texas.dot.hronline.domain.HrarchiveAlcoholScreeningVw;


public interface HrarchiveAlcoholScreeningVwRepository extends CrudRepository<HrarchiveAlcoholScreeningVw, Long> {
	
	 @Query("select p from HrarchiveAlcoholScreeningVw AS p  where rownum < 20000")
		List<HrarchiveAlcoholScreeningVw> findAllRecords();
	 
	 @Query("SELECT t FROM HrarchiveAlcoholScreeningVw t WHERE " +						    
			    "LOWER(t.ssnNumber) LIKE LOWER(CONCAT('%',:ssnNumber, '%'))")
	 List<HrarchiveAlcoholScreeningVw> findBySsnNumber(String ssnNumber);

}
