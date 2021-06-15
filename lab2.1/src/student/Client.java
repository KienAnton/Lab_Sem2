package student;

import student.entity.Student;

/**
 * Lớp Client sử dụng lớp Student để xây dựng chương trình java theo kịch bản.
 * CreateBy Kiennx
 * CreateAt 14/6/2021
 */
public class Client {
    public static void main(String[] args) {
        //Khai báo đối tượng A của lớp Student
        Student studentA;
        // Khai báo đối tượng B của lớp student
        Student studentB;
        // Khởi tạo giá trị cho đối tượng A và B
        studentA = new Student(0, "Nguyen Manh Truong", true);
        studentB = new Student(1, "Nguyen Van Linh", true);

        studentA.printfInfo();
        studentB.printfInfo();
        //Đổi tên sinh viên B
        studentB.setName("Nguyen Xuan Kien");
        studentB.printfInfo();

    }
}
