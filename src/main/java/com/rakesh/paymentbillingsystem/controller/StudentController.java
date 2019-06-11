package com.rakesh.paymentbillingsystem.controller;

import com.rakesh.paymentbillingsystem.dto.StudentDto;
import com.rakesh.paymentbillingsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Rakesh Kuchana
 */
@Controller
@RequestMapping("/student")
public class StudentController
{
    @Autowired
    private StudentService studentService;
    
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@ModelAttribute("studentRegistrationForm") StudentDto studentDto, ModelMap map)
    {
        studentService.register(studentDto);
        
        map.put("studentRegistrationForm", new StudentDto());
        return "generalinfo";
    }
    
    @RequestMapping("/findname")
    public String findByName(@RequestParam("val") String name, ModelMap map)
    {
        map.put("name", name);
        map.put("studentList", studentService.findByName(name));
        return "findname";
    }
    
    @RequestMapping("/findname1")
    public String findByName1(@RequestParam("val") String name, ModelMap map)
    {
        map.put("name", name);
        map.put("studentList", studentService.findByName(name));
        return "findname1";
    }
    
    @RequestMapping("/viewall")
    public String findById(@RequestParam("val") int id, ModelMap map)
    {
        map.put("student", studentService.findById(id));
        return "viewall";
    }
    
    @RequestMapping("/viewallinfo")
    public String findById2(@RequestParam("val") int id, ModelMap map)
    {
        map.put("student", studentService.findById(id));
        return "viewallinfo";
    }
    
    @RequestMapping("/getgeninfo")
    public String findById3(@RequestParam("val") int id, ModelMap map)
    {
        map.put("student", studentService.findById(id));
        return "getgeninfo";
    }
    
    @RequestMapping("/getgeninfoname")
    public String findById4(@RequestParam("val") int id, ModelMap map)
    {
        map.put("student", studentService.findById(id));
        return "getgeninfoname";
    }
    
    @RequestMapping("/modify")
    public String returnModify()
    {
        return "modify";
    }
    
    @RequestMapping("/save1")
    public String save1(@ModelAttribute("student") StudentDto studentDto)
    {
        studentService.update(studentDto);
        return "modify";
    }
}
