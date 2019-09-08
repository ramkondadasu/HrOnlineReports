package texas.dot.hronline.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PS_X_JOBCODE_SUBS_VW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="PS_X_JOBCODE_SUBS_VW")
@NamedQuery(name="PsXJobcodeSubsVw.findAll", query="SELECT p FROM PsXJobcodeSubsVw p")
public class PsXJobcodeSubsVw implements Serializable {
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private Date effdt;

	@Column(name="HIGHEST_EDUC_LVL")
	private String highestEducLvl;
	@Id
	private BigDecimal id;

	private String jobcode;

	private String setid;

	@Column(name="YEARS_OF_EXP")
	private BigDecimal yearsOfExp;

	public PsXJobcodeSubsVw() {
	}

	public Date getEffdt() {
		return this.effdt;
	}

	public void setEffdt(Date effdt) {
		this.effdt = effdt;
	}

	public String getHighestEducLvl() {
		return this.highestEducLvl;
	}

	public void setHighestEducLvl(String highestEducLvl) {
		this.highestEducLvl = highestEducLvl;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
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

	public BigDecimal getYearsOfExp() {
		return this.yearsOfExp;
	}

	public void setYearsOfExp(BigDecimal yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
	}

}