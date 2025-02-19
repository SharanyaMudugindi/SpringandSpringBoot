package ems.project.EmployeeManagementSystem.Mapper;

import ems.project.EmployeeManagementSystem.Entity.Scheduler;
import ems.project.EmployeeManagementSystem.Entity.User;
import ems.project.EmployeeManagementSystem.dto.SchedulerDto;

public class SchedulerMapper {
	public static SchedulerDto mapToSchedulerDto(Scheduler scheduler)
	{
		return new SchedulerDto(
				scheduler.getId(),
				scheduler.getTaskName(),
				scheduler.getStatus(),
				scheduler.getRunAt(),
				scheduler.getExecutedAt(),
				scheduler.getAdmin().getId(),
				scheduler.getFilePath());
	}
	public static Scheduler mapToScheduler(SchedulerDto schedulerDto,User user)
	{
		return new Scheduler(
				schedulerDto.getId(),
				schedulerDto.getTaskName(),
				schedulerDto.getStatus(),
				schedulerDto.getRunAt(),
				schedulerDto.getExecutedAt(),
				user,
				schedulerDto.getFilePath()
				);
	}
}
