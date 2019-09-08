package texas.dot.hronline.services;

import java.util.List;

import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.PsPeLicenseDataHistMvw;

public interface PsPeLicenseDataHistMvwService {
	
	List<PsPeLicenseDataHistMvw> findAllRecords();
	List<PsPeLicenseDataHistMvw> findBySearchEmplid(@Param("rep17employeeid") String rep17employeeid);
	List<PsPeLicenseDataHistMvw> findByBUEmp(@Param("businessUnit17") String businessUnit17,@Param("rep17employeeid") String rep17employeeid);
	List<PsPeLicenseDataHistMvw> findBySearchBU(@Param("businessUnit17") String businessUnit17);

}
