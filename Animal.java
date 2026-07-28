public class Animal {
    void makeSound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat Meows");
    }
}

void main() {
    Animal[] animals ={new Dog(),new Cat()};
    for(Animal a: animals){
        a.makeSound();
    }
}

