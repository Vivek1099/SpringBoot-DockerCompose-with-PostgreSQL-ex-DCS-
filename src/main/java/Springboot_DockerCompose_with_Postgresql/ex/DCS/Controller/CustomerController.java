package Springboot_DockerCompose_with_Postgresql.ex.DCS.Controller;

import Springboot_DockerCompose_with_Postgresql.ex.DCS.Entity.Customer;
import Springboot_DockerCompose_with_Postgresql.ex.DCS.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController
{
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping("/test")
    public String test()
    {
        return "demo docker compose test with postgresql";
    }

    @PostMapping("/save")
    public String savedata(@RequestBody Customer customer)
    {
        customerRepository.save(customer);
        return "Customer data saved";
    }

    @GetMapping("/byid/{cid}")
    public Optional<Customer> showById(@PathVariable int cid)
    {
        return customerRepository.findById(cid);
    }

    @GetMapping("/show")
    public List<Customer> showall()
    {
        return customerRepository.findAll();
    }

    @DeleteMapping("/deletebyid/{cid}")
    public String DeleteById(@PathVariable int cid)
    {
        customerRepository.deleteById(cid);
        return "Customer Data Deleted";
    }

    @PutMapping("/updatebyid/{cid}")
    public Customer UpdateById(@PathVariable int cid, @RequestBody Customer customer)
    {
        Customer c = customerRepository.findById(cid).get();
        c.setCname(customer.getCname());
        c.setCaddress(customer.getCaddress());
        c.setCphnno(customer.getCphnno());
        customerRepository.save(c);
        return c;
    }
}
