import org.jonas.Assignment;
import org.jonas.Course;
import org.jonas.Department;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssignmentTest {
    @Test
    public void testcalcAssignmentAvg1() {
        Assignment assignment = new Assignment("Exam1", 0.2, 100, 3);

        assignment.getScores().set(0, 80);
        assignment.getScores().set(1, 80);
        assignment.getScores().set(2, 80);

        assignment.calcAssignmentAvg();

        double expectedResult = 80.0;
        double result = assignment.getAssignmentAverage();

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testcalcAssignmentAvg2() {
        Assignment assignment = new Assignment("Exam1", 0.2, 100, 3);

        assignment.getScores().set(0, 35);
        assignment.getScores().set(1, 77);
        assignment.getScores().set(2, 92);

        assignment.calcAssignmentAvg();

        double expectedResult = 68.0;
        double result = assignment.getAssignmentAverage();

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testcalcAssignmentAvg3() {
        Assignment assignment = new Assignment("Exam1", 0.2, 100, 0);

        assignment.calcAssignmentAvg();

        double expectedResult = Double.NaN;
        double result = assignment.getAssignmentAverage();

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testcalcAssignmentAvg4() {
        Assignment assignment = new Assignment("Exam1", 0.2, 100, 3);

        assignment.getScores().add(null);
        assignment.getScores().add(null);
        assignment.getScores().add(null);

        double expectedResult = 0;
        double result = assignment.getAssignmentAverage();

        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    public void testIsAssignmentsTotalWeightValid1() {
        Course course = new Course("Programming1", 4, new Department("CST"));
        course.addAssignment("Exam1", 0.2, 100);
        course.addAssignment("Exam2", 0.2, 100);
        course.addAssignment("FinalExam", 0.6, 100);

        boolean expectedResult = true;
        boolean result = course.isAssignmentWeightValid();
    }

    @Test
    public void testIsAssignmentsTotalWeightValid2() {
        Course course = new Course("Programming1", 4, new Department("CST"));
        course.addAssignment("Exam1", 0.1, 100);
        course.addAssignment("FinalExam", 0.6, 100);

        boolean expectedResult = false;
        boolean result = course.isAssignmentWeightValid();
    }

    @Test
    public void testIsAssignmentsTotalWeightValid4() {
        Course course = new Course("Programming1", 4, new Department("CST"));

        boolean expectedResult = false;
        boolean result = course.isAssignmentWeightValid();
    }

}
