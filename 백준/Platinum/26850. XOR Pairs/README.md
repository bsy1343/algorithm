# [Platinum V] XOR Pairs - 26850

[문제 링크](https://www.acmicpc.net/problem/26850)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 103, 정답: 73, 맞힌 사람: 51, 정답 비율: 69.863%

### 분류

수학

### 문제 설명

<p>XOR is a bitwise operator that evaluates the resulting bit into 1 if and only if their corresponding input bits differ (one of them is 1 while the other is 0). XOR operator is usually written with a symbol &oplus;, or in most programming languages, the character ^(caret). For example, (10 &oplus; 6) = 12.</p>

<pre>
10 =&gt;  1010
 6 =&gt;  0110
      ----- &oplus;
       1100   =&gt; 12
</pre>

<p>In this problem, you are given an integer N and a set of integers S<sub>1..</sub>M. Your task is to count how many pairs of integers &lt;A, B&gt; such that 1 &le; A, B &le; (A &oplus; B) &le; N, and (A &oplus; B) &notin; S.</p>

<p>For example, let N = 10 and S<sub>1..4</sub> = {4, 6, 7, 10}. There are 6 pairs of &lt;A, B&gt; that satisfy the condition.</p>

<ul>
	<li>&lt;1, 2&gt; &rarr; (1 &oplus; 2) = 3</li>
	<li>&lt;1, 4&gt; &rarr; (1 &oplus; 4) = 5</li>
	<li>&lt;1, 8&gt; &rarr; (1 &oplus; 8) = 9</li>
	<li>&lt;2, 1&gt; &rarr; (2 &oplus; 1) = 3</li>
	<li>&lt;4, 1&gt; &rarr; (4 &oplus; 1) = 5</li>
	<li>&lt;8, 1&gt; &rarr; (8 &oplus; 1) = 9</li>
</ul>

<p>Observe that a pair such as &lt;2, 4&gt; does not satisfy the condition for this example as (2 &oplus; 4) = 6 but 6 &isin; S. Another pair such as &lt;5, 1&gt; also does not satisfy the condition as it violates the requirement A, B &le; (A &oplus; B).</p>

### 입력

<p>Input begins with a line containing two integers N M (1 &le; N &le; 10<sup>6</sup>; 1 &le; M &le; 100 000) representing the given N and the size of the set of integers S<sub>1..M</sub>. The next line contains M integers S<sub>i</sub> (1 &le; S<sub>i</sub> &le; 10<sup>6</sup>) representing the set of integers S<sub>1..M</sub>.</p>

### 출력

<p>Output contains an integer in a line representing the number of &lt;A, B&gt; such that 1 &le; A, B &le; (A &oplus; B) &le; N and (A &oplus; B) &notin; S<sub>1..M</sub>.</p>