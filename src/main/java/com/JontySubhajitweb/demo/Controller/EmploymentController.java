package com.JontySubhajitweb.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.JontySubhajitweb.demo.dao.Employmentrepository;
import com.JontySubhajitweb.demo.model.Employment;

@RestController
public class EmploymentController {

	
	@Autowired
	Employmentrepository repo;
	
	
	
	@GetMapping(path="/Employment",produces= {"application/json"})
	public List<Employment> AllEmployee() {
		return repo.getAllemployee();
	}
	
	
	@GetMapping(path="/Employment/{EmpID}",produces= {"application/json"})
	public Employment GetEmployeeByEmpID(@PathVariable("EmpID") int EmpID) {
		return repo.getEmployeeByEmpID(EmpID);
	}
	
	@PostMapping(path="/Employment", consumes={"application/json"})
	public List<Employment> AddEmployeepost(@RequestBody Employment employment) {
		return repo.AddEmployee(employment);
		
	}
	
	
	@DeleteMapping(path="/Employment/{EmpID}",produces= {"application/json"})
	public List<Employment> EmployeeEMPIDDelete(@PathVariable("EmpID") int EmpID) {
		
		return repo.DeleteEmplpyee(EmpID);
		
	}
	
	
	@PutMapping(path="/Employment", consumes={"application/json"})
	public Employment AddorupEmployeepost(@RequestBody Employment employment) {
		repo.UpdateEmployee(employment);
		return employment;
		
	}
	
}