package com.away1994.dist.basic;

import com.away1994.constants.TestConstants;
import com.away1994.dist.feature.structure.ps.graph.ProjectStructureGraph;
import com.away1994.dist.feature.structure.ps.scan.FileScan;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileWriter;

import static com.away1994.constants.TestConstants.TEST_OUT_PATH;

public class FileVisitorTest {

    @Before
    public void before() {
        File file = new File(TEST_OUT_PATH);
        if (!file.exists()) {
            file.mkdirs();
        }
    }
    @Test
    public void fileVisitorTest1() throws Exception {
        ProjectStructureGraph graph = FileScan.scanProject(TestConstants.IOS_HELLO_PROJECT_PATH);

        PrintFileVisitor visitor = new PrintFileVisitor();
        visitor.visit(graph.root);


    }


    @Test
    public void fileVisitorTest2() throws Exception {
        ProjectStructureGraph graph = FileScan.scanProject(TestConstants.IOS_HELLO_PROJECT_PATH);

        DotGraphFileVisitor visitor = new DotGraphFileVisitor();
        visitor.visit(graph.root);
        visitor.sb.append("}");
        System.out.println(visitor.sb.toString());



        FileWriter fw = new FileWriter(TEST_OUT_PATH + "fileVisitorTest2.dot");
        fw.write(visitor.sb.toString());
        fw.flush();
        fw.close();
    }

}
