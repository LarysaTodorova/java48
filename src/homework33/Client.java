package homework33;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {

    private int id;
    private String name;
    private String contacts;
    private List<Rent> clientRents;

    public Client(int id, String name, String contacts) {
        this.id = id;
        this.name = name;
        this.contacts = contacts;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContacts() {
        return contacts;
    }

    public List<Rent> getClientRents() {
        return clientRents;
    }

    public void setClientRents(List<Rent> clientRents) {
        this.clientRents = clientRents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contacts='" + contacts + '\'' +
                ", clientRents=" + clientRents +
                '}';
    }
}
