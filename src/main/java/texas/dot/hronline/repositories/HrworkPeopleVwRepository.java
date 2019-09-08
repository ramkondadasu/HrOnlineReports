package texas.dot.hronline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.HrworkPeopleVw;

public interface HrworkPeopleVwRepository extends CrudRepository<HrworkPeopleVw, Long> {
	
	 @Query("select p from HrworkPeopleVw AS p  where rownum < 20000")
		List<HrworkPeopleVw> findAllRecords();
	 
	 @Query("SELECT t FROM HrworkPeopleVw t WHERE " +						    
			    "LOWER(t.ssnNumber) LIKE LOWER(CONCAT('%',:ssnNumber, '%'))")
	 List<HrworkPeopleVw> findBySsnNumber(@Param("ssnNumber") String ssnNumber);

}