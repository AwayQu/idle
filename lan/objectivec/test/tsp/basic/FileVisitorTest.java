package tsp.basic;

import org.junit.Test;
import tsp.feature.structure.ps.graph.ProjectStructureGraph;
import tsp.feature.structure.ps.scan.FileScan;

public class FileVisitorTest {

    @Test
    public void fileVisitorTest1() throws Exception {
        ProjectStructureGraph graph = FileScan.scanProject("/Users/away/Desktop/ios_hello");

        PrintFileVisitor visitor = new PrintFileVisitor();
        visitor.visit(graph.root);


    }
}
