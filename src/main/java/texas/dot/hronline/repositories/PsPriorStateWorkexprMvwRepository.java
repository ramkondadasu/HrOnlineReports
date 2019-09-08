package texas.dot.hronline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import texas.dot.hronline.domain.PsPriorStateWorkexprMvw;

public interface PsPriorStateWorkexprMvwRepository extends CrudRepository<PsPriorStateWorkexprMvw, Long> {

	List<PsPriorStateWorkexprMvw> findByEmplid(String empid);

	@Query("select p from PsPriorStateWorkexprMvw AS p  where rownum < 20000")
	List<PsPriorStateWorkexprMvw> findAllRecords();
}
