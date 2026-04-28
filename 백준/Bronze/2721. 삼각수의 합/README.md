# [Bronze III] 삼각수의 합 - 2721

[문제 링크](https://www.acmicpc.net/problem/2721)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 4399, 정답: 3320, 맞힌 사람: 3051, 정답 비율: 76.104%

### 분류

수학, 구현

### 문제 설명

<p>n번째 삼각수, T(n)은 1부터 n까지의 합이다. T(n) = 1 + ... + n. 이것은 삼각형 모양으로 표현할 수 있다. 아래 그림은 T(4)를 나타낸 것이다.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/2721.%E2%80%85%EC%82%BC%EA%B0%81%EC%88%98%EC%9D%98%E2%80%85%ED%95%A9/64745793.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/2721.%E2%80%85%EC%82%BC%EA%B0%81%EC%88%98%EC%9D%98%E2%80%85%ED%95%A9/64745793.png" data-original-src="https://www.acmicpc.net/upload/images/tsum.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:90px; width:87px" /></p>

<p>다음과 같은 식을 통해 가중치를 부여한 삼각수의 합을 구할 수 있다.</p>

<p>W(n) = Sum[k=1..n; k*T(k+1)]</p>

<p>n이 주어졌을 때, W(n)을 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 정수 n 하나로 이루어져 있다. (1&lt;=n&lt;=300)</p>

### 출력

<p>각 테스트 케이스에 대해 W(n)을 한 줄에 하나씩 출력한다.</p>