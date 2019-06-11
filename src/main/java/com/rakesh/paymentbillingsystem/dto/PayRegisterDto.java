package com.rakesh.paymentbillingsystem.dto;

/**
 *
 * @author Rakesh Kuchana
 */
public class PayRegisterDto
{
    private int id;
    private String username;
    private String userpass;
    private String branch;
    private String dateOfJoining;
    private String dateOfBirth;
    private String salary;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getUserpass()
    {
        return userpass;
    }

    public void setUserpass(String userpass)
    {
        this.userpass = userpass;
    }

    public String getBranch()
    {
        return branch;
    }

    public void setBranch(String branch)
    {
        this.branch = branch;
    }

    public String getDateOfJoining()
    {
        return dateOfJoining;
    }

    public void setDateOfJoining(String dateOfJoining)
    {
        this.dateOfJoining = dateOfJoining;
    }

    public String getDateOfBirth()
    {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSalary()
    {
        return salary;
    }

    public void setSalary(String salary)
    {
        this.salary = salary;
    }
}
