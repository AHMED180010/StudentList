/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student1;

/**
 *
 * @author hsham
 */
public class partTimeStudent extends Student1{
    private int numofCourses;

    public partTimeStudent(int numofCourses, String studentId, String studentName) {
        super(studentId, studentName);
        this.numofCourses = numofCourses;
    }

    public int getNumofCourses() {
        return numofCourses;
    }

    public void setNumofCourses(int numofCourses) {
        this.numofCourses = numofCourses;
    }
    
    
}
