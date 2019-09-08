package texas.dot.hronline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.PsPeLicenseDataHistMvw;


public interface PsPeLicenseDataHistMvwRepository extends CrudRepository<PsPeLicenseDataHistMvw, Long> {
	
	 @Query("SELECT t FROM PsPeLicenseDataHistMvw t WHERE " +
			    "LOWER(t.businessUnit) LIKE LOWER(CONCAT('%',:businessUnit17, '%')) ")
			List<PsPeLicenseDataHistMvw> findBySearchBU(@Param("businessUnit17") String businessUnit17);
				 
				 
				 @Query("SELECT t FROM PsPeLicenseDataHistMvw t WHERE " +
						    "(LOWER(t.businessUnit) = LOWER(:businessUnit17)) OR " +
						    "(LOWER(t.emplid) = LOWER(:rep17employeeid))")
						List<PsPeLicenseDataHistMvw> findByBUEmp(@Param("businessUnit17") String searchTerm,@Param("rep17employeeid") String rep17employeeid);
				 
				
				 @Query("select p from PsPeLicenseDataHistMvw AS p  where rownum < 20000")
					List<PsPeLicenseDataHistMvw> findAllRecords();
				 
				 @Query("SELECT t FROM PsPeLicenseDataHistMvw t WHERE " +						    
						    "LOWER(t.emplid) = LOWER(:rep17employeeid)")
				 List<PsPeLicenseDataHistMvw> findBySearchEmplid(@Param("rep17employeeid") String rep17employeeid);

}
