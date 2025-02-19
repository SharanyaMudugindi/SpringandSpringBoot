package ems.project.EmployeeManagementSystem.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class FinancialDocumentDto {
	private Long id;
	private Long userId;
	private String filepath;
	private LocalDateTime createdAt;

}
