package test;

import java.io.BufferedReader;
import java.io.IOException;

class Human {
 // 인터페이스로 만들거나 추상클래스로 만들어도 상관없음.
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
