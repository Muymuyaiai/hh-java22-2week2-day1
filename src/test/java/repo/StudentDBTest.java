package repo;

import org.junit.jupiter.api.Test;
import java.util.HashMap;


import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    void findStudentByIdShouldThrowAnExceptionOnInvalidId(){
        int id = 5;
        StudentDB studentDB = new StudentDB(new HashMap<>());

        assertThrows(NullPointerException.class, () -> studentDB.findById(id));

    }

}