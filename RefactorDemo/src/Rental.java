
class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
      _movie = movie;
      _daysRented = daysRented;
    }
    public int getDaysRented() {
      return _daysRented;
    }
    public Movie getMovie() {
      return _movie;
    } 
    
    
    /**
	 * @deprecated Use {@link #MISSING()} instead
	 */
	
    public double getCharge()
	{
		return _movie.getCharge(_daysRented);
	}
    
    
    int getFrequentRentorPoints() 
    {
    	return _movie.getFrequentRentorPoints(_daysRented);
    }
    
    /**
	 * @deprecated Use {@link Movie#getFrequentRentorPoints(Rental,int)} instead
	 * @deprecated Use {@link #MISSING()} instead
	 */
	
	int getFrequentRentorPoints(int daysRented) {
		return _movie.getFrequentRentorPoints(daysRented);
	}
	

    
}

