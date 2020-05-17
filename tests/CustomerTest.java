import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    private Customer customer;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        customer = new Customer("Anna");
    }

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("Anna",customer.getName());
    }

    @org.junit.jupiter.api.Test
    void statement() {
        String statement = "Rental Record for Anna"+"\n";
        statement += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
        statement += "Amount owed is " + "0.0" + "\n";
        statement += "You earned " + "0" + " frequent renter points";

        assertEquals(statement,customer.statement());
    }
}