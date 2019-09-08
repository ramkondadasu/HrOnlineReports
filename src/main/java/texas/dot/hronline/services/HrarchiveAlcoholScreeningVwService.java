package texas.dot.hronline.services;

import java.util.List;

import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.HrarchiveAlcoholScreeningVw;

public interface HrarchiveAlcoholScreeningVwService {
	
	List<HrarchiveAlcoholScreeningVw> findAllRecords();
	List<HrarchiveAlcoholScreeningVw> findBySsnNumber(@Param("ssnNumber") String ssnNumber);

}
