package net.pi.hackaton.web.controller;


import net.pi.hackaton.service.Query;
import net.pi.hackaton.service.QueryBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/query")
public class QueryController {

  private final QueryBuilder queryBuilder;

  @Autowired
  public QueryController(QueryBuilder queryBuilder) {
    this.queryBuilder = queryBuilder;
  }

  @RequestMapping(method = RequestMethod.POST)
  public String buildSQL(@RequestBody Query query) {
    return queryBuilder.sql(query);
  }
}
