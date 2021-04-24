/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

/**
 *
 * @author RSM
 */
public class Reception {
 
   private IHospital Medical;
   private IHospital xray;
   private IHospital OPD;
   private IHospital Laboratory;
   
   
   public Reception()
   {
       Medical = new Medical();
       xray = new Xray();
       OPD = new OPD();
       Laboratory = new Laboratory();
   }
   
   public String getMedical()
   {
       String mDept = Medical.setDepartment();
       return mDept;
   }
   
   public String getxray()
   {
       String mDept = xray.setDepartment();
       return mDept;
   }
   
   public String getOPD()
   {
       String mDept = OPD.setDepartment();
       return mDept;
   }
   
   public String getLaboratory()
   {
       String mDept = Laboratory.setDepartment();
       return mDept;
   }
}
