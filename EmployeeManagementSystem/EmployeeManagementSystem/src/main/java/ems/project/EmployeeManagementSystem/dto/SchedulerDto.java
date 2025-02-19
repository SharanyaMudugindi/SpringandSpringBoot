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
public class SchedulerDto { 
	    private Long id;
	    private String taskName;
	    private String status;
	    private LocalDateTime runAt;
	    private LocalDateTime executedAt;
	    private Long adminId;  
	    private String filePath;
}
