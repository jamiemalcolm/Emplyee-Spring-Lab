package com.example.demo;

import com.example.demo.models.Department;
import com.example.demo.models.Employee;
import com.example.demo.models.Project;
import com.example.demo.repositories.DepartmentRepository;
import com.example.demo.repositories.EmployeeRepository;
import com.example.demo.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;



	@Test
	void contextLoads() {
	}

	@Test
	public void createEverything(){
		Department department = new Department("justAName");
		departmentRepository.save(department);
		Employee employee = new Employee("Bob","Long", 007, department);
		employeeRepository.save(employee);
		Employee employee1 = new Employee("BobsBrother","Long", 001, department);
		employeeRepository.save(employee1);
		Project project = new Project("ProjectName");
		projectRepository.save(project);
		employee.addProject(project);



	}

}
