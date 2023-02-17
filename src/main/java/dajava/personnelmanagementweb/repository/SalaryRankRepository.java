package dajava.personnelmanagementweb.repository;

import dajava.personnelmanagementweb.model.SalaryRank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaryRankRepository extends JpaRepository<SalaryRank, Integer> {

}
