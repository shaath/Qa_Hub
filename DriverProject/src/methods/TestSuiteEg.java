package methods;

import java.io.IOException;

public class TestSuiteEg {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//Login
		BusinessMethodsEg be = new BusinessMethodsEg();
		
		String res = be.orgLaunch("firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Applicaion Launch "+res);
		
		res = be.orgLogin("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res = be.orgLogout();
		System.out.println("Application Logout" + res);
		
		be.orgClose();
		System.out.println("Application clossed successfully");
		
		//EmployeeReg
		res = be.orgLaunch("firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Applicaion Launch "+res);
		
		res = be.orgLogin("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res = be.orgEmpReg("Vinay", "S", "VS435548");
		System.out.println("Employee Registration "+res);
		
		res = be.orgLogout();
		System.out.println("Application Logout" + res);
		
		be.orgClose();
		System.out.println("Application clossed successfully");
		
		//UserReg
		res = be.orgLaunch("firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Applicaion Launch "+res);
		
		res = be.orgLogin("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res = be.orguserReg("Vinay S", "AAVinayS786", "TestUser@098761234598");
		System.out.println("User Registrration "+res);
		
		res = be.orgLogout();
		System.out.println("Application Logout" + res);
		
		be.orgClose();
		System.out.println("Application clossed successfully");
		
		//User Login
		res = be.orgLaunch("firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Applicaion Launch "+res);
		
		res = be.orgLogin("AAVinayS786", "TestUser@098761234598");
		System.out.println("Application Login "+res);
		
		res = be.orgLogout();
		System.out.println("Application Logout" + res);
		
		be.orgClose();
		System.out.println("Application clossed successfully");


	}

}
