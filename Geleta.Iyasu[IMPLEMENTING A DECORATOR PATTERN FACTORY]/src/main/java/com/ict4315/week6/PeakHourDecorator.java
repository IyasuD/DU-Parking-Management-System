package com.ict4315.week6;



public class PeakHourDecorator implements AbstractDiscount {
	private AbstractDiscount discount;

    protected PeakHourDecorator(AbstractDiscount discount) {
        this.discount = discount;
    }

@Override
public double apply() {
	// TODO Auto-generated method stub
	return  discount.apply() - discount.apply() * 0.1;
}
}
