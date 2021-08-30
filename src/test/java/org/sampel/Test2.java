package org.sampel;

import org.junit.Assert;
import org.junit.Ignore;

public class Test2 {

	@org.junit.Test
	public void tc0() {
		System.out.println("Method 0");

	}

	@org.junit.Test
	public void tc1() {
		System.out.println("Method 1");

	}

	@org.junit.Test
	public void tc2() {
		System.out.println("Method 2");

	}

	@Ignore
	@org.junit.Test
	public void tc3() {
		System.out.println("Method 3");

	}

	@org.junit.Test
	public void tc4() {
		System.out.println("Method 4");
		Assert.assertTrue(false);

	}

}
