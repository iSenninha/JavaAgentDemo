package com.senninha.agent;

import java.lang.instrument.Instrumentation;

public class SetParam {
	@SuppressWarnings("rawtypes")
    public static void agentmain(String args, Instrumentation inst){
		Target.flag = false;
		System.out.println("设置为false");
    }
}
