package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;


class SearchingFacadeTest {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private SearchingFacade searchingFacade;

    private List<Company> companyList = new ArrayList<>();
    private List<Employee> employeeList = new ArrayList<>();

    @Test
    void TestCompanyAndEmployeeSearchString() {
        // Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        companyDao.save(softwareMachine);
        companyDao.save(greyMatter);
        companyDao.save(dataMaesters);

        employeeDao.save(johnSmith);
        employeeDao.save(stephanieClarckson);
        employeeDao.save(lindaKovalsky);


        companyList.add(softwareMachine);
        companyList.add(greyMatter);
        companyList.add(dataMaesters);

        employeeList.add(johnSmith);
        employeeList.add(stephanieClarckson);
        employeeList.add(lindaKovalsky);

        //When
        List<Company> testListCompany = searchingFacade.retrieveCompaniesWithSearchedString("ata");
        List<Employee> testListEmployee = searchingFacade.retrieveEmployeesWithSearchedString("Ste");

        //Then
        Assertions.assertEquals(companyList.size(), testListCompany.size());
        Assertions.assertEquals(employeeList.size(), testListEmployee.size());
    }
    //Clean up
//      try {
//        companyDao.delete(softwareMachine);
//        companyDao.delete(softDataMasters);
//        companyDao.delete(greyMatter);
//    } catch (Exception e) {
//        //do nothing
//    }

}