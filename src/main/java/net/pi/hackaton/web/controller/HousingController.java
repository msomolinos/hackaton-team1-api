package net.pi.hackaton.web.controller;

import net.pi.hackaton.core.model.Housing;
import net.pi.hackaton.core.model.RequestHousing;
import net.pi.hackaton.core.service.HousingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/apartments-list")
public class HousingController {

    @Autowired
    private HousingService housingService;

    public List<Housing> search(@RequestBody RequestHousing requestHousing) {
        return housingService.search(requestHousing);
    }
}
