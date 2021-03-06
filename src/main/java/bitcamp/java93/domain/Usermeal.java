package bitcamp.java93.domain;

import java.util.List;

/* 역할: memb 테이블의 값을 보관할 때 사용할 클래스
 * => 복합 데이터를 다룰 때, 이렇게 클래스를 정의하여 사용한다.
 * => 이런 복합 데이터를 보관하는 용도로 사용하는 클래스를
 *    "도메인(domain)" 클래스 또는 "DTO(Data Transfer Object)"라 부른다.
 */


public class Usermeal extends Meal {
  List<Meal> meal;
  String date;
  String day;
  int trainingNo;
  
  @Override
  public String toString() {
    return "Usermeal [meal=" + meal + ", date=" + date + ", day=" + day + ", trainingNo=" + trainingNo + ", mealtype="
        + mealtype + ", mealpicture=" + mealpicture + ", mealname=" + mealname + ", mealkcal=" + mealkcal + ", confirm="
        + confirm + ", mealno=" + mealno + "]";
  }

  public List<Meal> getMeal() {
    return meal;
  }

  public void setMeal(List<Meal> meal) {
    this.meal = meal;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getDay() {
    return day;
  }

  public void setDay(String day) {
    this.day = day;
  }

  public int getTrainingNo() {
    return trainingNo;
  }

  public void setTrainingNo(int trainingNo) {
    this.trainingNo = trainingNo;
  }
  
  
}
