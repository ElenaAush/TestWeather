package pojo;

import com.google.gson.annotations.SerializedName;


public class Current {

  @SerializedName("last_updated_epoch")
  private Integer lastUpdatedEpoch;

  @SerializedName("last_updated")
  private String lastUpdated;

  @SerializedName("temp_c")
  private Double tempC;

  @SerializedName("temp_f")
  private Double tempF;

  @SerializedName("is_day")
  private Integer isDay;

  @SerializedName("condition")
  private Condition condition;

  @SerializedName("wind_mph")
  private Double windMph;

  @SerializedName("wind_kph")
  private Double windKph;

  @SerializedName("wind_degree")
  private Integer windDegree;

  @SerializedName("wind_dir")
  private String windDir;

  @SerializedName("pressure_mb")
  private Integer pressureMb;

  @SerializedName("pressure_in")
  private Double pressureIn;

  @SerializedName("precip_mm")
  private Integer precipMm;

  @SerializedName("precip_in")
  private Integer precipIn;

  @SerializedName("humidity")
  private Integer humidity;

  @SerializedName("cloud")
  private Integer cloud;

  @SerializedName("feelslike_c")
  private Double feelslikeC;

  @SerializedName("feelslike_f")
  private Double feelslikeF;

  @SerializedName("vis_km")
  private Integer visKm;

  @SerializedName("vis_miles")
  private Integer visMiles;

  @SerializedName("uv")
  private Integer uv;

  @SerializedName("gust_mph")
  private Double gustMph;

  @SerializedName("gust_kph")
  private Double gustKph;


  public Current setLastUpdatedEpoch(Integer lastUpdatedEpoch) {
    this.lastUpdatedEpoch = lastUpdatedEpoch;
    return this;
  }
  public Integer getLastUpdatedEpoch() {
    return lastUpdatedEpoch;
  }

  public Current setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }
  public String getLastUpdated() {
    return lastUpdated;
  }

  public Current setTempC(Double tempC) {
    this.tempC = tempC;
    return this;
  }
  public Double getTempC() {
    return tempC;
  }

  public Current setTempF(Double tempF) {
    this.tempF = tempF;
    return this;
  }
  public Double getTempF() {
    return tempF;
  }

  public Current setIsDay(Integer isDay) {
    this.isDay = isDay;
    return this;
  }
  public Integer getIsDay() {
    return isDay;
  }

  public Current setCondition(Condition condition) {
    this.condition = condition;
    return this;
  }
  public Condition getCondition() {
    return condition;
  }

  public Current setWindMph(Double windMph) {
    this.windMph = windMph;
    return this;
  }
  public Double getWindMph() {
    return windMph;
  }

  public Current setWindKph(Double windKph) {
    this.windKph = windKph;
    return this;
  }
  public Double getWindKph() {
    return windKph;
  }

  public Current setWindDegree(Integer windDegree) {
    this.windDegree = windDegree;
    return this;
  }
  public Integer getWindDegree() {
    return windDegree;
  }

  public Current setWindDir(String windDir) {
    this.windDir = windDir;
    return this;
  }
  public String getWindDir() {
    return windDir;
  }

  public Current setPressureMb(Integer pressureMb) {
    this.pressureMb = pressureMb;
    return this;
  }
  public Integer getPressureMb() {
    return pressureMb;
  }

  public Current setPressureIn(Double pressureIn) {
    this.pressureIn = pressureIn;
    return this;
  }
  public Double getPressureIn() {
    return pressureIn;
  }

  public Current setPrecipMm(Integer precipMm) {
    this.precipMm = precipMm;
    return this;
  }
  public Integer getPrecipMm() {
    return precipMm;
  }

  public Current setPrecipIn(Integer precipIn) {
    this.precipIn = precipIn;
    return this;
  }
  public Integer getPrecipIn() {
    return precipIn;
  }

  public Current setHumidity(Integer humidity) {
    this.humidity = humidity;
    return this;
  }
  public Integer getHumidity() {
    return humidity;
  }

  public Current setCloud(Integer cloud) {
    this.cloud = cloud;
    return this;
  }
  public Integer getCloud() {
    return cloud;
  }

  public Current setFeelslikeC(Double feelslikeC) {
    this.feelslikeC = feelslikeC;
    return this;
  }
  public Double getFeelslikeC() {
    return feelslikeC;
  }

  public Current setFeelslikeF(Double feelslikeF) {
    this.feelslikeF = feelslikeF;
    return this;
  }
  public Double getFeelslikeF() {
    return feelslikeF;
  }

  public Current setVisKm(Integer visKm) {
    this.visKm = visKm;
    return this;
  }
  public Integer getVisKm() {
    return visKm;
  }

  public Current setVisMiles(Integer visMiles) {
    this.visMiles = visMiles;
    return this;
  }
  public Integer getVisMiles() {
    return visMiles;
  }

  public Current setUv(Integer uv) {
    this.uv = uv;
    return this;
  }
  public Integer getUv() {
    return uv;
  }

  public Current setGustMph(Double gustMph) {
    this.gustMph = gustMph;
    return this;
  }
  public Double getGustMph() {
    return gustMph;
  }

  public Current setGustKph(Double gustKph) {
    this.gustKph = gustKph;
    return this;
  }
  public Double getGustKph() {
    return gustKph;
  }

}