package texas.dot.hronline.commands;
import java.util.HashMap;
import java.util.Map;
public class ReportForm {

	private String reportId;

	// Report 5
	private String businessUnit;
	private String courseStDate;
	private String courseEndDate;
	private String[] courseCodes5 = new String[1];
	private String employeeid5;
    private String singleCourseCodes1;

	// Report 2
	private String empFirstName;
	private String empLastName;

	// Report 3
	// Report 5
	private String businessUnit1;
	private String courseStDate1;
	private String courseEndDate1;
	private String[] courseCodes = new String[1];
	private String employeeid;

	// Report 11
	private String rep11employeeid;

	// Report 12
	private String rep12employeeid;

	// Report 13
	private String rep13employeeid;

	// Report 15
	private String rep15employeeid;
	// Report 16
	private String rep16employeeid;

	// Report 17
	private String rep17employeeid;
	private String businessUnit17;
	

	// Report 18
	private String[] jobcodes18 = new String[1];
	private String singlejobcode18;
	private String jobtitle18;

	// Report 19
	private String[] jobcodes19 = new String[1];
	private String singlejobcode19;
	private String jobtitle19;
	
	// Report 20
	private String[] jobcodes20 = new String[1];
	private String singlejobcode20;
	private String jobtitle20;
	// Report 21
	private String[] jobcodes21 = new String[1];
	private String singlejobcode21;
	private String jobtitle21;
	// Report 22
	private String[] jobcodes22 = new String[1];
	private String singlejobcode22;
	private String jobtitle22;
	// Report 29
		private String[] jobcodes29 = new String[1];
		private String singlejobcode29;
		private String jobtitle29;

	// Report 21-28
	
	private String[] courseCodes28 = new String[1];
	private String courseStDate28;
	private String courseEndDate28;
	private String rep28employeeid;
	private String singleCourseCodes28;

	// Report 23
	private String[] courseCodes23 = new String[1];
	private String singlejobcode23;
   //Report 24
	private String businessUnit24;
	private String courseStDate24;
	// Report 25
	private String rep25employeeid;
	private String businessUnit25;
	// Report 26
	private String rep26employeeid;
	private String businessUnit26;
	// Report 27
	private String rep27employeeid;
	private String businessUnit27;
	// Report 30
	private String rep30ssn;
	// Report 31
		private String rep31ssn;
		// Report 32
		private String rep32ssn;
		// Report 33
		private String rep33ssn;
	
	//Dropdown list
	private Map<String, String> sampleDropdownMap = new HashMap<String, String>();

	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public String[] getCourseCodes() {
		return courseCodes;
	}

