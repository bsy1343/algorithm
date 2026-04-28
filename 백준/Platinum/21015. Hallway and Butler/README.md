# [Platinum III] Hallway and Butler - 21015

[문제 링크](https://www.acmicpc.net/problem/21015)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 14, 정답: 10, 맞힌 사람: 10, 정답 비율: 71.429%

### 분류

수학, 다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 트리, 조합론, 깊이 우선 탐색, 트리에서의 다이나믹 프로그래밍

### 문제 설명

<p>Doni is a successful businessman and owns a grandiose mansion. In this mansion, there are N rooms numbered from 1 to N connected by N &minus; 1 hallways in such a way that you can travel from any room to any other room through a sequence of hallways. The i<sup>th</sup> hallway connects room u<sub>i</sub> with room v<sub>i</sub> and has a dirtiness level of w<sub>i</sub> which is an even integer.</p>

<p>Despite his wealth, Doni only has one vacuum cleaner that is initially located at room 1. As Doni&rsquo;s butler, you intend to clean all the hallways. When cleaning one hallway, you intend to do it by running the vacuum cleaner from one end to the other end of the hallway. For example, to run the vacuum cleaner through the i<sup>th</sup> hallway, you can start from room u<sub>i</sub> and end at room v<sub>i</sub>, or you can start from room v<sub>i</sub> and end at room u<sub>i</sub>. A hallway with a dirtiness level of w must be passed by the vacuum cleaner <strong>exactly</strong> w times.</p>

<p>How many ways are there to clean all the hallways (assuming you start and finish the cleaning at room 1)? Two ways are considered to be different if there exists an integer j such that the j<sup>th</sup> hallway passed by the vacuum cleaner on both ways are different.</p>

<p>Consider the following example of mansion with N = 4 rooms and 3 hallways.</p>

<ul>
	<li>The 1<sup>st</sup> hallway connects room 1 and room 2 with a dirtiness level of 2.</li>
	<li>The 2<sup>nd</sup> hallway connects room 1 and room 3 with a dirtiness level of 4.</li>
	<li>The 3<sup>rd</sup> hallway connects room 3 and room 4 with a dirtiness level of 2.</li>
</ul>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/f43ead35-9b69-421b-b970-abb31e678a12/-/preview/" style="width: 275px; height: 52px;" /></p>

<p>There are 6 ways to clean all the hallways in this example, by going through these rooms:</p>

<ul>
	<li>1 &rarr; 2 &rarr; 1 &rarr; 3 &rarr; 1 &rarr; 3 &rarr; 4 &rarr; 3 &rarr; 1.</li>
	<li>1 &rarr; 2 &rarr; 1 &rarr; 3 &rarr; 4 &rarr; 3 &rarr; 1 &rarr; 3 &rarr; 1.</li>
	<li>1 &rarr; 3 &rarr; 1 &rarr; 2 &rarr; 1 &rarr; 3 &rarr; 4 &rarr; 3 &rarr; 1.</li>
	<li>1 &rarr; 3 &rarr; 1 &rarr; 3 &rarr; 4 &rarr; 3 &rarr; 1 &rarr; 2 &rarr; 1.</li>
	<li>1 &rarr; 3 &rarr; 4 &rarr; 3 &rarr; 1 &rarr; 2 &rarr; 1 &rarr; 3 &rarr; 1.</li>
	<li>1 &rarr; 3 &rarr; 4 &rarr; 3 &rarr; 1 &rarr; 3 &rarr; 1 &rarr; 2 &rarr; 1.</li>
</ul>

<p>In each way, the hallway connecting room 1 and room 2 is passed 2 times, the hallway connecting room 1 and room 3 is passed 4 times, and the hallway connecting rooms 3 and room 4 is passed 2 times.</p>

### 입력

<p>Input begins with a line containing an integer: N (2 &le; N &le; 10 000) representing the number of rooms. The next N &minus; 1 lines each contains three integers: u<sub>i</sub> v<sub>i</sub> w<sub>i</sub> (1 &le; u<sub>i</sub>, v<sub>i</sub> &le; N; 2 &le; w<sub>i</sub> &le; 200; w<sub>i</sub> is an even integer) representing the rooms connected by the hallways and their dirtiness level, respectively. It is guaranteed that you can travel from any room to any other room through a sequence of hallways.</p>

### 출력

<p>Output in a line an integer representing the number of ways to clean all the hallways modulo 998 244 353.</p>