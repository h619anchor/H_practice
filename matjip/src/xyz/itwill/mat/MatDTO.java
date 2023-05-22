package xyz.itwill.mat;

public class MatDTO {
   private String name;
   private String location;
   private String category;
   private String review;
   private String address;
   private String menu;
   private String price;
   private String phone;
   
   public MatDTO() {
      // TODO Auto-generated constructor stub
   }

   public MatDTO(String name, String location, String category, String review, String address, String menu,
         String price, String phone) {
      super();
      this.name = name;
      this.location = location;
      this.category = category;
      this.review = review;
      this.address = address;
      this.menu = menu;
      this.price = price;
      this.phone = phone;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getLocation() {
      return location;
   }

   public void setLocation(String location) {
      this.location = location;
   }

   public String getCategory() {
      return category;
   }

   public void setCategory(String category) {
      this.category = category;
   }

   public String getReview() {
      return review;
   }

   public void setReview(String review) {
      this.review = review;
   }

   public String getAddress() {
      return address;
   }

   public void setAddress(String address) {
      this.address = address;
   }

   public String getMenu() {
      return menu;
   }

   public void setMenu(String menu) {
      this.menu = menu;
   }

   public String getPrice() {
      return price;
   }

   public void setPrice(String price) {
      this.price = price;
   }

   public String getPhone() {
      return phone;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }
   
   
   
   
   
}