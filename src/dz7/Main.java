package dz7;

public class Main {
    public static void main(String[] args) {
       Phone phone = new SamsungPhone();
       phone.setNumber(123);
       phone.setModel("Samsung X11");
       phone.info();
       phone.receiveCall("Alex");

    }
}