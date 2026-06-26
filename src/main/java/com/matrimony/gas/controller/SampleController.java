package com.matrimony.gas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

/**
 * Sample REST Controller for Global Agent Search Application
 * 
 * This controller demonstrates basic CRUD operations and REST endpoints.
 * Use this as a template for creating additional controllers.
 */
@RestController
@RequestMapping("/api/v1/sample")
public class SampleController {

    /**
     * GET endpoint to retrieve all samples
     * @return ResponseEntity with list of samples
     */
    @GetMapping
    public ResponseEntity<?> getAllSamples() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Retrieved all samples");
        response.put("data", new Object[]{});
        
        return ResponseEntity.ok(response);
    }

    /**
     * GET endpoint to retrieve a sample by ID
     * @param id the sample ID
     * @return ResponseEntity with sample details
     */
    @GetMapping("/{id}")
    public ResponseEntity<?> getSampleById(@PathVariable Long id) {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Sample retrieved successfully");
        response.put("id", id);
        
        return ResponseEntity.ok(response);
    }

    /**
     * POST endpoint to create a new sample
     * @param sampleData the sample data to create
     * @return ResponseEntity with created sample
     */
    @PostMapping
    public ResponseEntity<?> createSample(@RequestBody Map<String, Object> sampleData) {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Sample created successfully");
        response.put("data", sampleData);
        response.put("id", 1); // In real scenario, this would be generated
        
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    /**
     * PUT endpoint to update an existing sample
     * @param id the sample ID to update
     * @param sampleData the updated sample data
     * @return ResponseEntity with updated sample
     */
    @PutMapping("/{id}")
    public ResponseEntity<?> updateSample(@PathVariable Long id, @RequestBody Map<String, Object> sampleData) {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Sample updated successfully");
        response.put("id", id);
        response.put("data", sampleData);
        
        return ResponseEntity.ok(response);
    }

    /**
     * DELETE endpoint to delete a sample
     * @param id the sample ID to delete
     * @return ResponseEntity with deletion status
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteSample(@PathVariable Long id) {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Sample deleted successfully");
        response.put("id", id);
        
        return ResponseEntity.ok(response);
    }

    /**
     * Health check endpoint
     * @return ResponseEntity with health status
     */
    @GetMapping("/health/check")
    public ResponseEntity<?> healthCheck() {
        Map<String, Object> response = new HashMap<>();
        response.put("status", "UP");
        response.put("message", "Application is running");
        
        return ResponseEntity.ok(response);
    }
}

