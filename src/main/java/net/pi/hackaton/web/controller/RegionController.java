package net.pi.hackaton.web.controller;

import net.pi.hackaton.core.model.Region;
import net.pi.hackaton.core.model.RequestHousing;
import net.pi.hackaton.core.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/regions")
public class RegionController {

    @Autowired
    private RegionService regionService;


    @RequestMapping(method = RequestMethod.POST)
    public List<Region> search(@RequestBody List<String> regions) {
        return regionService.search(regions);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Region> list() {
        return regionService.list();
    }
}
