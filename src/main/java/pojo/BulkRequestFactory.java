package pojo;

import java.util.List;

public class BulkRequestFactory {

  public static BulkRequest getBulkRequestForBody() {
    return new BulkRequest().setLocations(List.of(
        new Locations("London", "1"),
        new Locations("Boston", "2"),
        new Locations("Bell", "3"),
        new Locations("New York", "4")));
  }
}
