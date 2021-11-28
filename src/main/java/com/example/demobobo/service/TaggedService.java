package com.example.demobobo.service;

import java.util.List;
import java.util.Optional;

import com.example.demobobo.entity.Tagged;
import com.example.demobobo.repository.TaggedRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaggedService {
    
    @Autowired
    private TaggedRepository taggedRepository;

    // Create 1 Tagged
    public Tagged createTagged(Tagged tagged) {
        
        return taggedRepository.save(tagged);
    }

    // Create Multiple Tagged
    public List<Tagged> createMultipleTagged(List<Tagged> multipleTagged) {
        
        return taggedRepository.saveAll(multipleTagged);
    }

    // Read or Retrieve 1 Tagged by id
    public Optional<Tagged> findTaggedById(int id) {
        
        return taggedRepository.findById(id);
    }

    // Read or Retrieve All Taggeds
    public List<Tagged> findAllTaggeds() {
        
        return taggedRepository.findAll();
    }

    // Update 1 Tagged by id
    public Tagged updateTaggedById(Tagged tagged) {
        
        Tagged toBeUpdatedTagged = null;
        if (taggedRepository.findById(tagged.getId()).isPresent()) {
            
            toBeUpdatedTagged = taggedRepository.findById(tagged.getId()).get();
            toBeUpdatedTagged.setName(tagged.getName());
            toBeUpdatedTagged.setTag(tagged.getTag());
            taggedRepository.save(toBeUpdatedTagged);
        } else {
            
            return new Tagged();
        }
        
        return toBeUpdatedTagged;
    }
    
    // Delete 1 Tagged by id
    public void deleteTaggedById(int id) {
        
        taggedRepository.deleteById(id);
    }
}