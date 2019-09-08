package texas.dot.hronline.services;

import java.util.List;

import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.HrworkDrugTestVw;

public interface HrworkDrugTestVwService {
	List<HrworkDrugTestVw> findAllRecords();
	List<HrworkDrugTestVw> findBySsnNumber(@Param("ssnNumber") String ssnNumber);

}
