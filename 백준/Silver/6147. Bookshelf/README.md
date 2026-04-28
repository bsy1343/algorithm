# [Silver V] Bookshelf - 6147

[문제 링크](https://www.acmicpc.net/problem/6147)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 450, 정답: 316, 맞힌 사람: 275, 정답 비율: 74.728%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Farmer John recently bought a bookshelf for cow library, but the shelf is getting filled up quite quickly, and now the only available space is at the top.</p>

<p>Each of the N cows (1 &lt;= N &lt;= 20,000) has some height of H_i (1 &lt;= H_i &lt;= 10,000) and a total height summed across all N cows of S. The bookshelf has a height of B (1 &lt;= B &lt;= S &lt; 2,000,000,007).</p>

<p>To reach the top of the bookshelf taller than the tallest cow, one or more of the cows can stand on top of each other in a stack, so that their total height is the sum of each of their individual heights. This total height must be no less than the height of the bookshelf. Since more cows than necessary in the stack can be dangerous, your job is to find the set of cows that produces a stack of the smallest number of cows possible such that the stack can reach the bookshelf.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: N and B</li>
	<li>Lines 2..N+1: Line i+1 contains a single integer: H_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single integer representing the size of the smallest set of cows that can reach the bookshelf.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>One way to reach 40 with 3 cows is 18+11+13; many others exist</p>

<p>&nbsp;</p>