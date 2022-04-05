package Collect2;

public class ElerticlaShop {
private String product;
private int productcode;
private int tax;
private int netprice;
public ElerticlaShop(String product,int productcode,int tax,int netprice) {
	this.product=product;
	this.productcode=productcode;
	this.tax=tax;
	this.netprice=netprice;
}
public String toString() {
	return "ElerticlaShop [product=" + product + ", productcode=" + productcode + ", tax=" + tax + ", netprice="
			+ netprice + "]";
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public int getProductcode() {
	return productcode;
}
public void setProductcode(int productcode) {
	this.productcode = productcode;
}
public int getTax() {
	return tax;
}
public void setTax(int tax) {
	this.tax = tax;
}
public int getNetprice() {
	return netprice;
}
public void setNetprice(int netprice) {
	this.netprice = netprice;
}

}
