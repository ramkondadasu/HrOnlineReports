package texas.dot.hronline.services;

import java.util.List;

import texas.dot.hronline.domain.PsXLr01DaCaseMvw;
import org.springframework.data.repository.query.Param;


public interface PsXLr01DaCaseMvwService {
	List<PsXLr01DaCaseMvw> findAllRecords();
	List<PsXLr01DaCaseMvw> findByEmplid(@Param("rep13employeeid") String empid);

}