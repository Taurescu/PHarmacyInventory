package spring.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import spring.entity.Drug;
import spring.service.DrugService;

@SpringBootApplication
@ComponentScan({"spring"})
@EnableJpaRepositories("spring")
@EntityScan("spring.entity")
public class Application {

    @Autowired
    private DrugService drugService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }



    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("Start!");

            Drug drug = new Drug();
            drug.setUid(15);
            drug.setDrugName("drug2");
            drugService.save(drug);

            drugService.list().forEach(drug1-> System.out.println(drug1.getDrugName()));
        };
    }

//    @Override
//    public void run(String... args) {
//        System.out.println("Start!");
////
////        Drug drug = new Drug();
////        drug.setUid("1234");
////        drug.setDrugName("drug name");
////        drugService.save(drug);
////
////        drugService.list().forEach(drug1 -> System.out.println(drug1.getDrugName()));
//    }

}