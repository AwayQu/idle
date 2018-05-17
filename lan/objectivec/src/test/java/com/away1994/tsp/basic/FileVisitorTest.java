package com.away1994.tsp.basic;

import com.away1994.tsp.feature.structure.ps.graph.ProjectStructureGraph;
import com.away1994.tsp.feature.structure.ps.scan.FileScan;
import org.junit.Test;

import java.io.FileWriter;

import static com.away1994.constants.TestConstants.TEST_RESOURCES_PATH;

public class FileVisitorTest {

    @Test
    public void fileVisitorTest1() throws Exception {
        ProjectStructureGraph graph = FileScan.scanProject("/Users/away/Desktop/ios_hello");

        PrintFileVisitor visitor = new PrintFileVisitor();
        visitor.visit(graph.root);


    }


    @Test
    public void fileVisitorTest2() throws Exception {
        ProjectStructureGraph graph = FileScan.scanProject("/Users/away/Desktop/ios_hello");

        DotGraphFileVisitor visitor = new DotGraphFileVisitor();
        visitor.visit(graph.root);
        visitor.sb.append("}");
        System.out.println(visitor.sb.toString());



        FileWriter fw = new FileWriter(TEST_RESOURCES_PATH + "out/fileVisitorTest2.dot");
        fw.write(visitor.sb.toString());
        fw.flush();
        fw.close();
    }

}
