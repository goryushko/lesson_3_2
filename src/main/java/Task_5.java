//Hide all the field and methods which allow to change the inner state of the class(Encapsulation).

public class Task_5 {
        public static void main(String[] args) {
        }
        //Maybe I should make the variables below as private ?
        public class Cat {
            private String name;
            private int age;
            private int weight;

            public Cat(String name, int age, int weight) {
                this.name = name;
                this.age = age;
                this.weight = weight;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getAge() {
                return age;
            }

            public void setAge(int age) {
                this.age = age;
            }
        }
    }

