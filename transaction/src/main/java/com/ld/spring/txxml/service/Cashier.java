package com.ld.spring.txxml.service;

import java.util.List;

public interface Cashier {

  public void checkout(List<String> isbns, String username);
}
