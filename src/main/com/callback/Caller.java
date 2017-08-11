package main.com.callback;

public class Caller {
	
     private CallbackService callbackService;
     
     public Caller(CallbackService callbackService){
    	 this.callbackService=callbackService;
     }

	public CallbackService getCallbackService() {
		return callbackService;
	}

	public void setCallbackService(CallbackService callbackService) {
		this.callbackService = callbackService;
	}
    
	public void call(){
		callbackService.callbcak();
	}
	
}
