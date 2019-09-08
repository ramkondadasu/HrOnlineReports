package texas.dot.hronline.services;

import java.util.List;

import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.PsXDacaseNoresoluMvw;

public interface PsXDacaseNoresoluMvwService {
	List<PsXDacaseNoresoluMvw> findAllRecords();
	List<PsXDacaseNoresoluMvw> findByEmplid(@Param("rep12employeeid") String empid);

}

