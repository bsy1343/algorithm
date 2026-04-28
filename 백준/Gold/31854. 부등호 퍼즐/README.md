# [Gold III] 부등호 퍼즐 - 31854

[문제 링크](https://www.acmicpc.net/problem/31854)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 266, 정답: 193, 맞힌 사람: 147, 정답 비율: 71.359%

### 분류

그래프 이론, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>부등호 퍼즐은 $1$부터 $N^2$까지의 정수를 모두 이용하여 $N \times N$ 격자판을 채우는 퍼즐이다. 격자 칸 사이에는 부등호가 그려져 있는데, 인접한 두 격자 칸의 정수가 만족해야 하는 대소 관계를 의미한다. 예를 들어, 다음과 같은 $3 \times 3$ 부등호 퍼즐이 주어졌다고 하자.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/31854.%E2%80%85%EB%B6%80%EB%93%B1%ED%98%B8%E2%80%85%ED%8D%BC%EC%A6%90/110473fd.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/31854.%E2%80%85%EB%B6%80%EB%93%B1%ED%98%B8%E2%80%85%ED%8D%BC%EC%A6%90/110473fd.png" data-original-src="https://upload.acmicpc.net/354f6113-4b3a-428c-9330-ba2c9e21d137/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 400px;" /></p>

<p>맨 왼쪽 맨 위에 위치한 격자판을 보자. 가로로 인접한 격자판과 세로로 인접한 격자판 사이에는 부등호가 적혀있다. 이때 다음 그림과 같이 주어진 대소 관계를 만족하면서 격자판에 정수를 채워 넣을 수 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/31854.%E2%80%85%EB%B6%80%EB%93%B1%ED%98%B8%E2%80%85%ED%8D%BC%EC%A6%90/dab45887.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/31854.%E2%80%85%EB%B6%80%EB%93%B1%ED%98%B8%E2%80%85%ED%8D%BC%EC%A6%90/dab45887.png" data-original-src="https://upload.acmicpc.net/d8047077-b474-4fec-8f85-d9fd308df1d9/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; height: 249px;" /></p>

<p>이와 같이 주어진 격자판 간의 대소 관계를 만족하면서 $1$부터 $9$까지의 모든 정수를 이용하여 다음과 같이 퍼즐을 완성할 수 있다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/31854.%E2%80%85%EB%B6%80%EB%93%B1%ED%98%B8%E2%80%85%ED%8D%BC%EC%A6%90/8c226476.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/31854.%E2%80%85%EB%B6%80%EB%93%B1%ED%98%B8%E2%80%85%ED%8D%BC%EC%A6%90/8c226476.png" data-original-src="https://upload.acmicpc.net/87a464c7-3373-41bf-a610-229effe9d0be/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 400px;" /></p>

<p>$N \times N$ 부등호 퍼즐이 주어질 때 퍼즐의 해답을 출력하는 프로그램을 작성하라. 가능한 답이 여러 가지라면 그중 아무거나 하나를 출력한다.</p>

### 입력

<p>첫 번째 줄에 $N$이 주어진다.</p>

<p>편의상, $N \times N$ 크기의 격자판을 다음과 같은 행렬 표현으로 서술하자.</p>

<p>$\begin{matrix} A_{1, 1} &amp; A_{1, 2} &amp; A_{1, 3} &amp; \ldots &amp; A_{1, N}\\ A_{2, 1} &amp; A_{2, 2} &amp; A_{2, 3} &amp; \ldots &amp; A_{2, N}\\ A_{3, 1} &amp; A_{3, 2} &amp; A_{3, 3} &amp; \ldots &amp; A_{3, N}\\ \vdots &amp; \vdots &amp; \vdots &amp; \ddots &amp; \vdots \\ A_{N, 1} &amp; A_{N, 2} &amp; A_{N, 3} &amp; \ldots &amp; A_{N, N}\\ \end{matrix}$  </p>

<p>두 번째 줄부터 가로로 인접한 격자 칸이 만족해야 하는 대소 관계를 나타내는 $N \times (N-1)$ 크기의 부등호 행렬 $R$이 주어진다.</p>

<p>$\begin{matrix} R_{1, 1} &amp; R_{1, 2} &amp; R_{1, 3} &amp; \ldots &amp; R_{1, N-1}\\ R_{2, 1} &amp; R_{2, 2} &amp; R_{2, 3} &amp; \ldots &amp; R_{2, N-1}\\ R_{3, 1} &amp; R_{3, 2} &amp; R_{3, 3} &amp; \ldots &amp; R_{3, N-1}\\ \vdots &amp; \vdots &amp; \vdots &amp; \ddots &amp; \vdots \\ R_{N, 1} &amp; R_{N, 2} &amp; R_{N, 3} &amp; \ldots &amp; R_{N, N-1}\\ \end{matrix}$</p>

<p>이때 부등호 행렬의 원소 $R_{r, c}$는 &lsquo;<span style="color:#e74c3c;"><code>&lt;</code></span>&rsquo;이거나 &lsquo;<span style="color:#e74c3c;"><code>&gt;</code></span>&rsquo;이며 각각의 의미는 다음과 같다.</p>

<ul>
	<li>&lsquo;<span style="color:#e74c3c;"><code>&lt;</code></span>&rsquo; 이면 $A_{r, c} &lt; A_{r, c+1}$을 만족해야 한다.</li>
	<li>&lsquo;<span style="color:#e74c3c;"><code>&gt;</code></span>&rsquo; 이면 $A_{r, c} &gt; A_{r, c+1}$을 만족해야 한다.</li>
</ul>

<p>이후에는 세로로 인접한 격자 칸이 만족해야 하는 대소관계를 나타내는 $(N-1) \times N$ 크기의 부등호 행렬 $C$가 주어진다.</p>

<p>$\begin{matrix} C_{1, 1} &amp; C_{1, 2} &amp; C_{1, 3} &amp; \ldots &amp; C_{1, N}\\ C_{2, 1} &amp; C_{2, 2} &amp; C_{2, 3} &amp; \ldots &amp; C_{2, N}\\ C_{3, 1} &amp; C_{3, 2} &amp; C_{3, 3} &amp; \ldots &amp; C_{3, N}\\ \vdots &amp; \vdots &amp; \vdots &amp; \ddots &amp; \vdots \\ C_{N-1, 1} &amp; C_{N-1, 2} &amp; C_{N-1, 3} &amp; \ldots &amp; C_{N-1, N}\\ \end{matrix}$</p>

<p>부등호 행렬의 원소 $C_{r, c}$는 &lsquo;<span style="color:#e74c3c;"><code>&lt;</code></span>&rsquo;이거나 &lsquo;<span style="color:#e74c3c;"><code>&gt;</code></span>&rsquo;이며 각각의 의미는 다음과 같다.</p>

<ul>
	<li>&lsquo;<span style="color:#e74c3c;"><code>&lt;</code></span>&rsquo; 이면 $A_{r, c} &lt; A_{r+1, c}$을 만족해야 한다.</li>
	<li>&lsquo;<span style="color:#e74c3c;"><code>&gt;</code></span>&rsquo; 이면 $A_{r, c} &gt; A_{r+1, c}$을 만족해야 한다.</li>
</ul>

<p>항상 풀이가 존재하는 입력이 주어진다.</p>

### 출력

<p>$N$개의 줄에 걸쳐 정수 $N$개를 공백으로 구분하여 출력한다. $i$번째 줄의 $j$번째 수는 $A_{i,j}$에 적혀야 할 정수를 뜻한다.</p>

### 제한

<ul>
	<li>$2 \le N \le 1{,}000$</li>
</ul>