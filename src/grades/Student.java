package grades;
//Create a class named Student.
// It should have private properties for the student's name, and grades.
// The grades property should be an ArrayList of integers.
// The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList. The Student class should have the following methods:
//
//
//// returns the student's name
//public String getName();
//// adds the given grade to the grades property
//public void addGrade(int grade);
//// returns the average of the students grades
//public double getGradeAverage();
//Test your Student class by adding a main method and creating Student objects. Verify that you can add grades to each object, and that your getGradeAverage method correctly returns the average of the student's grades.


import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
//        System.out.print("Current Average: ");
        int totalGrades = 0;
        for (Integer grade: this.grades){
            totalGrades += grade;

        }

        //System.out.println("totalGrades = " + totalGrades);
        return totalGrades / this.grades.size();
    }


    public void printGrades(){
        System.out.println("Grades:");
        for (Integer grade: this.grades){
            System.out.println(grade);

        }
//        return "";

    }

    public static void main(String[] args) {
        Student fer = new Student("fer");
        fer.addGrade(80);
        fer.addGrade(20);
        fer.addGrade(60);

        System.out.println(fer.getGradeAverage());

    }

    public void recordAttendance(String date, String value){
        if (value.equalsIgnoreCase("A") || value.equalsIgnoreCase("P")){
            this.attendance.put(date, value);

        }
        else {
            System.out.println("The value : " + value + " is invalid");
        }

    }

    public String daysAbsent(){
        String daysAbsent="";
        String currentDay;
        for(String key : this.attendance.keySet()) {
//            System.out.println("student = " + students.get(key));
            currentDay = this.attendance.get(key);
            if (currentDay.equalsIgnoreCase("A")) {
                daysAbsent += " " + key + " ";
            }
//            System.out.println("key = " + key);
//            System.out.println("currentDay = " + currentDay);
        }
return daysAbsent;
    }

    public double attendancePercentage(){

        double totalDays = this.attendance.size();
        double daysPresent = 0;

        for (String val: this.attendance.values()) {
            if (val.equalsIgnoreCase("P")) {
                daysPresent += 1;
            }
        }

        return (daysPresent/totalDays) * 100;
    }

    /**
     *
     *
     * Add an attendance property to your Student objects. It should be a HashMap.
     * The keys should be strings representing the date, in the format "2017-10-02", and the values should be Strings that are one of:
     *
     * "A": Absent
     * "P": Present
     *
     * Add a method named recordAttendance(String date, String value) that adds records to the HashMap this method should make sure value is an an acceptable string.
     *
     * Create an instance method on your Student class to calculate a student's attendance percentage -- (Total Days - Absences) / Total Days.
     * Add the attendance information to the output of your command line interface, this should require only a small change.
     * Create an instance method on Student that finds the specific days a student was absent.
     * This method should return a List of Strings, where each string is the date of the absence.
     */
}
