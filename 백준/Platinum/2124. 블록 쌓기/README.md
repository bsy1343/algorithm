# [Platinum IV] 블록 쌓기 - 2124

[문제 링크](https://www.acmicpc.net/problem/2124)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 121, 정답: 51, 맞힌 사람: 19, 정답 비율: 31.667%

### 분류

수학, 다이나믹 프로그래밍, 조합론

### 문제 설명

<p>A&times;B&times;C&nbsp;크기의 삼차원 공간이 있다. 이는 밑면의 넓이가 A&times;B 크기의 직사각형이고, 높이 제한이 C라는 의미이다. 이러한 공간 안에 1&times;1&times;1 크기의 블록을 쌓으려고 한다. 이때 다음의 두 조건이 만족되어야 한다.</p>

<ol>
	<li>어떤 칸에 블록을 쌓을 때에, 그 칸의 왼쪽 칸보다 높게 쌓을 수는 없다.</li>
	<li>어떤 칸에 블록을 쌓을 때에, 그 칸의 위쪽 칸보다 높게 쌓을 수는 없다.</li>
</ol>

<p>예를 들어서 A = 3, B = 5, C = 5일 때, 다음과 같은 식으로 블록을 쌓을 수 있다. 각 칸은 그 왼쪽 칸과 위쪽 칸 이하의 높이로 블록을 쌓았다. 아래의 예에서도 확인할 수 있듯, 블록을 쌓지 않는 칸이 있을 수도 있다.</p>

<p style="text-align: center;"><img alt="" height="259" src="%EB%B0%B1%EC%A4%80/Platinum/2124.%E2%80%85%EB%B8%94%EB%A1%9D%E2%80%85%EC%8C%93%EA%B8%B0/a54239e4.png" data-original-src="https://boja.mercury.kr/assets/problem/2124-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" width="237" /></p>

<p>A, B, C가 주어졌을 때, 블록을 쌓는 경우의 수를 구하는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 세 정수 A, B, C가 주어진다.</p>

### 출력

<p>첫째 줄에 답을 1,000,000,000,000,000,000으로 나눈 나머지를 출력한다.</p>

### 제한

<ul>
	<li>1 &le; A &le; 20</li>
	<li>1 &le; B, C &le; 6</li>
</ul>