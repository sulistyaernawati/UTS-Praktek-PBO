/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal_4;

/**
 *
 * @author Sulistya Ernawati
 */
public class CourseDemo {
    public static void main(String[] args) {
       Instructor myInstructor = new Instructor("Puspitasari", "Nadia", "AG0110");
       
       TextBook myTextBook = new TextBook("Jika Kita Tidak Pernah Jadi Apa-Apa", "Alvi Syahrin", "Gagas Media");
       
       Course myCourse = new Course("Self Improvement", myInstructor, myTextBook);
       
       System.out.println(myCourse);
    }
}

