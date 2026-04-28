# [Platinum II] Avoider - 11379

[문제 링크](https://www.acmicpc.net/problem/11379)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 66, 정답: 33, 맞힌 사람: 29, 정답 비율: 56.863%

### 분류

다이나믹 프로그래밍, 런타임 전의 전처리

### 문제 설명

<p>Consider points with integer coordinates in the plane. We start from the origin, make a first step towards the point (1, 0) and then every next step is a move to one of the four neighboring integer points (up, down, left or right) so that we are always at a point with nonnegative coordinates. Moreover, it is not allowed to visit twice a point. Let us count how many different routes of the described kind we may obtain using n steps. For example, when n = 2, 3 and 4, counting the routes gives 2, 5 and 12, respectively.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11379.%E2%80%85Avoider/85063769.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/11379.%E2%80%85Avoider/85063769.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11379/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:348px; width:527px" /></p>

<p>Write program avoider that inputs two positive integers a and b (0 &lt; a &lt; b &lt; 29) and displays the sum of counting the number of routes for values of n = a, a + 1, ..., b.</p>

### 입력

<p>Two positive integers a and b (0 &lt; a &lt; b &lt; 29)</p>

### 출력

<p>The sum of counting the number of routes for values of n = a, a + 1, ..., b.</p>