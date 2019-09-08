package texas.dot.hronline.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;


/**
 * The persistent class for the APPLN_USER database table.
 * 
 */
@Entity
@Table(schema="hrhist",name="APPLN_USER")
@NamedQuery(name="ApplnUser.findAll", query="SELECT a FROM ApplnUser a")
public class ApplnUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="APPLN_USER_ID")
	@GeneratedValue(strategy=GenerationType.AUTO, generator="my_seq_gen")
	@SequenceGenerator(name="my_seq_gen", sequenceName="HRHIST.SEQ_APPLN_USER")
	private Long applnUserId;

	@Column(name="FIRST_NM")
	private String firstNm;

	@Column(name="IS_ACTIVE")
	private String isActive;

	@Column(name="LAST_NM")
	private String lastNm;

	@Column(name="ROLES_ID")
	private String rolesId;
	
	@Transient
	private String[] rolesmulti = new String[1];

	@Column(name="USER_NM")
	private String userNm;

	public ApplnUser() {
	}

	public Long getApplnUserId() {
		return this.applnUserId;
	}

	public void setApplnUserId(Long applnUserId) {
		this.applnUserId = applnUserId;
	}

	public String getFirstNm() {
		return this.firstNm;
	}

	public void setFirstNm(String firstNm) {
		this.firstNm = firstNm;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getLastNm() {
		return this.lastNm;
	}

	public void setLastNm(String lastNm) {
		this.lastNm = lastNm;
	}

	public String getRolesId() {
		return this.rolesId;
	}

	public void setRolesId(String rolesId) {
		this.rolesId = rolesId;
	}

	public String getUserNm() {
		return this.userNm;
	}

	public void setUserNm(String userNm) {
		this.userNm = userNm;
	}

	public String[] getRolesmulti() {
		return rolesmulti;
	}

	public void setRolesmulti(String[] rolesmulti) {
		this.rolesmulti = rolesmulti;
	}

}