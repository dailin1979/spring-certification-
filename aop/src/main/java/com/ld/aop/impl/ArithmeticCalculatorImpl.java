package com.ld.aop.impl;

import org.springframework.stereotype.Component;

@Component
public class ArithmeticCalculatorImpl implements ArithmeticCalculator {

  private Integer result;

  @Override
  public Integer add(Integer i, Integer j) {
    result = i+j;
    return result;
  }

  @Override
  public Integer sub(Integer i, Integer j) {
    result = i-j;
    return result;
  }

  @Override
  public Integer mul(Integer i, Integer j) {
    result = i*j;
    return result;
  }

  @Override
  public Integer intDiv(Integer i, Integer j) {
    result = i/j;
    return result;
  }

  @Override
  public Double doubleDiv(Double i, Double j) {
    return i/j;
  }
}
