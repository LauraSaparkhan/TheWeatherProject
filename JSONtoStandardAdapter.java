import org.json.JSONObject;
import java.io.IOException;

public class JSONtoStandardAdapter implements MobileApplication{
    JSONWeatherAPI jsonWeatherAPI;
    StandardWeatherData st;

    public JSONtoStandardAdapter(JSONWeatherAPI jsonWeatherAPI) {
        this.jsonWeatherAPI = jsonWeatherAPI;
        st = new StandardWeatherData();
    }

    @Override
    public String getWeatherData() throws IOException {
        convertToStandardFormat(jsonWeatherAPI.location);
        return st.getWeatherData();
    }

    public void convertToStandardFormat(String location) throws IOException {
        JSONObject object = new JSONObject(jsonWeatherAPI.getWeatherAPIData());
        st.setLocation(location);
        st.setTemperature((object.getJSONObject("main").getDouble("temp")));
        st.setHumidity(object.getJSONObject("main").getInt("humidity"));
        st.setCondition(object.getJSONArray("weather").getJSONObject(0).getString("description"));
    }
}
