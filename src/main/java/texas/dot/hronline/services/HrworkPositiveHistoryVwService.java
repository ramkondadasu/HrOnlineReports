package texas.dot.hronline.services;

import java.util.List;

import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.HrworkPositiveHistoryVw;

public interface HrworkPositiveHistoryVwService {
	List<HrworkPositiveHistoryVw> findAllRecords();
	List<HrworkPositiveHistoryVw> findBySsnNumber(@Param("ssnNumber") String ssnNumber);

}
