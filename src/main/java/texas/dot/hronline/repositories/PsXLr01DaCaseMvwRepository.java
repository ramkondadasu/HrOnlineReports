package texas.dot.hronline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import texas.dot.hronline.domain.PsXLr01DaCaseMvw;

public interface PsXLr01DaCaseMvwRepository extends CrudRepository<PsXLr01DaCaseMvw, Long> {
	
	List<PsXLr01DaCaseMvw> findByEmplid(String empid);

	@Query("select p from PsXLr01DaCaseMvw AS p  where rownum < 20000")
	List<PsXLr01DaCaseMvw> findAllRecords();

}