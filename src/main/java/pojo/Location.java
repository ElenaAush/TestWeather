package pojo;

import com.google.gson.annotations.SerializedName;


public class Location {

  @SerializedName("name")
  private String name;

  @SerializedName("region")
  private String region;

  @SerializedName("country")
  private String country;

  @SerializedName("lat")
  private Integer lat;

  @SerializedName("lon")
  private Double lon;

  @SerializedName("tz_id")
  private String tzId;

  @SerializedName("localtime_epoch")
  private Integer localtimeEpoch;

  @SerializedName("localtime")
  private String localtime;


  public Location setName(String name) {
    this.name = name;
    return this;
  }
  public String getName() {
    return name;
  }

  public Location setRegion(String region) {
    this.region = region;
    return this;
  }
  public String getRegion() {
    return region;
  }

  public Location setCountry(String country) {
    this.country = country;
    return this;
  }
  public String getCountry() {
    return country;
  }

  public Location setLat(Integer lat) {
    this.lat = lat;
    return this;
  }
  public Integer getLat() {
    return lat;
  }

  public Location setLon(Double lon) {
    this.lon = lon;
    return this;
  }
  public Double getLon() {
    return lon;
  }

  public Location setTzId(String tzId) {
    this.tzId = tzId;
    return this;
  }
  public String getTzId() {
    return tzId;
  }

  public Location setLocaltimeEpoch(Integer localtimeEpoch) {
    this.localtimeEpoch = localtimeEpoch;
    return this;
  }
  public Integer getLocaltimeEpoch() {
    return localtimeEpoch;
  }

  public Location setLocaltime(String localtime) {
    this.localtime = localtime;
    return this;
  }
  public String getLocaltime() {
    return localtime;
  }

}