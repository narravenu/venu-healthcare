/**
 * 
 */
package com.uitsystems.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.uitsystems.domain.Patient;

/**
 * @author VENU
 *
 */
@Repository
public class PatientDaoImpl implements PatientDao {
	
	@Autowired
	private SessionFactory sf;

	/* (non-Javadoc)
	 * @see com.uitsystems.dao.PatientDao#getPatient()
	 */
	@Override
	public Patient getPatient() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.uitsystems.dao.PatientDao#createPatient(com.uitsystems.domain.Patient)
	 */
	@Override
	public Patient createPatient(Patient pat) {
		Session session=sf.openSession();
		session.save(pat);
		session.beginTransaction().commit();
		session.close();
		return pat;
	}

	/* (non-Javadoc)
	 * @see com.uitsystems.dao.PatientDao#deletePatient(com.uitsystems.domain.Patient)
	 */
	@Override
	public void deletePatient(Patient pat) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.uitsystems.dao.PatientDao#updatePatient(com.uitsystems.domain.Patient)
	 */
	@Override
	public Patient updatePatient(Patient pat) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.uitsystems.dao.PatientDao#searchPatientByName(java.lang.String)
	 */
	@Override
	public List<Patient> searchPatientByName(String Pname) {
		// TODO Auto-generated method stub
		return null;
	}

}
