# [Platinum III] Zatopljenje - 30943

[문제 링크](https://www.acmicpc.net/problem/30943)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 62, 정답: 32, 맞힌 사람: 26, 정답 비율: 50.980%

### 분류

자료 구조, 분리 집합, 오프라인 쿼리, 세그먼트 트리, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>It&rsquo;s winter, it has never been colder, and Mr. Malnar is looking at his photos from his last cruise on the Adriatic and recalls unforgettable moments. The TV is on in the background, broadcasting news about the latest proposals for measures to slow down sea level rise. Looking at his photos of the coast, Mr. Malnar asks himself what the photos would have looked like if sea level had risen a certain amount. There are so many pictures, and even more questions, so Mr. Malnar asks for your help.</p>

<p>We imagine the coast as a sequence of $n$ numbers $h_1, h_2, \dots , h_n$, where the $i$-th number represents relief height at the $i$-th point. Mr. Malnar has $q$ queries, where the $i$-th query is as following: <em>How many islands would there be between the $l_i$-th and $r_i$-th point if the sea level rose by $x_i$ meters?</em></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30943.%E2%80%85Zatopljenje/5a937a23.png" data-original-src="https://upload.acmicpc.net/2b789c39-d844-4627-a532-33840fe42859/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 504px; height: 175px;" /></p>

<p style="text-align: center;">The left image shows the first query of the first sample test case, and the right image shows the second query of the second sample test case.</p>

<p style="text-align: center;">The left islands correspond to intervals $[2, 2]$ and $[4, 5]$.</p>

<p style="text-align: center;">The right islands correspond to intervals $[1, 1]$, $[4, 4]$, $[8, 8]$ and $[10, 10]$.</p>

<p>An island is defined as the maximal interval where every $h_i$ is <strong>strictly</strong> greater than the sea level. A maximal interval is one that cannot be extended in either direction while keeping the mentioned condition true. Initially, the sea level is at $0$ meters.</p>

### 입력

<p>The first line contains integers $n$ and $q$ ($1 &le; n, q &le; 2 \cdot 10^5$), the length of the sequence and the number of queries.</p>

<p>The second line contains $n$ integers $h_1, h_2, \dots , h_n$ ($0 &le; h_i &le; 10^9$) that describe the relief of the coast.</p>

<p>In each of the next $q$ lines there are three integers $l_i$, $r_i$ and $x_i$ ($1 &le; l_i &le; r_i &le; n$, $0 &le; x_i &le; 10^9$) that describe the $i$-th query.</p>

### 출력

<p>In the $i$-th of the $q$ lines print the answer to the $i$-th query. Each of the queries is independent of the others.</p>

### 힌트

<p>Clarification of the first example:</p>

<p>The first query is shown in the left image in the task description, islands correspond to intervals $[2, 2]$ and $[4, 5]$. In the second query island corresponds to interval $[5, 5]$. In the third query there are no islands because everything is under water.</p>

<p>Clarification of the second example: In the first query islands correspond to intervals $[3, 5]$ and $[8, 9]$. In the second query (shown in the right image in the task description) islands correspond to intervals $[1, 1]$, $[4, 4]$, $[8, 8]$ and $[10, 10]$, while in the third query islands correspond to intervals $[1, 1]$, $[3, 4]$ and $[8, 10]$.</p>