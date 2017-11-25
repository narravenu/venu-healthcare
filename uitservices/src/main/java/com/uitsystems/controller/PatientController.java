/**
 * 
 */
package com.uitsystems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.uitsystems.bean.PatinetBean;
import com.uitsystems.service.PatientService;

/**
 * @author VENU
 *
 */
@Controller
@RequestMapping("/PatientApi")
public class PatientController {
	
	@Autowired
	private PatientService pserv;
	
	@RequestMapping(value="/patients")
	@PostMapping
	public @ResponseBody PatinetBean getPatients(@RequestBody PatinetBean pat){
		/*PatinetBean pat=new PatinetBean();
		pat.setPid(10);
		pat.setPname("narsi");*/
		return pat;	
	}
	@RequestMapping("/savePatient")
	@PostMapping
	public @ResponseBody PatinetBean createPatient(@RequestBody PatinetBean pbean) {
		PatinetBean pat=pserv.createPatient(pbean);
		return pat;
		
	}

}
