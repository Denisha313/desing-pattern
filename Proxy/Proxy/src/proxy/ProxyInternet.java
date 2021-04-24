/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author st
 */
public class ProxyInternet implements IInternet{

    private IInternet i = new RealInternet();
    private static List<String> bannedsite;
    
    static{
        bannedsite = new ArrayList<String>();
        bannedsite.add("google.in");
        bannedsite.add("gujratuniversity.com");
        bannedsite.add("gujratvidyapith.com");
        bannedsite.add("bknmu.org");
    }
    
    @Override
    public void connect(String server) throws Exception{
        if(bannedsite.contains(server.toLowerCase()))
        {
            throw new  Exception("\nAccese Denied...");
        }
        i.connect(server);
    }
    
}
