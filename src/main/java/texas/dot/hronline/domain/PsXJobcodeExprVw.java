package texas.dot.hronline.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PS_X_JOBCODE_EXPR_VW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="PS_X_JOBCODE_EXPR_VW")
@NamedQuery(name="PsXJobcodeExprVw.findAll", query="SELECT p FROM PsXJobcodeExprVw p")
public class PsXJobcodeExprVw implements Serializable {
	private static final long serialVersionUID = 1L;

	private String description;

	@Temporal(TemporalType.DATE)
	private Date effdt;

	private String flag;

	@Id
	private BigDecimal id;

	@Column(name="JOB_TITLE")
	private String jobTitle;

	private String jobcode;

	private String setid;

	public PsXJobcodeExprVw() {
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getEffdt() {
		return this.effdt;
	}

	public void setEffdt(Date effdt) {
		this.effdt = effdt;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
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