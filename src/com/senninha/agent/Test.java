package com.senninha.agent;

import java.io.IOException;

import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;

public class Test {
	    public static void main(String[] args) throws AttachNotSupportedException,
	            IOException, AgentLoadException, AgentInitializationException {
	        VirtualMachine vm = VirtualMachine.attach(args[0]);
	        vm.loadAgent("/Users/jiangbo/Workspace/code/java/javaagent/loadagent.jar");

	    }

	}

