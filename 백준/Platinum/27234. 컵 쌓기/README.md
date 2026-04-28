# [Platinum II] 컵 쌓기 - 27234

[문제 링크](https://www.acmicpc.net/problem/27234)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 84, 정답: 58, 맞힌 사람: 43, 정답 비율: 72.881%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p> </p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27234.%E2%80%85%EC%BB%B5%E2%80%85%EC%8C%93%EA%B8%B0/2a40826d.png" data-original-src="https://upload.acmicpc.net/15a2917e-b107-4fed-acc7-e30bcfde7b3b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="display: block; margin-left: auto; margin-right: auto; width: 100%; max-width: 400px;" /></p>

<p>스포츠스태킹은 $N$개의 컵을 다양한 방법으로 빠르게 쌓는 스포츠 경기다. BOJ 스포츠스태킹 협회의 회장 한나는 이번에 새롭게 출시한 빨간 컵의 판매량을 늘리기 위해 새로운 스포츠스태킹 종목을 도입하고자 한다. (문제의 그림에서 빨간 컵은 가로줄이 그려져 있는 컵이다.) 그 규칙은 다음과 같다.</p>

<p>참가자는 빨간 컵 $N$개와 파란 컵 $N$개를 준비한다. 참가자는 이 중 $N$개의 컵을 쌓아서 규칙에 맞는 배치를 아무거나 만들어야 한다. 컵을 쌓는 규칙은 다음과 같다.</p>

<ul>
	<li>맨 아랫층에는 컵이 일렬로 연속해 있어야 한다.</li>
	<li>두 이웃한 컵의 중앙 위쪽에 다른 컵을 쌓을 수 있다. 이를 반복해서 여러 층을 쌓을 수도 있다.</li>
	<li>두 이웃한 컵 위에 다른 컵을 쌓으려면, 두 컵 중 적어도 하나는 빨간 컵이어야 한다.</li>
</ul>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27234.%E2%80%85%EC%BB%B5%E2%80%85%EC%8C%93%EA%B8%B0/ad526bc4.png" data-original-src="https://upload.acmicpc.net/12f47177-3446-470c-8a64-e42af06df5a4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="display: block; margin-left: auto; margin-right: auto; width: 100%; max-width: 300px;" /></p>

<p>색깔이 같은 컵끼리는 구분할 수 없다고 할 때, 컵을 쌓을 수 있는 경우의 수를 주어지는 소수 $P$로 나눈 나머지를 구하시오. 두 배치가 서로 대칭이어도, 서로 다른 배치로 센다.</p>

### 입력

<p>첫 번째 줄에 쌓을 컵의 개수를 나타내는 정수 $N$과 나누어 출력할 소수 $P$가 공백을 사이에 두고 주어진다.</p>

### 출력

<p>규칙을 만족하도록 $N$개의 컵을 쌓는 경우의 수를 $P$로 나눈 나머지를 출력한다.</p>

### 제한

<ul>
	<li>$1\le N\le 150$</li>
	<li>$2\le P\le 10^9$</li>
	<li>P는 소수이다.</li>
</ul>

### 힌트

<p>$3$개의 컵을 쌓는 방법은 다음 그림과 같이 $14$가지가 있다.<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27234.%E2%80%85%EC%BB%B5%E2%80%85%EC%8C%93%EA%B8%B0/92c2ea97.png" data-original-src="https://upload.acmicpc.net/d151ac1a-03f8-448e-85c7-acbccbc538e8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="display: block; margin-left: auto; margin-right: auto; width: 100%; max-width: 600px;" /></p>