package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long portfolioID;

   
    @OneToOne
    @JoinColumn(name = "clientID", nullable = false)
    private Client client;

    
    protected Portfolio() {
    }

   
    public Portfolio(Client client) {
        this.client = client;
    }

    
    public long getPortfolioID() {
        return portfolioID;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
