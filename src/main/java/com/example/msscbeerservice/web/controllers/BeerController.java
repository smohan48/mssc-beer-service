package com.example.msscbeerservice.web.controllers;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.msscbeerservice.web.model.BeerDto;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerID}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerID") UUID beerId){
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BeerDto> saveNewBeer(@RequestBody BeerDto beerDto){
        return new ResponseEntity<>( HttpStatus.CREATED);
    }


    @PutMapping("/{beerID}")
    public ResponseEntity<BeerDto> saveNewBeer(@PathVariable("beerID") UUID beerId, @RequestBody BeerDto beerDto){
        return new ResponseEntity<>( HttpStatus.NO_CONTENT);
    }
}
