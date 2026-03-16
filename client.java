import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue
    private Long clientId;

    private String name;
    private String email;
    private String phone;

    @ManyToOne
    private Advisor advisor;

    public Client() {}

    // getters and setters
}
