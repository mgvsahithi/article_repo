package api.response;

public class StandardResponse {

	private Long code;
	private String msg;
	private String accessToken;

	public String getAccessToken() {
		return accessToken;
	}

	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public StandardResponse withCode(Long code) {
		this.code = code;
		return this;
	}
	public StandardResponse withAccessToken(String code) {
		this.accessToken = code;
		return this;
	}
	public StandardResponse withMsg(String msg) {
		this.msg = msg;
		return this;
	}
	
	public StandardResponse(String msg, Long Code, String accessToken) {
		this.msg = msg;
		this.code = Code;
		this.accessToken = accessToken;
	}

	public StandardResponse(String msg, Long Code) {
		this.msg = msg;
		this.code = Code;
	}
	
	public StandardResponse() {
		
	}
	
}
