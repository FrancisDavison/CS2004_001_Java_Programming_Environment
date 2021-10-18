public class Numeric
{
	public static void main(String args[])
	{
		double x = 20;
		double y = 10;
		approxEqual(x,y);
	}
	
	/**
    Tests whether two floating-point numbers are
    equal, except for a roundoff error
    x a floating-point number
    y a floating-point number
	returns true if x and y are approximately equal
	*/
	public static boolean approxEqual(double x, double y)
	{
		final double EPSILON = 1E-10;
		if (Math.abs(x-y)<EPSILON)
		{
			return(true);
		}
		return(false);
	}
}