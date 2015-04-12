package com.ownedthx.xmldoclet;

public class TestThroughJavadoc {

   public static void main( String[] args ) {
      com.sun.tools.javadoc.Main.execute( new String[]{
            "-doclet",
            App.class.getName(),
            //            "-d",
            //            "bin/maven/generated-resources",
            "src/test/java/com/ownedthx/xmldoclet/sampledoc/Class2.java",
      } );
   }

}
