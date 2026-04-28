# [Platinum IV] Determinant Strikes Back - 20791

[문제 링크](https://www.acmicpc.net/problem/20791)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 54, 정답: 42, 맞힌 사람: 32, 정답 비율: 72.727%

### 분류

수학, 선형대수학

### 문제 설명

<p>Dinara has an integer $x$ and two $n$ arrays $a_1, \dots, a_n$, $b_1, \dots, b_n$. She makes an $n \times n$ matrix $M$ where</p>

<p>$$ M_{i, j} = \left\{\begin{matrix} x + a_i b_j &amp; \mathrm{when}\ i = j \\ a_i b_j &amp; \mathrm{otherwise} \end{matrix}\right. $$</p>

<p>Find the determinant of the matrix $M$ modulo $(10^9+7)$.</p>

### 입력

<p>The input consists of several test cases terminated by end-of-file.</p>

<p>The first line of each test case contains two integers $n$ and $x$. The second line contains $n$ integers $a_1, \dots, a_n$.&nbsp;The third line contains $n$ integers $b_1, \dots, b_n$.</p>

### 출력

<p>For each test case, print an integer which denotes the result.</p>

### 제한

<ul>
	<li>$1 \leq n \leq 10^5$</li>
	<li>$0 \leq x, a_i, b_i \leq 10^9$</li>
	<li>The sum of $n$ does not exceed $10^6$.</li>
</ul>