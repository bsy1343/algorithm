# [Silver IV] Near - 8362

[문제 링크](https://www.acmicpc.net/problem/8362)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 171, 정답: 101, 맞힌 사람: 69, 정답 비율: 52.672%

### 분류

정렬, 이분 탐색

### 문제 설명

<p>A known Polish proverb is: &#39;The apple always falls near the apple tree&#39;<sup>1</sup>. Your task is to check this proverb experimentally. For simplicity let us assume that both apple trees and apples stand in one line, so their positions can be described by a single coordinate. Let us also assume that every apple has fallen from the apple tree closest to it.</p>

<p>Write a program that:</p>

<ul>
	<li>reads from the standard input a description of positions of apple trees and apples,</li>
	<li>computes the smallest distance between an apple and its apple tree,</li>
	<li>writes the result to the standard output.</li>
</ul>

<p><sup>1</sup>An English equivalent of this proverb is: &#39;Like father, like son&#39; or &#39;Like mother, like daughter&#39;.</p>

### 입력

<p>The first line of input contains two integers <em>n</em>&nbsp;and <em>m</em>&nbsp;(1 &le; <em>n</em>, <em>m</em> &le; 100 000), separated with a single space and denoting the number of apple trees and the number of apples. The second line of input contains <em>n</em>&nbsp;integers from the range [0,10<sup>8</sup>], separated with single spaces and denoting the coordinates of apple trees. The third line of input contains <em>m</em>&nbsp;integers from the range [0,10<sup>8</sup>], separated with single spaces and denoting the coordinates of apples. We treat both apple trees and apples as points on a line; there can be multiple apple trees and multiple apples in one point.</p>

### 출력

<p>The first and only line of output should contain the smallest distance between an apple and its apple tree.</p>