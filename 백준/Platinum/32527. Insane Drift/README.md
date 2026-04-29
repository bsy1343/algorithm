# [Platinum V] Insane Drift - 32527

[문제 링크](https://www.acmicpc.net/problem/32527)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 1024 MB

### 통계

제출: 208, 정답: 48, 맞힌 사람: 39, 정답 비율: 24.074%

### 분류

그리디 알고리즘, 해 구성하기

### 문제 설명

<p>무한히 넓은 2차원 좌표평면의 원점 위에 채완이가 자동차를 타고 있다. 채완이는 아래 두 가지 조작 중 하나를 선택해서 자동차를 움직일 수 있다.</p>

<ul>
	<li><span style="color:#e74c3c;"><code>R</code></span>: 자동차를 $x$ 좌표가 증가하는 방향으로 움직인다. 현재 <span style="color:#e74c3c;"><code>R</code></span>을 $k$번 연속해서 선택했다면 $2^{k-1}$ 만큼 이동한다.</li>
	<li><span style="color:#e74c3c;"><code>U</code></span>: 자동차를 $y$ 좌표가 증가하는 방향으로 움직인다. 현재 <span style="color:#e74c3c;"><code>U</code></span>를 $k$번 연속해서 선택했다면 $2^{k-1}$ 만큼 이동한다.</li>
</ul>

<p>채완이는 위 조작을 최대 $4\ 000$번 시행해서 $(X, Y)$ 위치에 도달하고자 한다. 채완이가 해당 좌표에 도달할 수 있는지 판별하고, 도달할 수 있다면 조작 방법을 아무거나 하나 구해보자. 모든 조작을 시행했을 때 <strong>정확히</strong> $(X, Y)$ 위치에 자동차가 위치해 있어야만 좌표에 도달한 것으로 간주한다.</p>

### 입력

<p>첫째 줄에 $X, Y$가 공백으로 구분되어 주어진다. $(0 \le X, Y \le 10^{18}$; $(X, Y) \neq (0, 0))$</p>

### 출력

<p>채완이가 $(X, Y)$에 도달할 수 있다면 길이 $1$ 이상 $4\ 000$ 이하의 <span style="color:#e74c3c;"><code>R</code></span>과 <span style="color:#e74c3c;"><code>U</code></span> 문자로만 이루어진 문자열을 출력한다.</p>

<p>문자열의 문자 순서대로 자동차를 움직였을 때 자동차의 위치가 정확히 $(X, Y)$에 도달해야 하며, 가능한 정답이 여러 가지가 있다면 그중 아무거나 출력해도 된다.</p>

<p>도달할 수 없다면 <span style="color:#e74c3c;"><code>impossible</code></span>을 출력한다.</p>

### 힌트

<p style="text-align: center;"></p>