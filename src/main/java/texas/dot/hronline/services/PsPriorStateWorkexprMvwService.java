package texas.dot.hronline.services;

import java.util.List;

import texas.dot.hronline.domain.PsPriorStateWorkexprMvw;
import org.springframework.data.repository.query.Param;

public interface PsPriorStateWorkexprMvwService {
	List<PsPriorStateWorkexprMvw> findAllRecords();
	List<PsPriorStateWorkexprMvw> findByEmplid(@Param("rep16employeeid") String empid);

}
