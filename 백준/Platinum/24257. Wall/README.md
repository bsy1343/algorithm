# [Platinum II] Wall - 24257

[문제 링크](https://www.acmicpc.net/problem/24257)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 3, 정답: 1, 맞힌 사람: 1, 정답 비율: 33.333%

### 분류

방향 비순환 그래프, 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 구현, 정렬, 스위핑, 위상 정렬

### 문제 설명

<p>During her trip, Maria saw many architectural landmarks. She was most impressed by a huge wall, made of stones. The wall was in the shape of a perfect rectangle and was made of individual stones of equal height (their widths were not necessarily equal), which were arranged in rows one above another. The count of the stones was N and they were numbered with different integers from 1 to N. On each stone was written its number. Maria noticed that the stones in each row were not necessarily placed from left to right in ascending order of their numbers.</p>

<p>What made an even stronger impression on the girl, was that the edges formed between the stones of two adjacent rows did not coincide, i.e. the edges are not exactly one above the other. In addition, she made a list of all M pairs of integers u<sub>i</sub> and d<sub>i</sub>, such that the stone with number u<sub>i</sub> lies on that with number d<sub>i</sub>. We say that a stone lies on top of another, if the first stone is positioned one row higher than the second stone and the lower side of the first stone touches the upper side of the second stone in a segment with length greater than 0.</p>

<p>Now the girl asked her father to reproduce this architectural masterpiece on a large sheet of paper, divided into unit squares, setting the following conditions:</p>

<ul>
	<li>- The count of the stones remains unchanged;</li>
	<li>The drawn wall should be a perfect rectangle;</li>
	<li>There should be no edges on two adjacent rows, which are exactly one above the other;</li>
	<li>The height of each stone should be one unit;</li>
	<li>The width of each stone, chosen by her father, can be arbitrary, but it must be an integer greater than 0;</li>
	<li>If a stone was on top of another in the original wall, this should be the same in the reproduction;</li>
	<li>Also for the stones described, the lower side of the upper stone must overlap with the upper side of the lower stone on a segment of integer length greater than 0.</li>
</ul>

<p>Write a program that determines the dimensions of the rectangle with the smallest area, which will represent the wall, keeping the conditions set by Maria.</p>

### 입력

<p>From the first line of the standard input read two integers N and M &ndash; the count of the stones and the count of the pairs in the list. From each of the following M lines read two integers u<sub>i</sub> and d<sub>i</sub>, which denote that the stone with number u<sub>i</sub> lies on top of the stone with number d<sub>i</sub>. From the last line read an integer value of 0 or 1. If this value is 1, then it is guaranteed that the numbers of the stones from left to right in each row of the original wall are in ascending order. This does not mean that you must find an arrangement of the stones with this property in the reproduction.</p>

### 출력

<p>On the first line of the standard output, print two integers H and W, respectively the height and the width of the rectangle with minimal area representing the wall. On each of the following H lines of the output, print a description of one possible arrangement of the stones in the new wall &ndash; the i-th such line should contain a single k<sub>i</sub>&nbsp;&ndash; the count of the stones on the i-th row of the wall, followed by k<sub>i</sub> pairs of integers, which consist of the number of the consecutive stone and its width in units. Every two consecutive numbers must be separated with a single space.</p>

<p>The stones must be printed by rows from the top to the bottom of the wall.</p>

<p>If the task has many possible solutions, then print any of them.</p>

### 제한

<ul>
	<li>1 &le; N &le; 2 &times; 10<sup>5</sup></li>
</ul>

### 힌트

<p><img alt="" src="https://upload.acmicpc.net/1d36b44d-0da1-4047-b50f-aff2bfe2a99a/-/preview/" style="width: 294px; height: 115px; float: right;" />The diagram shows one possible arrangement of the stones in the reproduced wall for the first example, in which a minimum area of the rectangle representing the wall is achieved, so that all set conditions are met.</p>