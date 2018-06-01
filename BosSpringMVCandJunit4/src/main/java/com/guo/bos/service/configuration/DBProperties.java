package com.guo.bos.service.configuration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
//@Configuration
@Component
@PropertySource(value="classpath:db.properties")  
public class DBProperties  {
//	@Value("${jdbc.driverClass}")
//	private String driverClass;
//	@Value("${jdbc.jdbcUrl}")
//	private String jdbcUrl; 
//	@Value("${jdbc.user}")
//	private String user;
//	@Value("${jdbc.password}")
//	private String password;
//	@Value("${c3p0.acquireIncrement}")
//	private String acquireIncrement;
//	@Value("${c3p0.initialPoolSize}")
//	private String initialPoolSize;
//	@Value("${c3p0.maxPoolSize}")
//	private String maxPoolSize;
//	@Value("${c3p0.minPoolSize}")
//	private String minPoolSize;
//	@Value("${c3p0.maxIdleSize}")
//	private String maxIdleSize;
//	@Value("${c3p0.maxIdleTimeExcessConnections}")
//	private String maxIdleTimeExcessConnections;
//	@Value("${c3p0.maxConnectionAge}")
//	private String maxConnectionAge;
//	@Value("${c3p0.preferredTestQuery}")
//	private String preferredTestQuery;
//	@Value("${c3p0.idleConnectionTestPeriod}")
//	private String idleConnectionTestPeriod;
//	public String getDriverClass() {
//		return driverClass;
//	}
//	public String getJdbcUrl() {
//		return jdbcUrl;
//	}
//	public String getUser() {
//		return user;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public String getAcquireIncrement() {
//		return acquireIncrement;
//	}
//	public String getInitialPoolSize() {
//		return initialPoolSize;
//	}
//	public String getMaxPoolSize() {
//		return maxPoolSize;
//	}
//	public String getMinPoolSize() {
//		return minPoolSize;
//	}
//	public String getMaxIdleSize() {
//		return maxIdleSize;
//	}
//	public String getMaxIdleTimeExcessConnections() {
//		return maxIdleTimeExcessConnections;
//	}
//	public String getMaxConnectionAge() {
//		return maxConnectionAge;
//	}
//	public String getPreferredTestQuery() {
//		return preferredTestQuery;
//	}
//	public String getIdleConnectionTestPeriod() {
//		return idleConnectionTestPeriod;
//	}
//	

}