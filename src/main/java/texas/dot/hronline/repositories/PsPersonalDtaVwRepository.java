package texas.dot.hronline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.PsPersonalDtaVw;
import texas.dot.hronline.domain.TrainingHistoryVw;

public interface PsPersonalDtaVwRepository extends CrudRepository<TrainingHistoryVw, Long>{
	
	 @Query("SELECT t FROM PsPersonalDtaVw t WHERE " +
    "LOWER(t.firstName) LIKE LOWER(CONCAT('%',:searchTerm, '%')) and rownum < 20000")
List<PsPersonalDtaVw> findBySearchFN(@Param("searchTerm") String searchTerm);
	 
	 @Query("SELECT t FROM PsPersonalDtaVw t WHERE " +
			    "LOWER(t.lastName) LIKE LOWER(CONCAT('%',:searchTerm, '%')) and rownum < 20000")
			List<PsPersonalDtaVw> findBySearchLN(@Param("searchTerm") String searchTerm);
	 
	 @Query("SELECT t FROM PsPersonalDtaVw t WHERE " +
			    "LOWER(t.firstName) LIKE LOWER(CONCAT('%',:searchTerm, '%')) OR " +
			    "LOWER(t.lastName) LIKE LOWER(CONCAT('%',:searchTerm1, '%')) and rownum < 20000")
			List<PsPersonalDtaVw> findBySearchFull(@Param("searchTerm") String searchTerm,@Param("searchTerm1") String searchTerm1);
	 
	 @Query("SELECT t FROM PsPersonalDtaVw t WHERE " +
			    "LOWER(t.name) LIKE LOWER(CONCAT('%',:searchTerm, '%')) and rownum < 20000")
			List<PsPersonalDtaVw> findBySearchFullName(@Param("searchTerm") String searchTerm);

}
