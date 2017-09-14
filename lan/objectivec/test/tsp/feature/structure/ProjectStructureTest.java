package tsp.feature.structure;

import org.junit.Test;
import tsp.feature.structure.ps.graph.ProjectStructureGraph;
import tsp.feature.structure.ps.scan.FileScan;

public class ProjectStructureTest {

    @Test
    public void psTest1() throws Exception {
        ProjectStructureGraph graph = FileScan.scanProject("/Users/away/Desktop/ios_hello");
        System.out.println(graph.toString());
    }
}
