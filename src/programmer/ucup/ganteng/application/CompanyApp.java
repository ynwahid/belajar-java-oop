package programmer.ucup.ganteng.application;

import programmer.ucup.ganteng.data.Company;

public class CompanyApp {

  public static void main(String[] args) {

    Company company = new Company();
    company.setName("Programmer Ucup Ganteng");

    Company.Employee employee = company.new Employee();
    employee.setName("Cakcup");

    System.out.println(employee.getName());
    System.out.println(employee.getCompany());

    Company company2 = new Company();
    company2.setName("Belum Ada");

    Company.Employee employee2 = company2.new Employee();
    employee2.setName("Budi");

    System.out.println(employee2.getName());
    System.out.println(employee2.getCompany());
  }
}
