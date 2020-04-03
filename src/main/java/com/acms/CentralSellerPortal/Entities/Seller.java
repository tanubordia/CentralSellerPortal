package com.acms.CentralSellerPortal.Entities;

public class Seller {
  int seller_id, seller_contactno;
  String seller_name, shop_name, shop_address, password, email_id, pan, gstin;
  public seller(int seller_id, String seller_name, String gstin)
  {
    this.seller_id= seller_id;
    this.seller_name= seller_name;
    this.gstin=gstin;
}
}
