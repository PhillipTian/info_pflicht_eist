package de.tum.in.ase.eist.service;

import de.tum.in.ase.eist.model.ComputerStock;
import de.tum.in.ase.eist.repository.ComputerStockRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ComputerStockService {
    private final ComputerStockRepository computerStockRepository;

    public ComputerStockService(ComputerStockRepository computerStockRepository) {
        this.computerStockRepository = computerStockRepository;
    }

    public ComputerStock save(ComputerStock computer) {
        return computerStockRepository.save(computer);
    }

    // TODO: Implement buy logic here
//    public ComputerStock buyComputer(ComputerStock computer) {
//        computerStockRepository
//    }



    // TODO: Implement retrieve logic using ComputerStockRepository
    public List<ComputerStock> getAllComputers(boolean onlyAvailable) {
        return new ArrayList<>();
    }

    public Optional<ComputerStock> getById(Long computerId) {
        return computerStockRepository.findById(computerId);
    }
}