	public void setCourseCodes(String[] courseCodes) {
		this.courseCodes = courseCodes;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public String getReportId() {
		return reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getCourseStDate() {
		return courseStDate;
	}

	public void setCourseStDate(String courseStDate) {
		this.courseStDate = courseStDate;
	}

	public String getCourseEndDate() {
		return courseEndDate;
	}

	public void setCourseEndDate(String courseEndDate) {
		this.courseEndDate = courseEndDate;
	}

	public String getBusinessUnit1() {
		return businessUnit1;
	}

	public void setBusinessUnit1(String businessUnit1) {
		this.businessUnit1 = businessUnit1;
	}

	public String getCourseStDate1() {
		return courseStDate1;
	}

	public void setCourseStDate1(String courseStDate1) {
		this.courseStDate1 = courseStDate1;
	}

	public String getCourseEndDate1() {
		return courseEndDate1;
	}

	public void setCourseEndDate1(String courseEndDate1) {
		this.courseEndDate1 = courseEndDate1;
	}

	public String getRep11employeeid() {
		return rep11employeeid;
	}

	public void setRep11employeeid(String rep11employeeid) {
		this.rep11employeeid = rep11employeeid;
	}

	public String getRep12employeeid() {
		return rep12employeeid;
	}

	public void setRep12employeeid(String rep12employeeid) {
		this.rep12employeeid = rep12employeeid;
	}

	public String getRep13employeeid() {
		return rep13employeeid;
	}

	public void setRep13employeeid(String rep13employeeid) {
		this.rep13employeeid = rep13employeeid;
	}

	public String getRep15employeeid() {
		return rep15employeeid;
	}

	public void setRep15employeeid(String rep15employeeid) {
		this.rep15employeeid = rep15employeeid;
	}

	public String getRep16employeeid() {
		return rep16employeeid;
	}

	public void setRep16employeeid(String rep16employeeid) {
		this.rep16employeeid = rep16employeeid;
	}

	public String getRep17employeeid() {
		return rep17employeeid;
	}

	public void setRep17employeeid(String rep17employeeid) {
		this.rep17employeeid = rep17employeeid;
	}

	public String getBusinessUnit17() {
		return businessUnit17;
	}

	public void setBusinessUnit17(String businessUnit17) {
		this.businessUnit17 = businessUnit17;
	}

	public String[] getJobcodes18() {
		return jobcodes18;
	}

	public void setJobcodes18(String[] jobcodes18) {
		this.jobcodes18 = jobcodes18;
	}

	public String[] getJobcodes19() {
		return jobcodes19;
	}

	public void setJobcodes19(String[] jobcodes19) {
		this.jobcodes19 = jobcodes19;
	}

	public String[] getJobcodes20() {
		return jobcodes20;
	}

	public void setJobcodes20(String[] jobcodes20) {
		this.jobcodes20 = jobcodes20;
	}

	public String[] getJobcodes21() {
		return jobcodes21;
	}

	public void setJobcodes21(String[] jobcodes21) {
		this.jobcodes21 = jobcodes21;
	}

	public String[] getJobcodes22() {
		return jobcodes22;
	}

	public void setJobcodes22(String[] jobcodes22) {
		this.jobcodes22 = jobcodes22;
	}



	public String getCourseStDate28() {
		return courseStDate28;
	}

	public void setCourseStDate28(String courseStDate28) {
		this.courseStDate28 = courseStDate28;
	}

	public String getCourseEndDate28() {
		return courseEndDate28;
	}

	public void setCourseEndDate28(String courseEndDate28) {
		this.courseEndDate28 = courseEndDate28;
	}

	public String[] getCourseCodes23() {
		return courseCodes23;
	}

	public void setCourseCodes23(String[] courseCodes23) {
		this.courseCodes23 = courseCodes23;
	}

	public String getRep25employeeid() {
		return rep25employeeid;
	}

	public void setRep25employeeid(String rep25employeeid) {
		this.rep25employeeid = rep25employeeid;
	}

	public String getBusinessUnit25() {
		return businessUnit25;
	}

	public void setBusinessUnit25(String businessUnit25) {
		this.businessUnit25 = businessUnit25;
	}

	public String getRep26employeeid() {
		return rep26employeeid;
	}

	public void setRep26employeeid(String rep26employeeid) {
		this.rep26employeeid = rep26employeeid;
	}

	public String getBusinessUnit26() {
		return businessUnit26;
	}

	public void setBusinessUnit26(String businessUnit26) {
		this.businessUnit26 = businessUnit26;
	}

	public String getRep27employeeid() {
		return rep27employeeid;
	}

	public void setRep27employeeid(String rep27employeeid) {
		this.rep27employeeid = rep27employeeid;
	}

	public String getBusinessUnit27() {
		return businessUnit27;
	}

	public void setBusinessUnit27(String businessUnit27) {
		this.businessUnit27 = businessUnit27;
	}

	public String getBusinessUnit24() {
		return businessUnit24;
	}

	public void setBusinessUnit24(String businessUnit24) {
		this.businessUnit24 = businessUnit24;
	}

	public String getCourseStDate24() {
		return courseStDate24;
	}

	public void setCourseStDate24(String courseStDate24) {
		this.courseStDate24 = courseStDate24;
	}

	public String[] getCourseCodes28() {
		return courseCodes28;
	}

	public void setCourseCodes28(String[] courseCodes28) {
		this.courseCodes28 = courseCodes28;
	}

	public Map<String, String> getSampleDropdownMap() {
		return sampleDropdownMap;
	}

	public void setSampleDropdownMap(Map<String, String> sampleDropdownMap) {
		this.sampleDropdownMap = sampleDropdownMap;
	}

	public String getSinglejobcode18() {
		return singlejobcode18;
	}

	public void setSinglejobcode18(String singlejobcode18) {
		this.singlejobcode18 = singlejobcode18;
	}

	public String getSinglejobcode19() {
		return singlejobcode19;
	}

	public void setSinglejobcode19(String singlejobcode19) {
		this.singlejobcode19 = singlejobcode19;
	}

	public String getSinglejobcode20() {
		return singlejobcode20;
	}

	public void setSinglejobcode20(String singlejobcode20) {
		this.singlejobcode20 = singlejobcode20;
	}

	public String getSinglejobcode21() {
		return singlejobcode21;
	}

	public void setSinglejobcode21(String singlejobcode21) {
		this.singlejobcode21 = singlejobcode21;
	}

	public String getSinglejobcode22() {
		return singlejobcode22;
	}

	public void setSinglejobcode22(String singlejobcode22) {
		this.singlejobcode22 = singlejobcode22;
	}

	public String getSinglejobcode23() {
		return singlejobcode23;
	}

	public void setSinglejobcode23(String singlejobcode23) {
		this.singlejobcode23 = singlejobcode23;
	}

	public String[] getCourseCodes5() {
		return courseCodes5;
	}

	public void setCourseCodes5(String[] courseCodes5) {
		this.courseCodes5 = courseCodes5;
	}

	public String getEmployeeid5() {
		return employeeid5;
	}

	public void setEmployeeid5(String employeeid5) {
		this.employeeid5 = employeeid5;
	}

	public String[] getJobcodes29() {
		return jobcodes29;
	}

	public void setJobcodes29(String[] jobcodes29) {
		this.jobcodes29 = jobcodes29;
	}

	public String getSinglejobcode29() {
		return singlejobcode29;
	}

	public void setSinglejobcode29(String singlejobcode29) {
		this.singlejobcode29 = singlejobcode29;
	}

	public String getJobtitle19() {
		return jobtitle19;
	}

	public void setJobtitle19(String jobtitle19) {
		this.jobtitle19 = jobtitle19;
	}

	public String getJobtitle20() {
		return jobtitle20;
	}

	public void setJobtitle20(String jobtitle20) {
		this.jobtitle20 = jobtitle20;
	}

	public String getJobtitle21() {
		return jobtitle21;
	}

	public void setJobtitle21(String jobtitle21) {
		this.jobtitle21 = jobtitle21;
	}

	public String getJobtitle22() {
		return jobtitle22;
	}

	public void setJobtitle22(String jobtitle22) {
		this.jobtitle22 = jobtitle22;
	}

	public String getJobtitle29() {
		return jobtitle29;
	}

	public void setJobtitle29(String jobtitle29) {
		this.jobtitle29 = jobtitle29;
	}

	public String getRep28employeeid() {
		return rep28employeeid;
	}

	public void setRep28employeeid(String rep28employeeid) {
		this.rep28employeeid = rep28employeeid;
	}

	public String getJobtitle18() {
		return jobtitle18;
	}

	public void setJobtitle18(String jobtitle18) {
		this.jobtitle18 = jobtitle18;
	}

	public String getSingleCourseCodes28() {
		return singleCourseCodes28;
	}

	public void setSingleCourseCodes28(String singleCourseCodes28) {
		this.singleCourseCodes28 = singleCourseCodes28;
	}

	public String getSingleCourseCodes1() {
		return singleCourseCodes1;
	}

	public void setSingleCourseCodes1(String singleCourseCodes1) {
		this.singleCourseCodes1 = singleCourseCodes1;
	}

	public String getRep30ssn() {
		return rep30ssn;
	}

	public void setRep30ssn(String rep30ssn) {
		this.rep30ssn = rep30ssn;
	}

	public String getRep31ssn() {
		return rep31ssn;
	}

	public void setRep31ssn(String rep31ssn) {
		this.rep31ssn = rep31ssn;
	}

	public String getRep32ssn() {
		return rep32ssn;
	}

	public void setRep32ssn(String rep32ssn) {
		this.rep32ssn = rep32ssn;
	}

	public String getRep33ssn() {
		return rep33ssn;
	}

	public void setRep33ssn(String rep33ssn) {
		this.rep33ssn = rep33ssn;
	}

}
