import org.ini4j.Ini;
import java.io.File;
import java.io.IOException;

/**
 * Created by nadunindunil on 10/31/17.
 */

/**
 * Git Manager suppose to handle .gitconfig file in $home directory
 */
public class GitManager {

    private Ini ini = null;

    public GitManager(){

//        String home_dir = System.getProperty("user.home");
//        System.out.println(home_dir);
//        String config_file = home_dir + "/.gitconfig";
//
//        try {
//            ini = new Ini(new File(config_file));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        if (ini != null) {
//            System.out.println("Getting some information from the git configuration...");
//        }
//        else {
//            System.out.println("Git configuration file does not exist...");
//        }

        try {
            ini = new Ini(new File("/Users/nadunindunil/OpenProjects/java/.gitconfig"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String getUserName(){

        return ini.get("user", "name");
    }

    public String getEmail(){

        return ini.get("user", "email");
    }

    public void setUserName(String value) throws IOException {

        ini.put("user","name",value);
        ini.store();

    }

    public void setEmail(String value) throws IOException {

        ini.put("user","email",value);
        ini.store();

    }
}
