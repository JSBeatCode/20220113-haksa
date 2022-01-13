package test;

import java.io.BufferedReader;
import java.io.IOException;

public class Teacher extends Human {
 String text;

 @Override
 public void setInfo(BufferedReader br) throws IOException {

  System.out.println("==teacher info input==");
  super.setInfo(br);
  // 내 부모가 가지고 있는 것을 가리키는 것으로 super 처리.
  System.out.println("major: ");
  text = br.readLine();

 }

 @Override
 public void getInfo() {

  System.out.println("==teacher info==");
  super.getInfo();
  System.out.println("major: " + text);
 }
}
