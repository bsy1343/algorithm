# [Gold I] Count the Operations - 32913

[문제 링크](https://www.acmicpc.net/problem/32913)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 27, 정답: 10, 맞힌 사람: 7, 정답 비율: 77.778%

### 분류

구현, 그래프 이론, 문자열, 이분 탐색, 자료 구조, 집합과 맵, 트리를 사용한 집합과 맵, 파싱

### 문제 설명

<p>In a class, Ania wrote a program which does some work for all integers from $0$ to $n - 1$:</p>

<pre>for (int i = 0; i &lt; n; i++) {
    work (i);
}</pre>

<p>The teacher Petia looked at the program and said that it would work for too long, as the maximum value of $n$ is $10^{9}$.</p>

<p>In response, Ania decided to do the work only for a portion of the numbers. Her new program looks as follows:</p>

<pre>for (int i = 0; i &lt; n; i++) {
    if (i == x_1) i = y_1;
    if (i == x_2) i = y_2;
    ...
    if (i == x_k) i = y_k;
    work (i);
}
</pre>

<p>How many operations does this program perform for the given $n$, and does it terminate at all? The operations we count are assignments (<code>i = 0</code>; <code>i++</code>; <code>i = y\_1</code>; \ldots), comparisons (<code>i &lt; n</code>; <code>i == x\_1</code>; \ldots), and the work itself (<code>work (i)</code>).</p>

### 입력

<p>The input contains the program written by Ania. It is formatted exactly as shown in the examples: in particular, the opening curly bracket is on the line with <code>for</code>, there is a space in front of every opening round bracket, and the indentation is four spaces. The input does not contain spaces at line ends.</p>

<p>The number of lines with conditionals: $0 \le k \le 10^5$. The constraints on the values: $0 \le x_i, y_i &lt; n \le 10^9$, other than that, the values can be arbitrary. The line with <code>work</code> follows once after all the lines with <code>if</code>.</p>

### 출력

<p>Print the number of operations that the given program performs. If the program never terminates, print <code>-1</code>.</p>