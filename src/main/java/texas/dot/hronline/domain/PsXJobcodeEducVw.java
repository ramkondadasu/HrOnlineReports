package texas.dot.hronline.domain;


import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PS_X_JOBCODE_EDUC_VW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="PS_X_JOBCODE_EDUC_VW")
@NamedQuery(name="PsXJobcodeEducVw.findAll", query="SELECT p FROM PsXJobcodeEducVw p")
public class PsXJobcodeEducVw implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="EDUCATION_DESCRIPTION")
	private String educationDescription;

	@Temporal(TemporalType.DATE)
	private Date effdt;

	@Id
	private BigDecimal id;

	@Column(name="JOB_TITLE")
	private String jobTitle;

	private String jobcode;

	private String setid;

	public PsXJobcodeEducVw() {
	}

	public String getEducationDescription() {
		return this.educationDescription;
	}

	public void setEducationDescription(String educationDescription) {
		this.educationDescription = educationDescription;
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

	public String getJobTitle() {
		return this.jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobcode() {
		return this.jobcode;
	}

	public void setJobcode(String jobcode) {
		this.jobcode = jobcode;
	}

	public String getSetid() {
		return this.setid;
	}

	public void setSetid(String setid) {
		this.setid = setid;
	}

	

	

}