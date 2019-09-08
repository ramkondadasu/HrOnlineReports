package texas.dot.hronline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.PsXSlryAllocMvw;//need to change empid to year later
public interface PsXSlryAllocMvwRepository extends CrudRepository<PsXSlryAllocMvw, Long> {
	
	 @Query("SELECT t FROM PsXSlryAllocMvw t WHERE " +
			    "LOWER(t.businessUnit) LIKE LOWER(CONCAT('%',:businessUnit24, '%')) ")
			List<PsXSlryAllocMvw> findBySearchBU(@Param("businessUnit24") String businessUnit24);
				 
				 
				 @Query("SELECT t FROM PsXSlryAllocMvw t WHERE " +
						    "(LOWER(t.businessUnit) LIKE LOWER(CONCAT('%',:businessUnit24, '%'))) OR " +
						    "(LOWER(t.fiscalYear) LIKE LOWER(CONCAT('%',:fiscalYear, '%')))")
						List<PsXSlryAllocMvw> findByBUEmp(@Param("businessUnit24") String searchTerm,@Param("fiscalYear") String fiscalYear);
				 
				
				 @Query("select p from PsXSlryAllocMvw AS p  where rownum < 20000")
					List<PsXSlryAllocMvw> findAllRecords();
				 
				 @Query("SELECT t FROM PsXSlryAllocMvw t WHERE " +						    
						    "LOWER(t.fiscalYear) LIKE LOWER(CONCAT('%',:courseStDate24, '%'))")
				 List<PsXSlryAllocMvw> findByFiscalYear(@Param("courseStDate24") String courseStDate24);

}
