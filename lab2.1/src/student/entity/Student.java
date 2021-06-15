package student.entity;

/**
 * Lớp sinh viên chứa các thuộc tính như id, name, gender
 * createBy kiennx
 * createAt 13/6/2021
 */
public class Student {

    /**
     * Khai báo các trường để lưu các giá trị của các thuộc tính trong lớp
     */
    private int id;
    private String name;
    private boolean gender;

    /**
     * Constructor không có đối số
     */
    public Student(){
        // To do:
        this.id = -1;
        this.name = "noname";
        this.gender = true ;
    }

    /**
     * Constructor có đối số
     */

    public Student(int id, String name, boolean gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int value) {
        this.id = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String value) {
        this.name = value;
    }

    public boolean isMale() {
        return gender;
    }

    public void setMale(boolean value) {
        this.gender = value;
    }

    public void printfInfo(){
        System.out.println("----------------------------");
        System.out.println("| ID |        Name          | Male |");
        System.out.printf("| %d | %s | %b |\n",this.id,this.name,this.gender);
    }
}
