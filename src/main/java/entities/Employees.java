package entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Employee", schema = "dbo", catalog = "demo")
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "Name")
    private String Name;
    @Column(name = "Email")
    private String email;
    @Column(name = "Phone")
    private String phone;

    public Employees(int id, String Name, String email, String phone) {
        super();
        this.id = id;
        this.Name = Name;
        this.email = email;
        this.phone = phone;
    }

    public Employees() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String userName) {
        this.Name = userName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Employees(String Name, String email, String phone) {
        this.Name = Name;
        this.email = email;
        this.phone = phone;
    }

}
