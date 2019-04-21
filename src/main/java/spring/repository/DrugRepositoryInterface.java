package spring.repository;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.entity.Drug;

@Repository
@ComponentScan({"spring"})
public interface DrugRepositoryInterface extends JpaRepository<Drug, String> {


}
