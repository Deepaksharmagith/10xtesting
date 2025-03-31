package ex_17_OOPs;

public class Lab161_Cats {
    public static void main(String[] args) {
        
        Cat c1 = new Cat();
        Cat c2 = null; // reff without obj, no obj created
        new Cat();  // obj without reff
        
        c1.running();
        c2.running(); // java.lang.NullPointerException
        // c2 --> obj not present in jvm to excess by c2 reff, so error will come
        //is c1 , c2 same --> no c1 points towards own obj memory/area, but c2 points null ares 
        // Null area also present in jvm.

    }
}


class Cat{
    String name;
    
    
    void running(){
        System.out.println("Running");
    }
}