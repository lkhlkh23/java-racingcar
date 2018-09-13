import org.junit.*;

public class JunitTest {


    @Before
    public void beforeTest() {
        System.out.println("Before");
    }

    @BeforeClass
    public static void beforeClassTest() {
        System.out.println("BeforeClass");
    }

    @After
    public void afterTest() {
        System.out.println("After");
    }

    @AfterClass
    public static void afterClassTest() {
        System.out.println("AfterClass");
    }

    @Test
    @Ignore
    public void test1Test() {
        System.out.println("Test Igonored");
    }

    @Test
    public void test2Test() {
        System.out.println("Test");
    }
}
