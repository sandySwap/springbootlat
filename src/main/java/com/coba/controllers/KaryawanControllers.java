package com.coba.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coba.dao.PsKaryawanRepo;
import com.coba.domain.PsKaryawan;

@Controller
public class KaryawanControllers {
	
	@Autowired
	private PsKaryawanRepo psKaryawanRepo;
	
	@RequestMapping("/")
	@ResponseBody
	public String index(){
		PsKaryawan psKaryawan = new PsKaryawan();
		List<PsKaryawan> psKaryawans = psKaryawanRepo.findAllByNik("15072742");
		return "ini sudah di panggil "+psKaryawans.size() ; 
	}
	
}
