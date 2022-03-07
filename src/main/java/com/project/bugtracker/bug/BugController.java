package com.project.bugtracker.bug;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BugController {

    @GetMapping("/bugs")
    public String list(Model model) {
        String[] bugs = {"bug1", "bug2", "bug3", "bug4", "bug5", "bug6"};
        model.addAttribute("bugs", bugs);
        return "bug/list";
    }

    @GetMapping("/bug/create")
    public String create() {
        return "bug/create";
    }
}
