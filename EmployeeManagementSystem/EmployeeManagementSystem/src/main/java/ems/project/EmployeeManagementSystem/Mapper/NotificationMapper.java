package ems.project.EmployeeManagementSystem.Mapper;

import ems.project.EmployeeManagementSystem.Entity.Notification;
import ems.project.EmployeeManagementSystem.Entity.User;
import ems.project.EmployeeManagementSystem.dto.NotificationDto;

public class NotificationMapper {
	public static NotificationDto mapToNotificationDto(Notification notification)
	{
		return new NotificationDto(
				notification.getId(),
				notification.getUser().getId(),
				notification.getMessage(),
				notification.getCreatedAt()
				);
	}
	public static Notification mapToNotification(NotificationDto notificationDto,User user)
	{
		return new Notification(
				notificationDto.getId(),
				user,
				notificationDto.getMessage(),
				notificationDto.getCreatedAt());			
				
	}
}
