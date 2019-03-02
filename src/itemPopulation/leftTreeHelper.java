package itemPopulation;

import java.util.ArrayList;
import javafx.scene.control.TreeItem;
 
public class leftTreeHelper 
{
    public leftTreeHelper()
    {
    }
     
    // This method creates an ArrayList of TreeItems 
    public ArrayList<TreeItem> getProducts()
    {
        ArrayList<TreeItem> options = new ArrayList<TreeItem>();
         
        TreeItem custView = new TreeItem("Custom Views");
        custView.getChildren().addAll(getCustViews());
         
        TreeItem winLogs = new TreeItem("Windows Logs");
        winLogs.getChildren().addAll(getWinLogs());
 
        TreeItem apps = new TreeItem("Applications and Service Logs");
        apps.getChildren().addAll(getApps());
         
        TreeItem subs = new TreeItem("Subscriptions");
         
        options.add(custView);
        options.add(winLogs);
        options.add(apps);
        options.add(subs);
         
        return options;
    }
 
    // This method creates an ArrayList of TreeItems 
    private ArrayList<TreeItem> getCustViews()
    {
        ArrayList<TreeItem> custView = new ArrayList<TreeItem>();
        TreeItem adminEvents = new TreeItem("Administrative Events");
         
        custView.add(adminEvents);      
        return custView;        
    }
 
    // This method creates an ArrayList of TreeItems 
    private ArrayList<TreeItem> getWinLogs()
    {
        ArrayList<TreeItem> winLogs = new ArrayList<TreeItem>();
         
        TreeItem app = new TreeItem("Application");
        TreeItem sec = new TreeItem("Security");
        TreeItem setup = new TreeItem("Setup");
        TreeItem system = new TreeItem("System");
        TreeItem forwardedEvents = new TreeItem("Forwarded Events");
         
        winLogs.add(app);
        winLogs.add(sec);
        winLogs.add(setup);
        winLogs.add(system);
        winLogs.add(forwardedEvents);
         
        return winLogs;       
    }
     
    // This method creates an ArrayList of TreeItems 
    private ArrayList<TreeItem> getApps()
    {
        ArrayList<TreeItem> apps = new ArrayList<TreeItem>();
         
        TreeItem aesm = new TreeItem("AESMService");
        TreeItem hardware = new TreeItem("Hardware Events");
        TreeItem audio = new TreeItem("IntelAudioServiceLog");
        TreeItem ie = new TreeItem("Internet Explorer");
        TreeItem keyManage = new TreeItem("KeyManagement Service");
        TreeItem office = new TreeItem("Microsoft Office Alerts");
        TreeItem pre = new TreeItem("PreEmptive");
        TreeItem powersh = new TreeItem("Windows Powershell");
        
        apps.add(aesm);
        apps.add(hardware);
        apps.add(audio);
        apps.add(ie);
        apps.add(keyManage);
        apps.add(office);
        apps.add(pre);
        apps.add(powersh);
         
        return apps;
    }   
}