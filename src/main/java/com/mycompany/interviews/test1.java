/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interviews;

import java.util.*;
import java.io.*;

/**
 *
 * @author abhikbanerjee12
 */
public class test1 {

  public static void main(String args[]){
//    int n=20;
//    for(int i = 0;i<n;n--){
//      System.out.println(n);
//      System.out.println(i);
//    }

//      getCommonATGCounts();

      StringBuilder s = new StringBuilder();
      String l = s.append("a").append("dkl").reverse().toString();
      System.out.println(l);

  }

    public static void getCommonATGCounts()
    {
        String loggedUsersfilePath = "/Users/tkmacl9/Downloads/Logged_In_das_profile_id_webstore.csv";
        String allUsersfilePath = "/Users/tkmacl9/Downloads/All_IDS_PID_April3_text";
        HashSet<String> loggedUsers = readLoggedInAtgs(loggedUsersfilePath);

        HashSet<String> allUsers = readLoggedInAtgs(allUsersfilePath);

        System.out.println("Logged In Ids are - "+ loggedUsers.size());

        System.out.println("All User Ids are - "+ allUsers.size());

        findCommonIds(loggedUsers, allUsers);
    }

    public static HashSet<String> readLoggedInAtgs(String filePath)
    {
        HashSet<String> ids = new HashSet<String>();
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(filePath);
            br = new BufferedReader(fr);
            String s = null;
            while((s=br.readLine())!=null)
            {
                ids.add(s.trim());
            }

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            try {
                br.close();
                fr.close();
            }catch (Exception e)
            {

            }

        }
        return ids;
    }

    public static void findCommonIds(HashSet<String> logged, HashSet<String> all)
    {
        HashSet<String> common = new HashSet<String>();
        for(String s: logged)
        {
            if(all.contains(s.trim()))
            {
                common.add(s.trim());
            }
        }
        System.out.println("Common Ids are - "+ common.size());
    }
  
}
