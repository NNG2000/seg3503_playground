import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateOkTest
{

  private Date today;
  private Date expectedTomorrow;

  public DateNextDateOkTest(
    int todayYear, int todayMonth, int todayDay,
    int expeectedYear, int expectedMonth, int expectedDay)
  {
    this.today = new Date(todayYear, todayMonth, todayDay);
    this.expectedTomorrow = new Date(expeectedYear, expectedMonth, expectedDay);
  }

  @Parameters
  public static List<Integer[]> data( )
  {
    List<Integer[]> params = new LinkedList<Integer[]>( );


    // IS END OF MONTH TEST 16 Branch test attempt
    
    //Branch 1 (day!=31).
     params.add(new Integer[] { 3456, 10, 10, 3456, 10, 11 });
    //Branch 2: day == 30 and !isThirtyDayMonth)
    params.add(new Integer[] { 3456, 9, 30, 3456, 10, 1 });
    //Branch 3: (day == 30) and isThirtyDayMonth)
    params.add(new Integer[] { 3456, 10, 30, 3456, 10, 31 });
    //Branch 4: (day != 30) and isThirtyDayMonth)
    params.add(new Integer[] { 3456, 9, 12, 3456, 9, 13 });

    //Branch 5:  month = 2, day  = 29 and leap 
    params.add(new Integer[] { 444, 2, 29, 444, 3, 1 });
    //Branch 6 : month = 2, day = 29 and non leap (is in DateExceptionTest)
    //Look for Params.add(new Integer[] {1500,	02,	31,	0,0,0});
    //Branch 7 : month = 2, day != 29 and non leap 
    params.add(new Integer[] { 3600, 2, 22, 3600, 2, 23 });
    //Branch 8 = month = 2, day  != 29 and leap 
    params.add(new Integer[] { 3601, 2, 22, 3601, 2, 23});  

     // Branch9 month = 2, day  = 28 and !leap  
    params.add(new Integer[] { 3600, 2, 28, 3600, 2, 29 });
    // Branch 10 = month = 2, day  = 28 and leap 
    params.add(new Integer[] { 3601, 2, 28, 3601, 3, 1 });
    // Branch 11 month = 2, day  != 28 and !leap  
    params.add(new Integer[] { 3600, 2, 22, 3600, 2, 23 });
    // Branch 12 = month = 2, day  != 28 and leap 
    params.add(new Integer[] { 3601, 2, 22, 3601, 2, 23});
    
    //Branch 13 : month == 2 and !(leap or day == 29 or 28) 
     params.add(new Integer[] { 3601, 2, 22, 3601, 2, 23})
    //Branch 14 : month !=2 
    params.add(new Integer[] { 3601, 3, 22, 3601, 3, 23});

    //Branch 15: !30 day month and day != 30 
    params.add(new Integer[] {1607,	8,	15,	1607,8,16});

    //Branch 16 (day == 31)
    params.add(new Integer[] { 3456, 12, 31, 3457, 1, 1 });
    return params;
  }

  @Test
  public void testNextDate()
  {
    Date actualTomorrow = today.nextDate();
    Assert.assertEquals(expectedTomorrow, actualTomorrow);
  }

}
