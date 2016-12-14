package net.pi.hackaton.web.controller;

import net.pi.hackaton.core.model.Housing;
import net.pi.hackaton.core.model.RequestHousing;
import net.pi.hackaton.core.service.HousingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/housing")
public class HousingController {

    @Autowired
    private HousingService housingService;

    @RequestMapping(method = RequestMethod.POST)
    public List<Housing> search(@RequestBody RequestHousing requestHousing) {
        return housingService.search(requestHousing);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Housing> list() {
        return housingService.list();
    }
}
