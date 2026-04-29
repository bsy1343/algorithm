# [Gold II] Line-Based Matrix Addition - 32882

[문제 링크](https://www.acmicpc.net/problem/32882)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 74, 정답: 24, 맞힌 사람: 19, 정답 비율: 34.545%

### 분류

누적 합, 차분 배열 트릭

### 문제 설명

<p>You are given an $N \times N$ matrix $A$.</p>

<p>Two types of lines exist on the matrix: rising and falling. There are $2N-1$ lines for each type, where rising lines are numbered $\mathrm{RL}_i$ and falling lines are numbered $\mathrm{FL}_i$ for each $1 \le i \le 2N-1$. The below picture illustrates the line layout when $N=5$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32882.%E2%80%85Line-Based%E2%80%85Matrix%E2%80%85Addition/d8d3bb59.png" data-original-src="https://boja.mercury.kr/assets/problem/32882-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 100%; max-width: 540px;"></p>

<p>You have to perform $Q$ cumulative queries in order on this matrix, which is given by the input as:</p>

<ul>
	<li><span style="color:#e74c3c;">$s_\mathrm{R}$ $e_\mathrm{R}$ $s_\mathrm{F}$ $e_\mathrm{F}$ $v$</span>.</li>
</ul>

<p>Each query specifies two line ranges of different types on the matrix, which is $\left\{ \mathrm{RL}_i \mid s_\mathrm{R} \le i \le e_\mathrm{R} \right\}$ and $\left\{ \mathrm{FL}_i \mid s_\mathrm{F} \le i \le e_\mathrm{F} \right\}$, and a value $v$. You should add the value $v$ to every element in the <strong>intersection</strong> of such range, i.e., $$\left\{ \mathrm{RL}_i \mid s_\mathrm{R} \le i \le e_\mathrm{R} \right\} \quad \cap \quad \left\{ \mathrm{FL}_i \mid s_\mathrm{F} \le i \le e_\mathrm{F} \right\}.$$</p>

<p>The following example illustrates the elements to update when $N=5$, $[s_\mathrm{R},e_\mathrm{R}]=[5,6]$, and $[s_\mathrm{F},e_\mathrm{F}]=[3,7]$:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32882.%E2%80%85Line-Based%E2%80%85Matrix%E2%80%85Addition/87a10d8a.png" data-original-src="https://boja.mercury.kr/assets/problem/32882-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 100%; max-width: 320px;"></p>

<p>Write a program to perform the queries and output the final status of the matrix $A$.</p>

### 입력

<p>The first line of input contains a single integer, $N$, denoting the matrix size. ($1 \le N \le 1\,000$)</p>

<p>The next $N$ lines of input contain $N^2$ integers, where each line has $N$ space-separated integers, denoting the value of the matrix. Here, the $j$-th integer of the $i$-th line denotes $A_{ij}$. ($-10^9 \le A_{ij} \le 10^9$)</p>

<p>The next line contains a single integer, $Q$, denoting the query count. ($1 \le Q \le 200\,000$)</p>

<p>The $i$-th of the next $Q$ lines of input contain five space-separated integers: $s_\mathrm{R}$, $e_\mathrm{R}$, $s_\mathrm{F}$, $e_\mathrm{F}$, and $v$, denoting the $i$-th query explained earlier. ($1 \le s_\mathrm{R} \le e_\mathrm{R} \le 2N-1;$ $1 \le s_\mathrm{F} \le e_\mathrm{F} \le 2N-1;$ $-10^9 \le v \le 10^9$)</p>

### 출력

<p>Output $N$ lines denoting the updated value of the matrix $A$. Each line should contain $N$ space-separated integers. The $j$-th integer of the $i$-th line should represent $A_{ij}$.</p>

### 힌트

<p>(For Sogang students:) Note that this problem is an improvised version that matches the format of a problem in a general programming contest. While in the exam, the original scoring was:</p>

<ul>
	<li>$40$ points for Subtask 1.</li>
	<li>$30$ points for Subtask 2.</li>
	<li>$25$ points for Subtask 3.</li>
	<li>$5$ points for Subtask 4.</li>
</ul>