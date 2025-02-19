package ems.project.EmployeeManagementSystem.Mapper;

import ems.project.EmployeeManagementSystem.Entity.Message;
import ems.project.EmployeeManagementSystem.Entity.User;
import ems.project.EmployeeManagementSystem.dto.MessageDto;

public class MessageMapper {
	public static MessageDto mapToMessageDto(Message message)
	{
		return new MessageDto(
				message.getId(),
				message.getSender().getId(),
				message.getReceiver().getId(),
				message.getMessage(),
				message.getCreatedAt()
				);
	}
	public static Message mapToMessage(MessageDto messageDto,User sender,User receiver)
	{
		return new Message(
				messageDto.getId(),
				sender,receiver,
				messageDto.getMessage(),messageDto.getCreatedAt());
	}
}
