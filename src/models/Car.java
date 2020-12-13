package models;

import java.util.Date;

public class Car {
	/**
	 * @return the modelName
	 */
	public static String getModelName() {
		return modelName;
	}
	/**
	 * @param modelName the modelName to set
	 */
	public static void setModelName(String modelName) {
		Car.modelName = modelName;
	}
	/**
	 * @return the brand
	 */
	public static String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public static void setBrand(String brand) {
		Car.brand = brand;
	}
	/**
	 * @return the marketPrice
	 */
	public static double getMarketPrice() {
		return marketPrice;
	}
	/**
	 * @param marketPrice the marketPrice to set
	 */
	public static void setMarketPrice(double marketPrice) {
		Car.marketPrice = marketPrice;
	}
	/**
	 * @return the modelYear
	 */
	public static int getModelYear() {
		return modelYear;
	}
	/**
	 * @param modelYear the modelYear to set
	 */
	public static void setModelYear(int modelYear) {
		Car.modelYear = modelYear;
	}
	/**
	 * @return the annualInsurancePercent
	 */
	public static double getAnnualInsurancePercent() {
		return annualInsurancePercent;
	}
	/**
	 * @param annualInsurancePercent the annualInsurancePercent to set
	 */
	public static void setAnnualInsurancePercent(double annualInsurancePercent) {
		Car.annualInsurancePercent = annualInsurancePercent;
	}
	/**
	 * @return the milage
	 */
	public static int getMilage() {
		return milage;
	}
	/**
	 * @param milage the milage to set
	 */
	public static void setMilage(int milage) {
		Car.milage = milage;
	}
	/**
	 * @return the dateCreated
	 */
	public Date getDateCreated() {
		return dateCreated;
	}
	/**
	 * @param dateCreated the dateCreated to set
	 */
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	private static String modelName = "";
	private static String brand = "";	
	private static double marketPrice = 0.0;
	private static int modelYear = 0;
	private static double annualInsurancePercent = 0.0;
	private static int milage= 0;
	private Date dateCreated;	

}
