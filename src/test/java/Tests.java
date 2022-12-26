import org.example.OddEvenWeek;
import org.junit.Assert;
import org.junit.Test;

public class Tests {

    public Tests() {
    }



    @Test
    public void Test1() {
        OddEvenWeek week = new OddEvenWeek(20, 30, 2022, 2022);
        Assert.assertEquals(2, week.Check());


    }
    @Test
    public void Test2() {

        OddEvenWeek week2 = new OddEvenWeek(20, 31, 2022, 2022);
        Assert.assertEquals(1, week2.Check());


    }
    @Test
    public void Test3() {

        OddEvenWeek week3 = new OddEvenWeek(20, 31, 2022, 2021);
        Assert.assertEquals(0, week3.Check());

    }


}