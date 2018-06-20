package ch15_prj1_CountryListManager;

import java.util.ArrayList;
import java.io.*;
import java.nio.file.Files;

public class CountryIO {

	private File countriesFile = null;
	
	public CountryIO() {
		countriesFile = new File("countries.txt");
		this.checkFile();		
	}
	
	public ArrayList<String> getCountries() {
		try (BufferedReader in = new BufferedReader(new FileReader(countriesFile))) {
			ArrayList<String> countries = new ArrayList<>();
			String country = in.readLine();
			while (country != null) {
				countries.add(country);
				country = in.readLine();
			}
			return countries;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public boolean saveCountries(ArrayList<String> countries) {
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(countriesFile)))) {
			for (String country : countries) {
				out.println(country);
			}
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	private void checkFile() {
		if (!countriesFile.exists()) {
			try {
				countriesFile.createNewFile();
			} catch (Exception e) {
				System.out.println(e);
			}

		}
	}

}
