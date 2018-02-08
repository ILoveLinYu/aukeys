package com.aukey.study.service.impl;

import com.aukey.study.Apple;
import com.aukey.study.service.ApplePredicate;

public class AppleHeavyWeightPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		// TODO Auto-generated method stub
		return apple.getWeight() >26.00;
	}

}
