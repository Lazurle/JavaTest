import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
  public static final int LOOP_NUM = 1000;//繰り返す回数
  public static final int BR = 6;//改行判定

  public static void main(String args[]){
    String str ="";//文字列を一時保管する。
    int strNum = 0;//改行を入れる行の判定で使う。
    ArrayList<String> mainList = new ArrayList<String>();
    ArrayList<String> list = new ArrayList<String>();
    list.add("　");
    list.add("グ");
    list.add("ロ");
    list.add("ー");
    list.add("バ");
    list.add("ル");
    list.add("ラ");
    list.add("ー");
    list.add("ニ");
    list.add("ン");
    list.add("グ");
    list.add("コ");
    list.add("モ");
    list.add("ン");
    list.add("ズ");
    try {
      ProcessBuilder pb = new ProcessBuilder("notepad.exe", "GLC.txt");
      pb.start();//notepad起動
    } catch (Exception e){
      e.printStackTrace();
    }
    mainList.add("＿人人人人人人人人人人人人人人＿[BR]＞　芝浦工業大学　グローバル　＜[BR]＞　　ラーニングコモンズ　　　＜[BR]￣Y^Y^Y^Y^Y^Y^Y^Y^Y^Y^Y^Y￣");

    while(mainList.size() < LOOP_NUM){//5000回ループを繰り返す
      Collections.shuffle(list);
      str = "＿人人人人人人人人人人人人人人＿[BR]＞　芝浦工業大学";

      for(String s : list){
        str = str + s;
        strNum++;
        if(strNum == BR){
          str = str + "　＜[BR]＞　　";
        }
      }

      str = str + "　　　＜[BR]￣Y^Y^Y^Y^Y^Y^Y^Y^Y^Y^Y^Y￣";
      //ここまでで文字列の1回の作成終わり。
      if(!hasStr(str, mainList)){
        mainList.add(str);
      }
      strNum = 0;//初期化
      str = "";//文字列初期化
    }//処理の終了
    //printList(mainList);
    Iterator iterator = mainList.iterator();
    int i = 0;
    try {
      FileWriter fw = new FileWriter("GLC.txt");
      BufferedWriter bw = new BufferedWriter(fw);
      while(iterator.hasNext()){
        bw.write((String)iterator.next());
        bw.newLine();
        i++;
        if (i % 100 == 0){//100行目で改行
          bw.newLine();
        }
      }
      bw.close();
    } catch (IOException e){
      e.printStackTrace();
    }

  }
  //追加関数：重複がないか確認する関数。重複があればtrueを返す。
  //重複がないかの確認、重複がなければmainList<String>に追加する。
  public static Boolean hasStr(String str, ArrayList<String> list2){
    Iterator iterator = list2.iterator();
    try{
      while(iterator.hasNext()){
        String str2 = (String)iterator.next();
        if(str.equals(str2)){
          return true;
        }
      }
      return false;
    } catch (NullPointerException e){
      e.printStackTrace();
      return false;
    }
  }
  public static void printList(ArrayList<String> list2){
    Iterator iterator = list2.iterator();
    try{
      while(iterator.hasNext()){
        System.out.println((String)iterator.next());
      }
    } catch (NullPointerException e){
      e.printStackTrace();
    }
  }
}
