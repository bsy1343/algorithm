# [Platinum IV] Modern Art Plagiarism (Small) - 12693

[문제 링크](https://www.acmicpc.net/problem/12693)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 21, 맞힌 사람: 19, 정답 비율: 73.077%

### 분류

다이나믹 프로그래밍, 그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 트리, 트리에서의 다이나믹 프로그래밍, 이분 매칭

### 문제 설명

<p>You have pictures of two sculptures. The sculptures consist of several solid metal spheres, and some rubber pipes connecting pairs of spheres. The pipes in each sculpture are connected in such a way that for any pair of spheres, there is exactly one path following a series of pipes (without repeating any) between those two spheres. All the spheres have the same radius, and all the pipes have the same length.</p>

<p>You suspect that the smaller of the two sculptures was actually created by simply removing some spheres and pipes from the larger one. You want to write a program to test if this is possible.</p>

<p>The input will contain several test cases. One sculpture is described by numbering the spheres consecutively from 1, and listing the pairs of spheres which are connected by pipes. The numbering is chosen independently for each sculpture.</p>

### 입력

<ul>
	<li>One line containing an integer&nbsp;<strong>C</strong>, the number of test cases in the input file.</li>
</ul>

<p>For each test case, there will be:</p>

<ul>
	<li>One line containing the integer&nbsp;<strong>N</strong>, the number of spheres in the large sculpture.</li>
	<li><strong>N</strong>&minus;1 lines, each containing a pair of space-separated integers, indicating that the two spheres with those numbers in the large sculpture are connected by a pipe.</li>
	<li>One line containing the integer&nbsp;<strong>M</strong>, the number of spheres in the small sculpture.</li>
	<li><strong>M</strong>&minus;1 lines, each containing a pair of space-separated integers, indicating that the two spheres with those numbers in the small sculpture are connected by a pipe.</li>
</ul>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>C</strong>&nbsp;&le; 100</li>
	<li>2 &le;&nbsp;<strong>N</strong>&nbsp;&le; 8</li>
	<li>1 &le;&nbsp;<strong>M</strong>&nbsp;&lt; N</li>
</ul>

### 출력

<ul>
	<li><strong>C</strong>&nbsp;lines, one for each test case in the order they occur in the input file, containing &quot;Case #<strong>X</strong>: YES&quot; if the small sculpture in case&nbsp;<strong>X</strong>&nbsp;could have been created from the large sculpture in case&nbsp;<strong>X</strong>, or &quot;Case #<strong>X</strong>: NO&quot; if it could not. (<strong>X</strong>&nbsp;is the number of the test case, between 1 and&nbsp;<strong>C</strong>.)</li>
</ul>

### 힌트

<p>In the first case, the large sculpture has five spheres connected in a line, and the small sculpture has one sphere that has three other spheres connected to it. There&#39;s no way the smaller sculpture could have been made by removing things from the larger one.</p>

<p>In the second case, the small sculpture is four spheres connected in a line. These can match the larger sculpture&#39;s spheres in the order 2-1-4-5.</p>