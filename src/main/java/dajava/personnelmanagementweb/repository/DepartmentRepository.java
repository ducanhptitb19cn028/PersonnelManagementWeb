package dajava.personnelmanagementweb.repository;

import dajava.personnelmanagementweb.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, String> {

}
