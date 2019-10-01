// Implement the method fight() depending on weight, strength and age of the boxer:
// You should write dependency by yourself. The method should return true or false if our boxer won or lost.
public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }


    public boolean fight(Boxer anotherBoxer) {

        if (strength > anotherBoxer.strength) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

    }
}

