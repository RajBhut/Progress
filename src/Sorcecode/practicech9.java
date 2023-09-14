public class practicech9 {
    public static void main(String[] args) {

        Human man = new Human();
        man.setGender("Male");
        Human woman = new Human();
        woman.setGender("Female");


    }
    }
class employ {
    private int id ;
    private String name ;
    public int getid()
    {
        return id;
    }
    public void setid(int uid)
    {
        id = uid;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String enteredname)
    {
        name = enteredname;
    }
    employ(int uid , String name)
    {
        this.id = uid;
        this.name = name;
    }
    employ()
    {
        this.id = 0;
        this.name = "Your-Name";
    }

}
class cylinder {
    private int radius;
    private int height;

    double surfacearea() {
        return 2 * 3.141592 * radius * height + 3.141592 * radius * radius * 2;

    }
    protected double volume() {
        return 3.141591 * radius * radius * height;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}

    class Human {
        public Human() {
            this.age = 15;
            this.name = "Your_Name";
            this.gender = "Your_gender";
            this.weight = 50;
            this.height = 200;
        }

        private int age, height, weight;
        private String name, gender;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }
    }
