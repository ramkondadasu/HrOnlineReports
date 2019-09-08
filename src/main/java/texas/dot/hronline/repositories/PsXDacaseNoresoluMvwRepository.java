package texas.dot.hronline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import texas.dot.hronline.domain.PsXDacaseNoresoluMvw;

public interface PsXDacaseNoresoluMvwRepository extends CrudRepository<PsXDacaseNoresoluMvw, Long> {
	
	List<PsXDacaseNoresoluMvw> findByEmplid(String empid);

	@Query("select p from PsXDacaseNoresoluMvw AS p  where rownum < 20000")
	List<PsXDacaseNoresoluMvw> findAllRecords();

}