import java.util.*; 
 
public class sort1 
{ 
    public static void main(String[] args) 
    { 
        List<int[]> frame = new ArrayList<>(); 
        System.out.println("Enter no. of frames:"); 
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt(); 
 
        for (int i = 0; i < n; i++) 
        { 
            Random random = new Random(); 
            int seqNum = random.nextInt(1000) + 1; 
            System.out.printf("Enter data for %dth frame>>", i + 1); 
            int data = sc.nextInt(); 
            frame.add(new int[]{seqNum, data}); 
        } 
 
        System.out.println("\n\nBefore Sorting>>"); 
        for (int[] i : frame) 
        { 
            System.out.printf("seqNum->%d, Data->%d\n", i[0], i[1]); 
        } 
 
        frame = sortFrame(frame); 
 
        System.out.println("\n\n After sorting>>"); 
        for (int[] i : frame) 
        { 
            System.out.printf("seqNum->%d, Data->%d\n", i[0], i[1]); 
        } 
    } 
    public static List<int[]> sortFrame(List<int[]> frame) 
    { 
        Collections.sort(frame, (a, b) -> Integer.compare(a[0], b[0])); 
        return frame; 
    } 
}