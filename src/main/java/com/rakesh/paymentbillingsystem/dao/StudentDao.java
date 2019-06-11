package com.rakesh.paymentbillingsystem.dao;

import com.rakesh.paymentbillingsystem.dto.StudentDto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Rakesh Kuchana
 */
public class StudentDao
{
    
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    public void register(StudentDto studentDto)
    {
        String query = "insert into system.student values("
                + studentDto.getId() + ", '" 
                + studentDto.getName() + "', '"
                + studentDto.getCourse() + "', '"
                + studentDto.getMobile() + "', '"
                + studentDto.getFeesub() + "', '"
                + studentDto.getFee() + "', '"
                + studentDto.getPaid() + "', '"
                + studentDto.getBalance() + "', '"
                + studentDto.getAddress() + "', '"
                + studentDto.getFatherName() + "', '"
                + studentDto.getMotherName() + "', '"
                + studentDto.getDateOfBirth() + "', '"
                + studentDto.getQualification() + "', '"
                + studentDto.getDateOfJoining() + "', '"
                + studentDto.getDescription() + "', '"
                + studentDto.getTrainer() + "')";
        
        jdbcTemplate.update(query);
    }
    
    public List<StudentDto> findByName(String name)
    {
        String query = "select * from system.student where upper(name) like upper('%" + name + "%')";
        
        return jdbcTemplate.query(query, new RowMapper<StudentDto>(){
            
            @Override
            public StudentDto mapRow(ResultSet resultSet, int rowNumber) throws SQLException
            {
                StudentDto studentDto = new StudentDto();
                studentDto.setId(resultSet.getString(1));
                studentDto.setName(resultSet.getString(2));
                studentDto.setCourse(resultSet.getString(3));
                studentDto.setMobile(resultSet.getString(4));
                studentDto.setFeesub(resultSet.getString(5));
                studentDto.setFee(resultSet.getString(6));
                studentDto.setPaid(resultSet.getString(7));
                studentDto.setBalance(resultSet.getString(8));
                studentDto.setAddress(resultSet.getString(9));
                studentDto.setFatherName(resultSet.getString(10));
                studentDto.setMotherName(resultSet.getString(11));
                studentDto.setDateOfBirth(resultSet.getString(12));
                studentDto.setQualification(resultSet.getString(13));
                studentDto.setDateOfJoining(resultSet.getString(14));
                studentDto.setDescription(resultSet.getString(15));
                studentDto.setTrainer(resultSet.getString(16));
                
                return studentDto;
            }
        }); 
    }
    
    public StudentDto findById(int id)
    {
        String query = "select * from system.student where id = " + id;
        
        List<StudentDto> list = jdbcTemplate.query(query, new RowMapper<StudentDto>(){
            
            @Override
            public StudentDto mapRow(ResultSet resultSet, int rowNumber) throws SQLException
            {
                StudentDto studentDto = new StudentDto();
                studentDto.setId(resultSet.getString(1));
                studentDto.setName(resultSet.getString(2));
                studentDto.setCourse(resultSet.getString(3));
                studentDto.setMobile(resultSet.getString(4));
                studentDto.setFeesub(resultSet.getString(5));
                studentDto.setFee(resultSet.getString(6));
                studentDto.setPaid(resultSet.getString(7));
                studentDto.setBalance(resultSet.getString(8));
                studentDto.setAddress(resultSet.getString(9));
                studentDto.setFatherName(resultSet.getString(10));
                studentDto.setMotherName(resultSet.getString(11));
                studentDto.setDateOfBirth(resultSet.getString(12));
                studentDto.setQualification(resultSet.getString(13));
                studentDto.setDateOfJoining(resultSet.getString(14));
                studentDto.setDescription(resultSet.getString(15));
                studentDto.setTrainer(resultSet.getString(16));
                
                return studentDto;
            }
        });
        
        return list.get(0);
    }
    
    public void update(StudentDto studentDto)
    {
        String query = "update system.student set "
                + "name = '" + studentDto.getName()
                + "', course = '"+ studentDto.getCourse()
                + "', mobile = '" + studentDto.getMobile()
                + "', feesub = '" + studentDto.getFeesub()
                + "', fee = '" + studentDto.getFee()
                + "', paid = '" + studentDto.getPaid()
                + "', balance = '" + studentDto.getBalance()
                + "', address = '" + studentDto.getAddress()
                + "', fathername = '" + studentDto.getFatherName()
                + "', mothername = '" + studentDto.getMotherName()
                + "', dateofbirth = '" + studentDto.getDateOfBirth()
                + "', qualification = '" + studentDto.getQualification()
                + "', dateofjoining = '" + studentDto.getDateOfJoining()
                + "', description = '" + studentDto.getDescription()
                + "', trainer = '" + studentDto.getTrainer() + "' where id = " + studentDto.getId();
        
        jdbcTemplate.update(query);
    }
    
}
