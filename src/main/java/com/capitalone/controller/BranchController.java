package com.capitalone.controller;

import com.capitalone.model.Branch;
import com.capitalone.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/branches")
public class BranchController {

    @Autowired
    private BranchService branchService;

    // Get all branches
    @GetMapping
    public ResponseEntity<List<Branch>> getAllBranches() {
        List<Branch> branches = branchService.getAllBranches();
        return new ResponseEntity<>(branches, HttpStatus.OK);
    }

    // Get a branch by ID
    @GetMapping("/{id}")
    public ResponseEntity<Branch> getBranchById(@PathVariable("id") Long id) {
        Branch branch = branchService.getBranchById(id);
        if (branch != null) {
            return new ResponseEntity<>(branch, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Create a new branch
    @PostMapping
    public ResponseEntity<Branch> createBranch(@RequestBody Branch branch) {
        Branch createdBranch = (Branch) branchService.updateBranch(branch);
        return new ResponseEntity<>(createdBranch, HttpStatus.CREATED);
    }

    // Update an existing branch
    @PutMapping("/{id}")
    public ResponseEntity<Branch> updateBranch(@PathVariable("id") Long id, @RequestBody Branch branch) {
        branch.setBranchId(id);
        Branch updatedBranch = (Branch) branchService.updateBranch(branch);
        if (updatedBranch != null) {
            return new ResponseEntity<>(updatedBranch, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete a branch by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBranch(@PathVariable("id") Long id) {
        boolean isDeleted = (boolean) branchService.updateBranch(id);
        if (isDeleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
