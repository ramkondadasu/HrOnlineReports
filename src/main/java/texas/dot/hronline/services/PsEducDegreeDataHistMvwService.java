package texas.dot.hronline.services;

import java.util.List;

import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.PsEducDegreeDataHistMvw;

public interface PsEducDegreeDataHistMvwService {
	
	List<PsEducDegreeDataHistMvw> findAllRecords();
	List<PsEducDegreeDataHistMvw> findByEmplid(@Param("rep17employeeid") String rep17employeeid);
	List<PsEducDegreeDataHistMvw> findByBUEmp(@Param("businessUnit17") String businessUnit17,@Param("rep17employeeid") String rep17employeeid);
	List<PsEducDegreeDataHistMvw> findBySearchBU(@Param("businessUnit17") String businessUnit17);

}
