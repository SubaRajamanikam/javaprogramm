package OverRide;

public class AxisBank extends Bank {
int getLoan(int principalamount) {
	return principalamount*7/100;
}
}
