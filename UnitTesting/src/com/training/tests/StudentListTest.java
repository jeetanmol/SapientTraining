package com.training.tests;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.*;

import com.training.samples.Student;
import com.training.samples.StudentList;

public class StudentListTest {
	
	StudentList studentList = new StudentList();
	Set<Student> studentSet = new HashSet<Student>();
	

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		
		Student stu1 = new Student(101, "Anmol");
		Student stu2 = new Student(101, "Anmol");
		
		
		studentSet.add(stu1);
		studentSet.add(stu2);
		
		
		studentList.setStudentList(studentSet);
		
		
		
		int actual = studentList.getStudentList().size();
		
		assertEquals(1, actual);
	}
	
	

}
