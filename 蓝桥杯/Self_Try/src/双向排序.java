import java.util.*;
public class 双向排序 {
    public static class pair{
        int x=0;
        int y=0;
        pair(int a,int b) {
            x=a;
            y=b;
        }
    }
    public static void main(String args[]) {
        int n,m;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        m=scan.nextInt();
        pair[] pairs= new pair[n+1];
        int top=0;
        int item[]=new int[n+1];
//		for(int i=1;i<=n;i++) {
//			item[i]=i;
//		}
        int p,q;
        for(int i=0;i<m;i++) {//记录有效步骤
            p=scan.nextInt();
            q=scan.nextInt();
//			System.out.println("第"+i+"次输入操作: "+"p: "+p+"  q: "+q);
            if(p==1&&top>0) {//top大于0是为了保证第一次操作为 0操作
                while(top>0&&pairs[top].x==1) {//top记录上一个操作
                    //若连续出现相同的操作，取范围大的那个
                    if(pairs[top].y<=q)
                        q=pairs[top].y;
                    --top;//将上一个操作的q赋值给当前的q，并将top移动至上一个操作的上一步
                }
                //若相邻的相同操作的范围小于当前范围，则top更新，舍弃小范围
                while(top>=2&&pairs[top-1].y>=q) {
                    top-=2;//删除一组操作（即0操作和1操作）
                }
                pairs[++top]=new pair(1,q);//top始终停留在要记录操作的前一步
//				System.out.println("top: "+top+"  操作1  x: "+pairs[top].x+"  y: "+pairs[top].y);
            }
            if(p==0){
                while(top>0&&pairs[top].x==0) {
                    if(pairs[top].y>=q)
                        q=pairs[top].y;
                    --top;
                }
                while(top>=2&&pairs[top-1].y<=q)//若不加=，会存两次相同的值
                    top-=2;
                pairs[++top]=new pair(0,q);
//				System.out.println("top:  "+top+"  操作0  x: "+pairs[top].x+"  y: "+pairs[top].y);
            }
        }

        int k=n;
        int l=1,r=n;
        for(int i=1;i<=top;i++) {
            if(pairs[i].x==0) {
                while(l<=r&&pairs[i].y<r)
                    item[r--]=k--;
            }
            if(pairs[i].x==1) {
                while(l<=r&&pairs[i].y>l)
                    item[l++]=k--;
            }
        }
        if(top%2==0) {//为操作1
            while(l<=r)
                item[r--]=k--;
        }
        else {//为操作0
            while(l<=r)
                item[l++]=k--;
        }
        for(int i=1;i<=n;i++) {
            System.out.print(item[i]+" ");
        }
    }
}
