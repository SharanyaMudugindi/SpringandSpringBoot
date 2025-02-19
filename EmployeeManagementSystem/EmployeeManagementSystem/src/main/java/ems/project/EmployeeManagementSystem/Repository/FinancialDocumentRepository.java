package ems.project.EmployeeManagementSystem.Repository;
import ems.project.EmployeeManagementSystem.Entity.FinancialDocument;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ems.project.EmployeeManagementSystem.Entity.User;

@Repository
public interface FinancialDocumentRepository extends JpaRepository<FinancialDocument, Long> {
    List<FinancialDocument> findByUser(User user);
}

