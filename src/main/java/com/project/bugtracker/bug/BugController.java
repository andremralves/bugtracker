package com.project.bugtracker.bug;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/bugs")
public class BugController {

    @Autowired
    private BugService bugService;

    // get all bugs
    @GetMapping
    public List<Bug> getAllBugs() {
        List<Bug> bugs = bugService.getAllBugs();
        System.out.println("===========>" + bugs);
        return bugs;
    }

    // create new bug
    @PostMapping
    public void addBug(@RequestBody Bug bug) {
        System.out.println("==============>" + bug);
        bugService.addBug(bug);
    }

    // get bug by id
    @GetMapping("/{id}")
    public Bug getBugById(@PathVariable Long id) {
        return bugService.getBugById(id);
    }

    // Delete bug
}
