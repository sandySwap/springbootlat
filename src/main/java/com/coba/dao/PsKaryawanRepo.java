package com.coba.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.coba.domain.PsKaryawan;

@Repository
public interface PsKaryawanRepo extends JpaRepository<PsKaryawan, Long>{

	@Modifying
	@Query(value="SELECT * FROM ps_karyawan u where u.ps_nik = :psNik", nativeQuery=true)
	public List<PsKaryawan> findAllByNik(@Param("psNik") String psNik);
	
}
