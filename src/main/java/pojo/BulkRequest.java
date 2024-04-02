package pojo;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class BulkRequest {

  @SerializedName("locations")
  private List<Locations> locations;

  public BulkRequest setLocations(List<Locations> locations) {
    this.locations = locations;
    return this;
  }
  public List<Locations> getLocations() {
    return locations;
  }
}