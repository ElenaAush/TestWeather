package pojo;

import com.google.gson.annotations.SerializedName;


public class Condition {

  @SerializedName("text")
  private String text;

  @SerializedName("icon")
  private String icon;

  @SerializedName("code")
  private Integer code;


  public Condition setText(String text) {
    this.text = text;
    return this;
  }
  public String getText() {
    return text;
  }

  public Condition setIcon(String icon) {
    this.icon = icon;
    return this;
  }
  public String getIcon() {
    return icon;
  }

  public Condition setCode(Integer code) {
    this.code = code;
    return this;
  }
  public Integer getCode() {
    return code;
  }

}