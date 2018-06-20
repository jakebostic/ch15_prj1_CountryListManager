package ch15_prj1_CountryListManager;


public class CountriesApp {

	public static void main(String[] args) {
		System.out.println("Country List Manager");
		System.out.println();
		
		System.out.println("COMMAND LIST MENU");
		System.out.println("1 - List Countries");
		System.out.println("2 - Add a country");
		System.out.println("3 - Exit");
		System.out.println();
		
		CountryIO countriesFile = new CountryIO(); //declare & instantiate
		
		int menuNumber = 0;
		while (menuNumber != 3) {
			System.out.println("Enter menu number: ");
			System.out.println();
			
			if (menuNumber == 1) {
				displayAllCountries();
			}
			
			
		}

	}

}
