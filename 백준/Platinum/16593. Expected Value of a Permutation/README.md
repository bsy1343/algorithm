# [Platinum II] Expected Value of a Permutation - 16593

[문제 링크](https://www.acmicpc.net/problem/16593)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 9, 맞힌 사람: 5, 정답 비율: 71.429%

### 분류

조합론, 수학, 정수론

### 문제 설명

<p>You have an array of N integers A = [A<sub>1</sub>, A<sub>2</sub>, &middot; &middot; &middot; , A<sub>N</sub>]. Summing all integers in A is boring, so you decided to take it to the next level. You have a permutation P of 1 to N generated randomly. Each permutation from 1 to N has an equal probability to be chosen as P.</p>

<p>You also want to define arrays X<sub>0</sub>, X<sub>1</sub>, X<sub>2</sub>, ..., X<sub>N</sub> and an integer Y as follows:</p>

<ul>
	<li>X<sub>0</sub> = A</li>
	<li>X<sub>i</sub> for 1 &le; i &le; N is defined as X<sub>i&minus;1</sub> but all integers whose indices are multiples of i are changed to 0.</li>
	<li>Y = sum(X<sub>1</sub>) + sum(X<sub>2</sub>) + &middot; &middot; &middot; + sum(X<sub>N</sub>), where sum(X<sub>i</sub>) is the sum of all integers in the array X<sub>i</sub>.</li>
</ul>

<p>For example, if A = [4, 1, 2, 3, 4] and P = [3, 2, 4, 1, 5], then:</p>

<ul>
	<li>X<sub>0</sub> = [4, 1, 2, 3, 4]</li>
	<li>X<sub>1</sub> = [4, 1, 0, 3, 4] &larr; P<sub>1</sub> = 3, so, the 3<sup>rd</sup> element of X<sub>1</sub> is changed to 0.</li>
	<li>X<sub>2</sub> = [4, 0, 0, 0, 4] &larr; P<sub>2</sub> = 2, so, the 2<sup>nd</sup> and 4<sup>th</sup> elements of X<sub>2</sub> are changed to 0.</li>
	<li>X<sub>3</sub> = [4, 0, 0, 0, 4] &larr; P<sub>3</sub> = 4, so, the 4<sup>th</sup> element of X<sub>3</sub> is changed to 0.</li>
	<li>X<sub>4</sub> = [0, 0, 0, 0, 0] &larr; P<sub>4</sub> = 1, so, all elements of X<sub>4</sub> are changed to 0.</li>
	<li>X<sub>5</sub> = [0, 0, 0, 0, 0] &larr; P<sub>5</sub> = 5, so, the 5<sup>th</sup> element of X<sub>5</sub> is changed to 0.</li>
</ul>

<p>Therefore, Y = 12 + 8 + 8 + 0 + 0 = 28 in this case.</p>

<p>Since P is generated randomly, you are wondering the expected value of Y . Let C/D be the expected value of Y where C and D are relatively prime non-negative integers. Print the value of (C &times;D<sup>&minus;1</sup>) mod 1000000007. In other words, you must print the value of the unique integer K (0 &le; K &lt; 1000000007) satisfying C &equiv; DK (mod 1000000007).</p>

### 입력

<p>Input begins with an integer N (1 &le; N &le; 100000) representing the number of integers in A. The second line contains N integers: A<sub>i</sub> (0 &le; A<sub>i</sub> &le; 10<sup>9</sup>) representing the array A.</p>

### 출력

<p>Output in a line the expected value of Y using the format specified in the problem description.</p>