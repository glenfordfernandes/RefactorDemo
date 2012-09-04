
public class ChildrensPrice extends Price {

	@Override
	int getPriceCode() {
		// TODO Auto-generated method stub
		return Movie.CHILDRENS;
	}
	
	public double getCharge(int daysRented)
	{
		double result = 1.5;
		if(daysRented > 3)
		{
			result += (daysRented - 3) * 1.5;
		}
		return result;
	}

}
