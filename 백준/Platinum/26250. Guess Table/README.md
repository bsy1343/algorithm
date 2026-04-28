# [Platinum V] Guess Table - 26250

[문제 링크](https://www.acmicpc.net/problem/26250)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 22, 정답: 5, 맞힌 사람: 5, 정답 비율: 25.000%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>Jury has created a $n \times m$ matrix $A$ consisting of zeroes and ones. You should guess it.</p>

<p>In order to do that you can send no more than $200$ queries. At the end you should print the desired matrix.</p>

<p>Each query is described by the matrix $B$ of size $a\times b$ ($1\le a\le n, 1\le b\le m$) consisting of zeroes, ones and questions. The answer to the query is $1$ if the matrix $A$ contains continuous submatrix that corresponds to the given pattern $B$. Otherwise the answer will be equal to $0$.</p>

<p>Formally the answer will be equal to $1$ if and only if exists some values $(i, j)$ ($1 \le i \le n-a+1, 1 \le j \le m-b+1$), so for each $(x, y)$ ($1\le x\le a, 1\le y\le b$) $B_{xy}$ is a question or $B_{xy}=A_{i+x-1, j+y-1}$.</p>

<p>Also there is another restriction for the query matrix $B$: there should be no row and no column fully consisting of questions.</p>

<p>Note the problem is interactive, so you should flush your output after each query and at the end of the guess. To do that use function <code>fflush(stdout)</code> in <code>C++</code> language and <code>PrintWriter.flush()</code> in <code>Java</code> language.</p>

### 입력

<p>You are given two integers $n$ and $m$ ($1 \le n,m \le 13$) --- the size of the matrix to guess.</p>

### 출력

<p>At the end you should print a line with a string <code>&quot;Answer:&quot;</code> (without quotes) on the first line. After that print $n$ lines with $m$ symbols &quot;<code>0</code>&quot; and &quot;<code>1</code>&quot; --- the desired matrix. Don&#39;t forget to flush you output after that.</p>