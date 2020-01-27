package com.JontySubhajitweb.demo.dao;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import org.springframework.stereotype.Service;

import com.JontySubhajitweb.demo.model.Employment;
@Service
public class Employmentrepository  {

	List<Employment> emplist = new ArrayList<>(Arrays.asList());

			public List<Employment> getAllemployee() {
				return emplist;
			}

			public Employment getEmployeeByEmpID(int empID) {
				
				Employment emp= emplist.stream().filter(e -> e.getEmpID()== empID).findFirst().get();
				return emp;
			
			}
			
			public List<Employment> AddEmployee(Employment Employment) {
				int empid = Employment.getEmpID();
				try {
				Employment emp= emplist.stream().filter(e -> e.getEmpID()== empid).findFirst().get();
				
					emp.setEmpDesignation(Employment.getEmpDesignation());
					emp.setEmpEmail(Employment.getEmpEmail());
					emp.setEmpGrade(Employment.getEmpGrade());
					emp.setEmpName(Employment.getEmpName());
					emp.setEmpRank(Employment.getEmpRank());
				return emplist;
				}
				catch (Exception e) {
				emplist.add(Employment);
				return emplist;
				}
				
			}

			public List<Employment> UpdateEmployee(Employment Employment) {
				
				int empid = Employment.getEmpID();
				try {
				Employment emp= emplist.stream().filter(e -> e.getEmpID()== empid).findFirst().get();
				
					emp.setEmpDesignation(Employment.getEmpDesignation());
					emp.setEmpEmail(Employment.getEmpEmail());
					emp.setEmpGrade(Employment.getEmpGrade());
					emp.setEmpName(Employment.getEmpName());
					emp.setEmpRank(Employment.getEmpRank());
				return emplist;
				}
				catch (Exception e) {
				emplist.add(Employment);
				return emplist;
				}
				
			}
			
		public List<Employment> DeleteEmplpyee(int empID) {
			Employment emp= emplist.stream().filter(e -> e.getEmpID()== empID).findFirst().get();
			emplist.remove(emp);
			return emplist;
		}

	}
	

