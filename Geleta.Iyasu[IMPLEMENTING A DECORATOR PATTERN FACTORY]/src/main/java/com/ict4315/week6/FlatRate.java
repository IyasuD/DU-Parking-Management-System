package com.ict4315.week6;



public class FlatRate implements AbstractDiscount  {
  private double total;

public FlatRate(double total) {
	super();
	this.total = total;
}

@Override
public double apply() {
	// TODO Auto-generated method stub
	return total;
}
}
