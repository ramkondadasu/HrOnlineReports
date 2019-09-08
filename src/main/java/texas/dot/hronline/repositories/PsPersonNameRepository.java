package texas.dot.hronline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import texas.dot.hronline.domain.PsPersonName;

public interface PsPersonNameRepository extends CrudRepository<PsPersonName, Long> {

	List<PsPersonName> findByEmplid(String empid);

	@Query("select p from PsPersonName AS p  where rownum < 20000")
	List<PsPersonName> findAllRecords();
}
