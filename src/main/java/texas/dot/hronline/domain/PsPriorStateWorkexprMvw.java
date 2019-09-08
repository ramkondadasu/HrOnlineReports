package texas.dot.hronline.domain;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PS_PRIOR_STATE_WORKEXPR_MVW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="PS_PRIOR_STATE_WORKEXPR_MVW")
@NamedQuery(name="PsPriorStateWorkexprMvw.findAll", query="SELECT p FROM PsPriorStateWorkexprMvw p")
public class PsPriorStateWorkexprMvw implements Serializable {
	private static final long serialVersionUID = 1L;

	private String company;

	private String descr100;

	private String emplid;
	
	private String name;

	@Temporal(TemporalType.DATE)
	@Column(name="END_DT")
	private Date endDt;
	@Id
	private BigDecimal id;

	@Column(name="SEQUENCE_NBR")
	private BigDecimal sequenceNbr;

	@Temporal(TemporalType.DATE)
	@Column(name="START_DT")
	private Date startDt;

	public PsPriorStateWorkexprMvw() {
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDescr100() {
		return this.descr100;
	}

	public void setDescr100(String descr100) {
		this.descr100 = descr100;
	}

	public String getEmplid() {
		return this.emplid;
	}

	public void setEmplid(String emplid) {
		this.emplid = emplid;
	}

	public Date getEndDt() {
		return this.endDt;
	}

	public void setEndDt(Date endDt) {
		this.endDt = endDt;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getSequenceNbr() {
		return this.sequenceNbr;
	}

	public void setSequenceNbr(BigDecimal sequenceNbr) {
		this.sequenceNbr = sequenceNbr;
	}

	public Date getStartDt() {
		return this.startDt;
	}

	public void setStartDt(Date startDt) {
		this.startDt = startDt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}