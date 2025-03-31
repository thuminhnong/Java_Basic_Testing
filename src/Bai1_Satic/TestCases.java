package Bai1_Satic;

public class TestCases {
    public static void testLoginSuccess(){
        System.out.println("Open browser " + DataConstants.brower);
        System.out.println("Navigate to url " + DataConstants.brower);
        System.out.println("Enter email and password...");
        System.out.println("Click Login button");
        System.out.println("Verify...");

    }
    public static void testAddNewCustomer(){
        testLoginSuccess();
        System.out.println("Open browser Chrome");
        System.out.println("Navigate to url https://anhtester.com");
        System.out.println("Enter email and password...");
        System.out.println("Click Login button");
        System.out.println("Verify...");

    }
    public static void main(String[] args) {
        //TestCases testCases = new TestCases();
       // testCases.testLoginSuccess();
        testLoginSuccess();
        System.out.println("name");
        testAddNewCustomer();

    }
}
