package texas.dot.hronline.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the TRAINING_HISTORY_VW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist", name="TRAINING_HISTORY_VW")
//@NamedQuery(name="TrainingHistoryVw.findAll", query="SELECT t FROM TrainingHistoryVw t")
//@NamedQuery(name = "TrainingHistoryVw.findByBusinessUnit",query = "select u from TrainingHistoryVw u where u.businessUnit = ?1")
@NamedQueries({
    @NamedQuery(name="TrainingHistoryVw.findByBusinessUnit",
                query="select u from TrainingHistoryVw u where u.businessUnit = ?1"),
    @NamedQuery(name="Country.findByEmplid",
                query="SELECT c FROM TrainingHistoryVw c WHERE c.emplid = :emplid"),
})
public class TrainingHistoryVw implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="BUSINESS_UNIT")
	private String businessUnit;

	private String deptid;
	@Id
	private String emplid;

	private String fy;

	private String name;
	
	@Temporal(TemporalType.DATE)
	@Column(name="COURSE_END_DT")
	private Date courseEndDt;

	@Column(name="TOTAL_TIME")
	private BigDecimal totalTime;

	public TrainingHistoryVw() {
	}

	public String getBusinessUnit() {
		return this.businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getDeptid() {
		return this.deptid;
	}

	public void setDeptid(String deptid) {
		this.deptid = deptid;
	}

	public String getEmplid() {
		return org.apache.commons.lang.StringUtils.leftPad(this.emplid, 11, "0");
	}

	public void setEmplid(String emplid) {
		this.emplid = emplid;
	}

	public String getFy() {
		return this.fy;
	}

	public void setFy(String fy) {
		this.fy = fy;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getTotalTime() {
		return this.totalTime;
	}

	public void setTotalTime(BigDecimal totalTime) {
		this.totalTime = totalTime;
	}
	
	public Date getCourseEndDt() {
		return this.courseEndDt;
	}

	public void setCourseEndDt(Date courseEndDt) {
		this.courseEndDt = courseEndDt;
	}

}