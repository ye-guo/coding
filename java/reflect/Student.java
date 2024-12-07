package reflect;

public class Student {
    private String name;
    private int age;
    public String address;
    protected String info;

    public Student() {
    }

    public Student(String name){
        this.name = name;
    }

    protected Student(int age) {
        this.age = age;
    }
    public Student(String name, int age,String address,String info) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.info = info;
    }
    private Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "other.Student{name = " + name + ", age = " + age + "}";
    }

    private String eat(){
        System.out.println("在吃东西");
        return "succse";
    }

    public void study(){
        System.out.println("学生在学习");
    }
}
