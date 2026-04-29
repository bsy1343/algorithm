# [Gold I] 쌓기나무 - 33713

[문제 링크](https://www.acmicpc.net/problem/33713)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 151, 정답: 55, 맞힌 사람: 47, 정답 비율: 38.525%

### 분류

구현, 우선순위 큐, 자료 구조, 집합과 맵, 트리를 사용한 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>PIMM 알고리즘 스터디에서 멘토로 활동하는 민규는, 알고리즘 수업 자료로써 격자판 형태의 칸에 ”쌓기나무”를 쌓고 있다.</p>

<p>민규는 격자판의 형태를 가로축이 $\text{X}$축이고 세로축이 $\text{Y}$축이며, $0$ 또는 양의 정수 좌표만 존재하는 2차원 좌표평면 형태로 정했다. 격자판의 각 칸은 2차원 좌표쌍 $(i, j)$ 형식으로 구분된다. 민규는 격자판의 빈칸에 새로운 블록을 쌓거나, 쌓인 블록의 가장 위에 새로운 블록을 쌓거나, 이미 쌓인 블록을 제거할 수 있다. 이때 모든 블록이 붙어있어야 할 필요는 없다.</p>

<p>격자판에 쌓인 쌓기나무를 바라보면 어떤 블록은 다른 블록에 가려져 보이지 않는다. 아래 그림과 같이 $\text{Z}$축을 도입한 3차원 좌표계에서 쌓기나무의 한 면이 $\text{XZ}$ 평면과 평행이 되게 바라볼 때를 ”쌓기나무를 정면에서 바라보고 있다”고 하며, $\text{YZ}$ 평면과 평행이 되게 바라볼 때를 ”쌓기나무를 측면에서 바라보고 있다”고 한다. 또, $\text{XY}$ 평면과 평행이 되게 바라볼 때를 ”쌓기나무를 윗면에서 바라보고 있다”고 한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33713.%E2%80%85%EC%8C%93%EA%B8%B0%EB%82%98%EB%AC%B4/912306b9.png" data-original-src="https://boja.mercury.kr/assets/problem/33713-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 500px; max-width:75%"></p>

<p>영도는 민규의 수업 준비를 위해 쌓기나무를 직접 프로그램으로 구현하려 한다. 영도를 도와 아래 쿼리들을 수행하는 프로그램을 작성하시오.</p>

<ul>
	<li><span style="color:#e74c3c;"><code>STACK i j</code></span>: $\text{XY}$ 평면 상의 $(i, j)$ 칸에 나무 블록을 한 개 쌓는다.</li>
	<li><span style="color:#e74c3c;"><code>REMOVE i j</code></span>: $\text{XY}$ 평면 상의 $(i, j)$ 칸의 가장 위에 위치한 나무 블록 한 개를 제거한다. 제거할 나무 블록이 없다면, 이 쿼리를 무시한다.</li>
	<li><span style="color:#e74c3c;"><code>FRONT</code></span>: 쌓기나무를 정면에서 봤을 때 보이는 나무 블록의 개수를 출력한다.</li>
	<li><span style="color:#e74c3c;"><code>SIDE</code></span>: 쌓기나무를 측면에서 봤을 때 보이는 나무 블록의 개수를 출력한다.</li>
	<li><span style="color:#e74c3c;"><code>TOP</code></span>: 쌓기나무를 윗면에서 봤을 때 보이는 나무 블록의 개수를 출력한다.</li>
</ul>

### 입력

<p>첫 번째 줄에 좌표평면 상에서 블록을 쌓을 수 있는 $\text{X}$ 좌표 범위 $N$, $\text{Y}$ 좌표 범위 $M$, 쿼리의 개수 $Q$가 공백으로 구분되어 주어진다.</p>

<p>두 번째 줄부터 $Q$개의 줄에 걸쳐 쿼리가 한 줄에 하나씩 주어진다.</p>

### 출력

<p>첫 번째 줄부터 <span style="color:#e74c3c;"><code>FRONT</code></span>, <span style="color:#e74c3c;"><code>SIDE</code></span>, <span style="color:#e74c3c;"><code>TOP</code></span> 쿼리가 주어질 때마다 정답을 결과를 한 줄에 하나씩 순서대로 출력한다.</p>

### 제한

<ul>
	<li>$1 \le N, M \le 200\,000$</li>
	<li>$1 \le Q \le 500\,000$</li>
	<li>$0 \le i&lt;N$</li>
	<li>$0 \le j&lt;M$</li>
	<li><span style="color:#e74c3c;"><code>FRONT</code></span>, <span style="color:#e74c3c;"><code>SIDE</code></span>, <span style="color:#e74c3c;"><code>TOP</code></span> 중 하나의 쿼리가 입력으로 한 줄 이상 주어짐이 보장된다.</li>
</ul>