/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package map_operations;
import mapbeans.Adhar;
import mapbeans.Panno;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
public class one_to_one {
    
   public static void main(String args[]){
    SessionFactory sf=
       new Configuration().configure().buildSessionFactory();  
       Session session = sf.openSession();
       Transaction tx = session.beginTransaction();
       Adhar adh=
               new Adhar("Chetan","678686","Male");
       session.save(adh);
       Panno pno = 
               new Panno("9009AX","UBi123",adh);
       session.save(pno);
       tx.commit();
       session.close();
   }
}
