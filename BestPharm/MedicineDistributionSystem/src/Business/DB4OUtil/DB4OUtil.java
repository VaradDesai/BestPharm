package Business.DB4OUtil;

import Business.ConfigureABusiness;
import Business.EcoSystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 *
 * @author 
 */
public class DB4OUtil {

   // private static final String FILENAME = "C:\\Users\\Ankita Mhatre\\Downloads\\MyDataBank\\DataBankAnkitaMedicalSystemTrialVersion6.db4o";   // path to the data store
//     private static final String FILENAME = "C:\\Users\\varad\\Course Work\\AED\\Project\\DataBank_1.db4o";   // path to the data store
//C:\Users\varad\Course Work\AED\Project\BestPharm\bestpharm
    // private static final String FILENAME = "C:\\Users\\Hardik Mody\\Desktop\\Revamped_AED\\BestPharm_New_Panels_Revamped\\maniacs_new\\maniacs_new\\DataBankhardik_5.db4o"; 
    private static final String FILENAME = Paths.get("DataBankhardik_5.db4o").toAbsolutePath().toString();
    private static DB4OUtil dB4OUtil;

    public synchronized static DB4OUtil getInstance() {
        if (dB4OUtil == null) {
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(EcoSystem system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }

    public EcoSystem retrieveSystem() {
        ObjectContainer conn = createConnection();
        ObjectSet<EcoSystem> systems = conn.query(EcoSystem.class); // Change to the object you want to save
        EcoSystem system;
        if (systems.size() == 0) {
            system = ConfigureABusiness.configure();  // If there's no System in the record, create a new one
        } else {
            system = systems.get(systems.size() - 1);
        }
        conn.close();
     
        
        
        
        
        
        
        
        
         return system;
    }

}
