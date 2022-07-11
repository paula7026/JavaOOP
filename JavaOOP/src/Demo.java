import model.Student;

public class Demo {
    public static void main(String[] args){
        char i;
        Student student = new Student(18,"zhangsan",'f',"3101152000123123");
        System.out.println(student.getName()+student.getSex()+student.getAge()+student.getId());
    }
}
