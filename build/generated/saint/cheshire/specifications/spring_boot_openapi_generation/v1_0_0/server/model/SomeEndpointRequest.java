package saint.cheshire.specifications.spring_boot_openapi_generation.v1_0_0.server.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SomeEndpointRequest
 */
@lombok.Builder(toBuilder = true)
@lombok.RequiredArgsConstructor
@lombok.AllArgsConstructor
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown=true)

@JsonTypeName("someEndpoint_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-17T23:27:58.945400400+03:00[Europe/Moscow]")
public class SomeEndpointRequest {

  private String id;

  private String code;

  public SomeEndpointRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Какой-нибудь важный идентификатор
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "1234", description = "Какой-нибудь важный идентификатор", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SomeEndpointRequest code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Не менее важный код
   * @return code
  */
  @NotNull 
  @Schema(name = "code", example = "4321", description = "Не менее важный код", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SomeEndpointRequest someEndpointRequest = (SomeEndpointRequest) o;
    return Objects.equals(this.id, someEndpointRequest.id) &&
        Objects.equals(this.code, someEndpointRequest.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SomeEndpointRequest {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

