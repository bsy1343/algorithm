# [Silver III] Mushroom Monster (Small) - 12160

[문제 링크](https://www.acmicpc.net/problem/12160)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 70, 정답: 63, 맞힌 사람: 60, 정답 비율: 90.909%

### 분류

구현

### 문제 설명

<p>Kaylin loves mushrooms. Put them on her plate and she&#39;ll eat them up! In this problem she&#39;s eating a plate of mushrooms, and Bartholomew is putting more pieces on her plate.</p>

<p>In this problem, we&#39;ll look at how many pieces of mushroom are on her plate at 10-second intervals. Bartholomew could put any non-negative integer number of mushroom pieces down at any time, and the only way they can leave the plate is by being eaten.</p>

<p>Figure out the minimum number of mushrooms that Kaylin could have eaten using two different methods of computation:</p>

<ol>
	<li>Assume Kaylin could eat any number of mushroom pieces at any time.</li>
	<li>Assume that, starting with the first time we look at the plate, Kaylin eats mushrooms at a constant rate whenever there are mushrooms on her plate.</li>
</ol>

<p>For example, if the input is&nbsp;<code>10 5 15 5</code>:</p>

<p>With the first method, Kaylin must have eaten at least 15 mushroom pieces: first she eats 5, then 10 more are put on her plate, then she eats another 10. There&#39;s no way she could have eaten fewer pieces.</p>

<p>With the second method, Kaylin must have eaten at least 25 mushroom pieces. We can determine that she must eat mushrooms at a rate of at least 1 piece per second. She starts with 10 pieces on her plate. In the first 10 seconds, she eats 10 pieces, and 5 more are put on her plate. In the next 5 seconds, she eats 5 pieces, then her plate stays empty for 5 seconds, and then Bartholomew puts 15 more pieces on her plate. Then she eats 10 pieces in the last 10 seconds.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;&nbsp;<strong>T</strong>&nbsp;test cases follow. Each will consist of one line containing a single integer&nbsp;<strong>N</strong>, followed by a line containing&nbsp;<strong>N</strong>&nbsp;space-separated integers&nbsp;<strong>m</strong><sub>i</sub>; the number of mushrooms on Kaylin&#39;s plate at the start, and at 10-second intervals.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>2 &le;&nbsp;<strong>N</strong>&nbsp;&le; 10.</li>
	<li>0 &le;&nbsp;<strong>m</strong><sub>i</sub>&nbsp;&le; 100.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y z&quot;, where x is the test case number (starting from 1), y is the minimum number of mushrooms Kaylin could have eaten using the first method of computation, and z is the minimum number of mushrooms Kaylin could have eaten using the second method of computation.</p>