package test;

import java.io.BufferedReader;
import java.io.IOException;

public class Teacher extends Human {
 String text;

 @Override
 public void setInfo(BufferedReader br) throws IOException {

  System.out.println("==teacher info input==");
  super.setInfo(br);
  // �� �θ� ������ �ִ� ���� ����Ű�� ������ super ó��.
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
