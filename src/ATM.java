import java.util.HashMap;
import java.math.*;
public class ATM {
	HashMap<Integer, Double> accounts = new HashMap<Integer, Double>();
	public void openAccount(int x) {
		accounts.put(x, 0.0);
	}
	public void openAccount(int x, double y) {
		accounts.put(x, y);
	}
	public void closeAccount(int x) {
		if (accounts.containsKey(x)) {
			if (accounts.get(x) == 0) {
				accounts.remove(x);
			}
		}
	}
	public double checkBalance(int x) {
		if (accounts.containsKey(x)) {
			return Math.round(100*accounts.get(x)) / 100.0;
		}
		return 0.0;
	}
	public boolean depositMoney(int x, double d) {
		if (accounts.containsKey(x) && d >= 0) {
			accounts.put(x, accounts.get(x)+d);
			return true;
		}
		return false;
	}
	public boolean withdrawMoney(int x, double d) {
		if (accounts.containsKey(x) && d <= accounts.get(x) && d >= 0) {
			accounts.put(x, accounts.get(x)-d);
			return true;
		}
		return false;
	}
}
