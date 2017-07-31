package bitcamp.java93.domain;

public class Trainning extends Trainer{
  String title;
  int pric;
  String content;
  String sdt;
  String edt;
  int type;
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public int getPric() {
    return pric;
  }
  public void setPric(int pric) {
    this.pric = pric;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public String getSdt() {
    return sdt;
  }
  public void setSdt(String sdt) {
    this.sdt = sdt;
  }
  public String getEdt() {
    return edt;
  }
  public void setEdt(String edt) {
    this.edt = edt;
  }
  public int getType() {
    return type;
  }
  public void setType(int type) {
    this.type = type;
  }
  @Override
  public String toString() {
    return "Trainning [title=" + title + ", pric=" + pric + ", content=" + content + ", sdt=" + sdt + ", edt=" + edt
        + ", type=" + type + "]";
  }
  
  
}
