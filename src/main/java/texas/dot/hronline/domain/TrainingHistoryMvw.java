package texas.dot.hronline.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TRAINING_HISTORY_MVW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="TRAINING_HISTORY_MVW")
@NamedQuery(name="TrainingHistoryMvw.findAll", query="SELECT t FROM TrainingHistoryMvw t")
public class TrainingHistoryMvw implements Serializable {
	private static final long serialVersionUID = 1L;

	private String attendance;

	@Column(name="BUSINESS_UNIT")
	private String businessUnit;

	private String course;

	@Temporal(TemporalType.DATE)
	@Column(name="COURSE_DATE")
	private Date courseDate;

	@Temporal(TemporalType.DATE)
	@Column(name="COURSE_END_DT")
	private Date courseEndDt;

	@Column(name="COURSE_GRADE")
	private String courseGrade;

	@Temporal(TemporalType.DATE)
	@Column(name="COURSE_START_DT")
	private Date courseStartDt;

	@Column(name="COURSE_TITLE")
	private String courseTitle;

	@Column(name="DEMAND_ID")
	private String demandId;

	private String deptid;

	@Temporal(TemporalType.DATE)
	@Column(name="DT_NEEDED")
	private Date dtNeeded;

	@Column(name="DURATION_TIME")
	private BigDecimal durationTime;

	private String emplid;

	@Column(name="EMPLOYEE_NAME")
	private String employeeName;

	private BigDecimal fy;
	@Id
	private BigDecimal id;

	@Column(name="INTERNAL_EXTERNAL")
	private String internalExternal;

	@Column(name="LETTER_CD")
	private String letterCd;

	@Temporal(TemporalType.DATE)
	@Column(name="LETTER_PRINTED_DT")
	private Date letterPrintedDt;

	@Column(name="PREREQ_MET")
	private String prereqMet;

	private String school;

	@Column(name="SCHOOL_CODE")
	private String schoolCode;

	@Column(name="SESSION_NBR")
	private String sessionNbr;

	@Temporal(TemporalType.DATE)
	@Column(name="STATUS_DT")
	private Date statusDt;

	@Column(name="TRAINING_REASON")
	private String trainingReason;

	@Temporal(TemporalType.DATE)
	@Column(name="WAIT_DT")
	private Date waitDt;

	@Column(name="X_CEU")
	private BigDecimal xCeu;

	@Column(name="X_ENROL_CNCL_RESN")
	private String xEnrolCnclResn;

	public TrainingHistoryMvw() {
	}

	public String getAttendance() {
		return this.attendance;
	}

	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}

	public String getBusinessUnit() {
		return this.businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getCourse() {
		return this.course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Date getCourseDate() {
		return this.courseDate;
	}

	public void setCourseDate(Date courseDate) {
		this.courseDate = courseDate;
	}

	public Date getCourseEndDt() {
		return this.courseEndDt;
	}

	public void setCourseEndDt(Date courseEndDt) {
		this.courseEndDt = courseEndDt;
	}

	public String getCourseGrade() {
		return this.courseGrade;
	}

	public void setCourseGrade(String courseGrade) {
		this.courseGrade = courseGrade;
	}

	public Date getCourseStartDt() {
		return this.courseStartDt;
	}

	public void setCourseStartDt(Date courseStartDt) {
		this.courseStartDt = courseStartDt;
	}

	public String getCourseTitle() {
		return this.courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public String getDemandId() {
		return this.demandId;
	}

	public void setDemandId(String demandId) {
		this.demandId = demandId;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public Date getDtNeeded() {
		return this.dtNeeded;
	}

	public void setDtNeeded(Date dtNeeded) {
		this.dtNeeded = dtNeeded;
	}

	public BigDecimal getDurationTime() {
		return this.durationTime;
	}

	public void setDurationTime(BigDecimal durationTime) {
		this.durationTime = durationTime;
	}

	public String getEmplid() {
		return this.emplid;
	}

	public void setEmplid(String emplid) {
		this.emplid = emplid;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public BigDecimal getFy() {
		return this.fy;
	}

	public void setFy(BigDecimal fy) {
		this.fy = fy;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getInternalExternal() {
		return this.internalExternal;
	}

	public void setInternalExternal(String internalExternal) {
		this.internalExternal = internalExternal;
	}

	public String getLetterCd() {
		return this.letterCd;
	}

	public void setLetterCd(String letterCd) {
		this.letterCd = letterCd;
	}

	public Date getLetterPrintedDt() {
		return this.letterPrintedDt;
	}

	public void setLetterPrintedDt(Date letterPrintedDt) {
		this.letterPrintedDt = letterPrintedDt;
	}

	public String getPrereqMet() {
		return this.prereqMet;
	}

	public void setPrereqMet(String prereqMet) {
		this.prereqMet = prereqMet;
	}

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSchoolCode() {
		return this.schoolCode;
	}

	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getSessionNbr() {
		return this.sessionNbr;
	}

	public void setSessionNbr(String sessionNbr) {
		this.sessionNbr = sessionNbr;
	}

	public Date getStatusDt() {
		return this.statusDt;
	}

	public void setStatusDt(Date statusDt) {
		this.statusDt = statusDt;
	}

	public String getTrainingReason() {
		return this.trainingReason;
	}

	public void setTrainingReason(String trainingReason) {
		this.trainingReason = trainingReason;
	}

	public Date getWaitDt() {
		return this.waitDt;
	}

	public void setWaitDt(Date waitDt) {
		this.waitDt = waitDt;
	}

	public BigDecimal getXCeu() {
		return this.xCeu;
	}

	public void setXCeu(BigDecimal xCeu) {
		this.xCeu = xCeu;
	}

	public String getXEnrolCnclResn() {
		return this.xEnrolCnclResn;
	}

	public void setXEnrolCnclResn(String xEnrolCnclResn) {
		this.xEnrolCnclResn = xEnrolCnclResn;
	}

}