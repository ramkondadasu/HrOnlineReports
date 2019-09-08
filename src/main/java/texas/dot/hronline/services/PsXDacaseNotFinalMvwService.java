package texas.dot.hronline.services;

import java.util.List;

import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.PsXDacaseNotFinalMvw;

public interface PsXDacaseNotFinalMvwService {
	List<PsXDacaseNotFinalMvw> findAllRecords();
	List<PsXDacaseNotFinalMvw> findByEmplid(@Param("rep11employeeid") String rep11employeeid);

}
