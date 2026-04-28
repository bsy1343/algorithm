# [Platinum I] Addition Robot - 19165

[문제 링크](https://www.acmicpc.net/problem/19165)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 107, 정답: 64, 맞힌 사람: 47, 정답 비율: 61.842%

### 분류

수학, 자료 구조, 세그먼트 트리, 느리게 갱신되는 세그먼트 트리, 선형대수학

### 문제 설명

<p>Adding two numbers several times is a time-consuming task, so you want to build a robot. The robot should have a string S = S<sub>1</sub>S<sub>2</sub>. . .S<sub>N</sub> of N characters on its memory that represents addition instructions. Each character of the string, S<sub>i</sub>, is either &lsquo;<code>A</code>&rsquo; or &lsquo;<code>B</code>&rsquo;.</p>

<p>You want to be able to give Q commands to the robot, each command is either of the following types:</p>

<ul>
	<li>1 L R. The robot should toggle all the characters of S<sub>i</sub> where L &le; i &le; R. Toggling a character means changing it to &lsquo;<code>A</code>&rsquo; if it was previously &lsquo;<code>B</code>&rsquo;, or changing it to &lsquo;<code>B</code>&rsquo; if it was previously &lsquo;<code>A</code>&rsquo;.</li>
	<li>2 L R A B. The robot should call f(L, R, A, B) and return two integers as defined in the following pseudocode:
	<pre>
function f(L, R, A, B):
  FOR i from L to R
    if S[i] = &#39;A&#39;
      A = A + B
    else
      B = A + B
  return (A, B)
</pre>
	</li>
</ul>

<p>You want to implement the robot&rsquo;s expected behavior.</p>

### 입력

<p>Input begins with a line containing two integers: N Q (1 &le; N, Q &le; 100 000) representing the number of characters in the robot&rsquo;s memory and the number of commands, respectively. The next line contains a string S containing N characters (each either &lsquo;<code>A</code>&rsquo; or &lsquo;<code>B</code>&rsquo;) representing the initial string in the robot&rsquo;s memory. The next Q lines each contains a command of the following types.</p>

<ul>
	<li>1 L R (1 &le; L &le; R &le; N)</li>
	<li>2 L R A B (1 &le; L &le; R &le; N; 0 &le; A, B &le; 10<sup>9</sup>)</li>
</ul>

<p>There is at least one command of the second type.</p>

### 출력

<p>For each command of the second type in the same order as input, output in a line two integers (separated by a single space), the value of A and B returned by f(L, R, A, B), respectively. As this output can be large, you need to modulo the output by 1 000 000 007.</p>

### 힌트

<p>For the first command, calling f(L, R, A, B) causes the following:</p>

<ul>
	<li>Initially, A = 1 and B = 1.</li>
	<li>At the end of i = 1, A = 2 and B = 1.</li>
	<li>At the end of i = 2, A = 2 and B = 3.</li>
	<li>At the end of i = 3, A = 5 and B = 3.</li>
	<li>At the end of i = 4, A = 8 and B = 3.</li>
	<li>At the end of i = 5, A = 11 and B = 3.</li>
</ul>

<p>Therefore, f(L, R, A, B) will return (11, 3).</p>

<p>For the second command, string S will be updated to &ldquo;<code>ABBBB</code>&rdquo;.</p>

<p>For the third command, the value of A will always be 0 and the value of B will always be 1 000 000 000. Therefore, f(L, R, A, B) will return (0, 1 000 000 000).</p>