# [Silver III] Falling Apples - 13732

[문제 링크](https://www.acmicpc.net/problem/13732)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 370, 정답: 176, 맞힌 사람: 138, 정답 비율: 50.735%

### 분류

구현

### 문제 설명

<p>You have a 2D rectangular grid. Each grid cell contains either an apple, an obstacle, or is empty. Empty cells are denoted as &rsquo;.&rsquo;, apples as &rsquo;a&rsquo;, and obstacles as &rsquo;#&rsquo;. You are to implement a simulation of gravity, based on the following rules:</p>

<ul>
	<li>The obstacles do not move.</li>
	<li>Whenever there is an empty cell immediately below an apple, the apple moves into the empty cell.</li>
</ul>

<p>Print out the final configuration of the board after all apples reach their final locations. Merely iterating the gravity rule, a step at a time, will likely take too long on large datasets.</p>

### 입력

<p>The input begins with a line containing integers R and C, designating the number of rows and columns of the grid, such that 1 &le; R &le; 50 000 and 1 &le; C &le; 10. The first line is followed by R additional lines, each designating a row of the grid, from top to bottom. Each line has C characters, each of which is either &rsquo;.&rsquo;, &rsquo;a&rsquo;, or &rsquo;#&rsquo;.</p>

### 출력

<p>Output R grid lines displaying the final state.&nbsp;</p>