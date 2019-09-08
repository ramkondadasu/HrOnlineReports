package texas.dot.hronline.services;

import java.util.List;

import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.PsActnReasonTblVw;

public interface PsActnReasonTblVwService {
	
	List<PsActnReasonTblVw> findAllRecords();

}
