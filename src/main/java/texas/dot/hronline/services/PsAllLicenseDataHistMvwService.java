package texas.dot.hronline.services;

import java.util.List;

import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.PsAllLicenseDataHistMvw;

public interface PsAllLicenseDataHistMvwService {
	
	List<PsAllLicenseDataHistMvw> findAllRecords();
	List<PsAllLicenseDataHistMvw> findByEmplid(@Param("rep17employeeid") String rep17employeeid);
	List<PsAllLicenseDataHistMvw> findByBUEmp(@Param("businessUnit17") String businessUnit17,@Param("rep17employeeid") String rep17employeeid);
	List<PsAllLicenseDataHistMvw> findBySearchBU(@Param("businessUnit17") String businessUnit17);

}
