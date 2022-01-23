package com.myLib.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myLib.model.Patient;
import com.myLib.repo.PatientRepo;
@Service
public class PatientService {
	
	@Autowired
	private PatientRepo patrepo;

	public PatientService(PatientRepo patrepo) {
		super();
		this.patrepo = patrepo;
	}

	public List<Patient> getPatients() {
		return patrepo.findAll();
	}

	public Patient addPatient(Patient pat) {
		return patrepo.save(pat);
	}

	public Patient getPatient(Long id) {
		return patrepo.findByPatientId(id);
	}
	
	
	
}
