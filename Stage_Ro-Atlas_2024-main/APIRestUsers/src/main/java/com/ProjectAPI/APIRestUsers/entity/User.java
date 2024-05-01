package com.ProjectAPI.APIRestUsers.entity;

//aggiungere nuovo user, fare login, prendere il token e passarlo come auth bearer token in postman poi procedere normalmente


import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Data
@Entity
@Table(name = "UserList")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements UserDetails {
    //implementato User Details e importato i suoi metodi

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="Name", nullable = false)
    private String name;

    @Column(name ="Surname", nullable = false)
    private String surname;

    @Column(name ="Username", nullable = false, unique = true)
    private String username;

    @Column(name ="Password", nullable = false)
    protected String password;

    @Column(name ="Email", nullable = false, unique = true)
    private String email;

    //aggiunto role passato come Enum dichiarato in una entity a parte
    @Enumerated(value = EnumType.STRING)
    @Column(name ="Role")
    private Role role;


    //forzati a true per il momento, metodi di controllo di account
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(role.name()));
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
