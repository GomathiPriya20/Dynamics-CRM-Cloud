package testcases.Contacts;

import org.testng.annotations.Test;

import pages.LoginPage;
import utils.DataInputProvider;

//TFS ID_ 5136:Automation :Restrict when user enters blank job function in Contact account associations

public class TestCase_5137 {
	
	
	@Test
	public void createMemberTP(int iRowNumber, String sDataSheetName) throws Exception, InterruptedException  {
		
		//1. Login to CRM using member supervisor / member credentials 
		new LoginPage()
			.typeUsername(DataInputProvider.getCellData_ColName(iRowNumber, "username", sDataSheetName))
	  	    .typePassword(DataInputProvider.getCellData_ColName(iRowNumber, "password", sDataSheetName))  
			.clickSignIn()
		
			//Go to Contacts >> Choose any contact which is active. Add contact account association with any member and create Job func/Communication records for it
			.clickWorkplace()	
			.selectContacts()
		
		//2. Go to any active contact which has an active contact account association
		.chooseActiveContact(DataInputProvider.getCellData_ColName(iRowNumber, "activeContact", sDataSheetName))
		
		//3.Try to enter blank Job function in the contact account association and save
			// Click on Contact Account association record created
			.doubleClickOnContactAccountAssociationRecordWithFrame1()
			
			// Click on add new Communication/Publications
			.clicAddCommunicationPublication()
					    
			// Select "" as Communication then save
			.typeCommunicationPublication(DataInputProvider.getCellData_ColName(iRowNumber, "communicationPublication", sDataSheetName))
						
			//Click on Save
			.clickSaveInCommunicationPublication()			
			
			//Verify error message
			.verifyErrorInCommPublivationn()
		
			




		
		
		
		
		;
	}
}
