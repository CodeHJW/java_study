class PersonalComputer{
    Computer computer;
    Monitor monitor;
    PersonalComputer(Computer computer, Monitor monitor){
        this.computer = computer;
        this.monitor = monitor;
    }
    void turnOn(){
        computer.turnOn();
        monitor.turnOn();
    }
    void printInfo(){
        computer.printInfo();
        monitor.printInfo();
    }

}
class Computer{
    private String CPU = "Core i7";
    private String Memory = "16GB";
    private String HDD = "2TB";
    private String Color = "White";
    private String Power = "500W";
    public void turnOn(){
        System.out.println("Turning on the computer.");
    }
    public void printInfo(){
        System.out.printf("The spec of the computer\nCPU: %s\nMemory: %s\nHDD: %s\nColor: %s\nPower: %s\n",
                this.CPU, this.Memory, this.HDD, this.Color, this.Power);
    }
}
class Monitor{
    private String Size = "24 inch";
    private String Color = "Black";
    private String Power = "45W";
    public void turnOn(){
        System.out.println("Turning on the monitor.");
    }
    public void printInfo(){
        System.out.printf("The spec of the monitor\nSize: %s\nColor: %s\nPower: %s\n",
                this.Size, this.Color, this.Power);
    }
}
public class Homework5 {
    public static void main(String[] args){
        PersonalComputer pc = new PersonalComputer(new Computer(),new Monitor());
        pc.turnOn();
        pc.printInfo();
    }
}
