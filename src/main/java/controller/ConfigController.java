package controller;





import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
	
	@GetMapping("/get")
	public static List<ConfigDTO> getConfigByEnvironment(@RequestParam String environment){
		Environment env = Environment.valueOf(environment.toUpperCase());
		switch(env) {
		case GLOWPOWERUAT:{
			return getGlowPowerUATConfig();
		}
		case GLOWPOWER:{
			return getGlowPowerConfig();
		}
		default:{
			return new ArrayList<>();
		}
		}
	}

	private static List<ConfigDTO> getGlowPowerUATConfig() {
		List<ConfigDTO> configs = new ArrayList<>();
		ConfigDTO config = new ConfigDTO();
		config.setEnvironment("GlowPowerUAT");
		config.setItemkey("GC_ENVIRONMENT");
		config.setItemvalue("SANDBOX");
		configs.add(config);
		ConfigDTO config1 = new ConfigDTO();
		config1.setEnvironment("GlowPowerUAT");
		config1.setItemkey("GC_ACCESS_KEY");
		config1.setItemvalue("........");
		configs.add(config1);
		return configs;
	}
	

	private static List<ConfigDTO> getGlowPowerConfig() {
		
		List<ConfigDTO> configs = new ArrayList<>();
		ConfigDTO config = new ConfigDTO();
		config.setEnvironment("GlowPower");
		config.setItemkey("GC_ENVIRONMENT");
		config.setItemvalue("LIVE");
		configs.add(config);
		ConfigDTO config1 = new ConfigDTO();
		config1.setEnvironment("GlowPowerUAT");
		config1.setItemkey("GC_ACCESS_KEY");
		config1.setItemvalue("waiting..............");
		configs.add(config1);
		return configs;
	}
	
	@GetMapping("/string")
	public String getString() {
		return "Hello";
	}
}