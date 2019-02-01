package constructors;

class ConstructorOverLoading {
    private String name;
    private int code;
    
    public ConstructorOverLoading() {
        this("Arnie", 0);
        
        System.out.println("Constructor running!");
        System.out.println(name + " " +code);
        System.out.println("************");
    }
    
    public ConstructorOverLoading(String name) {
        this(name, 0);
        
        System.out.println("Second constructor running");
        System.out.println(name + " " +code);
        System.out.println("************");
        // No longer need following line, since we're using the other constructor above.
        //this.name = name;
    }
    
    public ConstructorOverLoading(String name, int code) {
        
        System.out.println("Third constructor running");
        this.name = name;
        this.code = code;
        
        System.out.println(name + " " +code);
        System.out.println("************");
    }
}

public class ConstructorOverLoad {
    public static void main(String[] args) {
        ConstructorOverLoading ConstructorOverLoading1 = new ConstructorOverLoading();

        ConstructorOverLoading ConstructorOverLoading2 = new ConstructorOverLoading("Bertie");
        
        ConstructorOverLoading ConstructorOverLoading3 = new ConstructorOverLoading("Chalky", 7);
    }

}

 