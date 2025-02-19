package ems.project.EmployeeManagementSystem.Mapper;

import ems.project.EmployeeManagementSystem.Entity.FinancialDocument;
import ems.project.EmployeeManagementSystem.Entity.User;
import ems.project.EmployeeManagementSystem.dto.FinancialDocumentDto;

public class FinancialDocumentMapper {
	public static FinancialDocumentDto mapToFinancialDocumentDto(FinancialDocument financialDocument)
	{
		return new FinancialDocumentDto(
				financialDocument.getId(),
				financialDocument.getUser().getId(),
				financialDocument.getFilePath(),
				financialDocument.getCreatedAt());
	}
	
	public static FinancialDocument mapToFinancialDocument(FinancialDocumentDto financialDocumentDto,User user)
	{
		return new FinancialDocument(
				financialDocumentDto.getId(),
				user,
				financialDocumentDto.getFilepath(),
				financialDocumentDto.getCreatedAt());
				
	}
	

}
