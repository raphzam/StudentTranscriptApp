import java.util.ArrayList;

public class Transcript {
    private String firstName;
    private String lastName;
    private String studentID;

    private ArrayList<Course>courses;

    public Transcript(){
        courses = new ArrayList<Course>();
    }


    public Transcript (String studentID, String firstName, String lastName){
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        courses = new ArrayList<Course>();
    }

    //SETTERS AND GETTERS

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void addCourse(Course course){   //add a course to the array list of courses
        this.courses.add(course);
    }

    public ArrayList getCourses(){

        return this.courses;
    }

    public String getStudentInfo(){     //prints student information from transcript
        String retval ="";
        retval = this.firstName + " " + this.lastName + "\n" + "Student ID: " +this.studentID;
        return retval;
    }

    public String getTranscript(){      //prints whole transcript
        String retval = "";
        retval = this.studentID + " " + this.firstName + " " + this.lastName;
        return retval;
    }

    /*CALCULATE GPA
    double GPA;
    go through ArrayList of courses
    getLetterGrade of each course
    get point value of letter grade via switch (letterGrade)
    add point value to GPA
    GPA / courses.size();
     */

    public double getOverallGPA(){

        double GPA = 0;
        double points = 0;
        for (Course course : courses) {

            String grade = course.getLetterGrade();

            grade = grade.toUpperCase();

            switch(grade) {
                case ("A"):
                    points = 4;
                    break;
                case ("B"):
                    points = 3;
                    break;
                case ("C"):
                    points = 2;
                    break;
                case ("D"):
                    points = 1;
                    break;
                default:
                    points = 0;
                    break;
            }
            GPA+=points;
        }

        return GPA / courses.size();

    }

    public String wholeTranscript(){
        //print header
        System.out.println("Course\t\tCredits\t\tGrade\t\tQuality Points");
        System.out.println("-------\t\t--------\t------\t\t-------------");

        String retval = "";

           /*go through ArrayList of courses
        get code, get credits, get grade, get quality points
        save to string,
        print string, new line
        repeat on next course
        repeat for size() of array
        save all to string
        return string;
         */

        for (Course course : courses){
            String oneLine = "";
            oneLine = course.getCourseCode() +"\t\t\t " + course.getNumOfCredits() + "\t\t\t " + course.getLetterGrade() + "\t\t\t " + course.getNumOfCredits() + "\n";
            retval+= oneLine;

        }

        return retval;

    }


}





