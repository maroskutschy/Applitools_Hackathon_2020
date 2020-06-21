package TestRunners;

import org.apache.commons.lang3.StringUtils;

public class TestDefaultValues {

  public static final String DEFAULT_OPERATING_SYSTEM = "Windows";
  public static final String DEFAULT_BROWSER = "Chrome";
  //public static final String DEFAULT_LINK = "https://demo.applitools.com/gridHackathonV1.html#0";
  public static final String DEFAULT_LINK = "https://demo.applitools.com/gridHackathonV2.html#0";

  private static String operatingSystem;
  private static String browser;
  private static String link;

  public static String getOperatingSystem() { return StringUtils.isEmpty( operatingSystem ) ? DEFAULT_OPERATING_SYSTEM : operatingSystem; }

  public static void setOperatingSystem(String operatingSystem) {
    TestDefaultValues.operatingSystem = operatingSystem;
  }

  public static String getBrowser() {
    return StringUtils.isEmpty( browser ) ? DEFAULT_BROWSER : browser;
  }

  public static void setBrowser(String browser) {
    TestDefaultValues.browser = browser;
  }

  public static String getLink() {
    return StringUtils.isEmpty( link ) ? DEFAULT_LINK : link;
  }

  public static void setLink(String link) {
    TestDefaultValues.link = link;
  }

}
