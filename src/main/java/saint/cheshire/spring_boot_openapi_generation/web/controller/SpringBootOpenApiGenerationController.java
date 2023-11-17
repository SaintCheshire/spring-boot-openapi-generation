package saint.cheshire.spring_boot_openapi_generation.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.request.NativeWebRequest;
import saint.cheshire.specifications.spring_boot_openapi_generation.v1_0_0.server.api.SpringBootOpenApiGenerationApiController;
import saint.cheshire.specifications.spring_boot_openapi_generation.v1_0_0.server.model.SomeEndpointRequest;

@Slf4j
@Controller
public class SpringBootOpenApiGenerationController extends SpringBootOpenApiGenerationApiController {

    public SpringBootOpenApiGenerationController(NativeWebRequest request) {
        super(request);
    }

    @Override
    public ResponseEntity<Void> someEndpoint(SomeEndpointRequest someEndpointRequest) {
        log.info("Got request: {}", someEndpointRequest);
        return ResponseEntity.ok().build();
    }

}
