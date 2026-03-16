import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private Long portfolioId;

    private String portfolioName;

    @OneToOne
    private Client client;

    public Portfolio() {}

    // getters and setters
}
