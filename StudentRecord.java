/**
 * @author Luis Rivas
 * 2365948
 * lrivas@chapman.edu
 * CPSC 231-03
 * Mastery Project 1: Recursion and Intro to Classes - PART 2: StudentRecord
 * The purpose of this program is to create a StudentRecord class which stores the grades of 3 quizzes (Worth 25%), a midterm (worth 35%) and a final (worth 40%).
 * It then calculates the overall numeric score and letter grade. Note: methods are tested in main() before the toString() of each StudentRecord is printed.
 * Also note: both StudentRecords are set to the same values in order to test the .equals() method (student1 by using the constucor, and student2 by using mutator methods).
 * @version 1.0
 */
public class StudentRecord {
  /**
    * instance variables with self explanatory names
    */
  private double quizOneGrade;
  private double quizTwoGrade;
  private double quizThreeGrade;
  private double midtermGrade;
  private double finalGrade;
  private double overallNumericGrade;
  private char overallLetterGrade;

  /**
    * Default constructor initializing all double fields to 0.0 and the char to 'F' because they have no points yet.
    */
  public StudentRecord() {
    quizOneGrade = 0.0;
    quizTwoGrade = 0.0;
    quizThreeGrade = 0.0;
    midtermGrade = 0.0;
    finalGrade = 0.0;
    overallNumericGrade = 0.0;
    overallLetterGrade = 'F';
  }

  /**
    * Constructor initializing quizOneGrade to q1, quizTwoGrade to q2, quizThreeGrade to q3, midtermGrade to midterm, finalGrade to finalExam,
    * overallNumericGrade to the calculated weighted over grade using computeNumericScore(),and overallLetterGrade to the letter grade using computeLetterGrade().
    * @param q1 the grade for quiz 1
    * @param q2 the grade for quiz 2
    * @param q3 the grade for quiz 3
    * @param midterm the grade for the midterm
    * @param finalExam the grade for the final
    */
  public StudentRecord (double q1, double q2, double q3, double midterm, double finalExam) {
    quizOneGrade = q1;
    quizTwoGrade = q2;
    quizThreeGrade = q3;
    midtermGrade = midterm;
    finalGrade = finalExam;
    overallNumericGrade = computeNumericScore();
    overallLetterGrade = computeLetterGrade();
  }

  /**
    * Mutator method to set quizOneGrade to q1.
    * @param q1 the grade for quiz 1
    */
  public void setQuizOneGrade(double q1) {
    quizOneGrade = q1;
  }

  /**
    * Accessor method returning quizOneGrade.
    * @return  a double value quizOneGrade, the grade for quiz 1
    */
  public double getQuizOneGrade() {
    return quizOneGrade;
  }

  /**
    * Mutator method to set quizTwoGrade to q2.
    * @param q2 the grade for quiz 2
    */
  public void setQuizTwoGrade(double q2) {
    quizTwoGrade = q2;
  }

  /**
    * Accessor method returning quizTwoGrade.
    * @return a double value quizTwoGrade, the grade for quiz 2
    */
  public double getQuizTwoGrade() {
    return quizTwoGrade;
  }

  /**
    * Mutator method to set quizThreeGrade to q3.
    * @param q3 the grade for quiz 3
    */
  public void setQuizThreeGrade(double q3) {
    quizThreeGrade = q3;
  }

  /**
    * Accessor method returning quizThreeGrade.
    * @return a double value quizThreeGrade, the grade for quiz 3
    */
  public double getQuizThreeGrade() {
    return quizThreeGrade;
  }

  /**
    * Mutator method to set quizThreeGrade to q3.
    * @param midterm the grade for the midterm
    */
  public void setMidtermGrade(double midterm) {
    midtermGrade = midterm;
  }

  /**
    * Accessor method returning midtermGrade.
    * @return a double value midtermGrade,  the grade for the midterm.
    */
  public double getMidtermGrade() {
    return midtermGrade;
  }

  /**
    * Mutator method to set finalGrade to finalExam.
    * @param finalExam the grade for the final exam.
    */
  public void setFinalGrade(double finalExam) {
    finalGrade = finalExam;
  }

  /**
    * Accessor method returning finalGrade.
    * @return a double value finalGrade, the grade for the final.
    */
  public double getFinalGrade() {
    return finalGrade;
  }

  /**
    * Mutator method to set overallNumericGrade to overall.
    * @param overall the overall numeric grade.
    */
  public void setOverallNumericGrade(double overall) {
    overallNumericGrade = overall;
  }

