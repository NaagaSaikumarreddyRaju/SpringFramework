package PropertyConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:config.properties")
// If we have multiple property files use PropertySources({PropertySource(""),@PropertySource("")})
public class ApplicationConfigData {
    @Value("${ip}")
    String ip;
    @Value("${port}")
    int port;
    @Value("${username}")
    String username;
    @Value("${password}")
    String password;

    @Override
    public String toString() {
        return "ApplicationConfigData{" +
                "ip='" + ip + '\'' +
                ", port=" + port +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
