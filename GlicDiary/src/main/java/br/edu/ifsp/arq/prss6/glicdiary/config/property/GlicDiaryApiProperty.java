package br.edu.ifsp.arq.prss6.glicdiary.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("glicdiary")
public class GlicDiaryApiProperty {

	private String originAllowed = "http://localhost:4200";
	private final Security security = new Security();

	public Security getSecurity() {
		return security;
	}

	public String getOriginAllowed() {
		return originAllowed;
	}

	public void setOriginAllowed(String originPermitida) {
		this.originAllowed = originPermitida;
	}

	public static class Security {
		private boolean enableHttps;

		public boolean isEnableHttps() {
			return enableHttps;
		}

		public void setEnableHttps(boolean enableHttps) {
			this.enableHttps = enableHttps;
		}
	}
}
