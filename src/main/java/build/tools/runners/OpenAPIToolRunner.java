package build.tools.runners;

import io.ballerina.projects.buildtools.CodeGeneratorTool;
import io.ballerina.projects.buildtools.ToolContext;

public class OpenAPIToolRunner implements CodeGeneratorTool {
    @Override
    public void execute(ToolContext toolContext) {
        System.out.println("OpenAPIPreBuildRunner.execute");
        System.out.println("toolContext.toolId() = " + toolContext.toolId());
        System.out.println("toolContext.sourceValue() = " + toolContext.filePath());
        System.out.println("toolContext.targetModule() = " + toolContext.targetModule());
        System.out.println("toolContext.optionsTable() = " + toolContext.options());
        System.out.println("toolContext.cachePath() = " + toolContext.cachePath());
        System.out.println("toolContext.outputPath() = " + toolContext.outputPath());
    }

    @Override
    public String toolName() {
        return "openapi";
    }
}
