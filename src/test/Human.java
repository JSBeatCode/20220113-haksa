package test;

import java.io.BufferedReader;
import java.io.IOException;

class Human {
 // �������̽��� ����ų� �߻�Ŭ������ ���� �������.
 String name;
 int age;

 public void setInfo(BufferedReader br) throws IOException {
  System.out.println("name: ");
  name = br.readLine();
  System.out.println("age: ");
  age = Integer.parseInt(br.readLine());
 }

 public void getInfo() {
  System.out.println("name: " + name);
  System.out.println("age: " + age);
 }
}
