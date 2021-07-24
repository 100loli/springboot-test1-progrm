package com.guet.cn.springboottest1program.mapper;


import com.guet.cn.springboottest1program.bean.Employees;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.List;

@Mapper
public interface EmployeesMapper {
    List<Employees> selectmsg(@Param("sex") String sex, @Param("jobstatus") String jobstatus);
    List<Employees> viewEmployees();
    void deleteEmployee(int id);
    Employees getEmployeeById(int id);
    void updateEmployee(int id, String name, String sex, String phone, String lv, Date entrytime, int perobj, String jobstatus, String department, String lable, int ordernum, String workstatus, String open_ports, String tuijian_status);
    void addEmployee(int id, String name, String sex, String phone, String lv, Date entrytime, String jobstatus, String department, int ordernum, String workstatus, String open_ports, String tuijian_status);
}