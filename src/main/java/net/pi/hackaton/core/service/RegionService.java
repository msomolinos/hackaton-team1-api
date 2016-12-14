package net.pi.hackaton.core.service;

import net.pi.hackaton.core.model.Region;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RegionService {
    public List<Region> search(List<String> regions) {
        List<Region> list = new ArrayList<Region>();
        int random = RandomUtils.nextInt(0, 10);
        for (int i = 0; i < random; i++)
        list.add(randomRegion());
        return list;
    }

    public List<Region> list() {
        List<Region> list = new ArrayList();
        for (int i = 0; i < 100; i++)
            list.add(randomRegion());
        return list;
    }

    private Region randomRegion() {
        Region region = new Region();
        region.setId(RandomStringUtils.randomNumeric(5));
        region.setName(RandomStringUtils.randomAlphabetic(25));
        return region;
    }
}
