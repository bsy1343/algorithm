# [Gold III] 치킨 먹고 싶다 - 13199

[문제 링크](https://www.acmicpc.net/problem/13199)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 7326, 정답: 564, 맞힌 사람: 407, 정답 비율: 13.981%

### 분류

수학

### 문제 설명

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/13199.%E2%80%85%EC%B9%98%ED%82%A8%E2%80%85%EB%A8%B9%EA%B3%A0%E2%80%85%EC%8B%B6%EB%8B%A4/e0fd2e7d.jpg" data-original-src="%EB%B0%B1%EC%A4%80/Gold/13199.%E2%80%85%EC%B9%98%ED%82%A8%E2%80%85%EB%A8%B9%EA%B3%A0%E2%80%85%EC%8B%B6%EB%8B%A4/e0fd2e7d.jpg" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/13199/chicken.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:520px; width:780px" /></p>

<p>서울대학교 301동에는 아는 사람만 아는 &ldquo;눕치킨&rdquo;이란 치킨집이 있다. 이 치킨집은 여느 치킨집처럼 치킨을 시킬 때 마다 쿠폰을 <em>C</em> 장 주고, 쿠폰을 <em>F</em> 장 모으면 치킨을 공짜로 시킬 수 있다.</p>

<p>눕치킨의 단골이 아닌 두영이에게는 쿠폰으로 시키는 치킨에는 쿠폰이 딸려나오지 않는다. 하지만 눕치킨의 단골 손님인 상언이에게는 치킨집 아저씨가 쿠폰으로 시키는 치킨에 쿠폰을 주신다. 상언이와 두영이는 둘 다 <em>M</em> 원을 가지고 있고, 치킨의 가격은 <em>P</em> 원이다. 이때, 상언이는 두영이보다 치킨을 얼마나 더 시켜먹을 수 있을까?</p>

### 입력

<p>첫 번째 줄에 테스트 케이스의 수 <em>T</em> (1 &le; <em>T</em> &le; 20,000)가 주어지고, 이어서 <em>T</em>개의 테스트 케이스가 주어진다.</p>

<p>각 테스트 케이스마다 한 줄에 4개의 정수가 주어진다. 이는 순서대로 치킨의 가격 <em>P</em> (1 &le; <em>P</em> &le; 50,000), 치킨에 쓸 돈 <em>M</em> (1 &le; <em>M</em> &le; 1,000,000), 치킨을 공짜로 시키는데 필요한 쿠폰의 장수 <em>F</em> (2 &le; <em>F</em> &le; 1,000), 치킨을 시키면 주는 쿠폰의 장수 <em>C</em> (1 &le; <em>C</em> &lt; <em>F</em>) 를 의미한다.</p>

### 출력

<p>각 테스트 케이스마다, 첫 번째 줄에 상언이가 두영이보다 더 먹을 수 있는 치킨의 수를 출력한다.</p>