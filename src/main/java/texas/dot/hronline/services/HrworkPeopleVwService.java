package texas.dot.hronline.services;

import java.util.List;

import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.HrworkPeopleVw;

public interface HrworkPeopleVwService {
	List<HrworkPeopleVw> findAllRecords();
	List<HrworkPeopleVw> findBySsnNumber(@Param("ssnNumber") String ssnNumber);

}
