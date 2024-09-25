package org.example.taskservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private Long userId;
    private  String username;
    private String email;
    private String firstName;
    private String lastName;

    public User ToEntity(){
        return new User(this.userId,this.username,this.email,this.firstName,this.lastName);
    }
}
