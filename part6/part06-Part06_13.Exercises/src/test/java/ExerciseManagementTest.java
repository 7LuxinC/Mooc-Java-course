import static org.junit.Assert.assertEquals;
import static  org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class ExerciseManagementTest {
    private ExerciseManagement management;

   @Before
    public void initialize() {
        management = new ExerciseManagement();
    }

    @Test
    public void valueMinusTwoWhenTwoSubstracted() {
        assertEquals(0, management.exerciseList().size());

    }

    @Test
    public void addingExrciseGrowsListByOne() {
        management.add("Write a test");
        assertEquals(1, management.exerciseList().size());
    }

    @Test
    public void addedExerciseIsList() {
        management.add("Write a test");
        assertTrue(management.exerciseList().contains("Write a test"));

    }


    @Test
    public void exerciseCanBeMarkedAsCompleted(){
       management.add("New Exercise");
       management.markAsCompleted("New exercise");
       assertTrue(management.isCompleted("New exercise"));
    }

    @Test
    public void ifNotMarkedCompletedIsNotCompleted(){
       management.add("New exercise");
       management.markAsCompleted("New exercise");
       assertFalse(management.isCompleted("Some exercise"));
    }
}



