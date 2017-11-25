/**
 * 
 */
package com.uitsystems.service;

import java.util.List;

import com.uitsystems.bean.PatinetBean;

/**
 * @author VENU
 *
 */
public interface PatientService {
	
	public PatinetBean getPatient();
	public PatinetBean createPatient(PatinetBean pbean);
	public void deletePatient(PatinetBean pbean);
	public PatinetBean updatePatient(PatinetBean pbean);
	public List<PatinetBean> searchPatientByName(String Pname);
}
