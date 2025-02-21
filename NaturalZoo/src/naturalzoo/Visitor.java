package naturalzoo;

public class Visitor {

    private String name, activity;
    private int age;

    public Visitor() {
    }

    public Visitor(String name, String activity, int age) {
        this.name = name;
        this.activity = activity;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Visitante:" + " Nombre = " + name + ", Actividad = " + activity + ", Edad = " + age;
    }
}
