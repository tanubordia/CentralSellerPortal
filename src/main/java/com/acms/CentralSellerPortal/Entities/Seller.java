package com.acms.CentralSellerPortal.Entities;

public class Seller {
  int seller_id, seller_contactno;
  String seller_name, shop_name, shop_address, password, email_id, pan, gstin;
  public Seller(int seller_id, String seller_name, String shop_name, String seller_address, int seller_contactno, String email_id, String password, String gstin)
  {
    this.seller_id= seller_id;
    this.seller_name= seller_name;
    this.shop_name= shop_name;
    this.seller_address=seller_address;
    this.seller_contactno=seller_contactno;
    this.email_id=email_id;
    this.password=password;
    this.gstin=gstin;
}
  public int getId() {
      return seller_id;
   }

   public void setId( int id ) {
      this.seller_id = id;
   }
   public int getNumber() {
      return seller_contactno;
   }

   public void setNumber( int number ) {
      this.seller_contactno = number;
   }

   public String getPassword() {
      return password;
   }
    public void setPassword( String password ) {
      this.password = password;
   }

   public void setSellerName( String seller_name ) {
      this.seller_name = seller_name;
   }

   public String getSellerName() {
      return seller_name;
   }

   public void setShopName( String shop_name ) {
      this.shop_name = shop_name;
   }

   public String getShopName() {
      return shop_name;
   }
    public void setShopAddress( String shop_address ) {
      this.shop_address = shop_address;
   }

   public String getShopAddress() {
      return shop_address;
   }
      public void setEmailId( String email_id ) {
      this.email_id = email_id;
   }

   public String getEmaiiId() {
      return email_id;
   }
     public void setGstin( String gstin ) {
      this.gstin = gstin;
   }

   public String getGstin() {
      return gstin;
   }


}
