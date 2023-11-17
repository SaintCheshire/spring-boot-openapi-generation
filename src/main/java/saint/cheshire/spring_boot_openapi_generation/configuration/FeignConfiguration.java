package saint.cheshire.spring_boot_openapi_generation.configuration;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(FeignClientsConfiguration.class)
@EnableFeignClients(basePackages = {"saint.cheshire.specifications"})
@Configuration
public class FeignConfiguration {
}
