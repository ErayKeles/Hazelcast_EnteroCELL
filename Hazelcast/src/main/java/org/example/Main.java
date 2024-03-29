package org.example;

import org.example.hazelcast_operations.HazelcastDGWOperation;
import org.example.hazelcast_operations.HazelcastMWOperation;
import org.example.hazelcast_operations.HazelcastSimulatorOperation;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        //--Get Operation
        //  String result = HazelcastDGWOperation.getPartitionIdByKey("deneme1");
        //  System.out.println(result);

        // --Get Operation
        Collection<Object> all = HazelcastSimulatorOperation.getAllPartitionId();
        System.out.println(all);

        // --Put Operation
        // String result = HazelcastMWOperation.put("deneme1", "eray");
        // System.out.println(result);

        // --Remove Operation
        // String result = HazelcastMWOperation.remove("deneme1");
        //  System.out.println(result);


    }
}