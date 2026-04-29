# [Platinum I] Keys and Grates - 35028

[문제 링크](https://www.acmicpc.net/problem/35028)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

(분류 없음)

### 문제 설명

<p>Katniss is in a very long straight tunnel and wants to get out of it. She can move along the tunnel in both directions. There is exactly one hatch in the tunnel, and if she reaches it, she can exit.</p>

<p>Unfortunately, it's not that simple. There are grates blocking the entire width of the tunnel at $n$ locations. The grates are locked, and Katniss cannot pass through a grate until she unlocks it. Fortunately, there are $n$ keys located at $n$ points along the tunnel. Each grate can be unlocked by exactly one of these $n$ keys. Once a grate is unlocked, Katniss can freely and repeatedly pass through it. She can pick up and hold an unlimited number of keys.</p>

<p>Katniss knows her own location, as well as the locations of all $n$ keys, all $n$ grates, and the hatch. She also knows which key unlocks which grate. Determine the minimum distance she must travel to escape.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 \le t \le 5 \cdot 10^4$). The description of the test cases follows.</p>

<p>The first line of each test case contains three integers $n$, $s$, and $h$, denoting the number of grates, the initial coordinate of Katniss, and the coordinate of the hatch ($1 \le n \le 2 \cdot 10^5$; $-10^6 \le s, h \le 10^6$).</p>

<p>The $i$-th of the following $n$ lines contains two integers $k_i$ and $g_i$, denoting the coordinate of the $i$-th key and the coordinate of the grate that can be unlocked with this key ($-10^6 \le k_i, g_i \le 10^6$).</p>

<p>All $2n+2$ integers $s$, $h$, $k_i$, and $\ell_i$ are distinct.</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $2 \cdot 10^5$.</p>

### 출력

<p>For each test case, print the minimum possible length of Katniss' escape route. If it is impossible to escape, print $-1$ instead.</p>

### 힌트

<p>In the first test case, one of the shortest escape routes goes as follows: $5$ (initial) $\rightarrow$ $3$ (pick up key $1$) $\rightarrow$ $7$ (unlock grate $1$) $\rightarrow$ $9$ (pick up key $4$) $\rightarrow$ $1$ (unlock grate $4$) $\rightarrow$ $-1$ (pick up key $3$) $\rightarrow$ $2$ (pick up key $5$) $\rightarrow$ $10$ (unlock grate $5$) $\rightarrow$ $11$ (unlock grate $3$) $\rightarrow$ $13$ (hatch).</p>