package net.pi.hackaton.service;


import com.google.common.collect.Lists;

import org.junit.Test;

import java.util.LinkedList;


public class jOOQQueryBuilderTest {

  @Test
  public void sql() throws Exception {

    jOOQQueryBuilder testSubject = new jOOQQueryBuilder();
    String sql = testSubject.sql(new Query("air_bnb", Lists.newArrayList("price", "numberOfBedrooms")));

    System.out.println(sql);

  }

}