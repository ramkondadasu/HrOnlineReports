package texas.dot.hronline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import texas.dot.hronline.domain.PsEmpEvalDataHistMvw;

public interface PsEmpEvalDataHistMvwRepository extends CrudRepository<PsEmpEvalDataHistMvw, Long> {
	
	List<PsEmpEvalDataHistMvw> findByEmplid(String empid);

	@Query("select p from PsEmpEvalDataHistMvw AS p where rownum < 20000")
	List<PsEmpEvalDataHistMvw> findAllRecords();

}