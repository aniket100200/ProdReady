package ProdReady.Aniket.models;

import jakarta.persistence.Id;

// import org.springframework.data.mongodb.core.mapping.Document;

// @Document
public class Product {
  @Id private String id;
  private String name;
}
