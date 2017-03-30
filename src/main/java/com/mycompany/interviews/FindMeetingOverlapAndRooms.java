package com.mycompany.interviews;

/**
 * Created by Abhik Banerjee
 * on 3/29/17.
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// This class is used to find if there is any overlap between a set of meeting times
// and also how many meeting rooms are needed in order to hold all the meetings

public class FindMeetingOverlapAndRooms
{
    public static void main(String args[])
    {
        List<MeetingTimes> meetings = new ArrayList<MeetingTimes>();

        //Create a series of meetings
        meetings = createMeetings();
        //displayMeetings(meetings);

        //Sort the meeting objects by their starting times
        Collections.sort(meetings, new Comparator<MeetingTimes>()
        {
            public int compare (MeetingTimes m1, MeetingTimes m2)
            {
                return m1.getStartTime().compareTo(m2.getStartTime());
            }
        });
        System.out.println("After sorting ");
        displayMeetings(meetings);

        //Once we have the sorted Meeting objects, we find if their is any overlap
        System.out.println("Is there a Meeting Overlap - " + findMeetingOverlap(meetings));

        //Print Number of meeting rooms needed to have all the meetings
        System.out.println("Minimum Number of Meeting rooms needed to schedule all the meetings - " + minNumMeetingRooms(meetings));

    }

    public static List<MeetingTimes> createMeetings()
    {
        List<MeetingTimes> meetings = new ArrayList<MeetingTimes>();
        MeetingTimes m1 = new MeetingTimes();
        m1.setStartTime(1);
        m1.setEndTIme(4);
        meetings.add(m1);

        MeetingTimes m2 = new MeetingTimes();
        m2.setStartTime(5);
        m2.setEndTIme(6);
        meetings.add(m2);

        MeetingTimes m3 = new MeetingTimes();
        m3.setStartTime(8);
        m3.setEndTIme(9);
        meetings.add(m3);

        MeetingTimes m4 = new MeetingTimes();
        m4.setStartTime(6);
        m4.setEndTIme(7);
        meetings.add(m4);

        // Comment this block out to make the overlap false
        MeetingTimes m5 = new MeetingTimes();
        m5.setStartTime(2);
        m5.setEndTIme(6);
        meetings.add(m5);

        return meetings;
    }

    public static void displayMeetings(List<MeetingTimes> meetings)
    {
        for(MeetingTimes m : meetings)
        {
            System.out.print(m.getStartTime() + " - "+ m.getEndTIme());
            System.out.println();
        }
    }

    public static boolean findMeetingOverlap(List<MeetingTimes> meetings)
    {
        boolean overlap = false;
        for(int i=0;i < meetings.size()-2;i++)
        {
            if(meetings.get(i+1).getStartTime() < meetings.get(i).getEndTIme())
            {
                overlap = true;
                break;
            }
        }
        return overlap;
    }

    public static Integer minNumMeetingRooms(List<MeetingTimes> meetings)
    {
        Integer numMeetingRooms = 0;
        Integer startTimes[] = new Integer[meetings.size()];
        Integer endTimes[] = new Integer[meetings.size()];
        for(int i=0;i<meetings.size();i++)
        {
            startTimes[i] = meetings.get(i).getStartTime();
            endTimes[i] = meetings.get(i).getEndTIme();
        }

        int i=0;
        int j=0;
        int counter = 0;
        int maxRooms = startTimes[0];
        while(i<startTimes.length && j<endTimes.length)
        {
            if(numMeetingRooms>maxRooms)
            {
                maxRooms = numMeetingRooms;
            }
            if(startTimes[i]<endTimes[j])
            {
                numMeetingRooms++;
                i++;
            }
            else
            {
                numMeetingRooms--;
                j++;
            }
        }

        numMeetingRooms = maxRooms;
        return numMeetingRooms;
    }
}
