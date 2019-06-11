package com.rakesh.paymentbillingsystem.service;

import com.rakesh.paymentbillingsystem.dao.PayRegisterDao;
import com.rakesh.paymentbillingsystem.dto.PayRegisterDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Rakesh Kuchana
 */
@Service
public class PayRegisterService
{
    @Autowired
    private PayRegisterDao payRegisterDao;
    
    public void create(PayRegisterDto payRegisterDto)
    {
        payRegisterDao.create(payRegisterDto);
    }
    
    public boolean isAuthenticated(PayRegisterDto payRegisterDto)
    {
        if ( payRegisterDao.find(payRegisterDto) == null )
            return false;
        
        return true;
    }
    
    public List<PayRegisterDto> findByName(PayRegisterDto payRegisterDto)
    {
        return payRegisterDao.findByName(payRegisterDto);
    }
    
    public PayRegisterDto findById(String id)
    {
        return payRegisterDao.findById(id);
    }
    
    public void delete(String id)
    {
        payRegisterDao.delete(id);
    }
}
