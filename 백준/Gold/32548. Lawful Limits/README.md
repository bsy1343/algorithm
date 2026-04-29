# [Gold III] Lawful Limits - 32548

[문제 링크](https://www.acmicpc.net/problem/32548)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 33, 정답: 24, 맞힌 사람: 23, 정답 비율: 74.194%

### 분류

그래프 이론, 데이크스트라, 최단 경로

### 문제 설명

<p>One late afternoon you are driving to get home in your Big And Pricey Car. You have had a long day and are eager to get home as soon as possible. Your country's road network has many roads with varying speed limits, and has one strange quirk: at some time \(t\), the maximum speed on each road is raised. Because you want to get home as soon as possible, you instantly increase your speed to the new maximum speed of the road you are on at time \(t\).</p>

<p>You start driving at time \(0\) at junction \(1\) and are going to \(n\). What is the earliest time you can reach your destination? As an example, consider the first sample case, visualized in Figure L.1.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32548.%E2%80%85Lawful%E2%80%85Limits/8a81a8ac.png" data-original-src="https://boja.mercury.kr/assets/problem/32548-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 250px; height: 157px;"></p>

<p style="text-align: center;">Figure L.1: Visualization of the first sample input. The edges are marked with their lengths. On all roads, the maximum speed is \(1\) before time \(t\) and \(2\) from time \(t\) onwards.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with three integers \(n\), \(m\), and \(t\) (\(2\leq n\leq10^5\), \(1\leq m\leq10^5\), \(0\leq t\leq10^9\)), the number of junctions, the number of roads, and the time the speed limit increases.</li>
	<li>\(m\) lines, each with five integers \(x\), \(y\), \(\ell\), \(v\), and \(w\) (\(1\leq x,y\leq n\), \(1\leq\ell\leq10^9\), \(1\leq v&lt;w\leq10^9\)), the start and end junction of a road, length of this road, and the speed limits on this road before time \(t\) and from time \(t\) onwards.</li>
</ul>

<p>There is at most one road between any two junctions, and one can travel in both directions on any road. No road leads from one junction to that same junction. It is guaranteed that there is always a path between any two junctions.</p>

### 출력

<p>Output the minimum amount of time it takes to get from the start to your destination.</p>

<p>Your answer should have an absolute or relative error of at most $10^{-6}$.</p>