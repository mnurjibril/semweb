/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package semwebclass;

import com.hp.hpl.jena.db.IDBConnection;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import java.util.*;

/**
 *
 * @author tarex
 */
public class Semwebclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Class.forName(ConnectToDB.DB_DRIVER);
        }catch (ClassNotFoundException e){
                e.printStackTrace();
                }
         String filePath = "file:///B://ConfMa.owl";
        IDBConnection con = ConnectToDB.connectDB();
        System.out.println(con);
        String name = "ConfMan_db";
        
    //ontologyDB.createDBModelFromFile(con, name, filePath);
        
        ontologyDB.listClasses(con, name);
        ////ontologyDB.getPropertiesClass(con, name, "movie");
        //getPropertiesInstance(con, name, "movie");
  
    }
    
}
