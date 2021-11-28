package com.example.demobobo.controller;

import java.util.List;
import java.util.Optional;

import com.example.demobobo.entity.Tagged;
import com.example.demobobo.service.TaggedService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestMapping;

// @RequestMapping(path = "/tagged")
@RestController
public class TaggedController {
    
    @Autowired
    private TaggedService taggedService;

    // Create 1 Tagged
    @PostMapping("/tagged")
    public Tagged createTagged(@RequestBody Tagged tagged) {
        
        return taggedService.createTagged(tagged);
    }
    
    // Create Multiple Tagged
    @PostMapping("/taggeds")
    public List<Tagged> createMultipleTagged(@RequestBody List<Tagged> multipleTagged) {
        
        return taggedService.createMultipleTagged(multipleTagged);
    }

    // Read or Retrieve 1 Tagged by id
    @GetMapping("/tagged/{id}")
    public Optional<Tagged> findTaggedById(@PathVariable int id) {
        
        return taggedService.findTaggedById(id);
    }
    
    // Read or Retrieve All Taggeds
    @GetMapping("/taggeds")
    public List<Tagged> findAllTaggeds() {
        
        return taggedService.findAllTaggeds();
    }

    // Update 1 Tagged by id
    @PutMapping("/tagged")
    public Tagged updateTaggedById(@RequestBody Tagged tagged) {
        
        return taggedService.updateTaggedById(tagged);
    }

    // Delete 1 Tagged by id
    @DeleteMapping("/tagged/{id}")
    public void deleteTaggedById(@PathVariable int id) {
        
        taggedService.deleteTaggedById(id);
    }
}