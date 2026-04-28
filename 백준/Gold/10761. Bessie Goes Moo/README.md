# [Gold III] Bessie Goes Moo - 10761

[문제 링크](https://www.acmicpc.net/problem/10761)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 227, 정답: 95, 맞힌 사람: 80, 정답 비율: 43.478%

### 분류

수학, 브루트포스 알고리즘

### 문제 설명

<p>Farmer John and Bessie the cow love to exchange math puzzles in their free time. The last puzzle FJ gave Bessie was quite difficult and she failed to solve it. Now she wants to get even with FJ by giving him a challenging puzzle.</p>

<p>Bessie gives FJ the expression (B+E+S+S+I+E)(G+O+E+S)(M+O+O), containing the seven variables B,E,S,I,G,O,M (the &quot;O&quot; is a variable, not a zero). For each variable, she gives FJ a list of up to 500 integer values the variable can possibly take. She asks FJ to count the number of different ways he can assign values to the variables so the entire expression evaluates to a multiple of 7.</p>

<p>Note that the answer to this problem can be too large to fit into a 32-bit integer, so you probably want to use 64-bit integers (e.g., &quot;long long&quot;s in C or C++).</p>

### 입력

<p>The first line of the input contains an integer N. The next N lines each contain a variable and a possible value for that variable. Each variable will appear in this list at least once and at most 500 times. No possible value will be listed more than once for the same variable. All possible values will be in the range &minus;10<sup>5</sup> to 10<sup>5</sup>.</p>

### 출력

<p>Print a single integer, giving the number of ways FJ can assign values to variables so the expression above evaluates to a multiple of 7.</p>

### 힌트

<p>The two possible assignments are</p>

<pre>
(B,E,S,I,G,O,M) = (2, 5, 7, 9,  1, 16, 19) -&gt; 51,765
                = (2, 5, 7, 9,  1, 16, 2 ) -&gt; 34,510
</pre>