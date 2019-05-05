package reflect;
public class Student {

    public String name;
    protected Integer age;
    Character sex;
    private String phoneNum;

    public static void main(String[] args) {
        System.out.println("main方法执行了。。。");
    }

    //默认构造器
    Student(Integer i){
        System.out.println("默认构造");
    }

    //空参构造
    public Student(){
        System.out.println("无参构造");
    }

    //单参构造
    public Student(String name){
        System.out.println("姓名："+name);
    }

    //多参构造
    public Student(String name,Integer age){
        System.out.println("姓名："+name+",年龄："+age);//这的执行效率有问题，以后解决
    }

    //受保护构造方法
    protected Student(boolean flag){
        System.out.println("受保护"+flag);
    }

    //私有构造方法
    private Student(Character character){
        System.out.println("私有"+character);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", phoneNum='" + phoneNum + '\'' +
                '}';
    }

    public void show1(String str){
        System.out.println("公共有参show1："+str);
    }

    protected void show2(){
        System.out.println("受保护无参show2");
    }

    void show3(){
        System.out.println("默认无参show3");
    }

    private String show4(Integer num){
        System.out.println("私有有参有返回值："+num);
        return null;
    }

    public void show(){
        System.out.println("This is show()");
    }
}
