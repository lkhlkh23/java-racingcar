import org.junit.*;
import static junit.framework.TestCase.*;

public class CalculatorTest {
    /*
        Junit4 애노테이션
            @BeforeClass : 테스트 클래스 내에서 수행 전 한 번만 실행, static method 여야 함
            @AfterClass : 테스트 클래스 내에서 수행 후 한 번만 실행, static method 여야 함
            @Before : 테스트 케이스 수행 전 반복실행
            @After : 테스트 케이스 수행 후 반복실행
            @Test : 테스트 메소드 지정
             * @Before은 @Test 할 때마다 호출, @BeforeClass는 처음에 한번 실행하고 실행되지 않음!(반복X)
    */
    /*
        1. assertArrayEquals(a, b); 배열 A와 B가 일치함을 확인.
        2. assertEquals(a, b); 객체 A와 B가 일치함을 확인
        3. assertSame(a, b); 객체 A와 B가 같은 객임을 확인
         * assertEquals 메서드는 두 객체의 값이 같은가를 검사는데 반해 assertSame메서드는 두 객체가 동일한가 즉 하나의 객인 가를 확인.(== 연산자)
        4. assertTrue(a); 조건 A가 참인가를 확인
        5. assertNotNull(a); 객체 A가 null이 아님을 확인
    */

    static Calculator cal;

    @BeforeClass
    public static void beforeClassTest() {
        cal = new Calculator();
        System.out.println("Test Start");
    }

    @Test
    public void calculateResultTest1() {
        String[] arr = "3 + 7 / 2".split(" ");
        assertEquals(5, cal.calculateResult(arr));
    }

    @Test
    public void calculateResultTest2() {
        String[] arr = "5 * 7 + 2".split(" ");
        assertEquals(37, cal.calculateResult(arr));
    }

    @Test
    public void calculateResultTest3() {
        String[] arr = "6 + 7 / 13".split(" ");
        assertEquals(1, cal.calculateResult(arr));
    }


    @AfterClass
    public static void AfterClassTest() {
        cal = null;
        System.out.println("Test End");
    }
}
