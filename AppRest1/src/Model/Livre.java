package Model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Livre implements Serializable {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num;
	private String description;
	private int quantit�;
	public Livre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Livre(int num, String description, int quantit�) {
		super();
		this.num = num;
		this.description = description;
		this.quantit� = quantit�;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantit�() {
		return quantit�;
	}
	public void setQuantit�(int quantit�) {
		this.quantit� = quantit�;
	}
	

}
