# [Silver V] Trip Odometer - 24936

[문제 링크](https://www.acmicpc.net/problem/24936)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 156, 정답: 119, 맞힌 사람: 104, 정답 비율: 77.612%

### 분류

수학, 자료 구조, 정렬, 집합과 맵, 사칙연산, 해시를 사용한 집합과 맵

### 문제 설명

<p>A trip odometer can be used to record the distance driven on a single trip. You are very diligent: at the start of each trip you reset the trip odometer to read&nbsp;$0$&nbsp;and at the end of each trip you write down the distance travelled.</p>

<p>Thus, you maintain a list of distances (in kilometers) taken by all trips. Unfortunately, exactly one number from this list is spurious; you mistakenly recorded the length of one trip you took in another vehicle. You also forget which entry in your list corresponds to this trip.</p>

<p>You want to know all possible total distances that you could have taken in your own vehicle given that one of the written distances was fake. More specifically, all values&nbsp;$D$&nbsp;such that it is possible to remove one trip from your list and have the remaining distances sum to&nbsp;$D$.</p>

### 입력

<p>The first line of input contains a single integer&nbsp;$N$&nbsp;($2&le;N&le;10^5$), the number of distances you wrote down. The second line of input consists of&nbsp;$N$&nbsp;integers&nbsp;$d_1,d_2, \dots ,d_N$&nbsp;($1&le;d_i&le;10^4$), where&nbsp;$d_i$&nbsp;is the length of the&nbsp;$i$th trip you recorded.</p>

### 출력

<p>Display two lines. The first line should contain a single number&nbsp;$K$, which is the number of possible distinct distances that could be obtained. The second line should contain the list of the&nbsp;$K$&nbsp;distinct integers, each of which is a possible sum that can be obtained by removing exactly one of the written distances. The list should be displayed in ascending order.</p>