package br.com.vivareal.codechallenge.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
/**
 * Property
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-03-26T13:01:29.413Z")

public class Property   {
  @JsonProperty("x")
  private Double x = null;

  @JsonProperty("y")
  private Double y = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("price")
  private Double price = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("beds")
  private Integer beds = null;

  @JsonProperty("baths")
  private Integer baths = null;

  @JsonProperty("squareMeters")
  private Double squareMeters = null;

  public Property x(Double x) {
    this.x = x;
    return this;
  }

   /**
   * Get x
   * @return x
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Double getX() {
    return x;
  }

  public void setX(Double x) {
    this.x = x;
  }

  public Property y(Double y) {
    this.y = y;
    return this;
  }

   /**
   * Get y
   * @return y
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Double getY() {
    return y;
  }

  public void setY(Double y) {
    this.y = y;
  }

  public Property title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  @Size(min=1)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Property price(Double price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Property description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Property beds(Integer beds) {
    this.beds = beds;
    return this;
  }

   /**
   * Get beds
   * @return beds
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Integer getBeds() {
    return beds;
  }

  public void setBeds(Integer beds) {
    this.beds = beds;
  }

  public Property baths(Integer baths) {
    this.baths = baths;
    return this;
  }

   /**
   * Get baths
   * @return baths
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Integer getBaths() {
    return baths;
  }

  public void setBaths(Integer baths) {
    this.baths = baths;
  }

  public Property squareMeters(Double squareMeters) {
    this.squareMeters = squareMeters;
    return this;
  }

   /**
   * Get squareMeters
   * @return squareMeters
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Double getSquareMeters() {
    return squareMeters;
  }

  public void setSquareMeters(Double squareMeters) {
    this.squareMeters = squareMeters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Property property = (Property) o;
    return Objects.equals(this.x, property.x) &&
        Objects.equals(this.y, property.y) &&
        Objects.equals(this.title, property.title) &&
        Objects.equals(this.price, property.price) &&
        Objects.equals(this.description, property.description) &&
        Objects.equals(this.beds, property.beds) &&
        Objects.equals(this.baths, property.baths) &&
        Objects.equals(this.squareMeters, property.squareMeters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y, title, price, description, beds, baths, squareMeters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Property {\n");
    
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    beds: ").append(toIndentedString(beds)).append("\n");
    sb.append("    baths: ").append(toIndentedString(baths)).append("\n");
    sb.append("    squareMeters: ").append(toIndentedString(squareMeters)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

