# [Gold I] 긴 케이크 나눠주기 - 25334

[문제 링크](https://www.acmicpc.net/problem/25334)

### 성능 요약

시간 제한: 2 초  (하단 참고), 메모리 제한: 512 MB

### 통계

제출: 181, 정답: 84, 맞힌 사람: 64, 정답 비율: 52.033%

### 분류

수학, 정수론, 누적 합, 조합론, 분할 정복을 이용한 거듭제곱, 모듈로 곱셈 역원, 페르마의 소정리

### 문제 설명

<p>Albert는 길이가 $n$인 길다란 케이크를 구웠다. 이 케익은 $n$등분 할 수 있도록 총 $n$개의 칸으로 미리 나눠져있고, 일부 칸에는 과일 토핑이 올려져있다.</p>

<p>예를 들어 아래 그림은 $n = 8$인 케이크이고 $0$은 토핑이 없는 칸, $1$은 과일 토핑이 있는 칸을 나타낸다. 이를 정수 배열로 나타내면 $A = [0, 1, 1, 0, 0, 1, 1, 0]$로 표현할 수 있다. 구체적으로, $A[i]$는 $i$번째 칸에 토핑이 있으면 $1$, 없으면 $0$이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/25334.%E2%80%85%EA%B8%B4%E2%80%85%EC%BC%80%EC%9D%B4%ED%81%AC%E2%80%85%EB%82%98%EB%88%A0%EC%A3%BC%EA%B8%B0/20a9184d.png" data-original-src="https://upload.acmicpc.net/eb27b42b-56af-4262-b272-8b4e80816b07/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px;" /></p>

<p>Albert는 이 케이크를 정확히 $k-1$번 잘라 $k$개의 조각으로 나누고 싶은데, 아래 조건을 만족하도록 자르고 싶다:</p>

<ul>
	<li>조건 1: 각 케이크 조각에 포함된 토핑이 올라간 칸의 개수가 모두 동일해야한다.</li>
	<li>조건 2: 버려지는 칸이나 조각이 생겨서는 안된다.</li>
</ul>

<p>예를 들어 $k = 2$ 인 경우 버려지는 칸이나 조각 없이 위 케이크를 자를 수 있는 방법은 총 $7$가지 존재한다. 그 중 조건 1을 만족하는 경우는 아래와 같이 세 가지 방법이다. 각 케이크 조각에는 토핑이 올라간 칸이 두 개씩 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/25334.%E2%80%85%EA%B8%B4%E2%80%85%EC%BC%80%EC%9D%B4%ED%81%AC%E2%80%85%EB%82%98%EB%88%A0%EC%A3%BC%EA%B8%B0/0cd85b01.png" data-original-src="https://upload.acmicpc.net/49d5a282-4665-4571-b4ec-e692d66840cc/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 60px; width: 400px;" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/25334.%E2%80%85%EA%B8%B4%E2%80%85%EC%BC%80%EC%9D%B4%ED%81%AC%E2%80%85%EB%82%98%EB%88%A0%EC%A3%BC%EA%B8%B0/d651e440.png" data-original-src="https://upload.acmicpc.net/d2eb2dd6-1583-4978-8148-46b9383d91cb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 60px; width: 400px;" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/25334.%E2%80%85%EA%B8%B4%E2%80%85%EC%BC%80%EC%9D%B4%ED%81%AC%E2%80%85%EB%82%98%EB%88%A0%EC%A3%BC%EA%B8%B0/c7724215.png" data-original-src="https://upload.acmicpc.net/530396df-cabc-4c62-ab79-f83d8c02effd/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 58px; width: 400px;" /></p>

<p>다른 예로, 아래 그림은 $n = 5$, $A = [0, 1, 0, 1, 0]$, $k = 2$인 경우 위 조건들을 만족하면서 케이크를 자를 수 있는 두 가지 방법을 나타낸다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/25334.%E2%80%85%EA%B8%B4%E2%80%85%EC%BC%80%EC%9D%B4%ED%81%AC%E2%80%85%EB%82%98%EB%88%A0%EC%A3%BC%EA%B8%B0/87e4af79.png" data-original-src="https://upload.acmicpc.net/73d42293-e2ac-4321-8624-e9658da5444d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height: 41px; width: 600px;" /></p>

<p>입력으로 $n$, $k$, 그리고 토핑의 유무를 나타내는 배열 $A$가 주어졌을 때, 조건을 만족하며 케이크를 자를 수 있는 방법이 총 몇 가지 있는지 구해보자. 단, 답이 매우 클 수 있으므로 $10^9+7$ 로 나눈 나머지를 출력한다.</p>

### 입력

<p>첫 줄에 테스트 케이스의 수 $T$가 주어진다.</p>

<p>각 테스트 케이스는 두 줄에 나누어 주어진다. 첫 줄에 $n$과 $k$가 공백으로 구분되어 주어진다. 둘째 줄에 배열 $A$의 값이 주어지는데, 공백없이 길이 $n$인 문자열 형태로 주어진다.</p>

### 출력

<p>각 테스트 케이스의 정답을 각 줄에 출력한다.</p>

### 제한

<ul>
	<li>$1 &le; T &le; 10$</li>
	<li>$1 &le; k &le; n &le; 1\,000\,000$</li>
</ul>