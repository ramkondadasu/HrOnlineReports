package texas.dot.hronline.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.PsAllLicenseDataHistMvw;

public interface PsAllLicenseDataHistMvwRepository extends CrudRepository<PsAllLicenseDataHistMvw, Long> {
	
	 @Query("SELECT t FROM PsAllLicenseDataHistMvw t WHERE " +
			    "LOWER(t.businessUnit) LIKE LOWER(CONCAT('%',:businessUnit17, '%')) ")
			List<PsAllLicenseDataHistMvw> findBySearchBU(@Param("businessUnit17") String businessUnit17);
				 
				 
				 @Query("SELECT t FROM PsAllLicenseDataHistMvw t WHERE " +
						    "(LOWER(t.businessUnit) = LOWER(:businessUnit17)) OR " +
						    "(LOWER(t.emplid) = LOWER(:rep17employeeid))")
						List<PsAllLicenseDataHistMvw> findByBUEmp(@Param("businessUnit17") String searchTerm,@Param("rep17employeeid") String rep17employeeid);
				 
				
				 @Query("select p from PsAllLicenseDataHistMvw AS p  where rownum < 20000")
					List<PsAllLicenseDataHistMvw> findAllRecords();
				 
				 @Query("SELECT t FROM PsAllLicenseDataHistMvw t WHERE " +						    
						    "LOWER(t.emplid) LIKE LOWER(CONCAT('%',:rep17employeeid, '%'))")
				 List<PsAllLicenseDataHistMvw> findByEmplid(String rep17employeeid);

}
