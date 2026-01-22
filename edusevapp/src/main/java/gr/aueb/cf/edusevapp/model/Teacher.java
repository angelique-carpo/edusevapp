package gr.aueb.cf.edusevapp.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String uuid;

    @ColumnDefault("true")
    private Boolean isActive;

    @PrePersist
    public void initializeUUID(){
        if (uuid == null){
            uuid = java.util.UUID.randomUUID().toString();
        }
    }
}
