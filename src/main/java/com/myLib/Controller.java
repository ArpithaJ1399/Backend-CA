package com.myLib;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myLib.model.Doctor;
import com.myLib.model.Patient;
import com.myLib.services.DoctorService;
import com.myLib.services.PatientService;

@RestController
@RequestMapping(path="/hospital")
@CrossOrigin(origins = "http://localhost:4200")
public class Controller {
	
	@Autowired
	private DoctorService docService;
	
	@Autowired
	private PatientService patService;	
	
	public Controller(DoctorService d, PatientService p)
	{
		this.docService=d;
		this.patService=p;
	}
	
	@RequestMapping("/check")
	public String home()
	{
		return "Hello";
	}
	
	@PostMapping("/addDoctor")
	public Doctor addDoctor(@RequestBody Doctor d)
	{
		return docService.addDoctor(d);
	}
	
	@GetMapping("/getDoctors")
	public List<Doctor> getAllDoctors()
	{
		List<Doctor> doctors=docService.findallDoctors();
		return doctors;
	}
	
	@GetMapping("/getPatients")
	public List<Patient> getAllPatients()
	{
		return patService.getPatients();
	}
	
	@PostMapping("/addPatient")
	public Patient addPatient(@RequestBody Patient pat)
	{
		return patService.addPatient(pat);
	}
	
	@GetMapping("/getPatientById/{id}")
	public Patient  getPatientById(@PathVariable(value="id") Long id)
	{
		return patService.getPatient(id);
	}
}
