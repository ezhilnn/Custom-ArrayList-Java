public class CustomArrayList {
    private int[] data;
    int Default_size=1;
    int size=0;
    public CustomArrayList(){
    this.data=new int[Default_size];
    }
    public void add(int ele){
        if(isFull()){
            resize();
        }
        data[size++]=ele;
    }

    private void resize() {
        int[] temp=new int[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;

    }

    private boolean isFull() {
        return size== data.length;
    }
    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        CustomArrayList l=new CustomArrayList();
        l.add(2);
        l.add(3);
        l.show();
    }
}