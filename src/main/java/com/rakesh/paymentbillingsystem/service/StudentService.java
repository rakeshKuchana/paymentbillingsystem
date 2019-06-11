package com.rakesh.paymentbillingsystem.service;

import com.rakesh.paymentbillingsystem.dao.StudentDao;
import com.rakesh.paymentbillingsystem.dto.StudentDto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Rakesh Kuchana
 */
@Service
public class StudentService
{
    @Autowired
    private StudentDao studentDao;
    
    public void register(StudentDto studentDto)
    {
        studentDao.register(studentDto);
    }
    
    public List<StudentDto> findByName(String name)
    {
        return studentDao.findByName(name);
    }
    
    public StudentDto findById(int id)
    {
        return studentDao.findById(id);
    }
    
    public void update(StudentDto studentDto)
    {
        studentDao.update(studentDto);
    }
    
}
