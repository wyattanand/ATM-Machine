import java.util.HashMap;
public class ATM {
	HashMap<Integer, Double> accounts = new HashMap<Integer, Double>();
	private int Num;
	private double Bal;
	public void openAccount(int x) {
		Num = x;
	}
	public void openAccount(int x, double y) {
		Num = x;
		Bal = y;
	}
	public void closeAccount(int x) {
		if (accounts.containsKey(x)) {
			if (Bal <= 0) {
				accounts.remove(x);
			}
		}
	}
	public double checkBalance(int x) {
		if (accounts.containsKey(x)) {
			return Bal;
		}
		return 0.0;
	}
	public boolean depositMoney(int x, double d) {
		if (accounts.containsKey(x)) {
			accounts.put(x, accounts.get(x)+d);
			return true;
		}
		return false;
	}
	public boolean withdrawMoney(int x, double d) {
		if (accounts.containsKey(x)) {
			accounts.put(x, accounts.get(x)-d);
			return true;
		}
		return false;
	}
}
