import static org.junit.Assert.*;

/**
 * Created by nadunindunil on 11/1/17.
 */
public class GitManagerTest {
    @org.junit.Test
    public void getUserName() throws Exception {
        GitManager gm = new GitManager();
        assertEquals("Nadun Indunil",gm.getUserName());

    }

    @org.junit.Test
    public void getEmail() throws Exception {
        GitManager gm = new GitManager();
        assertEquals("test@123.com",gm.getEmail());
    }

    @org.junit.Test
    public void setUserName() throws Exception {

    }

    @org.junit.Test
    public void setEmail() throws Exception {

    }

}