import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EntityScan(basePackages = {"io.expensetracker.*"})
@ComponentScan(basePackages = {"io.expensetracker.*"})
@EnableJpaRepositories(basePackages = {"io.expensetracker.*"})
@SpringBootApplication
public class ExpenseTrackerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ExpenseTrackerApplication.class, args);

    }
}
