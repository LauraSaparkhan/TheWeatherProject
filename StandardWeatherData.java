public class StandardWeatherData {
    private String location;
    private double temperature;
    private int humidity;
    private String condition;

    public StandardWeatherData() {
        location = null;
        temperature = 0.0;
        humidity = 0;
        condition = null;
    }

    public String getWeatherData(){
        return "City name: " + getLocation() + "\n"
                + "Temperature: " + getTemperature() + "°C\n"
                + "Humidity: " + getHumidity() + "%\n"
                + "Weather Type: " + getCondition();
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getLocation() {
        return location;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public String getCondition() {
        return condition;
    }
}
