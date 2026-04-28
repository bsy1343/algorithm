# [Gold I] Light - 27428

[문제 링크](https://www.acmicpc.net/problem/27428)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 35, 정답: 9, 맞힌 사람: 9, 정답 비율: 30.000%

### 분류

조합론, 유클리드 호제법, 포함 배제의 원리, 수학, 정수론

### 문제 설명

<p>In the physics laboratory there are N light bulbs in a row, numbered from 1 to N. Initially, all the bulbs are turned off. During class, each of the K students chooses an integer positive number d<sub>i</sub> (2 &le; d<sub>i</sub> &le; N), and changes the state of all the bulbs whose number is divisible by di . Changing the state of a bulb means that if the bulb is turned on, then it will become turned off, and if it is turned off, it will become turned on. After changing the state of the bulbs, the student leaves the class.</p>

<p>Write a program that computes how many light bulbs will remain turned on, after all the students leave the class.</p>

### 입력

<p>The standard input contains on the first line the positive integer N, representing the number of the light bulbs. The second line contains the number K, the number of students. The third line contains K integers d<sub>1</sub>, d<sub>2</sub>, ..., d<sub>K</sub>, separated by a single white space.</p>

### 출력

<p>Your program should write to the standard output a single line containing the number of the bulbs that will remain turned on, after all the students leave the class.</p>

### 제한

<ul>
	<li>3 &le; N &le; 10<sup>12</sup></li>
	<li>1 &le; K &le; 22</li>
	<li>1 &le; d<sub>i</sub> &le; min(N, 10<sup>6</sup>)</li>
	<li>The numbers d<sub>i</sub> are not necessarily distinct</li>
</ul>

### 힌트

<p>Initially, all the bulbs are turned off. After the first student changes the state of the bulbs, the 2<sup>nd</sup>, 4<sup>th</sup>, 6<sup>th</sup> and the 8<sup>th</sup> bulb will be on. After the second student changes the state of the bulbs, the 2<sup>nd</sup>, 3<sup>rd</sup>, 4<sup>th</sup> and the 8<sup>th</sup> bulb will remain on.</p>