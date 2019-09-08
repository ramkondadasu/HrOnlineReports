package texas.dot.hronline.services;

import java.util.List;

import texas.dot.hronline.domain.JobcodeProfileDataMvw;
import texas.dot.hronline.domain.PsCmRoleCompsVw;
import texas.dot.hronline.domain.PsEditableTrgHistoryMvw;
import texas.dot.hronline.domain.PsTrn023CoursesMvw;
import texas.dot.hronline.domain.PsXJobcodeDutyVw;
import texas.dot.hronline.domain.PsXJobcodeEducVw;
import texas.dot.hronline.domain.PsXJobcodeExprVw;
import texas.dot.hronline.domain.PsXJobcodeSubsVw;
import texas.dot.hronline.domain.TrainingHistoryMvw;

public interface PsXJobcodeEducVwService {
	
	List<PsXJobcodeEducVw> findByjobcode(String jobcode,String singlejobcode, String jobTitle);
	List<PsXJobcodeExprVw> findByjobcode19(String jobcode,String singlejobcode, String jobTitle);
	List<PsXJobcodeDutyVw> findByjobcode20(String jobcode,String singlejobcode,String jobTitle);
	List<PsXJobcodeSubsVw> findByjobcode21(String jobcode,String singlejobcode);
	List<PsTrn023CoursesMvw> findByjobcode23(String jobcode,String singlejobcode);
	List<PsCmRoleCompsVw> findByjobcode22(String jobcode,String singlejobcode,String jobTitle); 
	List<TrainingHistoryMvw> findByTraningMvwHistReport( String bunit,
			 String cstdt,
			 String csenddt,String coursecode, String empid);
	List<PsEditableTrgHistoryMvw> findByjobcode28(String course,
			 String cstdt,
			 String csenddt,String empid, String singleCourseCodes28);
	public List<JobcodeProfileDataMvw> findByjobcode29(String jobcode,String singlejobcode,String jobTitle);

}
