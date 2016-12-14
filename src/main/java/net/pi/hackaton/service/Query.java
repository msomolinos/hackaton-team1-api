package net.pi.hackaton.service;

import java.util.List;

public class Query {

  public String table;
  public  List<String> fields;
  public String condition;

  public String getTable() {
    return table;
  }

  public void setTable(String table) {
    this.table = table;
  }

  public List<String> getFields() {
    return fields;
  }

  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public void setFields(List<String> fields) {
    this.fields = fields;
  }

  @Override
  public String toString() {
    return "Query{" +
      "table='" + table + '\'' +
      ", fields=" + fields +
      '}';
  }
}


