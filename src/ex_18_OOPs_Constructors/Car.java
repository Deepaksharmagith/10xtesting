package ex_18_OOPs_Constructors;

public class Car {
    String name;
    int year;
    String model;


    // Default Constructor --> Right click-> Generate->Constructors-> select non
    // Default Constructor means default name it i do't give name,model then this will
    Car() {
        name = "Unknown Car";
        model = "XXX";
        year = 0;
        System.out.println("DC");

    }
}
