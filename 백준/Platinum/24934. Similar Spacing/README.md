# [Platinum IV] Similar Spacing - 24934

[문제 링크](https://www.acmicpc.net/problem/24934)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 16, 정답: 9, 맞힌 사람: 8, 정답 비율: 61.538%

### 분류

이분 탐색, 브루트포스 알고리즘, 다이나믹 프로그래밍, 매개 변수 탐색, 누적 합, 두 포인터

### 문제 설명

<p>Finally, your dream of owning a restaurant chain has come true! You have consulted a marketing firm and received instructions on how to best place your restaurants in the city.</p>

<p>The firm has identified potential restaurant sites along a single road, each of which can house a single restaurant. To maximize&nbsp;<i>influencer media impact</i>, you have been advised to build some restaurants along this road and open them all at the same time. Apparently, the best way to attract customers to your chain is to build all of your restaurants with similar spacing along the road; such placement maximizes&nbsp;<i>pedestrian recall coherence</i>, which is all the rage in marketing.</p>

<p>Specifically, if&nbsp;$a$&nbsp;is the maximum distance between any two adjacent restaurants and&nbsp;$b$&nbsp;is the minimum distance between any two adjacent restaurants, place your restaurants such that&nbsp;$a-b$&nbsp;is minimized.</p>

### 입력

<p>The first line of input contains two integers&nbsp;$N$&nbsp;and&nbsp;$K$&nbsp;(with&nbsp;$2&le;N&le;100$&nbsp;and&nbsp;$2&le;K&le;N$) where&nbsp;$N$&nbsp;is the number of potential restaurant sites, and&nbsp;$K$&nbsp;is the number of restaurants to build. The second line of input contains&nbsp;$N-1$&nbsp;integers&nbsp;$d_1,\dots ,d_{N-1}$ (with&nbsp;$0&le;d_i&lt;2^{31}$) where&nbsp;$d_i$&nbsp;is the distance between restaurant site&nbsp;$i$&nbsp;and&nbsp;$i+1$.</p>

### 출력

<p>Display the number&nbsp;$a-b$.</p>

### 힌트

<p>In Sample Input 2, an optimal solution could place restaurants at sites&nbsp;$1$,&nbsp;$3$,&nbsp;$5$, and&nbsp;$6$. With this placement the distances between adjacent restaurants are&nbsp;$d_1+d_2$,&nbsp;$d_3+d_4$, and&nbsp;$d_5$, respectively. So,&nbsp;$a=10$&nbsp;(the maximum of these),&nbsp;$b=8$&nbsp;(the minimum), and&nbsp;$a-b=2$.</p>

<p>In Sample Input 3, an optimal solution could place restaurants at sites&nbsp;$3$,&nbsp;$4$,&nbsp;$6$,&nbsp;$7$, and&nbsp;$8$. With this placement the distances between adjacent restaurants are&nbsp;$d_3$,&nbsp;$d_4+d_5$,&nbsp;$d_6$, and&nbsp;$d_7$, respectively. So,&nbsp;$a=32$,&nbsp;$b=18$, and&nbsp;$a-b=14$.</p>