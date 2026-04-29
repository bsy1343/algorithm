# [Bronze III] [T] 스코어보드가 121분 남은 시점에서 프리즈되었습니다. - 34021

[문제 링크](https://www.acmicpc.net/problem/34021)

### 성능 요약

시간 제한: 1.21 초, 메모리 제한: 512 MB

### 통계

제출: 404, 정답: 244, 맞힌 사람: 199, 정답 비율: 59.226%

### 분류

구현, 사칙연산, 수학

### 문제 설명

<p>hibye1217은 $150$분간 진행되는 대학교 동아리 내전에서 $29$분만에 스코어보드를 프리즈시킨 적이 있다.</p>

<p>이제는 동아리의 운영진이 되어 내전을 운영하는 입장이 된 hibye1217은 이번 내전에서도 이 정도 속도의 프리즈가 일어날 것을 걱정하여, 프리즈 공지 멘트를 자동으로 작성하는 프로그램을 만들기로 했다.</p>

<p>이번 동아리 내전은 $M$분간 진행되며, 아래 두 조건 중 하나 이상을 만족할 때 스코어보드가 프리즈된다.</p>

<ul>
	<li>내전이 끝날 때까지 $L$분이 남았을 때.</li>
	<li>$1$문제를 제외하고 모든 문제를 해결한 참가자가 등장할 때.</li>
</ul>

<p>hibye1217은 지금까지의 데이터를 기반으로 이번 내전에 참가하는 $N$명의 참가자에 대해, $i$번째 참가자는 $1$문제를 제외하고 모든 문제를 해결할 때까지 $S_i$분이 걸릴 것으로 예상하고 있다. 단, 해당 참가자가 내전 시간 내에 $1$문제를 제외하고 모든 문제를 해결할 수 없다고 생각하는 경우 $S_i=-1$이다. 이 데이터를 토대로 프리즈 공지를 작성해 보자.</p>

### 입력

<p>첫째 줄에는 테스트케이스의 개수 $T$가 주어진다. $(1\le T\le 100)$</p>

<p>각 테스트케이스에 대해, 첫째 줄에는 문제에서 설명한 세 정수 $N$, $M$, $L$이 공백으로 구분되어 주어진다. $(1\le N\le 1000;$ $1\le L\le M\le 1440)$</p>

<p>이후 둘째 줄에는 문제에서 설명한 $N$개의 정수 $S_1,S_2,\ldots ,S_N$이 공백으로 구분되어 주어진다. $(-1\le S_i\le M)$</p>

### 출력

<p>각 테스트케이스에 대해, 내전이 끝날 때까지 $X$분 남은 시점에서 스코어보드가 프리즈된다면 <span style="color:#e74c3c;"><code>The scoreboard has been frozen with X minutes remaining.</code></span>을 출력한다. 단, $X=1$이라면 <span style="color:#e74c3c;"><code>minutes</code></span> 대신 <span style="color:#e74c3c;"><code>minute</code></span>으로 출력한다.</p>

### 힌트

<p>궁금한 사람들을 위해, 아래는 내전 당시 스코어보드를 찍은 사진이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/34021.%E2%80%85%5BT%5D%E2%80%85%EC%8A%A4%EC%BD%94%EC%96%B4%EB%B3%B4%EB%93%9C%EA%B0%80%E2%80%85121%EB%B6%84%E2%80%85%EB%82%A8%EC%9D%80%E2%80%85%EC%8B%9C%EC%A0%90%EC%97%90%EC%84%9C%E2%80%85%ED%94%84%EB%A6%AC%EC%A6%88%EB%90%98%EC%97%88%EC%8A%B5%EB%8B%88%EB%8B%A4./6c0e1f30.jpg" data-original-src="https://boja.mercury.kr/assets/problem/34021-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; max-width: 100%;"></p>

<p>참고로 hibye1217은 이 상태에서 2시간 동안 E를 못 풀어서 수상을 못 했다고 한다.</p>