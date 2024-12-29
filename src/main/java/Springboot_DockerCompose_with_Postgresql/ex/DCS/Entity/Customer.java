package Springboot_DockerCompose_with_Postgresql.ex.DCS.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int cid;
    String cname;
    String caddress;
    long cphnno;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCaddress() {
        return caddress;
    }

    public void setCaddress(String caddress) {
        this.caddress = caddress;
    }

    public long getCphnno() {
        return cphnno;
    }

    public void setCphnno(long cphnno) {
        this.cphnno = cphnno;
    }
}
