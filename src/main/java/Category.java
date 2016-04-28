import java.util.ArrayList;

public class Category {
  private String mName;
  private static ArrayList<Category> instances = new ArrayList<Category>();
  private int mId;

  public Category(String name) {
    mName = name;
    mId = instances.size();
    instances.add(this);
  }

  public String getName() {
    return mName;
  }

  public static ArrayList<Category> all() {
    return instances;
  }

  public static void clear() {
    instances.clear();
  }

  public int getId() {
    return mId;
  }


}