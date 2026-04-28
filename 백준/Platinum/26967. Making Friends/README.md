# [Platinum I] Making Friends - 26967

[문제 링크](https://www.acmicpc.net/problem/26967)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 130, 정답: 75, 맞힌 사람: 63, 정답 비율: 60.000%

### 분류

자료 구조, 집합과 맵, 해시를 사용한 집합과 맵, 트리를 사용한 집합과 맵, 작은 집합에서 큰 집합으로 합치는 테크닉

### 문제 설명

<p>There are initially $M$ ($1\le M\le 2\cdot 10^5$) pairs of friends among FJ&#39;s $N$ ($2\le N\le 2\cdot 10^5$) cows labeled $1\dots N$. The cows are leaving the farm for vacation one by one. On day $i$, the $i$-th cow leaves the farm, and all pairs of the $i$-th cow&#39;s friends still present on the farm become friends. How many new friendships are formed in total?</p>

### 입력

<p>The first line contains $N$ and $M$.</p>

<p>The next $M$ lines contain two integers $u_i$ and $v_i$ denoting that cows $u_i$ and $v_i$ are friends ($1\le u_i,v_i\le N$, $u_i\neq v_i$). No unordered pair of cows appears more than once.</p>

### 출력

<p>One line containing the total number of new friendships formed. Do not include pairs of cows that were already friends at the beginning.</p>

### 힌트

<p>On day $1$, three new friendships are formed: $(3,4)$, $(3,7)$, and $(4,7)$.</p>

<p>On day $3$, two new friendships are formed: $(4,5)$ and $(5,7)$.</p>