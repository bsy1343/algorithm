# [Silver III] 피하자 - 25379

[문제 링크](https://www.acmicpc.net/problem/25379)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 11572, 정답: 3584, 맞힌 사람: 2630, 정답 비율: 32.389%

### 분류

그리디 알고리즘

### 문제 설명

<p>음이 아닌 정수로 이루어진 길이 N의 배열 A = [A<sub>1</sub>, A<sub>2</sub>, &middot; &middot; &middot; , A<sub>N</sub>]가 있다. 배열 A에서 인접한 두 수를 교환하는 시행을 원하는 만큼 할 수 있다. 이 때, 홀수와 짝수가 인접한 경우가 최대 1번 등장하도록 하는 시행의 최소 횟수를 구하여라. 단, 0 또한 짝수로 간주함에 유의하라.</p>

<p>예를 들어, 아래 그림과 같이 A = [4, 5, 1, 0]인 상황을 살펴보자. 이 경우, 마지막 두 원소를 교환하는 시행 과 가운데 두 원소를 교환하는 시행을 차례로 수행하면 A가 [4, 0, 5, 1]이 되어 홀수와 짝수가 인접한 경우가 최대 1번 등장하도록 할 수 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/25379.%E2%80%85%ED%94%BC%ED%95%98%EC%9E%90/7bfeb614.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/25379.%E2%80%85%ED%94%BC%ED%95%98%EC%9E%90/7bfeb614.png" data-original-src="https://upload.acmicpc.net/f67afa9a-1465-4db3-8bb4-29e6d107cec5/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 203px; height: 250px;" /></p>

### 입력

<p>첫 번째 줄에 정수 N이 주어진다.</p>

<p>두 번째 줄에 배열의 원소 A<sub>1</sub>, A<sub>2</sub>, &middot; &middot; &middot; , A<sub>N</sub>이 사이에 공백을 두고 주어진다.</p>

### 출력

<p>첫 번째 줄에 답을 출력한다.</p>

### 제한

<ul>
	<li>1 &le; N &le; 1 000 000.</li>
	<li>0 &le; A<sub>i</sub> &le; 2 &times; 10<sup>9</sup> (1 &le; i &le; N).</li>
	<li>A<sub>i</sub>는 정수이다.</li>
</ul>