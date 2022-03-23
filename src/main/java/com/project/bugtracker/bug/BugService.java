package com.project.bugtracker.bug;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BugService {

    @Autowired
    private BugRepository bugRepository;

    // get all bugs
    public List<Bug> getAllBugs() {
        return bugRepository.findAll();
    }

    // create new Bug
    public void addBug(Bug bug) {
        bugRepository.save(bug);
    }
    
    // get Bug by id
    public Bug getBugById(long id) {
        return bugRepository.findById(id).get();
    }

}
