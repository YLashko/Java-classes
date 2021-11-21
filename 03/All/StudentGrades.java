import java.util.Random;
import java.util.*;
public class StudentGrades {

    String studentName;
    double[] grades = {};

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }
    
    StudentGrades(String name, int numberOfGrades) {
        this.studentName = name;
        FillRandom(numberOfGrades);
    }
    
    StudentGrades(String name){
        this.studentName = name;
        FillTerminal();
    }
    
    public void FillTerminal(){
        Scanner s = new Scanner(System.in);
        double userInput;
        double[] gradesExample = {2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0};
        while ((userInput = s.nextDouble()) != 0){
            if (contains(gradesExample, userInput)) {
                this.grades = Arrays.copyOf(this.grades, this.grades.length + 1);
                this.grades[this.grades.length - 1] = userInput;
            }
        }
    }
    
    public void FillRandom(int numberOfGrades) {
        Random r = new Random();
        double[] gradesExample = {2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0};
        for (int num = 0; num < numberOfGrades; num++){
            this.grades = Arrays.copyOf(this.grades, this.grades.length + 1);
            this.grades[num] = gradesExample[r.nextInt(gradesExample.length)];
        }
        System.out.println(this.grades);
    }
    
    double CalculateLowest(){
        double minValue = grades[0];
        for (double grade : grades){
            if (minValue > grade){
                minValue = grade;
            }
        }
        return minValue;
    }
    
    double CalculateHighest(){
        double maxValue = grades[0];
        for (double grade : grades){
            if (maxValue < grade){
                maxValue = grade;
            }
        }
        return maxValue;
    }
    
    int NumberOfGrades(){
        return grades.length;
    }
    
    double AverageGrade(){
        double sum = 0;
        for (double grade : grades){
            sum += grade;
        }
        return sum / NumberOfGrades();
    }
    
    void DisplayInfo(){
        System.out.println("Name: " + studentName + "\nHighestGrade: " + CalculateHighest() + "\nLowestGrade: " + CalculateLowest() + "\nNumber of grades: " + NumberOfGrades() + "\nGrade point average: " + AverageGrade());
        for (double grade : grades){
            System.out.println(grade);
        }
    }
    
    boolean contains(double[] array, double match){
        for(double arrayElement : array){
            if (arrayElement == match){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args){
        StudentGrades amanda = new StudentGrades("Amanda", 70);
        StudentGrades james = new StudentGrades("James", 80);
        amanda.DisplayInfo();
        james.DisplayInfo();
    }
}

