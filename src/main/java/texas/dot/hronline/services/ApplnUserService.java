package texas.dot.hronline.services;

import java.util.List;

import org.springframework.data.repository.query.Param;

import texas.dot.hronline.domain.ApplnUser;
import texas.dot.hronline.domain.PsEmpEvalDataHistMvw;

public interface ApplnUserService {
	
	 List<ApplnUser> findAllRecords();
	

}
