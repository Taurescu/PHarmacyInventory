package spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import spring.entity.Drug;
import spring.repository.DrugRepositoryInterface;

import java.util.List;

@Service
@ComponentScan({"spring"})
public class DrugService {

    @Autowired
    private DrugRepositoryInterface drugRepository;

    public void save(Drug drug){
        drugRepository.saveAndFlush(drug);
    }

    public List<Drug> list() {
        return drugRepository.findAll();
    }
}
