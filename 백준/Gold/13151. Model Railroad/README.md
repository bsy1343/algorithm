# [Gold III] Model Railroad - 13151

[문제 링크](https://www.acmicpc.net/problem/13151)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 198, 정답: 81, 맞힌 사람: 70, 정답 비율: 40.698%

### 분류

그래프 이론, 최소 스패닝 트리

### 문제 설명

<p>Since childhood you have been fascinated by model railroads. Designing your own tracks, complicated intersections, train stations with miniatures of travellers, train operators, luggage is so much fun! However, it also needs a lot of space. Since your house is more than full by now, you decide to move to the garden.</p>

<p>You have already moved all your completed tracks outside when you notice an important flaw: Since different tracks were in different rooms before, there are stations which cannot be reached from each other. That has to change!</p>

<p>Since you have already fixed the exact positions of the stations, you know the lengths for all possible connections you can build and also which stations are connected already. All connections can be used in both directions. You can decide to remove some existing connections and instead build new ones of at most the same total length. Is it possible to rearrange the railroads so that every station is reachable from all other stations?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>one line with three integers n (2 &le; n &le; 5 &middot; 10<sup>4</sup>), m (0 &le; m &le; 2.5 &middot; 10<sup>5</sup>) and ℓ (0 &le; ℓ &le; m), where n is the number of stations, m is the number of possible connections and ℓ is the number of connections already built;</li>
	<li>m lines describing the connections. Each connection is described by:
	<ul>
		<li>one line with three integers a, b (1 &le; a, b &le; n), and c (0 &le; c &le; 5 &middot; 10<sup>3</sup>) describing that there is a connection from station a to station b of length c.</li>
	</ul>
	</li>
</ul>

<p>The first ℓ of those connections already exist.</p>

### 출력

<p>Output &ldquo;possible&rdquo; if it is possible to construct a connected network as described above, otherwise output &ldquo;impossible&rdquo;.</p>

### 힌트

<p>Figure E.1 depicts the first sample case. It is possible to connect all stations by removing the connections between stations 1 and 2 of length 2 and instead building the connection between stations 2 and 4. The curvature of the rails does not matter because you have a hammer.</p>

<p>In the second case, depicted in Figure E.2, it is not possible to connect all three stations.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/13151.%E2%80%85Model%E2%80%85Railroad/4e9a699a.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/13151.%E2%80%85Model%E2%80%85Railroad/4e9a699a.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/13151/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:325px; width:439px" /></p>

<p style="text-align: center;">Figure E.1: Illustration of the first sample input.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/13151.%E2%80%85Model%E2%80%85Railroad/30cdbf66.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/13151.%E2%80%85Model%E2%80%85Railroad/30cdbf66.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/13151/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:261px; width:429px" /></p>

<p style="text-align: center;">Figure E.2: Illustration of the second sample input.</p>