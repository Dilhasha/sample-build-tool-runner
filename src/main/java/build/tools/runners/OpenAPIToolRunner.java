package disttest.cli;

import io.ballerina.cli.tool.BuildToolRunner;
import io.ballerina.projects.ToolContext;

import io.ballerina.tools.diagnostics.Diagnostic;

import java.util.ArrayList;
import java.util.List;

public class OpenAPIToolRunner implements BuildToolRunner {


    List<Diagnostic> diagnostics = new ArrayList<>();

    @Override
    public void executeTool(ToolContext toolContext) {
        System.out.println("OpenAPIPreBuildRunner.executeTool");
        System.out.println("toolContext.toolId() = " + toolContext.toolId());
        System.out.println("toolContext.toolType() = " + toolContext.toolType());
        System.out.println("toolContext.sourceValue() = " + toolContext.filePath());
        System.out.println("toolContext.targetModule() = " + toolContext.targetModule());
        System.out.println("toolContext.optionsTable() = " + toolContext.optionsTable());
        System.out.println("toolContext.cachePath() = " + toolContext.cachePath());
        System.out.println("toolContext.outputPath() = " + toolContext.outputPath());
    }

    @Override
    public String getToolName() {
        return "openapi";
    }

    @Override
    public List<Diagnostic> diagnostics() {
        return this.diagnostics;
    }
    
}
