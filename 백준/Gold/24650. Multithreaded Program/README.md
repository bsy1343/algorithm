# [Gold I] Multithreaded Program - 24650

[문제 링크](https://www.acmicpc.net/problem/24650)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 22, 정답: 16, 맞힌 사람: 16, 정답 비율: 88.889%

### 분류

자료 구조, 그리디 알고리즘, 해 구성하기, 해시를 사용한 집합과 맵, 스택

### 문제 설명

<p>Maurice is debugging a multithreaded program on his old machine. The program has several threads operating on a set of shared variables. Each thread executes its own sequence of assignments in a predefined <em>program order</em>. Each assignment sets one of the variables to an integer value.</p>

<p>When the program is run, assignments from different threads can be executed in any order. The only guarantee is that each thread executes all of its assignments in the program order.</p>

<p>For example, let&#39;s say the program has three threads that have $2$, $2$, and $1$ assignments in their sequences, respectively. Then one valid program execution looks as follows:</p>

<ul>
	<li>thread $1$ executes the first assignment in its sequence;</li>
	<li>thread $2$ executes the first assignment in its sequence;</li>
	<li>thread $2$ executes the second assignment in its sequence;</li>
	<li>thread $1$ executes the second assignment in its sequence;</li>
	<li>thread $3$ executes the only assignment in its sequence.</li>
</ul>

<p>This execution can be described as $1, 2, 2, 1, 3$, where numbers specify the threads performing each assignment, in order. Note that many other valid executions are possible.</p>

<p>Maurice suspects that his machine is broken and can work incorrectly. He has run his program and recorded the values of all variables at the end.</p>

<p>Find an execution of the program that performs all assignments and leads to the recorded values of all variables, or report that the machine is indeed broken and such an execution does not exist.</p>

### 입력

<p>The first line contains a single integer $t$ --- the number of threads ($1 \leq t \leq 100$). The threads are numbered from $1$ to $t$. The following lines describe $t$ sequences of assignments, one per thread.</p>

<p>The first line of the $i$-th description contains an integer $l_i$ --- the length of the sequence of assignments of the $i$-th thread ($1 \leq l_i \leq 100$). Each of the following $l_i$ lines contains an assignment in the form &quot;<code>&lt;variable&gt;=&lt;value&gt;</code>&quot;. The assignments are listed in the program order. Variable names consist of up to $10$ lowercase English letters, and values are positive integers not exceeding $10^9$.</p>

<p>The first of the remaining lines contains an integer $k$ --- the number of variables ($1 \le k \le 10\,000$). Each of the following $k$ lines contains a variable name and its recorded value, which is a positive integer not exceeding $10^9$. Each variable used in the program is listed exactly once, and each listed variable is used in at least one assignment.</p>

### 출력

<p>Print <code>&quot;Yes&quot;</code> if an execution producing the recorded values exists, and <code>&quot;No&quot;</code> otherwise.</p>

<p>If an execution exists, print a line containing $s = l_1 + l_2 + \dotsb + l_t$ integers $c_1, c_2, \ldots, c_s$, describing such an execution ($1 \le c_i \le t$). This specifies that the first assignment is performed by thread $c_1$, the second one is performed by thread $c_2$, and so on. Each thread performs its assignments in the program order. After the $s$-th assignment, each variable must have the recorded value. The $i$-th thread must appear in the description exactly $l_i$ times.</p>