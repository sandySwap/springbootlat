package com.coba.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ps_karyawan")
public class PsKaryawan implements Serializable {

	private static final long serialVersionUID = -3117362512252490982L;
	private Integer psId;
	private String psNik;
	private String psPassword;

	public PsKaryawan() {
	}

	public PsKaryawan(String psNik, String psPassword) {
		this.psNik = psNik;
		this.psPassword = psPassword;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ps_id", unique = true, nullable = false)
	public Integer getPsId() {
		return this.psId;
	}

	public void setPsId(Integer psId) {
		this.psId = psId;
	}

	@Column(name = "ps_nik", length = 20)
	public String getPsNik() {
		return this.psNik;
	}

	public void setPsNik(String psNik) {
		this.psNik = psNik;
	}

	@Column(name = "ps_password", length = 20)
	public String getPsPassword() {
		return this.psPassword;
	}

	public void setPsPassword(String psPassword) {
		this.psPassword = psPassword;
	}

}
