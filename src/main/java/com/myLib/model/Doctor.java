package com.myLib.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Doctor{
	
	@Id
	private Long doctorId;
	private String doctorName;
	private String doctorAge;
	private char doctorGender;
	private String specialistField;
	private int patientAtteneded;
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Doctor(Long doctorId, String doctorName, String doctorAge, char doctorGender, String specialistField,
			int patientAtteneded) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorAge = doctorAge;
		this.doctorGender = doctorGender;
		this.specialistField = specialistField;
		this.patientAtteneded = patientAtteneded;
	}

	public int getPatientAtteneded() {
		return patientAtteneded;
	}
	public void setPatientAtteneded(int patientAtteneded) {
		this.patientAtteneded = patientAtteneded;
	}
	public Long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorAge() {
		return doctorAge;
	}
	public void setDoctorAge(String doctorAge) {
		this.doctorAge = doctorAge;
	}
	public char getDoctorGender() {
		return doctorGender;
	}
	public void setDoctorGender(char doctorGender) {
		this.doctorGender = doctorGender;
	}
	public String getSpecialistField() {
		return specialistField;
	}
	public void setSpecialistField(String specialistField) {
		this.specialistField = specialistField;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorAge=" + doctorAge
				+ ", doctorGender=" + doctorGender + ", specialistField=" + specialistField + ", patientAtteneded="
				+ patientAtteneded + "]";
	}

	
}
