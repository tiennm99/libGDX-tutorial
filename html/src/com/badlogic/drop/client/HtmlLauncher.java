package com.badlogic.drop.client;

import com.badlogic.drop.Drop;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class HtmlLauncher extends GwtApplication {

  @Override
  public GwtApplicationConfiguration getConfig() {
    // Resizable application, uses available space in browser
//    return new GwtApplicationConfiguration(true);
    // Fixed size application:
     return new GwtApplicationConfiguration(800, 480);
  }

  @Override
  public ApplicationListener createApplicationListener() {
    return new Drop();
  }
}
