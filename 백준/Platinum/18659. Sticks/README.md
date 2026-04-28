# [Platinum IV] Sticks - 18659

[문제 링크](https://www.acmicpc.net/problem/18659)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 38, 정답: 13, 맞힌 사람: 10, 정답 비율: 40.000%

### 분류

브루트포스 알고리즘, 다이나믹 프로그래밍

### 문제 설명

<p>Bob has 12 sticks of lengths l<sub>1</sub>, l<sub>2</sub>, . . . , l<sub>12</sub>. He wants to use some sticks to form triangles as many as possible. Each triangle can be built by three different sticks l<sub>a</sub>, l<sub>b</sub>, l<sub>c</sub> such that l<sub>a</sub> + l<sub>b</sub> &gt; l<sub>c</sub>, l<sub>a</sub> + l<sub>c</sub> &gt; l<sub>b</sub> and l<sub>b</sub> + l<sub>c</sub> &gt; l<sub>a</sub>. If each stick can be used for at most one triangle, how many triangles can he build at most? Also, could you please find a way to build them all?</p>

### 입력

<p>The input contains several test cases. The first line contains an integer T indicating the number of test cases. The following describes all test cases. For each test case:</p>

<p>The only line contains twelve integers l<sub>1</sub>, l<sub>2</sub>, . . . , l<sub>12</sub>.</p>

### 출력

<p>For each test case, firstly output a line containing &ldquo;Case #x: m&rdquo; (without quotes), where x is the test case number starting from 1, and m is the maximum number of triangles that can be built.</p>

<p>Then, output m lines, each line of which contains three integers, representing three side lengths of a triangle.</p>

<p>If there are many optimal solutions, please output any of them. Note that every stick for each test case can be used at most once, and every two adjacent integers in a line of the output should be separated by one space.</p>

### 제한

<ul>
	<li>1 &le; T &le; 6000</li>
	<li>1 &le; l<sub>1</sub>, l<sub>2</sub>, . . . , l<sub>12</sub> &le; 10<sup>9</sup></li>
</ul>