# [Gold III] 당근 클릭 게임 - 31434

[문제 링크](https://www.acmicpc.net/problem/31434)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 969, 정답: 296, 맞힌 사람: 225, 정답 비율: 35.601%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>에릭은 방학 동안 너무 심심한 나머지, <strong>당근 클릭 게임</strong>이라는 게임을 직접 만들어서 플레이하기로 했다.</p>

<p>이 게임에서 초기에 에릭은 당근을 $0$개 가지고 있고, $s$가 $1$인 상태로 게임을 시작한다.</p>

<p>그 후, 매초 다음 두 가지의 행동 중 하나를 할 수 있다.</p>

<ol>
	<li>마우스를 클릭하고 당근을 $s$개 얻는다.</li>
	<li>정수 $i$$(1 \le i \le N)$를 고르고, 당근 $A_i$개를 지불하여 $i$번째 스피드 효과를 구매한다. 구매 직후, $s$가 $B_i$만큼 증가한다. (이전에 구매한 스피드 효과를 다시 구매하는 것도 가능하다.)</li>
</ol>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/31434.%E2%80%85%EB%8B%B9%EA%B7%BC%E2%80%85%ED%81%B4%EB%A6%AD%E2%80%85%EA%B2%8C%EC%9E%84/44c7a628.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/31434.%E2%80%85%EB%8B%B9%EA%B7%BC%E2%80%85%ED%81%B4%EB%A6%AD%E2%80%85%EA%B2%8C%EC%9E%84/44c7a628.png" data-original-src="https://u.acmicpc.net/c0c9bc5d-2628-43f7-a564-943b28096200/%EB%8B%B9%EA%B7%BC%EB%8B%B9%EA%B7%BC.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 234px; width: 350px;" /></p>

<p>게임을 개발하느라 에너지를 모두 소모해 버린 에릭을 위해 게임을 $K$초 플레이한 후 당근을 최대 몇 개까지 가지고 있을 수 있는지 알려주자!</p>

### 입력

<p>첫 번째 줄에 두 정수 $N$, $K$가 공백으로 구분되어 주어진다.</p>

<p>다음 $N$개의 줄 중 $i$번째 줄에 두 정수 $A_i$, $B_i$가 공백으로 구분되어 주어진다.</p>

### 출력

<p>에릭이 게임을 $K$초 플레이한 후 최대로 가지고 있을 수 있는 당근의 개수를 출력한다.</p>

### 제한

<ul>
	<li>$1\le N,K\le 100$</li>
	<li>$1\le A_i,B_i\le 50$</li>
</ul>