package Cient;

public class Test {
    public static void main(String[] args)throws Exception {
        Thread login = new LoginThread();
        login.start();
    }
}
