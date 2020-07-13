import com.zhouwf.entity.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyTest {
    public static void main(String[] args) throws Exception {
        Class cls = Student.class;
        System.out.println(cls);

        Field[] fields = cls.getDeclaredFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }

        Student stu = new Student(12, 2, "zhouzy");
        System.out.println(stu.toString());
        fields[0].setAccessible(true);
        fields[0].set(stu, 777);
        System.out.println(stu.toString());


        Student stu2 = (Student) cls.newInstance();
        Field f = cls.getDeclaredField("name");
        f.setAccessible(true);
        f.set(stu2, "lixiaoye");
        Method method = cls.getDeclaredMethod("Study", String.class);
        method.invoke(stu2, "Xi You Ji");
        System.out.println(method);

        Constructor cons = cls.getConstructor(int.class, int.class, String.class);
        Student stu3 = (Student) cons.newInstance(34, 45, "zhouwf");
        System.out.println(stu3.toString());
    }
}
