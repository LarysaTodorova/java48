package homework33;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClientRepository {

    Set<Client> clients = new HashSet<>();

    public ClientRepository(Set<Client> clients) {
        this.clients = clients;
    }

    public boolean printAllClientData(int id) {
        for (Client client : clients) {
            if (client.getId() == id) {
                System.out.println("Name " + client.getName());
                System.out.println("Contact data  " + client.getContacts());
            }
        }
        return false;
    }
}

