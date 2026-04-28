# [Gold II] Sorting It All Out - 7352

[문제 링크](https://www.acmicpc.net/problem/7352)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 93, 정답: 35, 맞힌 사람: 23, 정답 비율: 30.263%

### 분류

그래프 이론, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>An ascending sorted sequence of distinct values is one in which some form of a less-than operator is used to order the elements from smallest to largest. For example, the sorted sequence A, B, C, D implies that A &lt; B, B &lt; C and C &lt; D. In this problem, we will give you a set of relations of the form A &lt; B and ask you to determine whether a sorted order has been specified or not.</p>

### 입력

<p>Input consists of multiple problem instances. Each instance starts with a line containing two positive integers n and m. The first value indicates the number of objects to sort, where 2 &le; n &le; 26.&nbsp;</p>

<p>The objects to be sorted will be the first n characters of the uppercase alphabet. The second value m indicates the number of relations of the form A &lt; B which will be given in this problem instance. Next will be m lines, each containing one such relation consisting of three characters: an uppercase letter, the character ``&lt;&quot; and a second uppercase letter. No letter will be outside the range of the first n letters of the alphabet. Values of n = m = 0 indicate end of input.</p>

### 출력

<p>For each problem instance, output consists of one line. This line should be one of the following three:</p>

<ul>
	<li>Sorted sequence determined after xxx relations: yyy...y.</li>
	<li>Sorted sequence cannot be determined.</li>
	<li>Inconsistency found after xxx relations.</li>
</ul>

<p>where xxx is the number of relations processed at the time either a sorted sequence is determined or an inconsistency is found, whichever comes first, and yyy...y is the sorted, ascending sequence.</p>