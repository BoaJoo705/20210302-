package day0312;

// ArrayUtil의 메소드를 실습해 보는 클래스
import util.ArrayUtil;

public class Ex02ArrayUtil {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };

        
        // 1. size() 배열의 크기
        System.out.println("ArrayUtil.size(arr): " + ArrayUtil.size(arr));
        System.out.println();

        // 2. contains() 값이 배열에 존재하니? 하면 true 안하면 false
        System.out.println("ArrayUtil.contains(arr,3): " + ArrayUtil.contains(arr, 3));
        System.out.println("ArrayUtil.contains(arr,30): " + ArrayUtil.contains(arr, 30));
        System.out.println();
        
        

        // 3. indexof() 값이 배열에 존재하면 처음부터 몇번째 칸에 존재하는지 알려줌
        System.out.println("ArrayUtil.indexof(arr,4): " + ArrayUtil.indexof(arr, 4));
        System.out.println("ArrayUtil.indexof(arr,40): " + ArrayUtil.indexof(arr, 40));
        System.out.println();

        // 4. lastIndexof() 값이 배열에 존재하면 마지막부터 몇번째 칸에 존재하는지 알려줌
        System.out.println("ArrayUtil.lastIndexOf(arr,4): " + ArrayUtil.lastIndexOf(arr, 4));
        System.out.println("ArrayUtil.lastIndexOf(arr,40): " + ArrayUtil.lastIndexOf(arr, 40));
        System.out.println();

        // 5. add()
        arr = new int[0];
        System.out.println("ArrayUtil.size(arr): " + ArrayUtil.size(arr));
        arr = ArrayUtil.add(arr, 11);
        System.out.println("ArrayUtil.size(arr): " + ArrayUtil.size(arr));
        System.out.println();

        // 6. add(index)
        System.out.println("arr[0]: " + arr[0]);
        arr = ArrayUtil.add(arr, 0, 10);
        System.out.println("arr[0]: " + arr[0]);

        System.out.println("arr[1]: " + arr[1]);
        arr = ArrayUtil.add(arr, 1, 232);
        System.out.println("arr[1]: " + arr[1]);
        arr = ArrayUtil.add(arr, 1, 777);
        System.out.println("arr[1]: " + arr[1]);
        System.out.println();

        // 불가능한 인덱스에 추가하려는 경우
        System.out.println("ArrayUtil.size(arr): " + ArrayUtil.size(arr));
        arr = ArrayUtil.add(arr, -3, 100);
        System.out.println("ArrayUtil.size(arr): " + ArrayUtil.size(arr));
        arr = ArrayUtil.add(arr, 100, -3);
        System.out.println("ArrayUtil.size(arr): " + ArrayUtil.size(arr));
        System.out.println();

        // 7. removeByIndex()
        System.out.println("ArrayUtil.size(arr): " + ArrayUtil.size(arr));
        System.out.println("arr[0]; " + arr[0]);
        arr = ArrayUtil.removeByIndex(arr, 0);
        System.out.println("ArrayUtil.size(arr): " + ArrayUtil.size(arr));
        System.out.println("arr[0]; " + arr[0]);
        System.out.println();

        // 불가능한 인덱스를 제거해보자
        System.out.println("ArrayUtil.size(arr): " + ArrayUtil.size(arr));
        arr = ArrayUtil.removeByIndex(arr, -1);
        System.out.println("ArrayUtil.size(arr): " + ArrayUtil.size(arr));

        System.out.println("ArrayUtil.size(arr): " + ArrayUtil.size(arr));
        arr = ArrayUtil.removeByIndex(arr, 150);
        System.out.println("ArrayUtil.size(arr): " + ArrayUtil.size(arr));

        
        String[] arr2= new String[0];
        arr2=ArrayUtil.add(arr2, "abc");
        arr2=ArrayUtil.add(arr2,0, "bcd");
        System.out.println(ArrayUtil.size(arr2));
        
        arr2=ArrayUtil.add(arr2, "1");
        arr2=ArrayUtil.add(arr2, "2");
        arr2=ArrayUtil.add(arr2, "3");
        
        System.out.println(arr2[0]);
        arr2=ArrayUtil.removeByIndex(arr2, 0);
        System.out.println(arr2[0]);
        
        System.out.println("ArrayUtil.indexOf(arr2, \"1\"): "+ArrayUtil.indexOf(arr2,"1"));
        arr2=ArrayUtil.removeByElement(arr2, "1");
        System.out.println("ArrayUtil.indexOf(arr2, \"1\"): "+ArrayUtil.indexOf(arr2, "1"));
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
