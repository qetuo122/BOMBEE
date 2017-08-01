package bitcamp.java93.service;

import java.util.List;

import bitcamp.java93.domain.Promotion;

public interface PromotionService {
  List<Promotion> list() throws Exception;
  Promotion get(int no) throws Exception;
  void add(Promotion promotion) throws Exception;
  void update(Promotion promotion) throws Exception;
  void remove(int no) throws Exception;
}






