package com.Aman.Ecommerce.API.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
    private Integer productQuantity;
    @ManyToOne(cascade = CascadeType.ALL )
    private User users;         //:integer (foreign key mapping)
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_id_id")
    private Product productID;      //:integer(foreign key mapping)
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id_id")
    private Address addressID ;      //:integer(foreign key mapping)




}

