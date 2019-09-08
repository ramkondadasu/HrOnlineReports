package texas.dot.hronline.services;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import texas.dot.hronline.domain.TrainingHistoryMvw;
import texas.dot.hronline.domain.TrainingHistoryVw;

public interface TrainingHistoryVwService {	
	List<TrainingHistoryVw> listAll();
	List<TrainingHistoryVw> findByEmplid(String empid);
	List<TrainingHistoryVw> findByTraningHistReport(@Param("bunit") String bunit,
            										@Param("cstdt") String cstdt,
            										@Param("csenddt") String csenddt);
	List<TrainingHistoryMvw> findByTraningMvwHistReport( String bunit,
			 String cstdt,
			 String csenddt);
}
