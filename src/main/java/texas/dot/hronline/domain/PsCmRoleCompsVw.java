package texas.dot.hronline.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PS_CM_ROLE_COMPS_VW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="PS_CM_ROLE_COMPS_VW")
@NamedQuery(name="PsCmRoleCompsVw.findAll", query="SELECT p FROM PsCmRoleCompsVw p")
public class PsCmRoleCompsVw implements Serializable {
	private static final long serialVersionUID = 1L;

	private String competency;

	@Column(name="COMPETENCY_DESCRIPTION")
	private String competencyDescription;

	@Temporal(TemporalType.DATE)
	private Date effdt;

	private BigDecimal id;

	@Column(name="JOB_TITLE")
	private String jobTitle;

	private String jobcode;

	private String proficiency;

	private BigDecimal seqno;

	public PsCmRoleCompsVw() {
	}

	public String getCompetency() {
		return this.competency;
	}

	public void setCompetency(String competency) {
		this.competency = competency;
	}

	public String getCompetencyDescription() {
		return this.competencyDescription;
	}

	public void setCompetencyDescription(String competencyDescription) {
		this.competencyDescription = competencyDescription;
	}

	public Date getEffdt() {
		return this.effdt;
	}

	public void setEffdt(Date effdt) {
		this.effdt = effdt;
	}
	@Id
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

	public String getProficiency() {
		return this.proficiency;
	}

	public void setProficiency(String proficiency) {
		this.proficiency = proficiency;
	}

	public BigDecimal getSeqno() {
		return this.seqno;
	}

	public void setSeqno(BigDecimal seqno) {
		this.seqno = seqno;
	}

}