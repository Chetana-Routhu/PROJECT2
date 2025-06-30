package supplement_store2.entities;

import jakarta.persistence.*;

@Entity
public class ProductVariant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String size;
    private double price;
    private int stock;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
}
