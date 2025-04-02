class Animal{
    String name;
    String species;

    Animal(String name,String species){
        this.name=name;
        this.species=species;
    }

    void displayInfo(){
        System.out.println("animal name="+" "+name);
        System.out.println("animal species="+" "+species);
    }
}

class mammal extends Animal{
    boolean hair;
    mammal(boolean hair,String name, String species){
        super(name,species);
        this.hair=hair;
    }

    void displayInfomammal(){
        if (hair){
            System.out.println("yes it has hair");
            displayInfo();
        }

        else{
            System.out.println("no it doesn't has hair");
            displayInfo();
        }
        
    }
}

public class multilevelInheritance_1{
    public static void main(String[] args){
        mammal obj = new mammal(true,"bull","dog");
        obj.displayInfomammal();
    }
}

class dog extends mammal{
    String breed;
    
    dog(String breed,boolean hair,String name, String species){
        super(hair,name,species);
        this.breed=breed;
    }
}