package com.cursee.monolib;

import net.fabricmc.api.ClientModInitializer;

public class MoreBowsAndArrowsClientFabric implements ClientModInitializer {

  @Override
  public void onInitializeClient() {

    MoreBowsAndArrowsClient.init();
  }
}
