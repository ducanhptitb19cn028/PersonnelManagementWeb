package dajava.personnelmanagementweb.repository;

import dajava.personnelmanagementweb.model.DayOff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DayOffRepository extends JpaRepository<DayOff, Long> {

}
