package methods;

import java.io.IOException;

public class UserLoginEG {

	public static void main(String[] args) throws InterruptedException, IOException {
		BusinessMethodsEg be = new BusinessMethodsEg();
		
		String res = be.orgLaunch("firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Applicaion Launch "+res);
		
		res = be.orgLogin("AASivaP786", "TestUser@098761234598");
		System.out.println("Application Login "+res);
		
		res = be.orgLogout();
		System.out.println("Application Logout" + res);
		
		be.orgClose();
		System.out.println("Application clossed successfully");

	}

}
