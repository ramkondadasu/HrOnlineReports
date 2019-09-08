package texas.dot.hronline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.PsOtherAccomplDataHistMvw;

public interface PsOtherAccomplDataHistMvwRepository extends CrudRepository<PsOtherAccomplDataHistMvw, Long> {
	
	 @Query("SELECT t FROM PsOtherAccomplDataHistMvw t WHERE " +
			    "LOWER(t.businessUnit) LIKE LOWER(CONCAT('%',:businessUnit17, '%')) ")
			List<PsOtherAccomplDataHistMvw> findBySearchBU(@Param("businessUnit17") String businessUnit17);
				 
				 
				 @Query("SELECT t FROM PsOtherAccomplDataHistMvw t WHERE " +
						    "(LOWER(t.businessUnit) = LOWER(:businessUnit17)) OR " +
						    "(LOWER(t.emplid) = LOWER(:rep17employeeid))")
						List<PsOtherAccomplDataHistMvw> findByBUEmp(@Param("businessUnit17") String searchTerm,@Param("rep17employeeid") String rep17employeeid);
				 
				
				 @Query("select p from PsOtherAccomplDataHistMvw AS p  where rownum < 20000")
					List<PsOtherAccomplDataHistMvw> findAllRecords();
				 
				 @Query("SELECT t FROM PsOtherAccomplDataHistMvw t WHERE " +						    
						    "LOWER(t.emplid) LIKE LOWER(CONCAT('%',:rep17employeeid, '%'))")
				 List<PsOtherAccomplDataHistMvw> findByEmplid(String rep17employeeid);

}
