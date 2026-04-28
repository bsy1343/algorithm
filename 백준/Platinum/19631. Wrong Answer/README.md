# [Platinum II] Wrong Answer - 19631

[문제 링크](https://www.acmicpc.net/problem/19631)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 69, 정답: 18, 맞힌 사람: 14, 정답 비율: 29.167%

### 분류

해 구성하기

### 문제 설명

<p>Troy made the following problem (titled WA) for a programming contest:</p>

<blockquote>
<p>There is a game with N levels numbered from 1 to N. There are two characters, both are initially at level 1. For i &lt; j, it costs A<sub>i,j</sub> coins to move a character from level i to level j. It is not allowed to move a character from level i to level j if i &gt; j. To win the game, every level (except level 1) must be visited by exactly one character. What is the minimum number of coins needed to win?</p>
</blockquote>

<p>JP is a contestant and submitted the following Python solution.</p>

<pre>
def Solve(N, A):
&nbsp; # A[i][j] is cost of moving from level i to level j
&nbsp; # N is the number of levels
&nbsp; x, y, sx, sy = 1, 1, 0, 0 # Initialize x and y to 1, sx and sy to 0
&nbsp; for i in range(2, N + 1): # loop from 2 to N
&nbsp; &nbsp; if sx + A[x][i] &lt; sy + A[y][i]:
&nbsp; &nbsp; &nbsp; sx += A[x][i]
&nbsp; &nbsp; &nbsp; x = i
&nbsp; &nbsp; else:
&nbsp; &nbsp; &nbsp; sy += A[y][i]
&nbsp; &nbsp; &nbsp; y = i
&nbsp; return sx + sy</pre>

<p>Troy is certain that JP&rsquo;s solution is wrong. Suppose for an input to WA, JP&rsquo;s solution returns X but the minimum number of coins needed is Y. To show how wrong JP&rsquo;s solution is, help Troy find an input N and A<sub>i,j</sub> such that X/Y is maximized.</p>

### 입력

<p>There is no input.</p>

### 출력

<p>Print an input to WA in the following format:</p>

<p>On the first line, print one integer N (2 &le; N &le; 100). Then print N&minus;1 lines; the i-th line should contain N&minus;i integers A<sub>i,i+1</sub>, &middot; &middot; &middot;, A<sub>i,N</sub> (1 &le; A<sub>i,j</sub> &le; 100). If your output is not the correct format, it will get an incorrect verdict on the sample test in the grader and score 0 points.</p>

<p>Otherwise, suppose that for your input, JP&rsquo;s solution returns X but the minimum number of coins needed is Y. Then you will receive X/(4Y) points.</p>