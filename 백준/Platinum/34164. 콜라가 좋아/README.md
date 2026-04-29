# [Platinum II] 콜라가 좋아 - 34164

[문제 링크](https://www.acmicpc.net/problem/34164)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 38, 정답: 14, 맞힌 사람: 13, 정답 비율: 54.167%

### 분류

다이나믹 프로그래밍, 수학, 조합론

### 문제 설명

<p>동우는 제로가 싫다. 그래서 동우는 일반 콜라만 마신다.</p>

<p>유틸은 제로가 좋다. 그래서 유틸은 제로 콜라만 마신다.</p>

<p>동우와 유틸은 조개구이를 먹을 때면 <strong>콜라탑</strong>들을 쌓기 시작한다. <strong>콜라탑</strong>은 삼각형의 모양이며, 높이 $H$의 <strong>콜라탑</strong>은 $1$층에 콜라 $H$개, $2$층에 콜라 $H-1$개, $\cdots$, $H$층에 콜라 $1$개가 쌓여 있다. 그리고 각 콜라 캔을 원형으로 생각하고, 일반 콜라는 빨간색, 제로 콜라는 검정색을 칠해 도식화할 수 있다. 예를 들어 왼쪽 <strong>콜라탑</strong>을 도식화하여 오른쪽 그림으로 나타낼 수 있다.</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34164.%E2%80%85%EC%BD%9C%EB%9D%BC%EA%B0%80%E2%80%85%EC%A2%8B%EC%95%84/303b75fa.jpg" data-original-src="https://boja.mercury.kr/assets/problem/34164-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width:300px;max-width:100%;margin:0 calc(2% + 10px) 0 0;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34164.%E2%80%85%EC%BD%9C%EB%9D%BC%EA%B0%80%E2%80%85%EC%A2%8B%EC%95%84/d8b667de.png" data-original-src="https://boja.mercury.kr/assets/problem/34164-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width:300px;max-width:100%;margin:0 0 0 0;"></p>

<p style="text-align:center">동우가 친구 $3$명과 조개구이를 먹을 때 실제로 쌓은 높이 $4$의 <strong>콜라탑</strong>이다.</p>

<p>동우는 $N$개의 일반 콜라를, 유틸은 $M$개의 제로 콜라를 마셨다. 이제 이 $N+M$개의 콜라 캔을 모두 사용하여 한 개 이상의 <strong>콜라탑</strong>을 쌓아, 탑의 높이가 감소하지 않는 순서로 나열하고자 한다. 이때, 각 <strong>콜라탑</strong>을 도식화한 그림에 대해, 각각을 시계 혹은 반시계 방향으로 $120^\circ$씩 회전하더라도 원래와 모양이 같아야 한다.</p>

<p>이 조건을 만족하도록 $N+M$개의 콜라 캔을 모두 사용하여 한 개 이상의 <strong>콜라탑</strong>을 쌓아 탑의 높이가 감소하지 않는 순서로 나열하는 경우의 수를 구해보자.</p>

<p>각 <strong>콜라탑</strong>의 높이는 최소 $1$이상이어야 하며, 탑을 나열한 순서가 다르면 다른 경우로 센다.</p>

### 입력

<p>첫 번째 줄에 정수 $N,M(1\le N,M\le 1\, 000)$이 공백으로 구분되어 주어진다.</p>

### 출력

<p>첫 번째 줄에 정답을 $998\, 244\, 353$로 나눈 나머지를 출력한다.</p>