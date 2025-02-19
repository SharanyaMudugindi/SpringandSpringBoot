package ems.project.EmployeeManagementSystem.Repository;

import ems.project.EmployeeManagementSystem.Entity.Notification;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import ems.project.EmployeeManagementSystem.Entity.User;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification> findByUser(User user);
}

