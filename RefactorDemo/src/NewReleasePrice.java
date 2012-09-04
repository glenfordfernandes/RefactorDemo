
public class NewReleasePrice extends Price {

	@Override
	int getPriceCode() {
		// TODO Auto-generated method stub
		return Movie.NEW_RELEASE;
	}
	public double getCharge(int daysRented)
	{
		return daysRented * 3;
	}
	
	int getFrequentRentorPoints(int daysRented)
	{
		return (daysRented > 1) ? 2: 1;
	}

}