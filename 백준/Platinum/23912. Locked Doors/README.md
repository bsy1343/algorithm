# [Platinum III] Locked Doors - 23912

[문제 링크](https://www.acmicpc.net/problem/23912)

### 성능 요약

시간 제한: 40 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 26, 정답: 8, 맞힌 사람: 6, 정답 비율: 40.000%

### 분류

자료 구조, 트리, 세그먼트 트리, 이분 탐색, 희소 배열, 데카르트 트리

### 문제 설명

<p>Bangles is preparing to go on a tour of her local museum. The museum is made up of&nbsp;<b>N</b>&nbsp;rooms in a row, numbered from 1 to&nbsp;<b>N</b>&nbsp;from left to right. The rooms are connected by&nbsp;<b>N</b>-1 locked doors, each connecting a pair of adjacent rooms. Each door has a&nbsp;<i>difficulty level</i>&nbsp;indicating how difficult it is for Bangles to open the door. No two doors will have the same difficulty level. The door between the i-th room and (i+1)-th room has difficulty level&nbsp;<b>D<sub>i</sub></b>.</p>

<p>Bangles will pick one of the rooms to start in, and visit each of the rooms in the museum one at a time, taking pictures as she goes. She takes a picture in her starting room, then she repeats the following procedure until she has taken a picture in all the rooms: Of the two locked doors available to her, she will open the door with the lower difficulty level and take a picture in the newly unlocked room. If there is only one locked door available to her, then she will unlock that door. Once a door is unlocked, it remains unlocked.</p>

<p>Bangles is not yet sure which room she would like to start in, so she needs you to answer&nbsp;<b>Q</b>&nbsp;queries. For the i-th query, she would like to know: What is the&nbsp;<b>K<sub>i</sub></b>-th room that she will take a picture in if she starts in the&nbsp;<b>S<sub>i</sub></b>-th room?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. The first line of each test case contains the two integers&nbsp;<b>N</b>&nbsp;and&nbsp;<b>Q</b>. The second line contains&nbsp;<b>N</b>-1 integers, describing the locked doors. The i-th integer (starting from 1) is&nbsp;<b>D<sub>i</sub></b>. Then,&nbsp;<b>Q</b>&nbsp;lines follow, describing the queries. The i-th of these lines contains the two integers&nbsp;<b>S<sub>i</sub></b>&nbsp;and&nbsp;<b>K<sub>i</sub></b>.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is a list of the answers for the&nbsp;<b>Q</b>&nbsp;queries in order, separated by spaces.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>D<sub>i</sub></b>&nbsp;&le; 10<sup>5</sup>, for all i.</li>
	<li>All&nbsp;<b>D<sub>i</sub></b>&nbsp;are distinct.</li>
	<li>1 &le;&nbsp;<b>S<sub>i</sub></b>&nbsp;&le;&nbsp;<b>N</b>, for all i.</li>
	<li>1 &le;&nbsp;<b>K<sub>i</sub></b>&nbsp;&le;&nbsp;<b>N</b>, for all i.</li>
</ul>

### 힌트

<p>In sample case #1, there are four queries:</p>

<ul>
	<li>In the first query, Bangle takes pictures in the rooms in the order 3, 2, 4, 5 and 1, so the answer is 5.</li>
	<li>In the second query, Bangle takes pictures in the rooms in the order 3, 2, 4, 5 and 1, so the answer is 3.</li>
	<li>In the third query, Bangle takes pictures in the rooms in the order 1, 2, 3, 4 and 5, so the answer is 5.</li>
	<li>In the fourth query, Bangle takes pictures in the rooms in the order 4, 3, 2, 5, and 1, so the answer is 2.</li>
</ul>

<p>In sample case #2, there are two queries:</p>

<ul>
	<li>In the first query, Bangle takes pictures in the rooms in the order 6, 5, 4, 3, 2, 1, 7, 8, 9 and 10, so the answer is 8.</li>
	<li>The second query is the same as the first, so the answer is also 8.</li>
</ul>