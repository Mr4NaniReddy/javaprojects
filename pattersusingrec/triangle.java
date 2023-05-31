public class triangle {
    public static void main(String[] args) {
        tri1(4,0);
    }

    static void tri(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("* ");
            tri(r, c+1);
        }else{
            System.out.println();
            tri(r-1, 0);

        }
    }

    static void tri1(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            tri1(r, c+1);
            System.out.print("* ");
        }
        else{
            tri1(r-1,0);
            System.out.println();
        }
    }
}
