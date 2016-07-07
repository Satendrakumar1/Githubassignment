package com.qait.assignment.terminal;

//import java.io.File;
import java.io.IOException;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecutor;
//import org.apache.commons.exec.ExecuteException;


public class ExecuteCommand {
	
	int iExitValue;
	

	public void execute() {
		DefaultExecutor oDefaultExecutor = new DefaultExecutor();
		CommandLine oCmdLine = new CommandLine("./executor.bat");
		try {
			oDefaultExecutor.execute(oCmdLine);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}


}