package texas.dot.hronline.services;

import java.util.List;

import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.PsXSlryAllocMvw;

public interface PsXSlryAllocMvwService {
	
	List<PsXSlryAllocMvw> findAllRecords();
	List<PsXSlryAllocMvw> findByFiscalYear(@Param("courseStDate24") String courseStDate24);
	List<PsXSlryAllocMvw> findByBUEmp(@Param("businessUnit24") String businessUnit17,@Param("courseStDate24") String courseStDate24);
	List<PsXSlryAllocMvw> findBySearchBU(@Param("businessUnit24") String businessUnit17);

}
