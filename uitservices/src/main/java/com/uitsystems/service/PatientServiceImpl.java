/**
 * 
 */
package com.uitsystems.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uitsystems.bean.PatinetBean;
import com.uitsystems.dao.PatientDao;
import com.uitsystems.domain.Patient;

/**
 * @author VENU
 *
 */
@Service
public class PatientServiceImpl implements PatientService {
	
	@Autowired
	private PatientDao pdao;

	@Override
	public PatinetBean getPatient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PatinetBean createPatient(PatinetBean pbean) {
		
		Patient pat=mapBeanToDomain(pbean);
		Patient pat1=pdao.createPatient(pat);
		PatinetBean pbean1=mapDomainToBean(pat1);
		return pbean1;
	}

	private PatinetBean mapDomainToBean(Patient pat1) {
		PatinetBean pbean=new PatinetBean();
		pbean.setPid(pat1.getPid());
		pbean.setPname(pat1.getPname());
		return pbean;
	}

	private Patient mapBeanToDomain(PatinetBean pbean) {
		Patient pat=new Patient();
		pat.setPid(pbean.getPid());
		pat.setPname(pbean.getPname());
		return pat;
	}

	@Override
	public void deletePatient(PatinetBean pbean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public PatinetBean updatePatient(PatinetBean pbean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PatinetBean> searchPatientByName(String Pname) {
		// TODO Auto-generated method stub
		return null;
	}

}
