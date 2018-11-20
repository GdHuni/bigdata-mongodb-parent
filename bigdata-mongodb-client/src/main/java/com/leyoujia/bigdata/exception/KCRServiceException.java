package com.leyoujia.bigdata.exception;

public class KCRServiceException extends Exception { 
	
	private static final long serialVersionUID = 1L;

	public KCRServiceException() {
		super();
	}

	public KCRServiceException(String arg0) {
		super(arg0);
	}
	
	public KCRServiceException(Throwable arg1) {
		super(arg1);
	}
	
	public KCRServiceException(String arg0, Throwable arg1) {
		super(arg0,arg1);
	}
}
