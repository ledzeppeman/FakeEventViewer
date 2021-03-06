package itemPopulation;

import java.util.ArrayList;

import javafx.scene.Node;
import javafx.scene.control.TreeItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
 
public class LeftTreeHelper
{
	private Node adminEventsIcon =  new ImageView(new Image(getClass().getResourceAsStream("/imageAssets/icon2a.png")));
	
	private Node iconFolder  =  new ImageView(new Image(getClass().getResourceAsStream("/imageAssets/iconFolder1.png")));
	private Node iconFolder2 =  new ImageView(new Image(getClass().getResourceAsStream("/imageAssets/iconFolder2.png")));
	private Node iconFolder3 =  new ImageView(new Image(getClass().getResourceAsStream("/imageAssets/iconFolder3.png")));

	private Node iconPlain  =  new ImageView(new Image(getClass().getResourceAsStream("/imageAssets/iconPlain.png")));
	private Node iconPlain2 =  new ImageView(new Image(getClass().getResourceAsStream("/imageAssets/iconPlain.png")));
	
	private Node iconWarn   =  new ImageView(new Image(getClass().getResourceAsStream("/imageAssets/iconWarn1.png")));
	private Node iconWarn2  =  new ImageView(new Image(getClass().getResourceAsStream("/imageAssets/iconWarn2.png")));
	private Node iconWarn3  =  new ImageView(new Image(getClass().getResourceAsStream("/imageAssets/iconWarn3.png")));
	private Node iconWarn4  =  new ImageView(new Image(getClass().getResourceAsStream("/imageAssets/iconWarn4.png")));
	private Node iconWarn5  =  new ImageView(new Image(getClass().getResourceAsStream("/imageAssets/iconWarn5.png")));
	private Node iconWarn6  =  new ImageView(new Image(getClass().getResourceAsStream("/imageAssets/iconWarn6.png")));
	private Node iconWarn7  =  new ImageView(new Image(getClass().getResourceAsStream("/imageAssets/iconWarn7.png")));
	private Node iconWarn8  =  new ImageView(new Image(getClass().getResourceAsStream("/imageAssets/iconWarn8.png")));
	private Node iconWarn9  =  new ImageView(new Image(getClass().getResourceAsStream("/imageAssets/iconWarn9.png")));
	private Node iconWarn10 =  new ImageView(new Image(getClass().getResourceAsStream("/imageAssets/iconWarn10.png")));
	
	private Node rootIcon2 =  new ImageView(new Image(getClass().getResourceAsStream("/imageAssets/notSelected1.png")));
	private Node rootIcon3 =  new ImageView(new Image(getClass().getResourceAsStream("/imageAssets/notSelected2.png")));
	private Node rootIcon4 =  new ImageView(new Image(getClass().getResourceAsStream("/imageAssets/notSelected3.png")));
	private Node rootIcon5 =  new ImageView(new Image(getClass().getResourceAsStream("/imageAssets/notSelected4.png")));
	
    public LeftTreeHelper(){}
     
    public ArrayList<TreeItem> leftTreeFill()
    {
        ArrayList<TreeItem> options = new ArrayList<TreeItem>();
         
        TreeItem custView = new TreeItem("Custom Views", rootIcon2);
        custView.getChildren().addAll(getCustViews());
         
        TreeItem winLogs = new TreeItem("Windows Logs", rootIcon3);
        winLogs.getChildren().addAll(getWinLogs());
 
        TreeItem apps = new TreeItem("Applications and Service Logs", rootIcon4);
        apps.getChildren().addAll(getApps());
         
        TreeItem subs = new TreeItem("Subscriptions", rootIcon5);        
        
        options.add(custView);
        options.add(winLogs);
        options.add(apps);
        options.add(subs);
          
        return options;
    }
 
    private ArrayList<TreeItem> getCustViews()
    {
        ArrayList<TreeItem> custView = new ArrayList<TreeItem>();
        TreeItem adminEvents = new TreeItem("Administrative Events", adminEventsIcon);
        
        custView.add(adminEvents);      
        return custView;        
    }
 
    private ArrayList<TreeItem> getWinLogs()
    {
        ArrayList<TreeItem> winLogs = new ArrayList<TreeItem>();
         
        TreeItem app = new TreeItem("Application", iconWarn);
        TreeItem sec = new TreeItem("Security", iconWarn2);
        TreeItem setup = new TreeItem("Setup", iconPlain);
        TreeItem system = new TreeItem("System", iconWarn3);
        TreeItem forwardedEvents = new TreeItem("Forwarded Events", iconPlain2);
        
        winLogs.add(app);
        winLogs.add(sec);
        winLogs.add(setup);
        winLogs.add(system);
        winLogs.add(forwardedEvents);
         
        return winLogs;       
    }
     
    private ArrayList<TreeItem> getApps()
    {
        ArrayList<TreeItem> apps = new ArrayList<TreeItem>();
         
        TreeItem aesm = new TreeItem("AESMService", iconFolder);
        TreeItem hardware = new TreeItem("Hardware Events", iconWarn4);
        TreeItem audio = new TreeItem("IntelAudioServiceLog", iconWarn5);
        TreeItem ie = new TreeItem("Internet Explorer", iconWarn6);
        TreeItem keyManage = new TreeItem("Key Management Service", iconWarn7);
        TreeItem microsoft = new TreeItem("Microsoft", iconFolder2);
        TreeItem office = new TreeItem("Microsoft Office Alerts", iconWarn8);
        TreeItem openSSH = new TreeItem("OpenSSH", iconFolder3);
        TreeItem pre = new TreeItem("PreEmptive", iconWarn9);
        TreeItem powersh = new TreeItem("Windows Powershell", iconWarn10);
        
        apps.add(aesm);
        apps.add(hardware);
        apps.add(audio);
        apps.add(ie);
        apps.add(keyManage);
        apps.add(microsoft);
        apps.add(office);
        apps.add(openSSH);
        apps.add(pre);
        apps.add(powersh);
         
        return apps;
    }   
}