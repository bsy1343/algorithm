# [Silver II] Traveling Salesman Problem - 34461

[문제 링크](https://www.acmicpc.net/problem/34461)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 23, 정답: 19, 맞힌 사람: 15, 정답 비율: 88.235%

### 분류

애드 혹, 정렬

### 문제 설명

<p>There are $N$ cities numbered from $1$ to $N$, the $i$-th of which is at coordinates $(x_i, y_i)$. </p>

<p>Busy Beaver wants to start at city $1$, visit every city exactly once, and return to city $1$.</p>

<p>To go from city $i$ to city $j$, it takes $|x_i - x_j + y_i - y_j|$ seconds. Find the minimum number of seconds for Busy Beaver to complete his trip.</p>

### 입력

<p>The first line contains a single integer $T$ ($1 \leq T \leq 10^4$) --- the number of test cases.</p>

<p>The first line of each test case contains a single integer $N$ ($2 \leq N \leq 2 \cdot 10^5$) --- the number of cities.</p>

<p>The $i$-th of the next $N$ lines of each test case contains two integers $x_i$ and $y_i$ ($-10^9 \leq x_i, y_i \leq 10^9$) --- the coordinates of the $i$-th city.</p>

<p>The sum of $N$ across all test cases does not exceed $2 \cdot 10^5$.</p>

### 출력

<p>For each test case, output a single integer --- the minimum number of seconds needed for Busy Beaver to complete his trip.</p>

### 힌트

<p>In the first test case, we can take the path $1 \xrightarrow{3\,\text{seconds}} 3 \xrightarrow{1\,\text{second}} 4 \xrightarrow{1\,\text{second}} 5 \xrightarrow{3\,\text{seconds}} 2 \xrightarrow{2\,\text{seconds}} 1$ which takes $3+1+1+3+2=10$ seconds.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/34461.%E2%80%85Traveling%E2%80%85Salesman%E2%80%85Problem/97367983.png" data-original-src="https://boja.mercury.kr/assets/problem/34461-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 300px;"></p>