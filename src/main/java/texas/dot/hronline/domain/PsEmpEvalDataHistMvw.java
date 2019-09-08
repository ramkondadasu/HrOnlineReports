package texas.dot.hronline.domain;
import org.hibernate.annotations.Immutable;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the PS_EMP_EVAL_DATA_HIST_MVW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="PS_EMP_EVAL_DATA_HIST_MVW")
@NamedQuery(name="PsEmpEvalDataHistMvw.findAll", query="SELECT p FROM PsEmpEvalDataHistMvw p")
public class PsEmpEvalDataHistMvw implements Serializable {
	private static final long serialVersionUID = 1L;

	private String descr;

	@Temporal(TemporalType.DATE)
	private Date effdt;

	private String emplid;
	@Id
	private BigDecimal id;

	private String name;

	@Temporal(TemporalType.DATE)
	@Column(name="NEXT_REVIEW_DT")
	private Date nextReviewDt;

	@Column(name="RATING_SCALE")
	private String ratingScale;

	@Temporal(TemporalType.DATE)
	@Column(name="REVIEW_DT")
	private Date reviewDt;

	@Temporal(TemporalType.DATE)
	@Column(name="REVIEW_FROM_DT")
	private Date reviewFromDt;

	@Column(name="REVIEW_RATING")
	private String reviewRating;

	@Temporal(TemporalType.DATE)
	@Column(name="REVIEW_THRU_DT")
	private Date reviewThruDt;

	@Column(name="REVIEW_TYPE")
	private String reviewType;

	private String xlatlongname;

	public PsEmpEvalDataHistMvw() {
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public Date getEffdt() {
		return this.effdt;
	}

	public void setEffdt(Date effdt) {
		this.effdt = effdt;
	}

	public String getEmplid() {
		return this.emplid;
	}

	public void setEmplid(String emplid) {
		this.emplid = emplid;
	}

	public BigDecimal getId() {
		return this.id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getNextReviewDt() {
		return this.nextReviewDt;
	}

	public void setNextReviewDt(Date nextReviewDt) {
		this.nextReviewDt = nextReviewDt;
	}

	public String getRatingScale() {
		return this.ratingScale;
	}

	public void setRatingScale(String ratingScale) {
		this.ratingScale = ratingScale;
	}

	public Date getReviewDt() {
		return this.reviewDt;
	}

	public void setReviewDt(Date reviewDt) {
		this.reviewDt = reviewDt;
	}

	public Date getReviewFromDt() {
		return this.reviewFromDt;
	}

	public void setReviewFromDt(Date reviewFromDt) {
		this.reviewFromDt = reviewFromDt;
	}

	public String getReviewRating() {
		return this.reviewRating;
	}

	public void setReviewRating(String reviewRating) {
		this.reviewRating = reviewRating;
	}

	public Date getReviewThruDt() {
		return this.reviewThruDt;
	}

	public void setReviewThruDt(Date reviewThruDt) {
		this.reviewThruDt = reviewThruDt;
	}

	public String getReviewType() {
		return this.reviewType;
	}

	public void setReviewType(String reviewType) {
		this.reviewType = reviewType;
	}

	public String getXlatlongname() {
		return this.xlatlongname;
	}

	public void setXlatlongname(String xlatlongname) {
		this.xlatlongname = xlatlongname;
	}

}