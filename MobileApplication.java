import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public interface MobileApplication {

    String getWeatherData() throws IOException;
}
