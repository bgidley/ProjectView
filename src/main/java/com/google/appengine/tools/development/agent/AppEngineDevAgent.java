package com.google.appengine.tools.development.agent;

@SuppressWarnings({ "ALL" })
public class AppEngineDevAgent {

public AppEngineDevAgent() { }

public static void premain(java.lang.String agentArgs, java.lang.instrument.Instrumentation inst) { }

public static java.lang.Object getAgent() { return null; }

private static java.net.URL findAgentImplLib() { return null; }

static interface AgentImplStruct {

void run(java.lang.instrument.Instrumentation instrumentation);

java.lang.Object getInstance();
}

}