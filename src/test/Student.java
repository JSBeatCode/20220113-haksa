package test;

import java.io.BufferedReader;
import java.io.IOException;

public class Student extends Human {
 String major;

 @Override
 public void setInfo(BufferedReader br) throws IOException {
  System.out.println("==students info input==");
  super.setInfo(br);
  System.out.println("major: ");
  major = br.readLine();
 }

 @Override
 public void getInfo() {

  System.out.println("==students info==");
  super.getInfo();
  System.out.println("major: " + major);
 }
}