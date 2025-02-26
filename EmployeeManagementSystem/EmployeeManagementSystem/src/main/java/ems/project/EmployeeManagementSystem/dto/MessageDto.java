package ems.project.EmployeeManagementSystem.dto;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class MessageDto {
	private Long id;
	private Long senderId;
	private Long receiverId;
	private String message;
	private LocalDateTime createdAt;
}
