import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class User {
    private String name;
    private Integer age;
    public Date date;
    List<User> userList;
    private List<Integer> integerList;

    public List<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(List<Integer> integerList) {
        this.integerList = integerList;
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public int x(){
        return 1;
    }
    public int a(){
        return 0;
    }
    public int b(){
        return 0;
    }
    public int c(){
        return 0;
    }
    public int d(){
        return 0;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof User){
            return ((User)obj).getName().equals(name);
        }
        return false;
    }


    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
