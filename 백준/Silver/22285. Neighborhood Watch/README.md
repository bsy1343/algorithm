# [Silver III] Neighborhood Watch - 22285

[문제 링크](https://www.acmicpc.net/problem/22285)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 69, 정답: 45, 맞힌 사람: 37, 정답 비율: 63.793%

### 분류

수학, 조합론

### 문제 설명

<p>Jennifer was nominated to be neighborhood watch captain and is now in charge of managing the watch for her street.&nbsp;</p>

<p>Jennifer&#39;s street consists of houses on only one side of the road. She has a plan of which houses will be a <em>neighborhood watch house</em> and wants to know how safe the plan is. A <em>walk</em> from one house to another house (not necessarily distinct) is considered <em>safe</em> if there is at least one house along the walk that is a neighborhood watch house. The <em>safety rating</em> of a plan is the number of walks that are safe on the street. Since a walk is either safe or not safe, when traveling in either direction, it is not counted twice in the safety rating.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/22285.%E2%80%85Neighborhood%E2%80%85Watch/5a26100f.png" data-original-src="https://upload.acmicpc.net/5f957ee7-a431-4304-af5c-ed6b67daada4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 448px; height: 139px;" /></p>

<p style="text-align: center;">Figure G.1:&nbsp;Sample input. One example of a safe walk is traveling from house $1$ to house $5$.</p>

<p>Tell Jennifer the safety rating of her plan.</p>

### 입력

<p>The first line of input contains two integers $N$ ($1 \leq N \leq 200\,000$), which is the number of houses on the street, and $K$ ($0 \leq K \leq N$), which is the number of neighborhood watch houses in Jennifer&#39;s plan. The houses are numbered $1, \dots , N$.</p>

<p>The next $K$ lines describe the neighborhood watch houses. Each of these lines contains a single integer $H$ ($1 \leq H \leq N$), which is the house number of a neighborhood watch house. The house numbers are given in strictly increasing order.</p>

### 출력

<p>Display the safety rating of Jennifer&#39;s plan.</p>