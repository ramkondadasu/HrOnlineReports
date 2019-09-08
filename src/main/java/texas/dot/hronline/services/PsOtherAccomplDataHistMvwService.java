package texas.dot.hronline.services;

import java.util.List;

import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.PsOtherAccomplDataHistMvw;

public interface PsOtherAccomplDataHistMvwService {
	
	List<PsOtherAccomplDataHistMvw> findAllRecords();
	List<PsOtherAccomplDataHistMvw> findByEmplid(@Param("rep17employeeid") String rep17employeeid);
	List<PsOtherAccomplDataHistMvw> findByBUEmp(@Param("businessUnit17") String businessUnit17,@Param("rep17employeeid") String rep17employeeid);
	List<PsOtherAccomplDataHistMvw> findBySearchBU(@Param("businessUnit17") String businessUnit17);

}
