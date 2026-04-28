# [Gold IV] 달팽이와 쿼리 - 25294

[문제 링크](https://www.acmicpc.net/problem/25294)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 296, 정답: 107, 맞힌 사람: 69, 정답 비율: 38.983%

### 분류

수학, 구현

### 문제 설명

<p>크기가 $N$인 이차원 달팽이 배열은 다음과 같이 정의된다.</p>

<ul>
	<li>$N$은 $1$보다 큰 홀수이다.</li>
	<li>이차원 배열의 크기는 $N \times N$이다.</li>
	<li>$1$보다 크거나 같고, $N^2$보다 작거나 같은 자연수가 중복없이 $1$, $2$, $\dots$, $N^2$ 순서로 시계방향 소용돌이 패턴으로 한 칸에 하나씩 들어있다.</li>
	<li>가장 왼쪽 윗 칸은 $1$이다.</li>
</ul>

<p>왼쪽 그림은 크기 $N$이 $3$, 오른쪽은 $5$인 경우 이차원 달팽이 배열이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/25294.%E2%80%85%EB%8B%AC%ED%8C%BD%EC%9D%B4%EC%99%80%E2%80%85%EC%BF%BC%EB%A6%AC/31b87b7f.png" data-original-src="https://upload.acmicpc.net/eb40be61-c359-452c-af98-8bcc32fa9c38/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 266px; height: 137px;" /></p>

<p>쿼리는 총 두 종류가 있다.</p>

<ul>
	<li>1 $n$ $x$ $y$: 크기가 $n$인 이차원 달팽이 배열에서 $x$행 $y$열에 들어있는 수를 출력한다.</li>
	<li>2 $n$ $z$: 크기가 $n$인 이차원 달팽이 배열에서 $z$가 들어있는 행 번호와 열 번호를 공백으로 구분해 출력한다.</li>
</ul>

<p>행과 열의 번호는 $1$부터 시작한다.</p>

<p>$Q$개의 쿼리가 주어진다. 쿼리를 순서대로 수행해보자.</p>

### 입력

<p>첫째 줄에 쿼리의 개수 $Q$가 주어진다. 둘째 줄부터 $Q$개의 줄에 쿼리가 한 줄에 하나씩 주어진다.</p>

### 출력

<p>쿼리를 수행한 결과를 한 줄에 하나씩 순서대로 출력한다.</p>

### 제한

<ul>
	<li>$1 &le; Q &le; 100\,000$</li>
	<li>$3 &le; n &le; 9999$</li>
	<li>$1 &le; x, y &le; n$</li>
	<li>$1 &le; z &le; n^2$</li>
</ul>