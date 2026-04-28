# [Platinum III] Elegant Square - 19202

[문제 링크](https://www.acmicpc.net/problem/19202)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 67, 정답: 26, 맞힌 사람: 17, 정답 비율: 40.476%

### 분류

해 구성하기, 수학, 정수론

### 문제 설명

<p>Many people know about magic squares --- squares that contain distinct numbers and have equals sums of rows and columns. Recently Eve has heard about magic squares, and now she has invented her own version: <em>elegant squares</em>.</p>

<p>Eve calls a square of $n\times n$ integers elegant if the following conditions are satisfied:</p>

<ul>
	<li>All entries of the square are distinct positive integers.</li>
	<li>All integers are square free. That means that no integer is divisible by $t^2$ for any $t &gt; 1$.</li>
	<li>The product of numbers in any row and any column is the same.</li>
</ul>

<p>For example, the picture below shows an elegant $3 \times 3$ square.</p>

<p>$$ \begin{matrix} 1&amp; 21&amp; 10\\&nbsp; 6&amp; 5&amp; 7\\&nbsp; 35&amp; 2&amp; 3&nbsp; \end{matrix} $$</p>

<p>All of its entries are distinct positive square free integers, and product of any row and any column is 210.</p>

<p>Help Eve, find an $n \times n$ elegant square. All numbers in the square must not exceed $10^{18}$. It is guaranteed that for the given constraints there exists such square.</p>

### 입력

<p>The input file a single integer $n$ ($3 \le n \le 30$).</p>

### 출력

<p>Output $n \times n$ integers: the found elegant square. All printed integers must not exceed $10^{18}$.</p>