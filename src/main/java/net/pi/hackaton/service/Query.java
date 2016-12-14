package net.pi.hackaton.service;

import java.util.List;

public class Query {

  public final String table;
  public final List<String> fields;

  public Query(String table, List<String> fields) {
    this.table = table;
    this.fields = fields;
  }
}


