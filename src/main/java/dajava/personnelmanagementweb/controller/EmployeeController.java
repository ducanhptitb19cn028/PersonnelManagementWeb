package dajava.personnelmanagementweb.controller;

import dajava.personnelmanagementweb.model.Employee;
import dajava.personnelmanagementweb.service.EmployeeService;
import jakarta.servlet.http.PushBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    // display list of employees
    @GetMapping("/")
    public String viewHomepage(Model model) {
        return  findPaginated(1,model);
    }
    @GetMapping("/newEmployeesForm")
    public String newEmployeesForm(Model model) {
        // create a new employee
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "new_employees";
    }
    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        // save the employee to database
        employeeService.insertEmployee(employee);
        return "redirect:/";
    }
    @GetMapping("/showFormupdate/{id}")
    public String showFormupdate(@PathVariable(value = "id") long id, Model model){
        // get employee from service by id to update
        Employee employee = employeeService.getEmployeebyId(id);
        model.addAttribute("employee",employee);
        return "update_employees";
    }
    @GetMapping("/deleteEmplyee/{id}")
    public String deleteEmployee(@PathVariable(value = "id") long id){
        this.employeeService.deleteEmployee(id);
        return "redirect:/";
    }
    @GetMapping("page/{pageNo}")
    public String findPaginated(@PathVariable(value = "pageNo") int pageNo, Model model){
        int pageSize = 5;
        Page<Employee> page = employeeService.findPaginated(pageNo,pageSize);
        List<Employee> listEmployees = page.getContent();
        model.addAttribute("currentPage",pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());
        model.addAttribute("listEmployees", listEmployees);
        return "index";
    }
}
