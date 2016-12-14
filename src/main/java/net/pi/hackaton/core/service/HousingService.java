package net.pi.hackaton.core.service;

import net.pi.hackaton.core.model.*;
import net.pi.hackaton.core.model.Housing;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class HousingService {


    public List<Housing> search(RequestHousing requestHousing) {
        List<Housing> list = new ArrayList<Housing>();
        int random = RandomUtils.nextInt(0, 50);
        for (int i = 0; i < random; i++)
            list.add(randomHousing());
        return list;
    }

    private Housing randomHousing() {
        Housing housing = new Housing();
        housing.setId(RandomStringUtils.randomAlphanumeric(16));
        housing.setRegion(randomRegion());
        housing.setNumBeds(randomNumBeds());
        housing.setCrimeRate(randomCrimeRate());
        housing.setLongitude(RandomUtils.nextDouble(0, 50));
        housing.setLatitude(RandomUtils.nextDouble(0, 50));
        housing.setPrice(RandomUtils.nextDouble(100.00, 10000.00));
        housing.setYear(RandomUtils.nextInt(2000, 2017));
        return housing;
    }

    private Region randomRegion() {
        Region region = new Region();
        region.setId(RandomStringUtils.randomNumeric(5));
        region.setName(RandomStringUtils.randomAlphabetic(25));
        return region;
    }

    private CrimeRate randomCrimeRate() {
        return CrimeRate.values()[RandomUtils.nextInt(0, CrimeRate.values().length)];
    }

    private NumBeds randomNumBeds() {
        return NumBeds.values()[RandomUtils.nextInt(0, NumBeds.values().length)];
    }


    public List<Housing> list() {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 500; i++) {
            linkedList.add(randomHousing());
        }
        return linkedList;
    }
}
