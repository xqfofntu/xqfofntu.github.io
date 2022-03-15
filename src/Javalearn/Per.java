package Javalearn;

/**
 * @Classname Per
 * @Date 2021/6/23
 * @Author xqf
 */
public class Per {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Per{" +
                "age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Per a = new Per();
        a.setAge(10);
        String b = "3";

        a.pp(a, b);

        System.out.println(a.toString() + b);
    }

    public void pp(Per a, String b) {
        a.setAge(11);
        b = "5";
    }


}
