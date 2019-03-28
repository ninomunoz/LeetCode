package com.ninomunoz.Problems;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 933. Number of Recent Calls
 *
 * Write a class RecentCounter to count recent requests.
 *
 * It has only one method: ping(int t), where t represents some time in milliseconds.
 *
 * Return the number of pings that have been made from 3000 milliseconds ago until now.
 *
 * Any ping with time in [t - 3000, t] will count, including the current ping.
 *
 * It is guaranteed that every call to ping uses a strictly larger value of t than before.
 */

public class NumberOfRecentCalls {

    public static void main(String[] args) {
        RecentCounter counter = new RecentCounter();
        System.out.println(counter.ping(1));
        System.out.println(counter.ping(100));
        System.out.println(counter.ping(3001));
        System.out.println(counter.ping(3002));
    }
}

class RecentCounter {

    Queue<Integer> pings;

    RecentCounter() {
        pings = new LinkedList<>();
    }

    /*
        Time Complexity: O(n)
        Space Complexity: O(1)
     */
    int ping(int t) {
        pings.offer(t);
        while (pings.peek() < t - 3000) pings.poll();
        return pings.size();
    }
}