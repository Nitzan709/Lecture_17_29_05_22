import java.util.HashSet;
import java.util.Set;

public class Customer {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    private Set<Coupon> coupons;

    public Customer() {
        coupons = new HashSet<>();
    }
}
