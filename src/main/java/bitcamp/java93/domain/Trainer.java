package bitcamp.java93.domain;
/* 역할: memb 테이블의 값을 보관할 때 사용할 클래스
 * => 복합 데이터를 다룰 때, 이렇게 클래스를 정의하여 사용한다.
 * => 이런 복합 데이터를 보관하는 용도로 사용하는 클래스를
 *    "도메인(domain)" 클래스 또는 "DTO(Data Transfer Object)"라 부른다.
 */


public class Trainer extends Member {
  String comname;
  String zipcode;
  String comaddr;
  String comdetailaddr;
  String spono;
  String introduction;
  String tcherpic;
  int tno;
  
  @Override
  public String toString() {
    return "Trainer [comname=" + comname + ", zipcode=" + zipcode + ", comaddr=" + comaddr + ", comdetailaddr="
        + comdetailaddr + ", spono=" + spono + ", introduction=" + introduction + ", tcherpic=" + tcherpic + ", tno="
        + tno + ", no=" + no + ", id=" + id + ", name=" + name + ", email=" + email + ", pwd=" + pwd
        + ", profilePicture=" + profilePicture + ", membertype=" + membertype + ", accounttype=" + accounttype + "]";
  }

  public String getComname() {
    return comname;
  }

  public void setComname(String comname) {
    this.comname = comname;
  }

  public String getZipcode() {
    return zipcode;
  }

  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public String getComaddr() {
    return comaddr;
  }

  public void setComaddr(String comaddr) {
    this.comaddr = comaddr;
  }

  public String getComdetailaddr() {
    return comdetailaddr;
  }

  public void setComdetailaddr(String comdetailaddr) {
    this.comdetailaddr = comdetailaddr;
  }

  public String getSpono() {
    return spono;
  }

  public void setSpono(String spono) {
    this.spono = spono;
  }

  public String getIntroduction() {
    return introduction;
  }

  public void setIntroduction(String introduction) {
    this.introduction = introduction;
  }

  public String getTcherpic() {
    return tcherpic;
  }

  public void setTcherpic(String tcherpic) {
    this.tcherpic = tcherpic;
  }

  public int getTno() {
    return tno;
  }

  public void setTno(int tno) {
    this.tno = tno;
  }
  
  
  
}
