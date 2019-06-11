package com.rakesh.paymentbillingsystem.dao;

import com.rakesh.paymentbillingsystem.dto.PayRegisterDto;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

/**
 *
 * @author Rakesh Kuchana
 */
public class PayRegisterDao
{

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
    {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void create(PayRegisterDto payRegisterDto)
    {
        String query = "insert into system.payregister values (system.payregister_id.nextval, '"
                + payRegisterDto.getUsername() + "', '"
                + payRegisterDto.getUserpass() + "', '"
                + payRegisterDto.getBranch() + "', '"
                + payRegisterDto.getDateOfJoining() + "', '"
                + payRegisterDto.getDateOfBirth() + "', '"
                + payRegisterDto.getSalary() + "')";

        jdbcTemplate.update(query);

    }

    public PayRegisterDto find(PayRegisterDto payRegisterDto)
    {
        String query = "select * from system.payregister where username = '"
                + payRegisterDto.getUsername() + "' and userpass = '"
                + payRegisterDto.getUserpass() + "' and branch = '"
                + payRegisterDto.getBranch() + "'";

        List<PayRegisterDto> list = jdbcTemplate.query(query, new RowMapper<PayRegisterDto>()
        {

            @Override
            public PayRegisterDto mapRow(ResultSet rs, int rowNumber) throws SQLException
            {
                PayRegisterDto payRegisterDto = new PayRegisterDto();

                payRegisterDto.setUsername(rs.getString(1));
                payRegisterDto.setUserpass(rs.getString(2));
                payRegisterDto.setBranch(rs.getString(2));
                payRegisterDto.setDateOfBirth(rs.getString(2));
                payRegisterDto.setDateOfJoining(rs.getString(2));
                payRegisterDto.setSalary(rs.getString(2));

                return payRegisterDto;

            }
        });

        return list.get(0);
    }

    public List<PayRegisterDto> findByName(PayRegisterDto payRegisterDto)
    {
        String query = "select * from system.payregister where upper(username) like upper('%"
                + payRegisterDto.getUsername() + "%') and branch = '"
                + payRegisterDto.getBranch() + "'";

        return jdbcTemplate.query(query, new RowMapper<PayRegisterDto>()
        {

            @Override
            public PayRegisterDto mapRow(ResultSet rs, int rowNumber) throws SQLException
            {
                PayRegisterDto payRegisterDto = new PayRegisterDto();
                
                payRegisterDto.setId(rs.getInt(1));
                payRegisterDto.setUsername(rs.getString(2));
                payRegisterDto.setUserpass(rs.getString(3));
                payRegisterDto.setBranch(rs.getString(4));
                payRegisterDto.setDateOfBirth(rs.getString(5));
                payRegisterDto.setDateOfJoining(rs.getString(6));
                payRegisterDto.setSalary(rs.getString(7));

                return payRegisterDto;
            }
        });
    }
    
    public PayRegisterDto findById(String id)
    {
        String query = "select * from system.payregister where id = " + id;
        
        List<PayRegisterDto> list= jdbcTemplate.query(query, new RowMapper<PayRegisterDto>(){
            
            @Override
            public PayRegisterDto mapRow(ResultSet rs, int rowNumber) throws SQLException
            {
                PayRegisterDto payRegisterDto = new PayRegisterDto();
                payRegisterDto.setId(rs.getInt(1));
                payRegisterDto.setUsername(rs.getString(2));
                payRegisterDto.setUserpass(rs.getString(3));
                payRegisterDto.setBranch(rs.getString(4));
                payRegisterDto.setDateOfJoining(rs.getString(5));
                payRegisterDto.setDateOfBirth(rs.getString(6));
                payRegisterDto.setSalary(rs.getString(7));
                
                return payRegisterDto;
            }
            
        });
        
        return list.get(0);
    }
    
    public void delete(String id)
    {
        String query = "delete from system.payregister where id = " + id;
        jdbcTemplate.update(query);
    }
}
