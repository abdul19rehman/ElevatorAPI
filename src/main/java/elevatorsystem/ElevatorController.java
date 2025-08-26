package elevatorsystem;

import elevatorsystem.enums.Direction;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/elevators")
public class ElevatorController {

    private final ElevatorSystem elevatorSystem;

    public ElevatorController() {
        // Initialize system with 2 elevators (configurable)
        this.elevatorSystem = ElevatorSystem.getInstance(2);
        this.elevatorSystem.start();
    }

    // --- External Request: Hall Call ---
    @PostMapping("/request")
    public String requestElevator(@RequestParam int floor,
                                  @RequestParam Direction direction) {
        elevatorSystem.requestElevator(floor, direction);
        return "Request received: User at floor " + floor + " wants to go " + direction;
    }

    // --- Internal Request: Cabin Call ---
    @PostMapping("/{id}/select")
    public String selectFloor(@PathVariable int id,
                              @RequestParam int floor) {
        elevatorSystem.selectFloor(id, floor);
        return "Request received: Elevator " + id + " -> floor " + floor;
    }

    // --- Shutdown System ---
    @PostMapping("/shutdown")
    public String shutdownSystem() {
        elevatorSystem.shutdown();
        return "Elevator system shut down.";
    }
}
