# [Gold III] Mean - 21957

[문제 링크](https://www.acmicpc.net/problem/21957)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 27, 맞힌 사람: 27, 정답 비율: 81.818%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>George loves informatics very much, but he is only a beginner and therefore he needs your help.</p>

<p>In the informatics class the teacher writes on the board N integers and George should make several operations. An operation consists in choosing two adjacent integers and replace them with a single number, equal to the integer part of their arithmetic mean. For example, 7 and 9 are replaced with 8, 7 and 12 with 9, 101 and 102 with 101. George should make these operations until there will be only one integer on the board.</p>

<p>Help George find out what is the greatest number which can be obtained in the end.</p>

### 입력

<p>The first line of the input contains one integer N, representing the number of integers written on the board.</p>

<p>The second line of the input contains N integers a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>n</sub>, the numbers written on the board at the beginning.</p>

### 출력

<p>The first line of the output contains one integer, the greatest number that can be obtained in the end, after all the operations are made.</p>

### 제한

<ul>
	<li>1 &le; N &le; 200</li>
	<li>1 &le; a<sub>i</sub> &le; 1,000,000,000, for i from 1 to N</li>
</ul>