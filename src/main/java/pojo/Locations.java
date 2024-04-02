package pojo;
import java.util.Date;

import com.google.gson.annotations.SerializedName;

public class Locations {

  @SerializedName("q")
  private String q;

  @SerializedName("custom_id")
  private String customId;

  public Locations(String q, String customId) {
    this.q = q;
    this.customId = customId;
  }

  public String getQ() {
    return q;
  }

  public String getCustomId() {
    return customId;
  }
}