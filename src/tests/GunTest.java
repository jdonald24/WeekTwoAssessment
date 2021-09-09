package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Gun;

/**
 * @author Austin Donald - ajdonald
 * CIS175 - Fall 2021
 * Sep 8, 2021
 */
public class GunTest {
	Gun handGun = new Gun (".45", "revolver", "yes");
	Gun rifle = new Gun (".22", "rifle", "no");
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGunCanFire() {
		assertTrue (handGun.canGunFire());
	}
	@Test
	public void testGunCanFire2() {
		assertFalse (rifle.canGunFire());
	}

}
