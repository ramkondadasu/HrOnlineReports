package texas.dot.hronline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.PsXDacaseNotFinalMvw;

public interface PsXDacaseNotFinalMvwRepository extends CrudRepository<PsXDacaseNotFinalMvw, Long> {
	
	List<PsXDacaseNotFinalMvw> findByEmplid(String rep11employeeid);

	@Query("select p from PsXDacaseNotFinalMvw AS p  where rownum < 20000")
	List<PsXDacaseNotFinalMvw> findAllRecords();

}
