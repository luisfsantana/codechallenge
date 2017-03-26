package br.com.vivareal.codechallenge.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import br.com.vivareal.codechallenge.model.Provinces;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * PropertyCreated
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-03-26T13:01:29.413Z")

public class PropertyCreated   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("price")
  private Double price = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("x")
  private Double x = null;

  @JsonProperty("y")
  private Double y = null;

  @JsonProperty("beds")
  private Integer beds = null;

  @JsonProperty("baths")
  private Integer baths = null;

  @JsonProperty("provinces")
  private List<Provinces> provinces = new ArrayList<Provinces>();

  @JsonProperty("squareMeters")
  private Double squareMeters = null;

  public PropertyCreated id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PropertyCreated title(String title) {
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

  public PropertyCreated price(Double price) {
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

  public PropertyCreated description(String description) {
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

  public PropertyCreated x(Double x) {
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

  public PropertyCreated y(Double y) {
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

  public PropertyCreated beds(Integer beds) {
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

  public PropertyCreated baths(Integer baths) {
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

  public PropertyCreated provinces(List<Provinces> provinces) {
    this.provinces = provinces;
    return this;
  }

  public PropertyCreated addProvincesItem(Provinces provincesItem) {
    this.provinces.add(provincesItem);
    return this;
  }

   /**
   * Get provinces
   * @return provinces
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public List<Provinces> getProvinces() {
    return provinces;
  }

  public void setProvinces(List<Provinces> provinces) {
    this.provinces = provinces;
  }

  public PropertyCreated squareMeters(Double squareMeters) {
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
    PropertyCreated propertyCreated = (PropertyCreated) o;
    return Objects.equals(this.id, propertyCreated.id) &&
        Objects.equals(this.title, propertyCreated.title) &&
        Objects.equals(this.price, propertyCreated.price) &&
        Objects.equals(this.description, propertyCreated.description) &&
        Objects.equals(this.x, propertyCreated.x) &&
        Objects.equals(this.y, propertyCreated.y) &&
        Objects.equals(this.beds, propertyCreated.beds) &&
        Objects.equals(this.baths, propertyCreated.baths) &&
        Objects.equals(this.provinces, propertyCreated.provinces) &&
        Objects.equals(this.squareMeters, propertyCreated.squareMeters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, price, description, x, y, beds, baths, provinces, squareMeters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyCreated {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    beds: ").append(toIndentedString(beds)).append("\n");
    sb.append("    baths: ").append(toIndentedString(baths)).append("\n");
    sb.append("    provinces: ").append(toIndentedString(provinces)).append("\n");
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

