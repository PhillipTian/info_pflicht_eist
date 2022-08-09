package de.tum.in.ase.eist.repository;

import de.tum.in.ase.eist.model.ComputerStock;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class ComputerStockRepository {

    private final List<ComputerStock> computerStocks = new ArrayList<>();

    // TODO: Implement retrieve logic here


    public List<ComputerStock> findAll() {
        return new ArrayList<>(computerStocks);
    }

    public void delete(ComputerStock computerStock){
        computerStocks.remove(computerStock);
    }

    public ComputerStock save(ComputerStock computerStock) {
        if (computerStock.getId() == null) {
            UUID uuid = UUID.randomUUID();
            computerStock.setId(uuid.getMostSignificantBits());
        } else {
            computerStocks.removeIf(stock -> stock.getId().equals(computerStock.getId()));
        }
        computerStocks.add(computerStock);

        return computerStock;
    }



    public Optional<ComputerStock> findById(Long id) {
        return computerStocks.stream().filter(stock -> id.equals(stock.getId())).findFirst();
    }
}
