import jakarta.persistence.*;

@Entity
public class Advisor {

    @Id
    @GeneratedValue
    private Long advisorId;

    private String name;
    private String email;
    private String phone;

    public Advisor() {}
}
