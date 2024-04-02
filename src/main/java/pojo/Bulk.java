package pojo;

import com.google.gson.annotations.SerializedName;


public class Bulk {

  @SerializedName("query")
  private Query query;

  public Bulk setQuery(Query query) {
    this.query = query;
    return this;
  }
  public Query getQuery() {
    return query;
  }

}