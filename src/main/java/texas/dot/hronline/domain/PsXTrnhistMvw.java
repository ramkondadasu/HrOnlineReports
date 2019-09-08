package texas.dot.hronline.domain;


import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PS_X_TRNHIST_MVW database table.
 * 
 */

@Entity
@Immutable
@Table(schema="hrhist", name="PS_X_TRNHIST_MVW")
public class PsXTrnhistMvw implements Serializable {
	private static final long serialVersionUID = 1L;

	private String attendance;
	
	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name="BUSINESS_UNIT")
	private String businessUnit;

	@Column(name="COST_UNIT_CD")
	private String costUnitCd;

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

	private String descr;

	private String descrshort;

	@Column(name="DURATION_TIME")
	private BigDecimal durationTime;

	private String emplid;

	private String name;

	@Column(name="X_CEU")
	private BigDecimal xCeu;

	public PsXTrnhistMvw() {
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

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
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

	public String getEmplid() {
		return this.emplid;
	}

	public void setEmplid(String emplid) {
		this.emplid = emplid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getXCeu() {
		return this.xCeu;
	}

	public void setXCeu(BigDecimal xCeu) {
		this.xCeu = xCeu;
	}

}