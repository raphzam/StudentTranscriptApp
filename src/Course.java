public class Course {
    private String courseCode;
    private int numOfCredits;
    private String letterGrade;

    public Course(){

    }

    public Course(String courseCode, int numOfCredits, String letterGrade){
        this.courseCode = courseCode;
        this.numOfCredits = numOfCredits;
        this.letterGrade = letterGrade;
    }

    //SETTERS AND GETTERS

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseCode() {
        return this.courseCode;
    }

    public void setNumOfCredits(int numOfCredits) {

        this.numOfCredits = numOfCredits;
    }
    public int getNumOfCredits() {
        return this.numOfCredits;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    public String getLetterGrade() {
        return this.letterGrade;
    }


    //

    public String toString(){
        String retval ="";
        retval = this.courseCode + " " + this.numOfCredits + " " + this.letterGrade;
        return retval;
    }



}


