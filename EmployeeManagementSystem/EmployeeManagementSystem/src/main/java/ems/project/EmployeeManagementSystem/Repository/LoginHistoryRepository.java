package ems.project.EmployeeManagementSystem.Repository;
import ems.project.EmployeeManagementSystem.Entity.LoginHistory;
import ems.project.EmployeeManagementSystem.Entity.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LoginHistoryRepository extends JpaRepository<LoginHistory, Long> {
    List<LoginHistory> findByUser(User user);
}
