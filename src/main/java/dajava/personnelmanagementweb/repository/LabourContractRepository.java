package dajava.personnelmanagementweb.repository;

import dajava.personnelmanagementweb.model.LabourContract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabourContractRepository extends JpaRepository<LabourContract, String> {

}
