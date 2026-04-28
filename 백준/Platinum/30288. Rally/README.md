# [Platinum V] Rally - 30288

[문제 링크](https://www.acmicpc.net/problem/30288)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 1024 MB

### 통계

제출: 66, 정답: 27, 맞힌 사람: 24, 정답 비율: 40.678%

### 분류

그래프 이론, 그래프 탐색, 비둘기집 원리

### 문제 설명

<p>Byteland has N cities. Some of the cities are connected by roads.</p>

<p>Byteland rally organisers asked you to set up a track that would consist of exactly four roads and that would start and end in the same city. A road can not be added to the track more than once.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/30288.%E2%80%85Rally/aed1b274.png" data-original-src="https://upload.acmicpc.net/0de5dcd6-238f-40db-926e-6900838226e7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 423px; height: 328px;" /></p>

<p style="text-align: center;">Figure 1: Four marked roads make a valid track</p>

<p>Knowing the road map of Byteland, set up a rally track.</p>

### 입력

<p>The first line contains the number of cities N and the number of roads M. Cities are numbered from 1 to N.</p>

<p>The following M lines describe M roads. Each line contains 2 integers from 1 to N &ndash; the numbers of the cities the road connects.</p>

<p>Roads connect distinct cities, and any pair of cities is connected by at most one road.</p>

### 출력

<p>If it is possible to set up a track, output <code>TAIP</code> on the first line. On the second line output four numbers &ndash; the city numbers the track goes through.</p>

<p>If several solutions are possible, output any of them.</p>

<p>If it is impossible to set up a track, output <code>NE</code>.</p>

### 제한

<ul>
	<li>1 &le; N &le; 5 000</li>
	<li>0 &le; M &le; 500 000</li>
	<li>M &le; N(N - 1)/2</li>
</ul>