package cart.domain;

import java.util.Objects;

public class Member {
    private Long id;
    private String email;
    private String password;

    public Member(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }
    
    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
    public Long getId() {
        return id;
    }
    
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
