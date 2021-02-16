package com.ict4315.week6;



public class SpecialDayDecorator implements AbstractDiscount {
	 private AbstractDiscount discount;

	    protected  SpecialDayDecorator(AbstractDiscount discount) {
	        this.discount = discount;
	    }
	
	@Override
	public double apply() {
		// TODO Auto-generated method stub
		return discount.apply() - discount.apply() * 0.05;
	}
}
