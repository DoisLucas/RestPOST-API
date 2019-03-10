package tecworld.doislucas.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_email")
public class Email {

    @Id
    @GeneratedValue
    public int id;
    public String email;

    public Email() {
    }

    public Email(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Email{" +
                "id=" + id +
                ", email='" + email + '\'' +
                '}';
    }
}
