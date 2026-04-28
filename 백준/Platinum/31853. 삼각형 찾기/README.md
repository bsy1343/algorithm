# [Platinum III] 삼각형 찾기 - 31853

[문제 링크](https://www.acmicpc.net/problem/31853)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 136, 정답: 29, 맞힌 사람: 27, 정답 비율: 33.333%

### 분류

자료 구조, 정렬, 세그먼트 트리, 누적 합, 값 / 좌표 압축

### 문제 설명

<p>원 위에 $N$개의 점이 있다. 각 점에는 시계방향으로 $1$번부터 $N$번까지의 번호가 부여되어 있다. 동현이는 이 중 두 점을 연결하는 서로 다른 선분을 $M$개 그렸다. 동현이가 그린 그림에서 세 선분으로 만들 수 있는 삼각형의 개수를 구하여라.</p>

<p>동현이가 점을 매우 적절하게 찍었기 때문에, 한 점에서 $3$개 이상의 선분이 만나지 않는다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31853.%E2%80%85%EC%82%BC%EA%B0%81%ED%98%95%E2%80%85%EC%B0%BE%EA%B8%B0/293c4fd1.png" data-original-src="https://upload.acmicpc.net/79688a4c-33f4-46c9-87e1-5a3debdd1a1c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/31853.%E2%80%85%EC%82%BC%EA%B0%81%ED%98%95%E2%80%85%EC%B0%BE%EA%B8%B0/08e0202b.png" data-original-src="https://upload.acmicpc.net/e79e4a9c-c2d7-4bc3-99df-ca6e536177c7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /> </p>

### 입력

<p>첫 번째 줄에 정수 $N$, $M$이 공백으로 구분되어 주어진다.</p>

<p>이어서 $M$개의 줄에, 각 선분의 끝점 번호 $u$, $v$가 공백으로 구분되어 주어진다.</p>

### 출력

<p>세 선분으로 만들 수 있는 삼각형의 개수를 출력한다.</p>

### 제한

<ul>
	<li>$ 2 \le N \le 10^9 $</li>
	<li>$ 1 \le M \le \min(\lfloor\frac{N}{2}\rfloor, 7\times10^3) $</li>
	<li>$ 1 \le u, v \le N $</li>
	<li>원 위의 각 점에는 최대 하나의 선분만이 연결되어 있다.</li>
</ul>