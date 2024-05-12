package Challenges_10.Challenge12345;

//Create a Dog class that extends Animal and overrides sound() method;
//dogs make a particular sound, so we want to print “bark”, in this case
public class Dog extends Animal{

    @Override
    public void sound() {
        super.sound();
        System.out.println("bark");
    }
}
