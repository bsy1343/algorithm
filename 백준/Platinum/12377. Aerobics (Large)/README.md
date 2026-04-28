# [Platinum II] Aerobics (Large) - 12377

[문제 링크](https://www.acmicpc.net/problem/12377)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 56, 정답: 20, 맞힌 사람: 16, 정답 비율: 32.000%

### 분류

정렬, 기하학, 무작위화

### 문제 설명

<p>The aerobics class begins. The trainer says, &quot;Please position yourselves on the training mat so that each one of you has enough space to move your arms around freely, and not hit anybody else.&quot; People start milling around on the mat, trying to position themselves properly. Minutes pass, and finally the trainer is so annoyed that he asks you to write a program that will position all the people correctly, hoping it will be quicker than letting them figure it out for themselves!</p>

<p>You are given the dimensions (width and length) of the mat on which the class takes place. For every student, there is a circular area she has to have for herself, with radius equal to the reach of her arms. These circles can not intersect, though they can touch; and the center of each circle (where the student stands) has to be on the mat. Note that the arms&nbsp;<strong>can</strong>&nbsp;reach outside the mat. You know that there&#39;s plenty of space on the mat &mdash; the area of the mat is at least five times larger than the total area of the circles required by all the people in the class. It will always be possible for all the people to position themselves as required.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case consists of two lines. The first line contains three integers:&nbsp;<strong>N</strong>,&nbsp;<strong>W</strong>&nbsp;and&nbsp;<strong>L</strong>, denoting the number of students, the width of the mat, and the length of the mat, respectively. The second line contains&nbsp;<strong>N</strong>&nbsp;integers&nbsp;<strong>r</strong><sub>i</sub>, denoting the reach of the arms of the i<sup>th</sup>&nbsp;student.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 50.</li>
	<li>1 &le;&nbsp;<strong>W, L</strong>&nbsp;&le; 10<sup>9</sup>.</li>
	<li>1 &le;&nbsp;<strong>r</strong><sub>i</sub>&nbsp;&le; 10<sup>5</sup>.</li>
	<li>The area of the mat is at least 5 times larger than the total area of the circles:&nbsp;</li>
	<li>5*&pi;*(<strong>r<sub>1</sub><sup>2</sup></strong>&nbsp;+ ... +&nbsp;<strong>r<sub>N</sub><sup>2</sup></strong>) &le;&nbsp;<strong>W*L</strong>.</li>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10<sup>3</sup>.</li>
	<li>The total number of circles in all test cases will be &le; 6000.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #n: y&quot;, where n is the case number (starting from 1) and y is a string containing 2<strong>N</strong>&nbsp;numbers, each of which can be an integer or a real number:&nbsp;<strong>x</strong><sub>1</sub>,&nbsp;<strong>y</strong><sub>1</sub>,&nbsp;<strong>x</strong><sub>2</sub>,&nbsp;<strong>y</strong><sub>2</sub>, etc., where the pair (<strong>x</strong><sub>i</sub>,&nbsp;<strong>y</strong><sub>i</sub>) is the position where the i<sup>th</sup>student should stand (with 0 &le;&nbsp;<strong>x</strong><sub>i</sub>&nbsp;&le;&nbsp;<strong>W</strong>&nbsp;and 0 &le;&nbsp;<strong>y</strong><sub>i</sub>&nbsp;&le; L).</p>

<p>As there will likely be multiple ways to position the students on the mat, you may output any correct positioning; but remember that you may not submit an output file more than 200kB in size.</p>