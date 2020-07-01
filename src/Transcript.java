import java.util.ArrayList;

public class Transcript {
    private String firstName;
    private String lastName;
    private int studentID;

    private ArrayList<Course>courses;

    public Transcript(){
        courses = new ArrayList<Course>();
    }


    public Transcript (int studentID, String firstName, String lastName){ //transcript can be started with just first name and last name
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

    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int studentID) {
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

//            String grade = courses.get(i).getLetterGrade();    //get the letter grade
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

        String retval = "";

           /*go through ArrayList of courses
        get code, get credits, get grade, get quality points
        save to string,
        print string, new line

        repeat on next course
        repeat for size() of array
         */

        //save all to string
        //return string;

        for (Course course : courses){
            String oneLine = "";
            oneLine = course.getCourseCode() +"\t" + course.getNumOfCredits() + "\t" + course.getLetterGrade() + "\t" + course.getNumOfCredits() + "\n";
//            System.out.println(oneLine);
            retval+= oneLine = course.getCourseCode() +"\t" + course.getNumOfCredits() + "\t" + course.getLetterGrade() + "\t" + course.getNumOfCredits() + "\n";

        }




        return retval;

    }



















}
