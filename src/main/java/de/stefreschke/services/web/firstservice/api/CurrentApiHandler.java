package de.stefreschke.services.web.firstservice.api;

import de.stefreschke.services.web.firstservice.model.QualitfiedWeatherSnapshot;
import de.stefreschke.services.web.firstservice.model.UnqualifiedWeatherSnapshot;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
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
