# [Silver III] Announcements - 24653

[문제 링크](https://www.acmicpc.net/problem/24653)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 137, 정답: 115, 맞힌 사람: 102, 정답 비율: 85.714%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 정렬, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>There are $N$ billboards with announcements near Kyoto University.</p>

<p>The $i$-th billboard appears at day $S_i$. However, at each $T$-th day, all billboards installed before this day are removed. You may assume that, on those days, no new billboards will appear.</p>

<p>Find the minimal number of times you need to visit the university to see each billboard at least once.</p>

### 입력

<p>The first line of input contains one integer $N$ ($1 \le N \le 2 \cdot 10^5$). The second line contains $N$ integers $S_1, S_2, \ldots, S_N$. Here, $S_i$ is the day when the $i$-th billboard appears ($1 \le S_i \le 10^9$). The last line contains one integer $T$ ($2 \le T \le 10^9$, $S_i$ is not divisible by $T$ for any $i$): the interval between successive deletions. This means the billboards are removed on days $T$, $2T$, $3T$, and so on.</p>

### 출력

<p>Print one integer: the minimum number of visits you need to do to see each billboard at least once.</p>

### 힌트

<p>In Example 1, the first two billboards are appearing on days 1 and 2. Then those 2 billboards are removed on day 3. After that, on day 5, the last billboard appears, which is then removed on day 6. So you may visit on day 2 (to see billboards 1 and 2) and on day 5 (to see billboard 3), two times in total.</p>