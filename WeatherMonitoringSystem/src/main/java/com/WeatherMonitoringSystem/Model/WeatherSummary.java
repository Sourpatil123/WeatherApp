package com.WeatherMonitoringSystem.Model;

public class WeatherSummary {
	
	 private double averageTemperature;
	    private double maxTemperature;
	    private double minTemperature;
	    private String dominantWeatherCondition;

	    public WeatherSummary(double averageTemperature, double maxTemperature, double minTemperature, String dominantWeatherCondition) {
	        this.averageTemperature = averageTemperature;
	        this.maxTemperature = maxTemperature;
	        this.minTemperature = minTemperature;
	        this.dominantWeatherCondition = dominantWeatherCondition;
	    }

		public double getAverageTemperature() {
			return averageTemperature;
		}

		public void setAverageTemperature(double averageTemperature) {
			this.averageTemperature = averageTemperature;
		}

		public double getMaxTemperature() {
			return maxTemperature;
		}

		public void setMaxTemperature(double maxTemperature) {
			this.maxTemperature = maxTemperature;
		}

		public double getMinTemperature() {
			return minTemperature;
		}

		public void setMinTemperature(double minTemperature) {
			this.minTemperature = minTemperature;
		}

		public String getDominantWeatherCondition() {
			return dominantWeatherCondition;
		}

		public void setDominantWeatherCondition(String dominantWeatherCondition) {
			this.dominantWeatherCondition = dominantWeatherCondition;
		}

	    

}
