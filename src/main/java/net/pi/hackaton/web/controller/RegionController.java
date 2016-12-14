package net.pi.hackaton.web.controller;

import net.pi.hackaton.core.model.Region;
import net.pi.hackaton.core.model.RequestHousing;
import net.pi.hackaton.core.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/regions")
public class RegionController {

    @Autowired
    private RegionService regionService;

    public List<Region> search(@RequestBody List<String> regions) {
        return regionService.search(regions);
    }
}
