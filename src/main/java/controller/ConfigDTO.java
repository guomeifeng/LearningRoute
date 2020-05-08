package controller;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data

public class ConfigDTO {
	
	private String environment;
	private String itemkey;
	private String itemvalue;
}
