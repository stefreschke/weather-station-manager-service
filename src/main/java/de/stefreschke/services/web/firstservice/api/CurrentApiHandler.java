package de.stefreschke.services.web.firstservice.api;

import de.stefreschke.services.web.firstservice.model.QualitfiedWeatherSnapshot;
import de.stefreschke.services.web.firstservice.model.UnqualifiedWeatherSnapshot;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CurrentApiHandler implements CurrentApiDelegate {
    @Override
    public ResponseEntity<List<QualitfiedWeatherSnapshot>> getCurrentOfAllStations() {
        return null;
    }

    @Override
    public ResponseEntity<UnqualifiedWeatherSnapshot> getCurrentOfSingleStation(Integer stationId) {
        return null;
    }
}
