package com.communication;

import com.actions.IAction;

public class Messenger extends UserInput<String>{
	private static Messenger instance;
	public static Messenger getInstance() {
		if(instance==null)
			instance=new Messenger();
		return instance;
	}
	
	public void Send(IAction action) throws Exception {
		if(action.getShouldWait())
			SendAndWait(action.toString());
		else
			System.out.println("start "+action.toString());
	}

	private void SendAndWait(String action) throws Exception {
		System.out.println("start " + action);
		var result = waitFor(action);
		if(result.startsWith("failed")||result.startsWith("error"))
			throw new Exception("Action failed to execute");
	}

	protected boolean checkFormat(String input, String waitingFor) {
		var match = "succeeded " + waitingFor;
		if(input.trim().startsWith(match))
			return true;
		match = "failed "+waitingFor;
		if(input.trim().startsWith(match))
			 return true;
		match="error "+waitingFor;
		if(input.trim().startsWith(match))
			return true;
		return false;
	}


}
