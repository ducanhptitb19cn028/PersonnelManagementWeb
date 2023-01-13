package dajava.personnelmanagementweb.service;

import dajava.personnelmanagementweb.model.Employee;
import org.springframework.data.domain.Page;


import java.util.List;


public interface EmployeeService {
    List<Employee> getAllEmployees();
    void insertEmployee(Employee employee);
    Employee getEmployeebyId(long Id);
    void deleteEmployee(long id);
    Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
