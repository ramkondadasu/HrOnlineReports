package texas.dot.hronline.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PS_X_JOBCODE_DUTY_VW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="PS_X_JOBCODE_DUTY_VW")
@NamedQuery(name="PsXJobcodeDutyVw.findAll", query="SELECT p FROM PsXJobcodeDutyVw p")
public class PsXJobcodeDutyVw implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DUTY_DESCRIPTION")
	private String dutyDescription;

	@Temporal(TemporalType.DATE)
	private Date effdt;
	@Id
	private BigDecimal id;

	@Column(name="JOB_TITLE")
	private String jobTitle;

	private String jobcode;

	private BigDecimal seqno;

	private String setid;

	public PsXJobcodeDutyVw() {
	}

	public String getDutyDescription() {
		return this.dutyDescription;
	}

	public void setDutyDescription(String dutyDescription) {
		this.dutyDescription = dutyDescription;
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

	public BigDecimal getSeqno() {
		return this.seqno;
	}

	public void setSeqno(BigDecimal seqno) {
		this.seqno = seqno;
	}

	public String getSetid() {
		return this.setid;
	}

	public void setSetid(String setid) {
		this.setid = setid;
	}

}