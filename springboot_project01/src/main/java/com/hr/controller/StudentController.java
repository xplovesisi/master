package com.hr.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hr.entity.Student;
import com.hr.service.StudentService;
	
@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService ss;
	@RequestMapping("/selectAll")
	public String selectAll(Map<String, Object> map){
		System.out.println("这是controller类1");
		List<Student> list = ss.selectAll();
		map.put("list", list);
		return "list";
	}
//	@RequestMapping("/delete")
//	public String delete(int sid,ModelMap map) {
//		int delete = ss.delete(sid);
//		System.out.println(delete );
//		return selectAll(map);
//	}
//	@RequestMapping("/selectById")
//	public String selectById(int sid,ModelMap map) {
//		Student student = ss.selectById(sid);
//		map.put("stu", student);
//		return "/update.jsp";
//	}
}
