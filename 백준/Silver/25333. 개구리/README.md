# [Silver II] 개구리 - 25333

[문제 링크](https://www.acmicpc.net/problem/25333)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 334, 정답: 243, 맞힌 사람: 218, 정답 비율: 75.958%

### 분류

수학, 정수론, 유클리드 호제법

### 문제 설명

<p>Albert는 개구리 장난감을 이용한 놀이를 즐겨한다. 이 장난감은 우측으로 $A$cm 혹은 좌측으로 $B$cm 점프할 수 있다.</p>

<p>예를 들어 현재 개구리 장난감의 위치가 $0$이고 $A = 4$, $B = 2$ 라 하자. 아래 그림에서 음수는 처음 위치에서 좌측을, 양수는 우측을 나타내며 거리의 단위는 cm (centimeter) 이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/25333.%E2%80%85%EA%B0%9C%EA%B5%AC%EB%A6%AC/ade8de67.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/25333.%E2%80%85%EA%B0%9C%EA%B5%AC%EB%A6%AC/ade8de67.png" data-original-src="https://upload.acmicpc.net/9a52de1c-6924-4a23-8ee6-47b964b3b881/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 75px; width: 500px;" /></p>

<p>만약 개구리가 우측으로 점프를 한 번 한다면, 아래 그림처럼 $4$cm 만큼 이동한 위치에 착지하게 된다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/25333.%E2%80%85%EA%B0%9C%EA%B5%AC%EB%A6%AC/3b2bf96f.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/25333.%E2%80%85%EA%B0%9C%EA%B5%AC%EB%A6%AC/3b2bf96f.png" data-original-src="https://upload.acmicpc.net/6d33c093-f4bd-4b6e-84b0-7e8a2421c192/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 77px; width: 500px;" /></p>

<p>이후 좌측으로 한 번 점프하면 $2$cm 만큼 이동한 위치에 착지한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/25333.%E2%80%85%EA%B0%9C%EA%B5%AC%EB%A6%AC/e74252a0.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/25333.%E2%80%85%EA%B0%9C%EA%B5%AC%EB%A6%AC/e74252a0.png" data-original-src="https://upload.acmicpc.net/b09490d6-ab48-4045-8551-666495da3e1a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 74px; width: 500px;" /></p>

<p>여기서 다시 좌측으로 두 번 더 점프하면 총 $4$cm를 움직이게 되어 처음 위치에서 좌측으로 $2$cm 떨어진 지점에 착지한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/25333.%E2%80%85%EA%B0%9C%EA%B5%AC%EB%A6%AC/037c9022.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/25333.%E2%80%85%EA%B0%9C%EA%B5%AC%EB%A6%AC/037c9022.png" data-original-src="https://upload.acmicpc.net/8e3ea945-dfa5-4fa2-863b-d8b064e6b1ee/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 75px; width: 500px;" /></p>

<p>위 예제의 경우 개구리가 무한정 점프할 수 있더라도 처음 위치에서 $1$cm 떨어진 곳에 도달할 수 있는 방법은 없다. 이를 깨달은 Albert는 문득 궁금해졌다 -- 개구리가 무한정 점프할 수 있을 때, 처음 위치에서 우측으로 $1$cm, $2$cm, $\dots$, $X$cm 떨어진 (총 $X$개의) 위치들 중 몇 곳에 도달할 수 있을까? 위 예제의 경우 $A = 4$, $B = 2$ 라면 $X = 10$ 일 때 처음 위치에서 우측으로 $2$cm, $4$cm, $6$cm, $8$cm, $10$cm 위치에 도달할 수 있으므로 정답은 $5$가 된다.</p>

<p>Albert를 도와 $A$, $B$, $X$가 주어졌을 때 답을 구해보자.</p>

### 입력

<p>입력 첫 줄에 테스트 케이스의 수 $T$가 주어진다.</p>

<p>각 테스트 케이스는 한 줄에 세 개의 정수 $A$, $B$, $X$가 공백으로 구분되어 주어진다.</p>

### 출력

<p>각 테스트 케이스의 정답을 각 줄에 출력한다.</p>

### 제한

<ul>
	<li>$1 &le; T &le; 20$</li>
	<li>$1 &le; A, B &le; 1\,000\,000\,000$</li>
	<li>$1 &le; X &le; 2\,000\,000\,000$</li>
</ul>