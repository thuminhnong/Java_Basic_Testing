package Bai1_PhuongThuc;

public class Demo_Phuong_Thuc {
    // Hàm không trả về kết quả
    public void login(){
        System.out.println("set email"); //set email
        System.out.println("set password");//set password
        System.out.println("click login button");// click login button
    }
    // hàm có trả về kết quả
    public String getHeaderPage(){
        System.out.println("Dùng selenium lấy được cái header page");
        String header = "Customers Summary";
        return header;
    }
    public void login(String email, String password){
        System.out.println("set email"); //set email
        System.out.println("set password");//set password
        System.out.println("click login button");// click login button
    }
    //phân quyền xử lý 15 cái roles
    public static void main(String[] args) {
        //login();
      //  String value2 = getHeaderPage();
      //  System.out.println(value2);
    }




}
