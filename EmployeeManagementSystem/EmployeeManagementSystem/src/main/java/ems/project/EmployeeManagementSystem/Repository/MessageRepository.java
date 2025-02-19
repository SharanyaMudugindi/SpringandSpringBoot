package ems.project.EmployeeManagementSystem.Repository;

import ems.project.EmployeeManagementSystem.Entity.Message;
import ems.project.EmployeeManagementSystem.Entity.User;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findBySender(User sender);
    List<Message> findByReceiver(User receiver);
}
