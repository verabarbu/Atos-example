import atos.cat.Cat;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {
    @Test
    public void test_getName(){
        Cat testCat = new Cat();
        testCat.setName("Officer Tiddles");
        assertEquals("Officer Tiddles", testCat.getName(), "The name of the cat is not as expected");
    }
    @Test
    public void test_getLives(){
        Cat testCat = new Cat();
        testCat.setLives(9);
        assertEquals(9, testCat.getLives(), "The lives no is not as expected");
    }

    }

