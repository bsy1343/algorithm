package src.mincoding.DAT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 사원출입관리시스템 {

    // 항상 PS에서 꼭 넣고 시작하는 코드
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st; // <- 특정 기준을 통해 문자열을 자르는 역할

    // 사번을 통해 가입된 정보(이름) 등록
    // index : 사번, value : 이름
    static String reg_data[] = new String[10000];

    static void Reg() {
        int num = Integer.parseInt( st.nextToken() );
        String name = st.nextToken();
        if(!(reg_data[num] == null))
        {
            // 가입됐던 사번
            System.out.println(num + " ERROR");
            return;
        }
        reg_data[num] = name;
        System.out.println(num + " OK");
    }
    static int enter[] = new int[10000];
    // index : 사번, value : 입장을 했는가? 1,  안했는가? 0
    static void Enter() {
        int num = Integer.parseInt(st.nextToken());
        // 가입이 안된 사번 <- ERROR
        if(reg_data[num] == null)
        {
            System.out.println(num + " ERROR");
            return;
        }

        // 가입은 완료됐던 사번
        // 가입이 됐고, 입장도 한 경우 <- EXIT
        if(enter[num] == 1)
        {
            System.out.println(num + " " + reg_data[num] + " EXIT");
            enter[num] = 0; // 나갔다고 기록
        }
        // 가입이 됐는데, 입장을 안한 경우 <- ENTER
        else if(enter[num] == 0)
        {
            System.out.println(num + " " + reg_data[num] + " ENTER");
            enter[num] = 1; // 입장했다고 기록
        }
    }
    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        int n = Integer.parseInt( br.readLine() );
        for(int i = 0; i < n; i++)
        {
            st = new StringTokenizer(br.readLine());
            int oper = Integer.parseInt(st.nextToken());
            if(oper == 1){
                Reg();
            }
            else if(oper == 2) {
                Enter();
            }
        }
    }
}