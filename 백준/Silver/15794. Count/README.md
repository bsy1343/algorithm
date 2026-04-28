# [Silver I] Count - 15794

[문제 링크](https://www.acmicpc.net/problem/15794)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 204, 정답: 50, 맞힌 사람: 37, 정답 비율: 23.270%

### 분류

이분 탐색, 두 포인터

### 문제 설명

<p>Given is a sequence of n integers: a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>n</sub>. Given is also an integer v. We consider pairs (a<sub>i</sub>, a<sub>j</sub>) of elements from the given sequence, such that i &lt; j.&nbsp;</p>

<p>Write a program count that finds such pair, whose sum a<sub>i</sub> + a<sub>j</sub>&nbsp;is the closest to (or the same as) the value of v and output the number of all such pairs with sums a<sub>i</sub> + a<sub>j</sub> that are equally closest to the value of v.</p>

### 입력

<p>On the first line of the standard input, the value of n is written.</p>

<p>On the second line, the values of a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>n</sub>, are written, separated by space.</p>

<p>On the third line, the value of v is written.</p>

### 출력

<p>On the standard output, your program has to print one integer, equal to the wanted count of pairs.</p>

### 제한

<ul>
	<li>1 &lt; n &le; 10<sup>6</sup>;</li>
	<li>&minus;10<sup>4</sup> &le; a<sub>i</sub> &le; 10<sup>4</sup> for i = 1, ..., n;</li>
	<li>&minus;10<sup>4</sup> &le; v &le; 10<sup>4</sup>.</li>
</ul>

### 힌트

<p>The value v = 12 cannot be obtained as a sum of elements of some considered pairs. But 13 can, e.g. 2 + 11=13. So, distance between v = 12 and 13 is 1. There exist some other pairs of elements, which sum is at distance 1 from v = 12. They are: 2 + 9 = 11, 2 + 9 = 11, 5 + 8 = 13. The total number of pairs with sum 11 or 13 is 4. Pay attention that the pair (2, 9) is count twice, because in the given sequence there are two different pairs of elements, although of equal value (2, 9).</p>