# [Platinum III] Date - 26494

[문제 링크](https://www.acmicpc.net/problem/26494)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 25, 정답: 5, 맞힌 사람: 4, 정답 비율: 20.000%

### 분류

많은 조건 분기, 다이나믹 프로그래밍, 자릿수를 이용한 다이나믹 프로그래밍, 구현, 문자열

### 문제 설명

<p>Fujiwara-san loves dates! She calls a date a string of form $y/m/d$ where $d$, $m$ and $y$ are positive integers without leading zeroes that represent a calendar date ($d$ is the day, $m$ is the month, $y$ is the year). The precise rules for a valid date is the following:</p>

<ul>
	<li>$y &isin; \{1, 2, \dots\}$.</li>
	<li>$m &isin; \{1, \dots , 12\}$.</li>
	<li>If $m &isin; \{1, 3, 5, 7, 8, 10, 12\}$, then $d &isin; \{1, \dots , 31\}$.</li>
	<li>If $m &isin; \{4, 6, 9, 11\}$, then $d &isin; \{1, \dots , 30\}$.</li>
	<li>If $m = 2$ and $y$ is either a not a multiple of $4$, or both a multiple of $100$ and not a multiple of $400$, then $d &isin; \{1, \dots , 28\}$.</li>
	<li>If $m = 2$ and $y$ is a multiple of $4$, and either not a multiple of $100$ or a multiple of $400$, then $d &isin; \{1, \dots , 29\}$.</li>
</ul>

<p>For example, $2022/2/14$, $2024/2/29$ and $2000/2/29$ are valid dates; whereas $2022/02/14$, $2022/2/29$ and $2100/2/29$ are not valid dates.</p>

<p>Fujiwara-san has recently received a sequence of symbols $s_1, \dots , s_n$, where $s_i &isin; \{0, 1, \dots , 9, /\}$. She now wants to ask: how many sequences of indices $1 &le; i_1 &lt; \dots &lt; i_k &le; n$ exist such that $s_{i_1} , \dots , s_{i_k}$ are a valid date?</p>

### 입력

<p>The first line of the input contains the integer $n$. The second line contains the symbols $s_1, \dots , s_n$, not separated by spaces.</p>

### 출력

<p>Output the answer modulo $10^9 + 7$.</p>

### 제한

<ul>
	<li>$1 &le; n &le; 100\,000$.</li>
</ul>