package dto;

public class ProductRequest {
   private String  title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    private String   description;
    private Integer  quantity;
    private Integer categoryId;
  private Double  price;

    @Override
    public String toString() {
        return "ProductRequest{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", categoryId=" + categoryId +
                ", price=" + price +
                '}';
    }
}
