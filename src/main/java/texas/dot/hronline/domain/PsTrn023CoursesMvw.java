package texas.dot.hronline.domain;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PS_TRN023_COURSES_MVW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="PS_TRN023_COURSES_MVW")
@NamedQuery(name="PsTrn023CoursesMvw.findAll", query="SELECT p FROM PsTrn023CoursesMvw p")
public class PsTrn023CoursesMvw implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="COST_UNIT_CD")
	private String costUnitCd;

	private String course;

	@Column(name="COURSE_DESCR_TYPE")
	private String courseDescrType;

	@Column(name="COURSE_OFFERING")
	private String courseOffering;

	@Column(name="COURSE_STATUS")
	private String courseStatus;

	@Column(name="COURSE_TYPE")
	private String courseType;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATION_DT")
	private Date creationDt;

	@Column(name="CRSE_COST_UNIT_DESCR")
	private String crseCostUnitDescr;

	private String descr;

	private String descrlong;

	private String descrshort;

	@Column(name="DURATION_TIME")
	private BigDecimal durationTime;

	@Column(name="EDUCATION_UNITS")
	private BigDecimal educationUnits;

	@Temporal(TemporalType.DATE)
	private Date effdt;
	@Id
	private BigDecimal id;

	@Column(name="INTERNAL_EXTERNAL")
	private String internalExternal;

	@Column(name="MAX_STUDENTS")
	private BigDecimal maxStudents;

	@Column(name="MIN_STUDENTS")
	private BigDecimal minStudents;

	@Column(name="PRIMARY_DEL_METHOD")
	private String primaryDelMethod;

	@Temporal(TemporalType.DATE)
	@Column(name="REVISION_DT")
	private Date revisionDt;

	private String school;

	@Column(name="SCHOOL_CODE")
	private String schoolCode;

	@Column(name="SESSN_ADMINISTRATN")
	private String sessnAdministratn;

	@Column(name="X_MANDATE")
	private String xMandate;

	@Column(name="X_SPECIAL_INSTRUCT")
	private String xSpecialInstruct;

	public PsTrn023CoursesMvw() {
	}

	public String getCostUnitCd() {
		return this.costUnitCd;
	}

	public void setCostUnitCd(String costUnitCd) {
		this.costUnitCd = costUnitCd;
	}

	public String getCourse() {
		return this.course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCourseDescrType() {
		return this.courseDescrType;
	}

	public void setCourseDescrType(String courseDescrType) {
		this.courseDescrType = courseDescrType;
	}

	public String getCourseOffering() {
		return this.courseOffering;
	}

	public void setCourseOffering(String courseOffering) {
		this.courseOffering = courseOffering;
	}

	public String getCourseStatus() {
		return this.courseStatus;
	}

	public void setCourseStatus(String courseStatus) {
		this.courseStatus = courseStatus;
	}

	public String getCourseType() {
		return this.courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public Date getCreationDt() {
		return this.creationDt;
	}

	public void setCreationDt(Date creationDt) {
		this.creationDt = creationDt;
	}

	public String getCrseCostUnitDescr() {
		return this.crseCostUnitDescr;
	}

	public void setCrseCostUnitDescr(String crseCostUnitDescr) {
		this.crseCostUnitDescr = crseCostUnitDescr;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getDescrlong() {
		return this.descrlong;
	}

	public void setDescrlong(String descrlong) {
		this.descrlong = descrlong;
	}

	public String getDescrshort() {
		return this.descrshort;
	}

	public void setDescrshort(String descrshort) {
		this.descrshort = descrshort;
	}

	public BigDecimal getDurationTime() {
		return this.durationTime;
	}

	public void setDurationTime(BigDecimal durationTime) {
		this.durationTime = durationTime;
	}

	public BigDecimal getEducationUnits() {
		return this.educationUnits;
	}

	public void setEducationUnits(BigDecimal educationUnits) {
		this.educationUnits = educationUnits;
	}

	public Date getEffdt() {
		return this.effdt;
	}

	public void setEffdt(Date effdt) {
		this.effdt = effdt;
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

	public BigDecimal getMaxStudents() {
		return this.maxStudents;
	}

	public void setMaxStudents(BigDecimal maxStudents) {
		this.maxStudents = maxStudents;
	}

	public BigDecimal getMinStudents() {
		return this.minStudents;
	}

	public void setMinStudents(BigDecimal minStudents) {
		this.minStudents = minStudents;
	}

	public String getPrimaryDelMethod() {
		return this.primaryDelMethod;
	}

	public void setPrimaryDelMethod(String primaryDelMethod) {
		this.primaryDelMethod = primaryDelMethod;
	}

	public Date getRevisionDt() {
		return this.revisionDt;
	}

	public void setRevisionDt(Date revisionDt) {
		this.revisionDt = revisionDt;
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

	public String getSessnAdministratn() {
		return this.sessnAdministratn;
	}

	public void setSessnAdministratn(String sessnAdministratn) {
		this.sessnAdministratn = sessnAdministratn;
	}

	public String getXMandate() {
		return this.xMandate;
	}

	public void setXMandate(String xMandate) {
		this.xMandate = xMandate;
	}

	public String getXSpecialInstruct() {
		return this.xSpecialInstruct;
	}

	public void setXSpecialInstruct(String xSpecialInstruct) {
		this.xSpecialInstruct = xSpecialInstruct;
	}

}