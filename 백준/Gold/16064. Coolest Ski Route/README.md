# [Gold III] Coolest Ski Route - 16064

[문제 링크](https://www.acmicpc.net/problem/16064)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 492, 정답: 250, 맞힌 사람: 203, 정답 비율: 53.421%

### 분류

다이나믹 프로그래밍, 그래프 이론, 방향 비순환 그래프, 위상 정렬, 플로이드–워셜

### 문제 설명

<p>John loves winter. Every skiing season he goes heli-skiing with his friends. To do so, they rent a helicopter that flies them directly to any mountain in the Alps. From there they follow the picturesque slopes through the untouched snow.</p>

<p>Of course they want to ski on only the best snow, in the best weather they can get. For this they use a combined condition measure and for any given day, they rate all the available slopes.</p>

<p>Can you help them find the most awesome route?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line with two integers n (2 &le; n &le; 1000) and m (1 &le; m &le; 5000), where n is the number of (1-indexed) connecting points between slopes and m is the number of slopes.</li>
	<li>m lines, each with three integers s, t, c (1 &le; s, t &le; n, 1 &le; c &le; 100) representing a slope from point s to point t with condition measure c.</li>
</ul>

<p>Points without incoming slopes are mountain tops with beautiful scenery, points without outgoing slopes are valleys. The helicopter can land on every connecting point, so the friends can start and end their tour at any point they want. All slopes go downhill, so regardless of where they start, they cannot reach the same point again after taking any of the slopes.</p>

### 출력

<p>Output a single number n that is the maximum sum of condition measures along a path that the friends could take.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/16064.%E2%80%85Coolest%E2%80%85Ski%E2%80%85Route/65f4b5f9.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/16064.%E2%80%85Coolest%E2%80%85Ski%E2%80%85Route/65f4b5f9.png" data-original-src="https://upload.acmicpc.net/f8750e42-70eb-473e-b2ba-8573e4de0f73/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 509px; height: 320px;" /></p>

<p style="text-align: center;">Figure C.1: Map of the second sample case</p>