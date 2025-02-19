package ems.project.EmployeeManagementSystem.Mapper;

import ems.project.EmployeeManagementSystem.Entity.Role;
import ems.project.EmployeeManagementSystem.dto.RoleDto;

public class RoleMapper {
	public static RoleDto mapToRoleDto(Role role)
	{
		return new RoleDto(role.getId(),
				role.getName()
				);
	}
	public static Role mapToRole(RoleDto roleDto)
	{
		return new Role(
				roleDto.getId(),
				roleDto.getName());
				
	}
}
