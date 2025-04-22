package com.boggy.forceServerList.manager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayerManager {

    List<String> playerIPs = new ArrayList<>();

    public boolean isAddedToServerList(String address) {
        return playerIPs.contains(address);
    }

    public void addAddress(String address) {
        playerIPs.add(address);
    }

}
