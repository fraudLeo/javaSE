package leo.algorithm.sort;

public class Student implements Comparable<Student>{
    private int age;
    private String username;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", username='" + username + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age-o.age;//本Student类的age - o的age
    }
}
