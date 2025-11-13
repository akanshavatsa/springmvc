package springmvc.user.model;

import jakarta.persistence.*;

import java.time.Instant;
import java.time.LocalDateTime;

@MappedSuperclass
public abstract class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // or SEQUENCE depending on DB
    private Long id;

    @Column(name = "creation_time_stamp", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "last_updated_time_stamp")
    private LocalDateTime updatedAt;

    @Column(name="creation_epoc_seconds")
    private Long creationEpocSeconds;

    @Column(name = "last_updated_epoc_seconds")
    private  Long lastUpdatedEpocSeconds;

    @Column(name = "created_by", length = 100)
    private String createdBy;

    @Column(name = "updated_by", length = 100)
    private String updatedBy;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
        this.creationEpocSeconds= Instant.now().getEpochSecond();
    }

    @PreUpdate
    protected void onUpdate() {
        updatedAt = LocalDateTime.now();
        this.lastUpdatedEpocSeconds=Instant.now().getEpochSecond();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Long getCreationEpocSeconds() {
        return creationEpocSeconds;
    }

    public void setCreationEpocSeconds(Long creationEpocSeconds) {
        this.creationEpocSeconds = creationEpocSeconds;
    }

    public Long getLastUpdatedEpocSeconds() {
        return lastUpdatedEpocSeconds;
    }

    public void setLastUpdatedEpocSeconds(Long lastUpdatedEpocSeconds) {
        this.lastUpdatedEpocSeconds = lastUpdatedEpocSeconds;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }
}

