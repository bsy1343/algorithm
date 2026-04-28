# [Platinum II] Equal Sums (Large) - 12393

[문제 링크](https://www.acmicpc.net/problem/12393)

### 성능 요약

시간 제한: 20 초, 메모리 제한: 512 MB

### 통계

제출: 362, 정답: 52, 맞힌 사람: 27, 정답 비율: 11.538%

### 분류

수학, 자료 구조, 집합과 맵, 해시를 사용한 집합과 맵, 확률론, 무작위화, 생일 문제

### 문제 설명

<p>I have a set of positive integers&nbsp;<strong>S</strong>. Can you find two non-empty, distinct subsets with the same sum?&nbsp;</p>

<p>Note: A subset is a set that contains only elements from&nbsp;<strong>S</strong>, and two subsets are distinct if they do not have exactly the same elements.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow, one per line. Each test case begins with&nbsp;<strong>N</strong>, the number of positive integers in&nbsp;<strong>S</strong>. It is followed by&nbsp;<strong>N</strong>distinct positive integers, all on the same line.</p>

<h3>Limits</h3>

<ul>
	<li>No two numbers in&nbsp;<strong>S</strong>&nbsp;will be equal.</li>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 10.</li>
	<li><strong>N</strong>&nbsp;is&nbsp;<em>exactly</em>&nbsp;equal to 500.</li>
	<li>Each number in&nbsp;<strong>S</strong>&nbsp;will be a positive integer less than 10<sup>12</sup>.</li>
</ul>

### 출력

<p>For each test case, first output one line containing &quot;Case #x:&quot;, where x is the case number (starting from 1).</p>

<ul>
	<li>If there are two different subsets of&nbsp;<strong>S</strong>&nbsp;that have the same sum, then output these subsets, one per line. Each line should contain the numbers in one subset, separated by spaces.</li>
	<li>If it is impossible, then you should output the string &quot;Impossible&quot; on a single line.</li>
</ul>

<p>If there are multiple ways of choosing two subsets with the same sum, any choice is acceptable.</p>

<p>&nbsp;</p>

<div>&nbsp;</div>