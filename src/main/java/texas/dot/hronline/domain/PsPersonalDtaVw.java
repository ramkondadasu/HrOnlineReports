package texas.dot.hronline.domain;

import java.io.Serializable;
import javax.persistence.*;

import org.hibernate.annotations.Immutable;


/**
 * The persistent class for the PS_PERSONAL_DTA_VW database table.
 * 
 */
@Entity
@Immutable
@Table(schema="hrhist",name="PS_PERSONAL_DTA_VW")
@NamedQuery(name="PsPersonalDtaVw.findAll", query="SELECT p FROM PsPersonalDtaVw p")
public class PsPersonalDtaVw implements Serializable {
	private static final long serialVersionUID = 1L;

	private String emplid;
	
	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name="FIRST_NAME")
	private String firstName;

	@Column(name="LAST_NAME")
	private String lastName;

	private String name;

	public PsPersonalDtaVw() {
	}

	public String getEmplid() {
		return this.emplid;
	}

	public void setEmplid(String emplid) {
		this.emplid = emplid;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}