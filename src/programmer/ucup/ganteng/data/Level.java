package programmer.ucup.ganteng.data;

import programmer.ucup.ganteng.annotation.Fancy;

@Fancy(name = "Level", tags = {"enum", "java"})
public enum Level {
  STANDARD("Standard Level"),
  PREMIUM("Premium Level"),
  VIP("VIP Level");

  private String description;

  Level(String description) {
    this.description = description;
  }

  public String getDescription() {
    return description;
  }
}
