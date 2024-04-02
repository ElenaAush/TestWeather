package pojo;

import com.google.gson.annotations.SerializedName;
import java.util.List;


public class BulkResponse {

  @SerializedName("bulk")
  private List<Bulk> bulk;


  public BulkResponse setBulk(List<Bulk> bulk) {
    this.bulk = bulk;
    return this;
  }
  public List<Bulk> getBulk() {
    return bulk;
  }

}