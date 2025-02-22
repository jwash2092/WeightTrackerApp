package com.weight.tracker.controller;

import com.weight.tracker.dto.PersonDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/weightTracker")
public class WeightTrackerController {

    @PostMapping(path = "/addUser", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> addIndividual(@RequestBody @Valid PersonDTO personDTO) {

        return new ResponseEntity<>(personDTO.toString(), HttpStatus.OK);
    }

}
