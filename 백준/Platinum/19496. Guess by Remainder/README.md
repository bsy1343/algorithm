# [Platinum IV] Guess by Remainder - 19496

[문제 링크](https://www.acmicpc.net/problem/19496)

### 성능 요약

시간 제한: 2.5 초, 메모리 제한: 512 MB

### 통계

제출: 191, 정답: 36, 맞힌 사람: 28, 정답 비율: 18.667%

### 분류

수학, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>We have chosen an integer $m$ between $1$ and $n$. Your task is to guess it, and you have to do no more queries than necessary for this $n$. Each of your queries must be an integer which has no more than $n$ digits in its decimal notation. The answer to query $x$ is the remainder $x \bmod m$.</p>

### 입력

<p>In the beginning, your program will receive one integer $n$ ($1 \le n \le 10^6$).</p>

<p>Then your program will receive the answers to the queries. Each answer is an integer.</p>

### 출력

<p>Your program can make queries in the form &quot;<code>?</code> $\mathit{number}$&quot;. When you think you know the answer, you should print &quot;<code>!</code> $\mathit{guess}$&quot;, and then terminate your program immediately. Don&#39;t forget to output the line break and flush the output. To do so, you can use the following instructions:</p>

<ul>
	<li><code>fflush(stdout)</code> in C++;</li>
	<li><code>System.out.flush()</code> in Java;</li>
	<li><code>stdout.flush()</code> in Python;</li>
	<li><code>flush(output)</code> in Pascal.</li>
</ul>

### 힌트

<p>You are not prohibited to output leading zeroes, but the checking program counts them when determining the length of the number. For example, if $n = 3$, query &quot;$001$&quot; is valid, but &quot;$0001$&quot; is invalid.</p>

<p>The second sample just demonstrates the interaction format, guessing can be done in smaller number of queries.</p>