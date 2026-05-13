package com.example.TaskManager.JPA;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Date;

@Entity
public class Task {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int Id;
    
    @Column(name = "Title")
    private String Title;
    
    @Column(name = "Description")
    private String Description;
    
    @Column(name = "CreationDate")
    private Date CreationDate;
    
    @ManyToOne
    @JoinColumn(name = "idstatus") 
    public Status status;

    public Task() {
    }

    public Task(int Id, String Title, String Description, Date CreationDate, Status status) {
        this.Id = Id;
        this.Title = Title;
        this.Description = Description;
        this.CreationDate = CreationDate;
        this.status = status;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Date getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(Date CreationDate) {
        this.CreationDate = CreationDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    
    
}
