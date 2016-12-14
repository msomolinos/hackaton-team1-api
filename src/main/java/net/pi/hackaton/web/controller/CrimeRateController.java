package net.pi.hackaton.web.controller;

import net.pi.hackaton.core.model.CrimeRate;
import net.pi.hackaton.core.model.Region;
import net.pi.hackaton.core.service.CrimeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.Arrays.asList;

@RestController
@RequestMapping("/crime-rate")
public class CrimeRateController {

    @Autowired
    private CrimeRateService crimeRateService;

    @RequestMapping(method = RequestMethod.POST)
    public List<CrimeRate> search(@RequestBody List<String> safety) {
        return crimeRateService.search(safety);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<CrimeRate> listCrimeRates() {
        return asList(CrimeRate.values());
    }
}
