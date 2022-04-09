package operators.logicalOpeerators;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean isInterviewQuestionsSent = true;
        boolean isJavaHomeworkSent = false;
        //Send me interviewQuestions or javaHomework
        System.out.println("The student is okay: " + (isInterviewQuestionsSent || isJavaHomeworkSent));
        System.out.println("The student is okay: " + (isInterviewQuestionsSent && isJavaHomeworkSent));
        // !!!!     if there is a single true for OR - it is true
        // !!!!     if there is a single false for AND - it is false

        System.out.println("\nThe studednt did NOT send the homework " + !isInterviewQuestionsSent);
        System.out.println("\nThe studednt did NOT send the homework " + isInterviewQuestionsSent);




    }
}
