package texas.dot.hronline.services;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import texas.dot.hronline.domain.PsEmpEvalDataHistMvw;
import texas.dot.hronline.domain.PsXTrnhistMvw;

public interface PsXTrnhistMvwService {	
	List<PsXTrnhistMvw> listAll();
	List<PsXTrnhistMvw> findByEmplid(String empid);
	List<PsXTrnhistMvw> findByTraningHistReport(String bunit,
            									String cstdt,
            									String csenddt);
	
	List<PsXTrnhistMvw> findByCourse( String businessUnit,
			  String courseStDate,
			 String course, String courseEndDate, String empid, String singleCourseCodes1);
}
