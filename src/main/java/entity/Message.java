package entity;

import javax.persistence.*;

/**
 *  Entity class, we use it to map
 *  Java Object to SQL database table
 */

@Entity
public class Message {

    @Id
    @GeneratedValue
    private Long id;

    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
