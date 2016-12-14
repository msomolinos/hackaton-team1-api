package net.pi.hackaton.web.controller;


import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/strings")
public class SampleController {

    protected final Logger logger = (Logger) LoggerFactory.getLogger(getClass());

    @RequestMapping(method = RequestMethod.GET)
    public List<String> getAllStrings() {
        return null;
    }

    @RequestMapping(value = "{input}", method = RequestMethod.POST)
    public String postString(@PathVariable("input") String input) {
        logger.info("This is input {input}", input);
        return input;
    }
}
