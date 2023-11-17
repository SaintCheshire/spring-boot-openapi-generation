package saint.cheshire.spring_boot_openapi_generation;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import saint.cheshire.specifications.spring_boot_openapi_generation.v1_0_0.client.api.SpringBootOpenApiGenerationApiClient;
import saint.cheshire.specifications.spring_boot_openapi_generation.v1_0_0.client.model.SomeEndpointRequest;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;
import static org.springframework.http.HttpStatus.OK;

@SpringBootTest(webEnvironment = RANDOM_PORT)
public class ApplicationTest {

    @LocalServerPort
    public int port;

    @Autowired
    SpringBootOpenApiGenerationApiClient springBootOpenApiGenerationApiClient;

    public static WireMockServer wireMockServer;

    static {
        wireMockServer = new WireMockServer(WireMockConfiguration.options().dynamicPort());
        wireMockServer.start();
    }

    @DynamicPropertySource
    protected static void feignProperties(DynamicPropertyRegistry registry) {
        registry.add("springBootOpenApiGeneration.url", () -> "http://localhost:" + wireMockServer.port());
    }

    @Test
    void testController() {
        SomeEndpointRequest someEndpointRequest = SomeEndpointRequest.builder()
                .id("Some id")
                .code("Another code")
                .build();

        given().body(someEndpointRequest)
                .contentType(JSON)
                .when().post("http://localhost:" + port + "/api/v1/some-endpoint")
                .then().statusCode(OK.value());
    }

    @Test
    void testClient() {
        wireMockServer
                .stubFor(post(urlPathEqualTo("/api/v1/some-endpoint"))
                        .willReturn(aResponse()
                        .withStatus(OK.value()))
        );

        SomeEndpointRequest someEndpointRequest = SomeEndpointRequest.builder()
                .id("Some id")
                .code("Another code")
                .build();

        springBootOpenApiGenerationApiClient.someEndpoint(someEndpointRequest);
    }

}