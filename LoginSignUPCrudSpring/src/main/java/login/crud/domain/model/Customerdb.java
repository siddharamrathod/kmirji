package login.crud.domain.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the customerdb database table.
 * 
 */
@Entity
@Table(name="customerdb")
@NamedQuery(name="Customerdb.findAll", query="SELECT c FROM Customerdb c")
public class Customerdb implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, length=50)
	private String username;

	@Column(length=100)
	private String name;

	@Column(length=45)
	private String password;

	public Customerdb() {
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}