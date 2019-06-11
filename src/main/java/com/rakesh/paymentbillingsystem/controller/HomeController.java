package com.rakesh.paymentbillingsystem.controller;

import com.rakesh.paymentbillingsystem.dto.PayRegisterDto;
import com.rakesh.paymentbillingsystem.dto.StudentDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Rakesh Kuchana
 */
@Controller
public class HomeController
{
    @RequestMapping("/")
    public String returnIndex()
    {
        return "index";
    }
    
    @RequestMapping("/admin")
    public String returnAdmin()
    {
        return "admin";
    }
    
    @RequestMapping("/aloginprocess")
    public String returnAdminLoginProcess()
    {
        return "aloginprocess";
    }
    
    @RequestMapping("/generalinfo")
    public String returnGeneralInfo(ModelMap map)
    {
        map.put("studentRegistrationForm", new StudentDto());
        return "generalinfo";
    }
    
    @RequestMapping("/home")
    public String returnHome()
    {
        return "home";
    }
    
    @RequestMapping("/modify")
    public String returnModify()
    {
        return "modify";
    }
    
    @RequestMapping("/logout")
    public String returnLogout()
    {
        return "logout";
    }
    
    @RequestMapping("/ahome")
    public String returnAdminHome()
    {
        return "ahome";
    }
    
    @RequestMapping("/contactus")
    public String returnContactUs()
    {
        return "contactus";
    }
    
    @RequestMapping("/create")
    public String returnCreate(ModelMap map)
    {
        map.put("payRegisterForm", new PayRegisterDto());
        return "create";
    }
    
    @RequestMapping("/loginprocess")
    public String returnLoginprocess()
    {
        return "loginprocess";
    }

}
