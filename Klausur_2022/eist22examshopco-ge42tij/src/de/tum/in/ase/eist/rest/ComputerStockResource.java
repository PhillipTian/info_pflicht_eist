package de.tum.in.ase.eist.rest;

import de.tum.in.ase.eist.model.ComputerStock;
import de.tum.in.ase.eist.service.ComputerStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.server.ResponseStatusException;

import java.io.FileNotFoundException;
import java.util.Optional;

@RestController

@RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)


public class ComputerStockResource {



    private final ComputerStockService computerStockService;

    private final String BASE_URL = "/api/computers";

    public ComputerStockResource(ComputerStockService computerStockService) {
        this.computerStockService = computerStockService;
    }

    // TODO: Implement createComputerStock
    @PostMapping (BASE_URL+"/add")
    private void createComputerStock(ComputerStock computerStock) throws ResponseStatusException{
       computerStockService.save(computerStock);

      }
    

    // TODO: Implement buyComputer
    @GetMapping(BASE_URL+"/get")
    private void buyComputer(@RequestParam(value = "id") int i) throws ResponseStatusException {
        if(computerStockService.getById()){
            throw new ResponseStatusException(ResponseStatus404);
        }else{
            computerStockService.
        }
    }

    // TODO: Implement getAllComputerStocks
//    @GetMapping("/search-pois")
//    private POI[] searchPOIs(@RequestParam(value = "destination") String destination) throws FileNotFoundException {
//        return POIService.getAllPOIs(destination);
//    }
}

