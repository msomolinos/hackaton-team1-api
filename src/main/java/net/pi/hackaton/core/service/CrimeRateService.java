package net.pi.hackaton.core.service;

import net.pi.hackaton.core.model.CrimeRate;

import java.util.ArrayList;
import java.util.List;

public class CrimeRateService {
    public List<CrimeRate> search(List<String> safety) {
        List<CrimeRate> list = new ArrayList<CrimeRate>();
        for (CrimeRate crimeRate : CrimeRate.values()) {
            if (safety.contains(crimeRate.id())) {
                list.add(crimeRate);
            }
        }
        return list;
    }
}
