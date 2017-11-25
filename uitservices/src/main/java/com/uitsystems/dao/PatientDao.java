/**
 * 
 */
package com.uitsystems.dao;

import java.util.List;

import com.uitsystems.domain.Patient;

/**
 * @author VENU
 *
 */
public interface PatientDao {
	
	public Patient getPatient();
	public Patient createPatient(Patient pat);
	public void deletePatient(Patient pat);
	public Patient updatePatient(Patient pat);
	public List<Patient> searchPatientByName(String Pname);

}
