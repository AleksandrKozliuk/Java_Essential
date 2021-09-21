package homework5.add_task;

import java.util.List;

public class Customer {
    private Integer id;
    private String username;
    private String password;
    private Integer profileId;
    List<Integer> serviceId;
    List<Integer> ticketId;

    public Customer(Integer id, String username, String password, Profile setId, List<Integer> serviceId, List<Integer> ticketId) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.profileId = setId.id;
        this.serviceId = serviceId;
        this.ticketId = ticketId;
    }
}
