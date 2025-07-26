public class BinarySearch {

    public static int binary(int target){
        int []arr ={3,4,5,6,2,1,0};
        int start=0;
        int n=arr.length;
        int end=n-1;
        while(start<=end){
            int mid=start + (end-start)/2;
            if(arr[mid]<target){
                start=end;
            } else if (arr[mid]>target) {
                end=start;
            }else{
                return mid;
        }
        }
        return -1;
    }
    public static void main(String []args){
        int target=5;
        int ans= binary(5);
        System.out.println(ans);
        }
    }
