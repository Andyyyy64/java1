import java.util.*;

public class GasStation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        List<Queue<Integer>> lanes = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            lanes.add(new LinkedList<>());
        }

        for (int i = 0; i < M; i++) {
            int infoType = sc.nextInt();

            if (infoType == 1) {
                int carNumber = sc.nextInt();
                int minQueueIndex = 0;
                int minQueueSize = lanes.get(0).size();

                for (int j = 1; j < N; j++) {
                    int currentQueueSize = lanes.get(j).size();
                    if (currentQueueSize < minQueueSize) {
                        minQueueSize = currentQueueSize;
                        minQueueIndex = j;
                    }
                }

                lanes.get(minQueueIndex).add(carNumber);
            } else {
                int laneNumber = sc.nextInt() - 1;
                int carNumber = lanes.get(laneNumber).poll();
                System.out.println(carNumber);
            }
        }
    }
}
