package saint.cheshire.specifications.spring_boot_openapi_generation.v1_0_0.client.api;

import org.springframework.cloud.openfeign.FeignClient;
import saint.cheshire.specifications.spring_boot_openapi_generation.v1_0_0.client.configuration.ClientConfiguration;

@FeignClient(name="${springBootOpenApiGeneration.name:springBootOpenApiGeneration}", url="${springBootOpenApiGeneration.url:http://localhost:8080}", configuration = ClientConfiguration.class)
public interface SpringBootOpenApiGenerationApiClient extends SpringBootOpenApiGenerationApi {
}
