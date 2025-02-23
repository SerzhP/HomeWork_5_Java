public class Dog {
    String name;
    String color;
    int age;

    public Dog(String name,String color,int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public  Dog(String name,int age){
        this.name = name;
        this.age = age;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
