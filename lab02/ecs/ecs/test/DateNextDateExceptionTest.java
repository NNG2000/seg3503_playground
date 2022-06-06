import java.util.LinkedList;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateExceptionTest
{
    
    private IllegalArgumentException actual;

    public DateNextDateExceptionTest(IllegalArgumentException actual)
    {
        this.actual = actual;
    }
    
	
    
    
    @Parameters
	public static List<Object[]> data( )
	{
        List<Object[]> params = new LinkedList<Object[]>( );
        test1(params);
        test2(params);
        test3(params);
        test4(params);
        test5(params);
        
		return params;
      
	}

	

	@Test
	public void testNextDateException()
	{
        Assert.assertEquals(IllegalArgumentException.class, actual.getClass());
	}

    public static List<Object[]> test1(List<Object[]> params)
    {
        try
        {
           
            params.add(new Object[] { new Date(1500,02,31)});
            Assert.fail("should throw an exception");
            
        }
        catch(IllegalArgumentException e)
        {
            
            params.add(new Object[] {e});
            
        }
        return params;
    }
    public static List<Object[]> test2(List<Object[]> params)
    {
        try
        {
           
            params.add(new Object[] { new Date(1500,02,29)});
            Assert.fail("should throw an exception");
            
        }
        catch(IllegalArgumentException e)
        {
            
            params.add(new Object[] {e});
            
        }
        return params;
    }
    public static List<Object[]> test3(List<Object[]> params)
    {
        try
        {
           
            params.add(new Object[] { new Date(-1,10,20)});
            Assert.fail("should throw an exception");
            
        }
        catch(IllegalArgumentException e)
        {
            
            params.add(new Object[] {e});
            
        }
        return params;
    }
    public static List<Object[]> test4(List<Object[]> params)
    {
        try
        {
           
            params.add(new Object[] { new Date(1458,15,12)});
            Assert.fail("should throw an exception");
            
        }
        catch(IllegalArgumentException e)
        {
            
            params.add(new Object[] {e});
            
        }
        return params;
    }
    public static List<Object[]> test5(List<Object[]> params)
    {
        try
        {
           
            params.add(new Object[] { new Date(1975,06,-50)});
            Assert.fail("should throw an exception");
            
        }
        catch(IllegalArgumentException e)
        {
            
            params.add(new Object[] {e});
            
        }
        return params;
    }

}