package dajava.personnelmanagementweb.repository;

import dajava.personnelmanagementweb.model.AcademicLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcademicLevelRepository extends JpaRepository<AcademicLevel, String> {
}
