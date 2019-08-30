import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Author: dahai.li
 * @Description:
 * @Date: Create in 17:42 2019/8/28
 */
@EnableAutoConfiguration
@ImportResource("provider.xml")
public class ServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class);
    }
}
