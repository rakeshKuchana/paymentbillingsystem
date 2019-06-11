package com.rakesh.paymentbillingsystem.controller;

import com.rakesh.paymentbillingsystem.dto.PayRegisterDto;
import com.rakesh.paymentbillingsystem.service.PayRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Rakesh Kuchana
 */
@Controller
@RequestMapping("/payregister")
public class PayRegisterController
{

    @Autowired
    PayRegisterService payRegisterService;

    @RequestMapping("/asave")
    public String asave(@ModelAttribute("payRegisterForm") PayRegisterDto payRegisterDto, ModelMap map)
    {
        payRegisterService.create(payRegisterDto);
        map.put("payRegisterForm", new PayRegisterDto());
        return "create";
    }

    @RequestMapping("/loginprocess")
    public String loginprocess(@ModelAttribute("payRegisterForm") PayRegisterDto payRegisterDto, ModelMap map)
    {
        if (payRegisterService.isAuthenticated(payRegisterDto))
        {
            map.put("username", payRegisterDto.getUsername());
        }

        return "loginprocess";
    }

    @RequestMapping("/afindname")
    public String afindname(@RequestParam("val") String name, @RequestParam("branch") String branch, ModelMap map)
    {        
        PayRegisterDto payRegisterDto = new PayRegisterDto();
        payRegisterDto.setUsername(name);
        payRegisterDto.setBranch(branch);
        
        map.put("payRegisterList", payRegisterService.findByName(payRegisterDto));

        return "afindname";
    }
    
    @RequestMapping("/aviewall")
    public String aviewall(@RequestParam("val") String id, ModelMap map)
    {
        map.put("payRegister", payRegisterService.findById(id));
        return "aviewall";
    }
    
    @RequestMapping("/aremove")
    public String aremove(@RequestParam("val") String id)
    {
        payRegisterService.delete(id);
        return "ahome";
    }
}
