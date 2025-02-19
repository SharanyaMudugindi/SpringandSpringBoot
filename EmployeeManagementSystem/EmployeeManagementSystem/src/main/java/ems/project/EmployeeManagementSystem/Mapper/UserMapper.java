package ems.project.EmployeeManagementSystem.Mapper;

import ems.project.EmployeeManagementSystem.Entity.User;
import ems.project.EmployeeManagementSystem.dto.UserDto;

public class UserMapper {
	public static UserDto mapToUserDto(User user)
	{
		return new UserDto(
				user.getId(),
				user.getFirstName(),
				user.getLastName(),
				user.getEmail()
				);
	}
	public static User mapToUser(UserDto userDto)
	{
		return new User(
				userDto.getId(),
				userDto.getFirstName(),
				userDto.getLastName(),
				userDto.getEmail(),
				null,null,true,null
				);
				
				
				
	}
}
