package org.bank;

public class AxisBank extends BankInfo {

@Override
public void savings() {
	System.out.println("savings is 6%");
	}
@Override
public void fixed() {
	System.out.println("fixed is 9%");
	}
@Override
	public void deposit() {
	System.out.println("deposit is 15%");
	}
public static void main(String[] args) {
	AxisBank AB = new AxisBank();
	AB.savings();
	AB.fixed();
	AB.deposit();
}
}
