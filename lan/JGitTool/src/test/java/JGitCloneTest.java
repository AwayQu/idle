import com.away1994.jgit.repository.RepositoryProvider;
import com.away1994.jgit.repository.TaskProgress;
import com.away1994.jgit.repository.impl.RepositoryProviderCloneImpl;
import org.eclipse.jgit.api.Git;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

public class JGitCloneTest {

    @Before
    public void deleteFiles() {
        File file = new File("./src/test/resources/");
        File[] files = file.listFiles();
        if (files != null) {
            for (File f: files) {
                f.delete();
            }
        }
    }

    @Test
    public void testClone() throws Exception {
        String url = "https://github.com/AwayQu/d3-uml.git";

        RepositoryProvider repoProvider = new RepositoryProviderCloneImpl(url, "./src/test/resources/d3-uml");

        repoProvider.setProgress(new TaskProgress() {
                    @Override
                    public void startProgress(String progressName) {
                        System.out.println("start progress: " + progressName);
                    }

                    @Override
                    public void startTask(String taskName, int totalNum) {
                        System.out.println("start task: " + taskName);
                    }

                    @Override
                    public void updateTask(String taskName, int increaseNum, int percent) {
                        System.out.println("update: " + percent + "%" );
                    }

                    @Override
                    public void endTask(String taskName) {
                        System.out.println("end: " + taskName);
                    }

                    @Override
                    public void endProgress(String progressName) {
                        System.out.println("end progress: " + progressName);
                    }
                });
        try (Git git = new Git(repoProvider.get())) {
//            git.pull().call();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
