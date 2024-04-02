package pojo;
import java.util.Date;

import com.google.gson.annotations.SerializedName;


public class Query {

  @SerializedName("custom_id")
  private String customId;

  @SerializedName("q")
  private String q;

  @SerializedName("location")
  private Location location;

  @SerializedName("current")
  private Current current;


  public Query setCustomId(String customId) {
    this.customId = customId;
    return this;
  }
  public String getCustomId() {
    return customId;
  }

  public Query setQ(String q) {
    this.q = q;
    return this;
  }
  public String getQ() {
    return q;
  }

  public Query setLocation(Location location) {
    this.location = location;
    return this;
  }
  public Location getLocation() {
    return location;
  }

  public Query setCurrent(Current current) {
    this.current = current;
    return this;
  }
  public Current getCurrent() {
    return current;
  }

}