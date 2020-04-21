package de.stefreschke.services.web.firstservice.api;

import de.stefreschke.services.web.firstservice.model.WeatherStation;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationsApiHandler implements StationsApiDelegate {
    @Override
    public ResponseEntity<List<WeatherStation>> getAllStations() {
        return null;
    }
}
