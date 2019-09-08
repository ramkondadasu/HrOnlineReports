package texas.dot.hronline.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import org.hibernate.annotations.Immutable;



/**
 * The persistent class for the PS_EDITABLE_TRG_HISTORY_MVW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="PS_EDITABLE_TRG_HISTORY_MVW")
@NamedQuery(name="PsEditableTrgHistoryMvw.findAll", query="SELECT p FROM PsEditableTrgHistoryMvw p")
public class PsEditableTrgHistoryMvw implements Serializable {
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

	@Temporal(TemporalType.DATE)
	@Column(name="COURSE_START_DT")
	private Date courseStartDt;

	@Column(name="COURSE_TITLE")
	private String courseTitle;

	private String deptid;

	private String emplid;

	@Column(name="EMPLOYEE_NAME")
	private String employeeName;
	@Id
	private BigDecimal id;

	@Column(name="INTERNAL_EXTERNAL")
	private String internalExternal;

	@Column(name="SESSION_NBR")
	private String sessionNbr;

	@Column(name="X_CEU")
	private BigDecimal xCeu;

	public PsEditableTrgHistoryMvw() {
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

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
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

	public String getSessionNbr() {
		return this.sessionNbr;
	}

	public void setSessionNbr(String sessionNbr) {
		this.sessionNbr = sessionNbr;
	}

	public BigDecimal getXCeu() {
		return this.xCeu;
	}

	public void setXCeu(BigDecimal xCeu) {
		this.xCeu = xCeu;
	}

}