import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.StringReader;

public class XMLtoStandardAdapter implements MobileApplication{
    XMLWeatherAPI xmlWeatherAPI;
    StandardWeatherData st;
    public XMLtoStandardAdapter(XMLWeatherAPI xmlWeatherAPI) {
        this.xmlWeatherAPI = xmlWeatherAPI;
        st = new StandardWeatherData();
    }
    @Override
    public String getWeatherData() {
        try {
            convertToStandardFormat();
        } catch (ParserConfigurationException |IOException | SAXException e) {
            throw new RuntimeException(e);
        }
        return st.getWeatherData();
    }
    public void convertToStandardFormat() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        Document document = builder.parse(new InputSource(new StringReader(xmlWeatherAPI.getWeatherAPIData())));

        Element cityElement = (Element) document.getElementsByTagName("city").item(0);
        String cityName = cityElement.getAttribute("name");
        st.setLocation(cityName);

        Element temperatureElement = (Element) document.getElementsByTagName("temperature").item(0);
        String temperature = temperatureElement.getAttribute("value");
        st.setTemperature(Double.parseDouble(temperature));

        Element humidityElement = (Element) document.getElementsByTagName("humidity").item(0);
        String humidity = humidityElement.getAttribute("value");
        st.setHumidity(Integer.parseInt(humidity));

        Element conditionElement = (Element) document.getElementsByTagName("clouds").item(0);
        String condition = conditionElement.getAttribute("name");
        st.setCondition(condition);
    }
}
