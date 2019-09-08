package texas.dot.hronline.services;

import java.util.List;

import texas.dot.hronline.domain.PsEmpEvalDataHistMvw;
import org.springframework.data.repository.query.Param;

public interface PsEmpEvalDataHistMvwService {
	List<PsEmpEvalDataHistMvw> findAllRecords();
	List<PsEmpEvalDataHistMvw> findByEmplid(@Param("rep15employeeid") String empid);

}
