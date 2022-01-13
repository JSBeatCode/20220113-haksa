package test;
import java.io.*;


public class HaksaTest {

 Human arr[];
 //human의 클래스의 배열생성. 같은 패키지에 있으면 다른 클래스의 변수 선언이 가능
 int count;

 public HaksaTest() {
  arr = new Human[10];
  //haksatset라는 객체를 생성하면 arr배열을 생성
  count = 0;
  //count 초기화
 }
 // 학사 테스트 생서자로 배열과 카운트 초기화

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
 // 메뉴출력 관련 메서드
 
 public void setTeacher(BufferedReader br) throws IOException{
  
  if(count>=10){
   System.out.println("no more input");
   return;
   //if문의 함수 종료되어 아래 arr[count 어쩌구는 실행이 안됨.
  }
  //유효성검사
  arr[count]=new Teacher();
  arr[count].setInfo(br);
  //arr의 변수는 human arr[]이기 때문에 setinfo 호출이 가능함!?
  //br은 입력받은 수를 가지고 setInfo 매소드에 대입
  count++;
 }
 public void setStudent(BufferedReader br) throws IOException{
  
  if(count>=10){
   System.out.println("no more input");
   return;
  }
  //유효성검사
  arr[count]=new Student();
  arr[count].setInfo(br);
  count++;
 }
 
 
 public void getTeacher(BufferedReader br) throws IOException{
  for(int i=0; i<count; i++){
   if(arr[i] instanceof Teacher) {
    arr[i].getInfo();
   }
   //instanceof 왼쪽이 오른쪽과 관련 있냐없냐 확인 관련있으면 왼쪽 관련자만 실행.
  }
  //i 를 count가 되기 직전까지 증가
 }
 
 public void getStudent(BufferedReader br) throws IOException{
  for(int i=0; i<count; i++){
   if(arr[i] instanceof Student) {
    arr[i].getInfo();
   }
   //instanceof 왼쪽이 오른쪽과 관련 있냐없냐 확인
  }
  //i 를 count가 되기 직전까지 증가
 }
 
 public void allList(BufferedReader br) throws IOException{
  for(int i=0; i<count; i++){
   arr[i].getInfo();
  }
 }

 public static void main(String[] args) throws IOException {

  HaksaTest ht = new HaksaTest();
  //haksatest 객체 생성.
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  while (true) {
   ht.printMenu();
   // 메인에 생성자를 통해 객체를 만들어 기능을 호출

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

