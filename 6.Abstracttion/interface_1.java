interface swimming{
    void swim();
}

interface running{
    void run();
}

class triathlete implements swimming,running{
    public void swim(){
        System.out.println("i am swimming........");
    }

    public void run(){
        System.out.println("i am running.............");
    }
}

public class interface_1{
    public static void main(String[] args) {
        triathlete obj = new triathlete();
        obj.swim();
        obj.run();
    }
}