package texas.dot.hronline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import texas.dot.hronline.domain.PsActnReasonTblVw;

public interface PsActnReasonTblVwRepository extends CrudRepository<PsActnReasonTblVw, Long> {	
		
	@Query("select p from PsActnReasonTblVw AS p  where rownum < 20000")		       	       
	 List<PsActnReasonTblVw> findAllRecords();
}
