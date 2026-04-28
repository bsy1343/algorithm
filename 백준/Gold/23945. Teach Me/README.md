# [Gold II] Teach Me - 23945

[문제 링크](https://www.acmicpc.net/problem/23945)

### 성능 요약

시간 제한: 40 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 33, 정답: 18, 맞힌 사람: 15, 정답 비율: 75.000%

### 분류

자료 구조, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Here at Google we love teaching new skills to each other! There are&nbsp;<b>N</b>&nbsp;employees at Google, numbered from 1 to&nbsp;<b>N</b>. There are a total of&nbsp;<b>S</b>&nbsp;different skills, numbered from 1 to&nbsp;<b>S</b>. Each employee knows up to 5 different skills.</p>

<p>The i-th employee can&nbsp;<i>mentor</i>&nbsp;the j-th employee if there is a skill that the i-th employee knows that the j-th employee does not know. How many ordered pairs (i, j) are there where the i-th employee can mentor the j-th employee?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow. The first line of each test case gives the two integers&nbsp;<b>N</b>&nbsp;and&nbsp;<b>S</b>, which are the number of employees and the number of skills respectively.</p>

<p>The next&nbsp;<b>N</b>&nbsp;lines describe the skills that each employee knows. The i-th of these lines begins with an integer&nbsp;<b>C<sub>i</sub></b>&nbsp;which is the number of skills the i-th employee knows. Then,&nbsp;<b>C<sub>i</sub></b>&nbsp;integers follow on the same line. The j-th of these integers is&nbsp;<b>A<sub>ij</sub></b>&nbsp;indicating that the i-th employee knows the skill&nbsp;<b>A<sub>ij</sub></b>.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the number of ordered pairs (i, j) where the i-th employee can mentor the j-th employee.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<b>S</b>&nbsp;&le; 1000.</li>
	<li>1 &le;&nbsp;<b>C<sub>i</sub></b>&nbsp;&le; 5 for all i.</li>
	<li>1 &le;&nbsp;<b>A<sub>ij</sub></b>&nbsp;&le;&nbsp;<b>S</b>&nbsp;for all i and j.</li>
	<li><b>A<sub>ij</sub></b>&nbsp;&ne;&nbsp;<b>A<sub>ik</sub></b>&nbsp;for all j &ne; k.</li>
</ul>