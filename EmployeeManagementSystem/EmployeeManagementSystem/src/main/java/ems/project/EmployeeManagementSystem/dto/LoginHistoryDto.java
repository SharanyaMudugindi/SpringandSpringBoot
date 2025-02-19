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


public class LoginHistoryDto {
	    private Long id;
	    private Long userId; 
	    private String ipAddress;
	    private LocalDateTime createdAt;

}
