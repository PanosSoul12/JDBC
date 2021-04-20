/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergo.entity;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author USER
 */
public class Actor {
    private int actor_id;
    private String firstName;
    private String lastName;
    private LocalDate lastUpdate;

    public Actor() {
    }
    
     public Actor(int actor_id, String firstName, String lastName) {
        this.actor_id = actor_id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Actor(int actorId, String firstName, String lastName, LocalDate lastUpdate) {
        this.actor_id = actorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdate = lastUpdate;
    }

   

    

    public int getActorId() {
        return actor_id;
    }

    public void setActorId(int actorId) {
        this.actor_id = actorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDate lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.actor_id;
        hash = 53 * hash + Objects.hashCode(this.firstName);
        hash = 53 * hash + Objects.hashCode(this.lastName);
        hash = 53 * hash + Objects.hashCode(this.lastUpdate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Actor other = (Actor) obj;
        if (this.actor_id != other.actor_id) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.lastUpdate, other.lastUpdate)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Actor{" + "actorId=" + actor_id + ", firstName=" 
                + firstName + ", lastName=" + lastName + 
                ", lastUpdate=" + lastUpdate + '}';
    }
    
    
    
}
