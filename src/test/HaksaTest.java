package test;
import java.io.*;


public class HaksaTest {

 Human arr[];
 //human�� Ŭ������ �迭����. ���� ��Ű���� ������ �ٸ� Ŭ������ ���� ������ ����
 int count;

 public HaksaTest() {
  arr = new Human[10];
  //haksatset��� ��ü�� �����ϸ� arr�迭�� ����
  count = 0;
  //count �ʱ�ȭ
 }
 // �л� �׽�Ʈ �����ڷ� �迭�� ī��Ʈ �ʱ�ȭ

 public void printMenu() {
  System.out.println("===college management===");
  System.out.println("1. teachers input");
  System.out.println("2. students input");
  System.out.println("3. teachers info");
  System.out.println("4. students info");
  System.out.println("5. all info");
  System.out.println("6. exit");
  System.out.println("----------------------");
 }
 // �޴���� ���� �޼���
 
 public void setTeacher(BufferedReader br) throws IOException{
  
  if(count>=10){
   System.out.println("no more input");
   return;
   //if���� �Լ� ����Ǿ� �Ʒ� arr[count ��¼���� ������ �ȵ�.
  }
  //��ȿ���˻�
  arr[count]=new Teacher();
  arr[count].setInfo(br);
  //arr�� ������ human arr[]�̱� ������ setinfo ȣ���� ������!?
  //br�� �Է¹��� ���� ������ setInfo �żҵ忡 ����
  count++;
 }
 public void setStudent(BufferedReader br) throws IOException{
  
  if(count>=10){
   System.out.println("no more input");
   return;
  }
  //��ȿ���˻�
  arr[count]=new Student();
  arr[count].setInfo(br);
  count++;
 }
 
 
 public void getTeacher(BufferedReader br) throws IOException{
  for(int i=0; i<count; i++){
   if(arr[i] instanceof Teacher) {
    arr[i].getInfo();
   }
   //instanceof ������ �����ʰ� ���� �ֳľ��� Ȯ�� ���������� ���� �����ڸ� ����.
  }
  //i �� count�� �Ǳ� �������� ����
 }
 
 public void getStudent(BufferedReader br) throws IOException{
  for(int i=0; i<count; i++){
   if(arr[i] instanceof Student) {
    arr[i].getInfo();
   }
   //instanceof ������ �����ʰ� ���� �ֳľ��� Ȯ��
  }
  //i �� count�� �Ǳ� �������� ����
 }
 
 public void allList(BufferedReader br) throws IOException{
  for(int i=0; i<count; i++){
   arr[i].getInfo();
  }
 }

 public static void main(String[] args) throws IOException {

  HaksaTest ht = new HaksaTest();
  //haksatest ��ü ����.
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  while (true) {
   ht.printMenu();
   // ���ο� �����ڸ� ���� ��ü�� ����� ����� ȣ��

   System.out.println("menu> ");
   int menu = Integer.parseInt(br.readLine());

   switch (menu) {
   case 1:
    ht.setTeacher(br);
    break;
   case 2:
    ht.setStudent(br);
    break;
   case 3:
    ht.getTeacher(br);
    break;
   case 4:
    ht.getStudent(br);
    break;
   case 5:
    ht.allList(br);
    break;
   case 6:
    System.exit(0);
    break;
   default:
    System.out.println("wrong choose");
   }
  }
 }
}

