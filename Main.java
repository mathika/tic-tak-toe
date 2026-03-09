import java.util.*;
class Game{
    int [][] a;
    Game(int [][]a){
        this.a=a;
    }
    void one(String s){
        char [] w=s.toCharArray();
        a[w[0]-'0'][w[1]-'0']=1;
        
    }
    void zero(String f){
         char [] w=f.toCharArray();
        a[w[0]-'0'][w[1]-'0']=2;
    }
    boolean checkone(){
        if(a[0][0]==1 &&a[0][1]==1 && a[0][2]==1 || 
          a[0][0]==1 &&a[1][0]==1&&a[2][0]==1 ||
           a[0][2]==1&&a[1][2]==1&&a[2][2]==1 ||
           a[1][0]==1&&a[1][1]==1&& a[1][2]==1||
           a[0][1]==1&&a[1][1]==1&& a[2][1]==1||
           a[2][0]==1&&a[2][1]==1&& a[2][2]==1 ||
           a[0][0]==1&&a[1][1]==1&& a[2][2]==1 ||
           a[2][0]==1&&a[1][1]==1&& a[0][2]==1){
               return true;
           }
           return false;
    }
    boolean checkzero(){
        if(a[0][0]==2 &&a[0][1]==2 && a[0][2]==2 || 
          a[0][0]==2 &&a[1][0]==2&&a[2][0]==2 ||
           a[0][2]==2&&a[1][2]==2&&a[2][2]==2 ||
           a[1][0]==2&&a[1][1]==2&& a[1][2]==2||
           a[0][1]==2&&a[1][1]==2&& a[2][1]==2||
           a[2][0]==2&&a[2][1]==2&& a[2][2]==2 ||
           a[0][0]==2&&a[1][1]==2&& a[2][2]==2 ||
           a[2][0]==2&&a[1][1]==2&& a[0][2]==2){
               return true;
              
           }
           return false;
    }
    void display(){
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
}
    
}
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int [][] a=new int [3][3];
        Game g1=new Game(a);
        int k=9;
        while(k>0){
            System.out.println("Enter the input place");
            g1.display();
            String s=sc.nextLine();
            if(s.length()==2){
            g1.one(s);
            k--;
                if(g1.checkone()){
                    System.out.print("player one wins the game");
                    break;
                }
            }
            else{
                System.out.print("not valid position");
            }
            g1.display();
            System.out.println("Enter the input player 2");
            String f=sc.nextLine();
            if(f.length()==2){
            g1.zero(f);
            k--;
            if(g1.checkzero()){
                System.out.print("player one wins the game");
                break;
            }
            }
            else{
                System.out.print("not valid position");
            }
            
        }
    }
}