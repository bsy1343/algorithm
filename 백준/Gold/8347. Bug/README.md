# [Gold III] Bug - 8347

[문제 링크](https://www.acmicpc.net/problem/8347)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 62, 정답: 34, 맞힌 사람: 29, 정답 비율: 59.184%

### 분류

그래프 이론, 최단 경로, 데이크스트라

### 문제 설명

<p>Your electronic calendar contains an error - something that programmers call a bug. Due to this bug, even integers cannot be entered into the calendar.</p>

<p>You are planning a business trip from Bytetown to Bitcity. Obviously, you would like to take the shortest path for the trip. After you return, you will have to enter the length of the path to your calendar, so the length needs to be an odd integer.</p>

<p>Taking into consideration that the bug in the calendar will surely remain uncorrected for quite a long time, and that the road system in Byteland will probably be reconstructed multiple times, you decided to write a program that will help you in dealing with similar problems in future.</p>

<p>Write a program that:</p>

<ul>
	<li>reads a description of the map of Byteland from the standard input,</li>
	<li>computes the length of the shortest odd-length path from Bytetown to Bitcity or checks that such path does not exist,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>The first line of input contains two integers <em>n</em>&nbsp;and <em>m</em>&nbsp;(2 &le; <em>n</em> &le; 200 000, 0 &le; <em>m</em> &le; 500 000), separated by a single space and denoting the number of cities and the number of roads in Byteland. The cities are numbered from 1&nbsp;to <em>n</em>; Bytetown has number 1, whereas Bitcity - number&nbsp;<em>n</em>.</p>

<p>The following&nbsp;<em>n</em>&nbsp;lines describe the system of roads in Byteland. Each of them contains three space-separated integers <em>a</em>, <em>b</em>, <em>c</em>&nbsp;(1 &le; <em>a</em>, <em>b</em> &le; n, <em>a</em> &ne; <em>b</em>, 1 &le; <em>c</em> &le; 1 000) denoting a bidirectional road of length <em>c</em>&nbsp;connecting cities with numbers <em>a</em>&nbsp;and <em>b</em>.</p>

### 출력

<p>The first and only line of output should contain one integer - the length of the shortest odd-length path from Bytetown to Bitcity. The computed path may visit some cities and roads multiple times. Changes in direction of driving (including turning back) can only be performed in cities. If no such path exists, the correct output is 0.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/8347.%E2%80%85Bug/cca07c22.png" data-original-src="https://upload.acmicpc.net/7cb7d303-e754-482f-b8e9-d79940cbb320/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>