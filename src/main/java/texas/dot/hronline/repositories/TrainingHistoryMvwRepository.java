package texas.dot.hronline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import texas.dot.hronline.domain.TrainingHistoryMvw;

public interface TrainingHistoryMvwRepository extends CrudRepository<TrainingHistoryMvw, Long>{
	
	@Query("select p from TrainingHistoryMvw AS p  where rownum < 20000")
	List<TrainingHistoryMvw> findAllRecords();

}
