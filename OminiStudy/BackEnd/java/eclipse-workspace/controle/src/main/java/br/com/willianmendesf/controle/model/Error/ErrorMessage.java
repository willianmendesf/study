package br.com.willianmendesf.controle.model.Error;

public class ErrorMessage {

	private String title;
	private Integer status;
	private String message;
	
	public ErrorMessage(String title, Integer status, String message) {
		super();
		this.title = title;
		this.status = status;
		this.message = message;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Integer getStatus() {
		return status;
	}
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
}
