package phone;

public class Main {

    public static void main(String[] args) {

        Phone firstPhone = new Phone("8234753465", "iPhone", 160.4);
        Phone secondPhone = new Phone("0928226464", "Samsung");
        Phone thirdPhone = new Phone();

        firstPhone.printInfo();
        secondPhone.printInfo();
        thirdPhone.printInfo();


        firstPhone.receiveCall("Jessica");
        secondPhone.receiveCall("Thor");
        thirdPhone.receiveCall("Charlie", "834758734");


        firstPhone.sendMessage("623647484", "1286263647", "643647389", "678493939");
    }
}
