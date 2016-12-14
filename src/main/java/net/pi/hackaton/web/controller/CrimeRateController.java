package net.pi.hackaton.web.controller;

import net.pi.hackaton.core.model.CrimeRate;
import net.pi.hackaton.core.service.CrimeRateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/crime-rate")
public class CrimeRateController {

    @Autowired
    private CrimeRateService crimeRateService;

    public List<CrimeRate> search(@RequestBody List<String> safety) {
        return crimeRateService.search(safety);
    }
}
