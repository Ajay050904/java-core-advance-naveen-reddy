package DSA_Code_And_Notes.Arrays.Array_Examples;

public class student_arr {

    int roll_number;
    int total_marks;
    double percentage;
    String name;

    student_arr[] getdata() {
        student_arr[] s1 = new student_arr[2];
        s1[0] = new student_arr();
        s1[1] = new student_arr();

        System.out.println("student One Details : ");
        s1[0].roll_number = 01;
        s1[0].total_marks = 430;
        s1[0].percentage = 80.00;
        s1[0].name = "Ram";

        s1[1].roll_number = 02;
        s1[1].total_marks = 530;
        s1[1].percentage = 90.00;
        s1[1].name = "Shyam";

        return s1;
    }

    public static void main(String[] args) {
        student_arr obj1 = new student_arr();
        student_arr a1[] = obj1.getdata();
        for (student_arr student : a1) {
            System.out.println("Roll Number = " + student.roll_number);
            System.out.println("Total Marks = " + student.total_marks);
            System.out.println("Percentage = " + student.percentage + "%");
            System.out.println("Name = " + student.name);
            System.out.println("\nStudent Two Details : ");
        }
    }
}

/*
 * agar mai chahta hu ki "Student Two Details :" wali line keval ek bar print ho
 * To achieve the desired output, you can remove the loop and manually access
 * the elements from the array.
 * Since you know that there are only two elements in the array, you can
 * directly access them by index.
 * Here's the modified code:
 *
 * class student_arr {
 * int roll_number;
 * int total_marks;
 * double percentage;
 * String name;
 * 
 * student_arr[] getdata() {
 * student_arr[] s1 = new student_arr[2];
 * s1[0] = new student_arr();
 * s1[1] = new student_arr();
 * 
 * System.out.println("Student One Details:");
 * s1[0].roll_number = 1;
 * s1[0].total_marks = 430;
 * s1[0].percentage = 80.00;
 * s1[0].name = "Ram";
 * 
 * System.out.println("Roll Number = " + s1[0].roll_number);
 * System.out.println("Total Marks = " + s1[0].total_marks);
 * System.out.println("Percentage = " + s1[0].percentage + "%");
 * System.out.println("Name = " + s1[0].name);
 * System.out.println();
 * 
 * System.out.println("Student Two Details:");
 * s1[1].roll_number = 2;
 * s1[1].total_marks = 530;
 * s1[1].percentage = 90.00;
 * s1[1].name = "Shyam";
 * 
 * System.out.println("Roll Number = " + s1[1].roll_number);
 * System.out.println("Total Marks = " + s1[1].total_marks);
 * System.out.println("Percentage = " + s1[1].percentage + "%");
 * System.out.println("Name = " + s1[1].name);
 * 
 * return s1;
 * }
 * 
 * public static void main(String[] args) {
 * student_arr obj1 = new student_arr();
 * obj1.getdata();
 * }
 * }
 * ```
 * 
 * With this modification, the output will be:
 * 
 * ```
 * Student One Details:
 * Roll Number = 1
 * Total Marks = 430
 * Percentage = 80.0%
 * Name = Ram
 * 
 * Student Two Details:
 * Roll Number = 2
 * Total Marks = 530
 * Percentage = 90.0%
 * Name = Shyam
 * ```
 */
