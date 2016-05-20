package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Customers {
	private List<Customer> accounts;
	
	public Customers() {
		accounts = new ArrayList<>();
	}	
		
	public void add(Customer a) {
		accounts.add(a);
	}
	
	public void clear() {
		accounts.clear();
	}

	public void remove(Customer a) {
		accounts.remove(a);
	}

	public void remove(Customer... acc) {
		for (Customer a: acc) {
			remove(a);
		}
	}

	public void add(Customer... acc) {
		for (Customer a: acc) {
			add(a);
		}
	}
	
	public void addAll( List<Customer> accountList ) {
		accounts.addAll( accountList );
	}
	
	public List<Customer> getAccounts(){
		return Collections.unmodifiableList( accounts );
	}

	@Override
	public String toString() {
		return "Customer [accounts=" + accounts + "]";
	}
}

