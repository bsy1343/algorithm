# [Gold V] Present - 24065

[문제 링크](https://www.acmicpc.net/problem/24065)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 512 MB

### 통계

제출: 136, 정답: 42, 맞힌 사람: 36, 정답 비율: 29.508%

### 분류

수학, 브루트포스 알고리즘, 조합론

### 문제 설명

<p>Today is the birthday of Farmer Eric&rsquo;s cow, Emily. Since Emily didn&rsquo;t manage to get a present last year, Eric wants to give her a square with delicious grass.</p>

<p>Farmer Eric&rsquo;s farm has a broad field with $n^2$ pillars arranged in $n$ rows and $n$ columns. (The distance between the nearest pillars is $1 \, \mathrm{m}$.)</p>

<p>He started to plan for Emily&#39;s birthday present to make Emily happy. In a couple of minutes, he figured out that the square should satisfy the following&nbsp;conditions:</p>

<ul>
	<li>have the pillars as its vertices;</li>
	<li>have an area of at least&nbsp;$a \, \mathrm{m}^2$.</li>
</ul>

<p>For convenience, you can ignore the height and the thickness of the pillars.</p>

<p>Farmer Eric was thinking about the number of possible birthday presents for Emily but just gave up counting(probably because there was work left to do). Can you count&nbsp;it instead?</p>

### 입력

<p>The first line contains the number $T$&nbsp;&mdash; the number of test cases.</p>

<p>The single line of each test case contains two integers $n$ and $a$.</p>

### 출력

<p>For each test case, print&nbsp;the number of possible birthday presents for Emily. If there aren&#39;t&nbsp;any, print <code>0</code>.</p>

### 제한

<ul>
	<li>$T&nbsp;\ge 1$</li>
	<li>$2 \le n \le 2 \cdot 10^3$</li>
	<li>$1 \le a \le (n-1)^2+1$</li>
	<li>The total sum of $n$ over test cases doesn&#39;t exceed $2 \cdot 10^3$.</li>
	<li>All values in&nbsp;input are integers.</li>
</ul>