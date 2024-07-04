package phone;

public class Phone {
    private String number;
    private String model;
    private double weight;


    public Phone() {
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public void receiveCall(String callerName) {
        System.out.println(callerName + " is calling" + "\n");
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println(callerName + " is calling with number: " + callerNumber + "\n");
    }

    public void sendMessage(String... numbers) {
        System.out.print("Sending message to numbers: ");
        for (String num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public void printInfo() {
        System.out.println("Number: " + number + "\nModel: " + model + "\nWeight: " + weight + "\n");
    }
}