package GIVEN.ToDoApp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ToDoController {

    @GetMapping
    public String home() {
        return "To-do Application !";
    }
}
