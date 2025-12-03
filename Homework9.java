import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Authentication {
    Scanner sc = new Scanner(System.in);
    Map <String,String> datas = new HashMap<String, String>();
    public void add_user(String id, String pw){
        datas.put(id,pw);
    }
    void verification(){
        String id;
        System.out.println("id와 password를 입력해주세요.");
        System.out.print("id : ");
        id = sc.nextLine().trim();
        verification_id(id);
    }
    void verification_id(String id){
        if(datas.containsKey(id)){
            String pw;
            System.out.print("password : ");
            pw = sc.nextLine().trim();
            verification_pw(id,pw);
        }else{
            System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
            System.out.println();
            verification();
        }
    }
    void verification_pw(String id, String pw){
        if(datas.get(id).equals(pw)){
            System.out.println("id와 비밀번호가 일치합니다.");
        }else{
            System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            System.out.println();
            verification();
        }
    }
}
public class Homework9{
   public static void main(String[] args) {
       Authentication auth = new Authentication();

       try {
           BufferedReader br = new BufferedReader(new FileReader("db.txt"));
           String line = br.readLine();
           String[] data = line.split(" ");
           auth.add_user(data[0], data[1]);
           line = br.readLine();
           data = line.split(" ");
           auth.add_user(data[0], data[1]);
           line = br.readLine();
           data = line.split(" ");
           auth.add_user(data[0], data[1]);
           br.close();
       } catch (Exception e) {
           e.printStackTrace();
       }
       finally {
           auth.verification();
       }
    }
}
