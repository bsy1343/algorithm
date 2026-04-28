# [Gold II] Relay - 27206

[문제 링크](https://www.acmicpc.net/problem/27206)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 88, 정답: 48, 맞힌 사람: 39, 정답 비율: 63.934%

### 분류

자료 구조, 정렬

### 문제 설명

<p>There are $N$ members in the track club of JOI High School, numbered from $1$ to $N$. For the member $i$ ($1 &le; i &le; N$), the time of the 100 m sprint is $A_i$ msec, and the ability of controlling the baton is $B_i$.</p>

<p>The track club will participate in a national contest for the 300 m relay. Three members will run in the 300 m relay. Each member will run for 100 m. A runner will pass the baton to the next runner. Precisely, if the first runner is the member $i$ ($1 &le; i &le; N$), the second runner is the member $j$ ($1 &le; j &le; N$), and the third runner is the member $k$ ($1 &le; k &le; N$), then the three members will run the relay in the following steps.</p>

<ol>
	<li>The member $i$ runs for 100 m with a baton. It takes $A_i$ msec.</li>
	<li>The member $i$ gives a baton to the member $j$. It takes $\max{(B_i , B_j)}$ msec.</li>
	<li>The member $j$ runs for 100 m with a baton. It takes $A_j$ msec.</li>
	<li>The member $j$ gives a baton to the member $k$. It takes $\max{(B_j , B_k)}$ msec.</li>
	<li>The member $k$ runs for 100 m with a baton. It takes $A_k$ msec.</li>
</ol>

<p>Therefore, the record for the 300 m relay is $A_i + \max{(B_i , B_j)} + A_j + \max{(B_j , B_k)} + A_k$ msec. Here $\max{(x, y)}$ is the largest value of $x$ and $y$. Since you are the coach of the track club, you want to choose three <strong>distinct</strong> members for the relay and decide the order of the runners so that the record becomes minimum.</p>

<p>Write a program which, given information of the $N$ members of the track club, calculates the minimum possible record of the 300 m relay.</p>

### 입력

<p>Read the following data from the standard input. Given values are all integers.</p>

<blockquote>
<p>$N$</p>

<p>$A_1$ $B_1$</p>

<p>$A_2$ $B_2$</p>

<p>$\vdots$</p>

<p>$A_N$ $B_N$</p>
</blockquote>

### 출력

<p>Write one line to the standard output. The output should contain an integer which is the minimum possible record of the 300 m relay counted by msec.</p>

### 제한

<ul>
	<li>$3 &le; N &le; 200\,000$.</li>
	<li>$1 &le; A_i &le; 100\,000\,000 (= 10^8)$ ($1 &le; i &le; N$).</li>
	<li>$1 &le; B_i &le; 100\,000\,000 (= 10^8)$ ($1 &le; i &le; N$).</li>
</ul>