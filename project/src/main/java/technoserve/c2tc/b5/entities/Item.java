package technoserve.c2tc.b5.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="Item")
@Component
public class Item {
	@Id
	private long id;
	private String name;
	private LocalDate manufacturing=LocalDate.of(2022,01,8);
	private LocalDate expiry=LocalDate.of(2024,01,8);
	private float price;
    private enum category{
			SHOES,PERFUMES,CLOTHES}
	@Enumerated(EnumType.STRING)
	private category cat;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getManufacturing() {
		return manufacturing;
	}
	public void setManufacturing(LocalDate manufacturing) {
		this.manufacturing = manufacturing;
	}
	public LocalDate getExpiry() {
		return expiry;
	}
	public void setExpiry(LocalDate expiry) {
		this.expiry = expiry;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public category getCat() {
		return cat;
	}
	public void setCat(category cat) {
		this.cat = cat;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", manufacturing=" + manufacturing + ", expiry=" + expiry
				+ ", price=" + price + ", cat=" + cat + "]";
	}

}

