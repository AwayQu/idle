import com.away1994.jgit.url.GitURL;
import org.junit.Assert;
import org.junit.Test;

public class GitURLTest {

    @Test
    public void testGitPrefix() throws Exception {
        String url = "git@git:example.git";
        GitURL gitURL = new GitURL(url);

        Assert.assertEquals("same url", url, gitURL.getURL());
    }

    @Test
    public void testHttpPrefix() throws Exception {
        String url = "http://github.com/example";
        String toUrl = "http://github.com/example.git";
        GitURL gitURL = new GitURL(url);

        Assert.assertEquals("append .git", gitURL.getURL(), toUrl);
    }

    @Test
    public void testHttpsPrefix() throws Exception {
        String url = "https://github.com/example";
        String toUrl = "https://github.com/example.git";
        GitURL gitURL = new GitURL(url);
        Assert.assertEquals("append .git", gitURL.getURL(), toUrl);
    }


    @Test
    public void testHttpHasDotGitSuffix() throws Exception {
        String url = "http://github.com/example.git";
        GitURL gitURL = new GitURL(url);
        Assert.assertEquals("no change", gitURL.getURL(), url);
    }

    @Test
    public void testHttpsHasDotGitSuffix() throws Exception {
        String url = "https://github.com/example.git";
        GitURL gitURL = new GitURL(url);
        Assert.assertEquals("no change", gitURL.getURL(), url);
    }

    @Test(expected = GitURL.GitURLFormatErrorException.class)
    public void testErrorFormatUrl() throws Exception {
        String url = "errorFormat";
        GitURL gitURL = new GitURL(url);
        gitURL.getURL();
    }

}
