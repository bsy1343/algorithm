# [Gold IV] Empty Stalls - 9567

[문제 링크](https://www.acmicpc.net/problem/9567)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 138, 정답: 77, 맞힌 사람: 63, 정답 비율: 52.500%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Farmer John&apos;s new barn consists of a huge circle of N stalls (2 &lt;= N &lt;= 3,000,000), numbered 0..N-1, with stall N-1 being adjacent to stall 0.</p><p>At the end of each day, FJ&apos;s cows arrive back at the barn one by one, each with a preferred stall they would like to occupy.  However, if a cow&apos;s preferred stall is already occupied by another cow, she scans forward sequentially from this stall until she finds the first unoccupied stall, which she then claims.  If she scans past stall N-1, she continues scanning from stall 0.</p><p>Given the preferred stall of each cow, please determine the smallest index of a stall that remains unoccupied after all the cows have returned to the barn.  Notice that the answer to this question does not depend on the order in which the cows return to the barn.</p><p>In order to avoid issues with reading huge amounts of input, the input to this problem is specified in a concise format using K lines (1 &lt;= K &lt;= 10,000) each of the form:</p><p>X Y A B</p><p>One of these lines specifies the preferred stall for XY total cows: X cows prefer each of the stalls f(1) .. f(Y), where f(i) = (Ai + B) mod N.  The values of A and B lie in the range 0...1,000,000,000.</p><p>Do not forget the standard memory limit of 64MB for all problems.</p>

### 입력

<ul><li>Line 1: Two space-separated integers: N and K.</li><li>Lines 2..1+K: Each line contains integers X Y A B, interpreted as above.  The total number of cows specified by all these lines will be at most N-1.  Cows can be added to the same stall by several of these lines.</li></ul>

### 출력

<ul><li>Line 1: The minimum index of an unoccupied stall.</li></ul>

### 힌트

<h4>Input Details</h4><p>There are 10 stalls in the barn, numbered 0..9.  The second line of input states that 3 cows prefer stall (2*1+4) mod 10 = 6, and 3 cows prefer stall (2*2+4) mod 10 = 8.  The third line states that 2 cows prefer stall (0*1+1) mod 10 = 1.  Line four specifies that 1 cow prefers stall (1*1+7) mod 10 = 8 (so a total of 4 cows prefer this stall).</p><h4>Output Details</h4><p>All stalls will end up occupied except stall 5.</p>