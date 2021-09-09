package model;

/**
 * @author Austin Donald - ajdonald
 * CIS175 - Fall 2021
 * Sep 8, 2021
 */
public class Gun {
	private String bulletType;
	private String gunModel;
	private String canFire;
	public Gun() {
		
	}
	public Gun (String bType, String gModel, String canFire) {
		setBulletType(bType);
		setGunModel(gModel);
		setCanFire(canFire);
	}
	/**
	 * @return the bulletType
	 */
	public String getBulletType() {
		return bulletType;
	}
	/**
	 * @param bulletType the bulletType to set
	 */
	public void setBulletType(String bulletType) {
		this.bulletType = bulletType;
	}
	/**
	 * @return the gunModel
	 */
	public String getGunModel() {
		return gunModel;
	}
	/**
	 * @param gunModel the gunModel to set
	 */
	public void setGunModel(String gunModel) {
		this.gunModel = gunModel;
	}
	/**
	 * @return the canFire
	 */
	public String isCanFire() {
		return canFire;
	}
	/**
	 * @param canFire the canFire to set
	 */
	public void setCanFire(String canFire) {
		this.canFire = canFire;
	}
	public boolean canGunFire () {
		if (this.canFire == "yes") {
			return true;
		} else {
			return false;
		}
	}
}
