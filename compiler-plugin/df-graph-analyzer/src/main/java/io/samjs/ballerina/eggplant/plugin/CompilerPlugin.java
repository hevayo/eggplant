/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.samjs.ballerina.eggplant.plugin;

import io.ballerina.projects.plugins.CompilerPluginContext;

public class CompilerPlugin extends io.ballerina.projects.plugins.CompilerPlugin {
    @Override
    public void init(CompilerPluginContext compilerPluginContext) {
        compilerPluginContext.addCodeAnalyzer(new WorkerInteractionAnalyzer());
    }
}
