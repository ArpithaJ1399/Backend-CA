package com.myLib.services;

import java.util.List;
import com.myLib.repo.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myLib.model.Doctor;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepo dRepo;
	
	public DoctorService(DoctorRepo dRepo) {
		this.dRepo = dRepo;
	}
	
	public Doctor addDoctor(Doctor d) {
		return dRepo.save(d);
	}
	
	public List<Doctor> findallDoctors()
	{
		return dRepo.findAll();
	}
	
//	public Doctor updateDoctor(Doctor d)
//	{
//		return dRepo.save(d);
//	}
//	
//	public Doctor findDoctor(String id)
//	{
//		return dRepo.findById(id).orElse(null);
//	}
//	
//	public void deleteDoctor(String id)
//	{
//		dRepo.deleteById(id);
//	}
//	public void updatePatientAttended(String id)
//	{
//		Doctor d= dRepo.getById(id); 
//		int m= d.getPatientAtteneded();
//		d.setPatientAtteneded(m+1);
//		dRepo.save(d);
//	}
}
