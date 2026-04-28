# [Gold III] Ski Cows - 27094

[문제 링크](https://www.acmicpc.net/problem/27094)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 22, 정답: 4, 맞힌 사람: 4, 정답 비율: 40.000%

### 분류

수학, 다이나믹 프로그래밍, 그래프 이론, 방향 비순환 그래프, 임의 정밀도 / 큰 수 연산, 위상 정렬

### 문제 설명

<p>Since his cows have been well-behaved, Farmer John sends them on vacation during the winter to visit with USACO head coach Rob K.  Since Rob lives in Colorado, he loves to take the cows out snow skiing and needs your help to determine the best ski location to visit. Specifically, since he doesn&#39;t want the cows to get bored, he wants to visit a mountain on which there are many routes to ski from top to bottom.</p>

<p>You will be given a file which contains a description of a mountain and its interesting landmarks.  The file describes landmarks, their elevation, and which paths exist between various landmarks.</p>

<p>The landmarks with the largest and smallest elevations represent respectively the top and bottom of the mountain.  All ski routes must start at the top of the mountain and follow some sequence of ski paths, moving from landmark to landmark downhill, until they reach the bottom of the mountain.</p>

<p>Your task is to compute the number of different possible ski routes.</p>

### 입력

<ul>
	<li>The first line contains two integers: N, 2 &le; N &le; 200, which gives the number of &quot;landmarks&quot; on the mountain; and M, which gives the number of &quot;ski paths&quot; on the mountain, where 1 &le; M &le; 5000.  A ski path connects two landmarks (see below).</li>
	<li>Subsequently, N space-separated positive integers smaller than 1,000,000 specify in turn the elevation of each landmark (e.g., landmark 1, landmark 2, ..., landmark N).  All elevations are unique. The integers are given 10 per line, except possibly the last line of these integers.</li>
	<li>Finally, M space-separated pairs of integers (each in the range [1..N]) specify the ski connections of the previously-specified landmarks by listing the pair of indices of each connected pair of landmarks.  Each pair connects two different landmarks (i.e., not from 5 to 5) Each pair of integers is unordered.  There might be multiple ski paths connecting the same pair of landmarks.  The pairs are given ten pairs per line, except possibly the last line of these pairs.</li>
</ul>

### 출력

<p>A single integer on the output line that specifies the total possible number of paths down the mountain.</p>