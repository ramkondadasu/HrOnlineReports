package texas.dot.hronline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import texas.dot.hronline.domain.PsXDaLetterVw;

public interface PsXDaLetterVwRepository extends CrudRepository<PsXDaLetterVw, Long> {

	List<PsXDaLetterVw> findByEmplid(String empid);

	@Query("select p from PsXDaLetterVw AS p  where rownum < 20000")
	List<PsXDaLetterVw> findAllRecords();
}
