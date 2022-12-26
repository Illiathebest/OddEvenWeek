import org.example.OddEvenWeek;
import org.junit.Assert;
import org.junit.Test;

public class Tests {

    public Tests() {
    }



    @Test
    public void Test() {
        OddEvenWeek week = new OddEvenWeek(1, 9, 2022, 26, 12, 2022);
        Assert.assertEquals(2, week.Check());
        OddEvenWeek week2 = new OddEvenWeek(1, 9, 2022, 25, 12, 2022);
        Assert.assertEquals(1, week2.Check());
        OddEvenWeek week3 = new OddEvenWeek(1, 9, 2021, 26, 12, 2022);
        Assert.assertEquals(0, week.Check());

    }

}