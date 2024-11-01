public class GradeBookTest {
    public static void main(String[] args) {
        final int NUMBER_OF_STUDENTS = 3;
        Student[] students = new Student[3];
        students[0] = new Student("A112221009", "王小明");
        students[1] = new Student("A112221010", "陳小華");
        students[2] = new Student("A112221011", "李小強");
        GradeBook gradeBook = new GradeBook("Java程式設計", students, NUMBER_OF_STUDENTS);
        gradeBook.processStudentGrades();
        gradeBook.displayGradeReport();
    }
}
