package ems.project.EmployeeManagementSystem.Repository;

import ems.project.EmployeeManagementSystem.Entity.Scheduler;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchedulerRepository extends JpaRepository<Scheduler, Long> {
    List<Scheduler> findByStatus(String status);
}
