package personal.tripgenerator;

import org.springframework.web.bind.annotation.*;
import personal.tripgenerator.model.PlannedTrip;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/test")
public class TripGeneratorController {

    private static final String template = "Hello, %s!";
    private final AtomicLong  counter = new AtomicLong();
    @GetMapping
    @ResponseBody
    public PlannedTrip sayHello(@RequestParam(name = "World!", required = false, defaultValue = "Stanger") String name) {
        return new PlannedTrip(counter.incrementAndGet(), String.format(template, name));
    }
}
