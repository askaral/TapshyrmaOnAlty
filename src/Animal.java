public class Animal {
    private  String breed;
    private int age;
    private  String name;

    public Animal(String breed, int age, String name) {
        this.breed = breed;
        this.age = age;
        this.name = name;
    }
    public Animal(){

    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void allAnimal(){
        System.out.println("Animal is eating");
    }

    @Override
    public String toString() {
        return  "[" + name +", "+
                  breed +", "+
                 age +"]";
    }
}
