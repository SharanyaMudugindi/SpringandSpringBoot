package ems.project.EmployeeManagementSystem.Mapper;

import ems.project.EmployeeManagementSystem.Entity.LoginHistory;
import ems.project.EmployeeManagementSystem.Entity.User;
import ems.project.EmployeeManagementSystem.dto.LoginHistoryDto;

public class LoginHistoryMapper {
	public static LoginHistoryDto mapToLoginHistoryDto(LoginHistory loginHistory)
	{
		return new LoginHistoryDto(
				loginHistory.getId(),
				loginHistory.getUser().getId(),
				loginHistory.getIpAddress(),
				loginHistory.getCreatedAt()
				);
	}
	public static LoginHistory mapToLoginHistory(LoginHistoryDto loginHistoryDto,User admin)
	{
		return new LoginHistory(
				loginHistoryDto.getId(),
				admin,
				loginHistoryDto.getIpAddress(),
				loginHistoryDto.getCreatedAt()
				);
	}
}
