import java.util.ArrayList;
import java.util.Scanner;

public class TranscriptApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //ARRAYLIST OF TRANSCRIPTS
        ArrayList<Transcript> allTranscripts = new ArrayList<Transcript>();


//        STUDENT INFO VARIABLES
        String firstName = "";
        String lastName = "";
        String studentID;

//        COURSE VARIABLES
        String courseCode = "";
        int numOfCredits;
        String letterGrade;


        System.out.println("Welcome to the transcript application");


        Transcript summer20 = null;
        while (true) {


            System.out.println("Enter Student ID number: ");
            studentID = input.nextLine();


            System.out.println("Enter Student's first name: ");
            firstName = input.nextLine();


            System.out.println("Enter Student's last name: ");
            lastName = input.nextLine();

            summer20 = new Transcript(studentID, firstName, lastName);


            Course courseOne;
            while (true) {
                System.out.println("Enter course code:");
                courseCode = input.nextLine();
                //validate courseCode


                System.out.println("Enter credits:");
                numOfCredits = Integer.valueOf(input.nextLine());
                //validate numOfCredits


                System.out.println("Enter letter grade:");
                letterGrade = input.nextLine();
                letterGrade = letterGrade.toUpperCase();
                //validate letterGrade

                courseOne = new Course(courseCode, numOfCredits, letterGrade);   //generate new course and input values
                summer20.addCourse(courseOne);  //add course to the transcript

                System.out.println("Add another course? (y/n)");
                String userContinue = input.nextLine();

                if (userContinue.equalsIgnoreCase("n") || userContinue.equalsIgnoreCase("no")) {
                    break;
                }
            }//END ADD COURSE


            allTranscripts.add(summer20);

            System.out.println("Add another student? (y/n)");
            String userContinue = input.nextLine();

            if (userContinue.equalsIgnoreCase("n") || userContinue.equalsIgnoreCase("no")) {
                break;
            }




        }//END NEW TRANSCRIPT

        for (Transcript transcript : allTranscripts){
            System.out.println(transcript.getStudentInfo());
            System.out.println(transcript.wholeTranscript());
            System.out.println("Overall GPA: " + transcript.getOverallGPA());
            System.out.println("\n\t\t-------------------------");


        }

//
//
//
//        System.out.println(summer20.getStudentInfo());
//        System.out.println(summer20.wholeTranscript());
//        System.out.println("Overall GPA: " + summer20.getOverallGPA());

















    }



}
