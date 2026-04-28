# [Bronze I] Switching Lights - 6069

[문제 링크](https://www.acmicpc.net/problem/6069)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 295, 정답: 225, 맞힌 사람: 204, 정답 비율: 77.567%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Farmer John tries to keep the cows sharp by letting them play with intellectual toys. One of the larger toys is the lights in the barn. Each of the N (2 &lt;= N &lt;= 500) cow stalls conveniently numbered 1..N has a colorful light above it.</p>

<p>At the beginning of the evening, all the lights are off. The cows control the lights with a set of N pushbutton switches that toggle the lights; pushing switch i changes the state of light i from off to on or from on to off.</p>

<p>The cows read and execute a list of M (1 &lt;= M &lt;= 2,000) operations expressed as one of two integers (0 &lt;= operation &lt;= 1).</p>

<p>The first operation (denoted by a 0 command) includes two subsequent integers S_i and E_i (1 &lt;= S_i &lt;= E_i &lt;= N) that indicate a starting switch and ending switch. They execute the operation by pushing each pushbutton from S_i through E_i inclusive exactly once.</p>

<p>The second operation (denoted by a 1 command) asks the cows to count how many lights are on in the range given by two integers S_i and E_i (1 &lt;= S_i &lt;= E_i &lt;= N) which specify the inclusive range in which the cows should count the number of lights that are on.</p>

<p>Help FJ ensure the cows are getting the correct answer by processing the list and producing the proper counts.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and M</li>
	<li>Lines 2..M+1: Each line represents an operation with three space-separated integers: operation, S_i, and E_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Lines 1..number of queries: For each output query, print the count as an integer by itself on a single line.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>Four lights; five commands. Here is the sequence that should be processed:</p>

<pre>
        Lights
            1 2 3 4
  Init:     O O O O   O = off  * = on
  0 1 2 -&gt;  * * O O  toggle lights 1 and 2
  0 2 4 -&gt;  * O * *
  1 2 3 -&gt;  1        count the number of lit lights in range 2..3
  0 2 4 -&gt;  * * O O  toggle lights 2, 3, and 4
  1 1 4 -&gt;  2        count the number of lit lights in the range 1..4</pre>