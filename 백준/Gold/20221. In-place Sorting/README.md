# [Gold III] In-place Sorting - 20221

[문제 링크](https://www.acmicpc.net/problem/20221)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 112, 정답: 51, 맞힌 사람: 47, 정답 비율: 52.809%

### 분류

그리디 알고리즘, 구현

### 문제 설명

<p>Woe is you -- for your algorithms class you have to write a sorting algorithm, but you missed the relevant lecture! The subject was in-place sorting algorithms, which you deduce must be algorithms that leave each input number in its place and yet somehow also sort the sequence.</p>

<p>Of course you cannot change any of the numbers either, then the result would just be a different sequence. But then it hits you: if you flip a 6 upside-down, it becomes a 9, and vice versa! Certainly no one can complain about this since you changed none of the digits! The deadline to hand in the exercise is in five hours. Try to implement this sorting algorithm before then!</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>A line with an integer $n$ ($2 \leq n \leq 10\,000$), the number of integers in the input sequence.</li>
	<li>$n$ lines, the $i$th of which contains a positive integer $x_i$ ($1\leq x_i \leq 10^{18}$), the $i$th number of the sequence.</li>
</ul>

### 출력

<p>If the sequence cannot be sorted in non-decreasing order by flipping some of the digits $6$ or $9$ in the input<sup>1</sup>, output &quot;<code>impossible</code>&quot;. Otherwise, output &quot;<code>possible</code>&quot; followed by the sorted sequence -- each number on its own line.</p>

<p>If there are multiple valid solutions, you may output any one of them.</p>

<p><sup>1</sup>Flipping any of the digits of $n$ is not allowed.</p>