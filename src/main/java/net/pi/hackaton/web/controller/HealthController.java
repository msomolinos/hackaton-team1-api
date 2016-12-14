package net.pi.hackaton.web.controller;


import com.google.common.collect.ImmutableMap;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("/health")
public class HealthController {

    @RequestMapping(method = RequestMethod.GET)
    public Map health() {
        return ImmutableMap.of("status", "OK");
    }
}
