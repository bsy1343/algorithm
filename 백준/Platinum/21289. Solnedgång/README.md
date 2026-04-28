# [Platinum I] Solnedgång - 21289

[문제 링크](https://www.acmicpc.net/problem/21289)

### 성능 요약

시간 제한: 9 초, 메모리 제한: 1024 MB

### 통계

제출: 121, 정답: 31, 맞힌 사람: 25, 정답 비율: 30.864%

### 분류

그래프 이론, 자료 구조, 정렬, 이분 탐색, 분리 집합

### 문제 설명

<p>You are visiting a very warm country, and it happens to be a sizzling hot day. Luckily, you managed to find the shadow of a house to take cover in. You realize that you probably should head back to the hotel sometime soon, but you also realize that it&#39;s too hot to walk in the sun. The city you are in consists of $N$ houses, placed in a grid, where every house occupies exactly one unit square.</p>

<p>Currently, each house has a shadow that is exactly one unit square long, and is located directly north of the house. Since the sun just started to set, this shadow will extend one more unit square north per time unit. You can walk from the shadow of one house to another one, if the shadows share an edge of length at least one (see figure). You cannot walk through houses.</p>

<p>The question is how long it will take before there exists a path to the hotel that does not involve getting burned by the sun. The hotel is house number $N$, and you are currently in the shadow of house number 1. Since the hotel entrence is at the north side of the house, that&#39;s where you need to go. In the worst case you might have to wait until nightfall, which will occur in $K$ units of time.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/21289.%E2%80%85Solnedg%C3%A5ng/2c5baa41.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/21289.%E2%80%85Solnedg%C3%A5ng/2c5baa41.png" data-original-src="https://upload.acmicpc.net/a59da767-95cb-4fc8-801b-27689bd54b8c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 512px; height: 256px;" /></p>

### 입력

<p>The first line contains two space-separated integers $N$ and $K$ - the number of houses in the city and the number of time units before nightfall.</p>

<p>The next $N$ lines contains 2 integers $x y$ each, the coordinates of the houses. The first line contains the coordinates of the house which you take cover behind, and the last line contains the coordinate of the hotel.</p>

<p>It is guaranteed that every house has a shadow, i.e. no house is placed immediately south of another house.</p>

### 출력

<p>You should output a single integer, the time it takes before there exist a path to the hotell which goes entirely through the shadows, or <code>&quot;NATT&quot;</code> in case this time exceeds or equals $K$.</p>

### 제한

<ul>
	<li>$1 \le N$</li>
	<li>$0 \le K$</li>
</ul>