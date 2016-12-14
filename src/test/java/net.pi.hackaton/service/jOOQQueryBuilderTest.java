package net.pi.hackaton.service;


import com.google.common.collect.Lists;

import org.junit.Test;

import java.util.LinkedList;


public class jOOQQueryBuilderTest {

  @Test
  public void test_select_sql() throws Exception {

    jOOQQueryBuilder testSubject = new jOOQQueryBuilder();

    Query q = new Query();
    q.setFields(Lists.newArrayList("price", "numberOfBedrooms"));
    q.setTable("air_bnb");
    String sql = testSubject.sql(q);

    System.out.println(sql);

  }

  @Test
  public void test_select_sqlwith_where() throws Exception {

    jOOQQueryBuilder testSubject = new jOOQQueryBuilder();

    Query q = new Query();
    q.setFields(Lists.newArrayList("price", "numberOfBedrooms"));
    q.setTable("air_bnb");
    q.setCondition("budget < 3000");
    String sql = testSubject.sql(q);

    System.out.println(sql);

  }

}