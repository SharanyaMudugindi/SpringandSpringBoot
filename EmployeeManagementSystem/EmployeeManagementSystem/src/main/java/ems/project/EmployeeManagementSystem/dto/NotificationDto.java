package ems.project.EmployeeManagementSystem.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NotificationDto {
	private Long id;
	private Long userId;
	private String message;
	private LocalDateTime createdAt;

}
