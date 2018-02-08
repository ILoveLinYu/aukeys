package com.aukey.study.service.impl;

import com.aukey.study.Apple;
import com.aukey.study.service.ApplePredicate;

public class AppleGreenColorPredicate implements ApplePredicate {

	@Override
	public boolean test(Apple apple) {
		// TODO Auto-generated method stub
		return apple.getColor().equals("бли╚");
	}

}
