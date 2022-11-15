package OOPs;

// implement classes here
class Animal{
    public int legs;
    public int brainSize;
    Animal(int legs,int brainSize){
        this.legs=legs;
        this.brainSize=brainSize;
    }
    public void sound(){
        System.out.println("which animal sound do you want?");
    }
}

class Lion extends  Animal{
    Lion(int legs,int brainSize){
        super(legs,brainSize);
    }
    public void sound(){
        System.out.println("Lion roar!! roar! roar!!");
    }
}

class Elephant extends  Animal{
    Elephant(int legs,int brainSize){
        super(legs,brainSize);
    }
    public void sound(){
        System.out.println("Elephant Pawoo! Pawoo!");
    }
}

class Cow extends  Animal{
    Cow(int legs,int brainSize){
        super(legs,brainSize);
    }
    public void sound(){
        System.out.println("Cow moo moo");
    }
}

class Goat extends  Animal{
    Goat(int legs,int brainSize){
        super(legs,brainSize);
    }
    public void sound(){
        System.out.println("Goat baa! baa! baa!");
    }
}