  /**
    * Accessor method returning overallNumericGrade.
    * @return a double value overallNumericGrade, the overall numeric grade.
    */
  public double getOverallNumericGrade() {
    return overallNumericGrade;
  }

  /**
    * Mutator method to set overallLetterGrade to letterGrade.
    * @param letterGrade the overall letter grade.
    */
  public void setOverallLetterGrade(char letterGrade) {
    overallLetterGrade = letterGrade;
  }

  /**
    * Accessor method returning overallLetterGrade.
    * @return a char value overallLetterGrade, the overall letter grade.
    */
  public char getOverallLetterGrade() {
    return overallLetterGrade;
  }

  /**
    * Computes and returns the weighted overall grade considering the quiz category is woth 25%,
    * the midterm is worth 35%, and the final is worth 40% of the overall grade.
    * @return a double value, the overall numeric grade.
    */
  public double computeNumericScore() {
    double weightedQuizGrade = ((quizOneGrade + quizTwoGrade + quizThreeGrade) / 30) * 25.0;
    double weightedMidtemGrade = (midtermGrade / 100.0) * 35.0;
    double weightedFinalGrade = (finalGrade / 100) * 40.0;
    return (weightedQuizGrade + weightedMidtemGrade + weightedFinalGrade);
  }

  /**
    * Computes and returns the letter grade
    * @return a char value overallLetterGrade, the overall letter grade.
    */
  public char computeLetterGrade() {
    if (overallNumericGrade >= 90) {
      overallLetterGrade = 'A';
    }
    else if (overallNumericGrade >= 80) {
      overallLetterGrade = 'B';
    }
    else if (overallNumericGrade >= 70) {
      overallLetterGrade = 'C';
    }
    else if (overallNumericGrade >= 60) {
      overallLetterGrade = 'D';
    }
    else {
      overallLetterGrade = 'F';
    }
    return overallLetterGrade;
  }

  /**
    * toString() method neatly returning all StudentRecord information as a String.
    * @return a String value neatly showing all StudentRecord instance variables.
    */
  public String toString() {
    return ("Quiz 1 grade: " + quizOneGrade +
          "\nQuiz 2 grade: " + quizTwoGrade +
          "\nQuiz 3 grade: " + quizThreeGrade +
          "\nMidterm grade: " + midtermGrade +
          "\nFinal exam grade: " + finalGrade +
          "\nOverall numeric grade: " + overallNumericGrade +
          "%\nOverall letter grade: " + overallLetterGrade);
  }

  /**
    * equals() method comparing two StudentRecords for equality of contents
    * @return a boolean value representing if the two StudentRecords are equal or not.
    */
  public boolean equals(Object o) {
    boolean notSame = false;
    if (!(o instanceof StudentRecord)) {
      return notSame;
    }
    StudentRecord record = (StudentRecord) o;
    if (record.quizOneGrade != quizOneGrade || record.quizTwoGrade != quizTwoGrade || record.quizThreeGrade != quizThreeGrade || record.midtermGrade != midtermGrade ||
        record.finalGrade != finalGrade || record.overallNumericGrade != overallNumericGrade || record.overallLetterGrade != overallLetterGrade) {
          return notSame;
        }
    return true;
  }

  /**
    * Creates two StudentRecords. The first is initialized using an overloaded constructor. The second is initialized using mutator methods.
    * Prints both student records by utilizing their toString methods.
    * Checks if both StudentRecords are equal by calling the equals() method and prints if they are or not.
    * @param args command-line arguments
    */
  public static void main (String [] args) {
    StudentRecord student1 = new StudentRecord(9, 7, 10, 85, 93);
    StudentRecord student2 = new StudentRecord();

    student2.setQuizOneGrade(9);
    student2.setQuizTwoGrade(7);
    student2.setQuizThreeGrade(10);
    student2.setMidtermGrade(85);
    student2.setFinalGrade(93);
    student2.setOverallNumericGrade(student2.computeNumericScore());
    student2.computeLetterGrade();

    System.out.println("\nStudent Record for Student 1: \n" + student1);
    System.out.println("\nStudent Record for Student 2: \n" + student2);

    if (student2.equals(student1)) {
      System.out.println("\nThese students have the exact same grades!");
    }
    else {
      System.out.println("\nThese students have different grades!");
    }
  }
}
