package saint.cheshire.specifications.spring_boot_openapi_generation.v1_0_0.server.api;

import saint.cheshire.specifications.spring_boot_openapi_generation.v1_0_0.server.model.SomeEndpointErrorResponse;
import saint.cheshire.specifications.spring_boot_openapi_generation.v1_0_0.server.model.SomeEndpointRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-17T23:27:58.945400400+03:00[Europe/Moscow]")
@Controller
@RequestMapping("${openapi.aPISpringBootOpenapiGeneration.base-path:}")
public class SpringBootOpenApiGenerationApiController implements SpringBootOpenApiGenerationApi {

    private final NativeWebRequest request;

    @Autowired
    public SpringBootOpenApiGenerationApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
