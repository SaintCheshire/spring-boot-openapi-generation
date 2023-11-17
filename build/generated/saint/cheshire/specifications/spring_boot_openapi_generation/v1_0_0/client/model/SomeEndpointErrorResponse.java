package saint.cheshire.specifications.spring_boot_openapi_generation.v1_0_0.client.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Ответ при ошибке
 */
@lombok.Builder(toBuilder = true)
@lombok.RequiredArgsConstructor
@lombok.AllArgsConstructor

@Schema(name = "SomeEndpointErrorResponse", description = "Ответ при ошибке")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-11-17T23:27:58.758048700+03:00[Europe/Moscow]")
public class SomeEndpointErrorResponse {

  private String errorMessage;

  public SomeEndpointErrorResponse errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Описание ошибки при обращении к сервису
   * @return errorMessage
  */
  
  @Schema(name = "errorMessage", example = "Сервис временно недоступен", description = "Описание ошибки при обращении к сервису", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SomeEndpointErrorResponse someEndpointErrorResponse = (SomeEndpointErrorResponse) o;
    return Objects.equals(this.errorMessage, someEndpointErrorResponse.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SomeEndpointErrorResponse {\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

