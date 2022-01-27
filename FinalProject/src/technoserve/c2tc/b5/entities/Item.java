package technoserve.c2tc.b5.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
@Entity
public class Item {
	@Id
	private long uid;
	private String name;
	private Date manufacturing;
	private Date expiry;
	private float price;
    private enum category{
			SHOES,PERFUMES,CLOTHES}
	@Enumerated(EnumType.STRING)
	private category cat;

	public category getCat() {
		return cat;
	}
	public void setCat(category cat) {
		this.cat = cat;
	}
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getManufacturing() {
		return manufacturing;
	}
	public void setManufacturing(Date date) {
		this.manufacturing = date;
	}
	public Date getExpiry() {
		return expiry;
	}
	public void setExpiry(Date expiry) {
		this.expiry = expiry;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [id=" + uid + ", name=" + name + ", manufacturing=" + manufacturing + ", expiry=" + expiry
				+ ", price=" + price + ", cat=" + cat + "]";
	}
		
		
	
	

}
