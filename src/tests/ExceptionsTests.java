package tests;

import com.sun.xml.internal.ws.developer.MemberSubmissionAddressing;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import week6.Exceptions;
import week6.InsufficientFundsException;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionsTests {

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    @Before
    public void setUp(){
        list1.add(1);
        list1.add(2);
        list1.add(3);

        list2.add(1);
        list2.add(2);
        list2.add(3);
    }

    @After
    public void tearDown(){
        list1 = null;
        list2 = null;
    }

    @Test(expected = FileNotFoundException.class)
    public void readFileWithException() throws FileNotFoundException {
        Exceptions.readFile();
    }

    @Test
    public void divideTenByFive() {
        int expectedResult = 2;
        int actualResult = Exceptions.divide(10, 5);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZero() {
        Exceptions.divide(10, 0);
    }

    @Test(expected = InsufficientFundsException.class)
    public void checkAccountWithBogdan() throws InsufficientFundsException {
        Exceptions.checkAccount("Bogdan");
    }

    @Test
    public void checkAccount() throws InsufficientFundsException {
        double expected = 500;
        double actual = Exceptions.checkAccount("alin");
        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void checkArray(){
        Assert.assertArrayEquals(list1.toArray(), list2.toArray());
        list2.add(4);
        Assert.assertNotEquals(list1.toArray(), list2.toArray());
    }

    @Test
    public void checkArrayAgain(){
        Assert.assertArrayEquals(list1.toArray(),list2.toArray());
    }
}
