package pl.javacoding.controller;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.javacoding.manager.FlightManager;
import pl.javacoding.model.State;

@Controller
public class WelcomeController {

	// inject via application.properties
	@Value("${welcome.message}")
	private String message = "Hello World";

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("message", this.message);
		return "welcome";
	}

	@RequestMapping(value = "/flight", produces = MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
	public ResponseEntity<State> findNearestFlight() throws MalformedURLException {
		State nearestFlight = new FlightManager(new URL("https://opensky-network.org/api/states/all")).findNearestFlight(51.6525013, 18.4329261);
		return new ResponseEntity<State>(nearestFlight, HttpStatus.OK);
	}
}