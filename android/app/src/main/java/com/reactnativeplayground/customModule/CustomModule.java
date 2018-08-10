package com.reactnativeplayground.customModule;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class CustomModule extends ReactContextBaseJavaModule {
   // constructor
   public CustomModule(ReactApplicationContext reactContext) {
       super(reactContext);
   }
   // Mandatory function getName that specifies the module name
   // NativeModules.CustomModule.getDeviceName()
   @Override
   public String getName() {
       return "CustomModule";
   }
   // Custom function that we are going to export to JS
   @ReactMethod
   public void getDeviceName(Callback cb) {
       try{
           cb.invoke(null, android.os.Build.MODEL);
       }catch (Exception e){
           cb.invoke(e.toString(), null);
       }
   }
}