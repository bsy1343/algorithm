# [Platinum IV] 그래프 곱셈 - 32988

[문제 링크](https://www.acmicpc.net/problem/32988)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 157, 정답: 44, 맞힌 사람: 36, 정답 비율: 27.481%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색, 최단 경로

### 문제 설명

<p>그래프 이론에서 두 그래프의 적(곱)연산은 여러 가지가 정의되어 있는데, 대표적으로는 데카르트적, 텐서적, 강적이 있다. 이들의 정의는 다음과 같다.</p>

<p>정점이 $N$개인 그래프 $A$의 정점을 $A_i$ $(1 \leq i \leq N)$, 정점이 $M$개인 그래프 $B$의 정점을 $B_i$ $(1 \leq i \leq M)$라 하자. 이때, 두 그래프를 곱한 새로운 그래프 $G$는 $N\times M$개의 정점을 가진다. 각 정점에 다음과 같은 번호를 붙이자: $G_{11}, G_{12}, \cdots, G_{1M}, G_{21}, \cdots, G_{NM}$.</p>

<p>이때, 연산별로 간선은 다음과 같이 정의된다.</p>

<ul>
	<li>데카르트적: $1\leq i,j\leq N$ ($i \neq j$)에 대해 $A_i$와 $A_j$가 인접하다면 $1 \leq k \leq M$에 대해 $G_{ik}$와 $G_{jk}$가 인접하고, $1\leq i,j\leq M$ ($i \neq j$)에 대해 $B_i$와 $B_j$가 인접하다면 $1 \leq k \leq N$에 대해 $G_{ki}$와 $G_{kj}$가 인접하다.</li>
	<li>텐서적: $1\leq i,j\leq N$, $1\leq k,l\leq M$ ($i\neq j$, $k\neq l$)에 대해 $A_i$와 $A_j$가 인접하고 $B_k$와 $B_l$가 인접하다면 $G_{ik}$와 $G_{jl}$이 인접하다.</li>
	<li>강적: $1\leq i,j\leq N$, $1\leq k,l\leq M$에 대해 $G_{ik}$와 $G_{jl}$이 데카르트적에서 인접하거나 텐서적에서 인접하다면 인접하다.</li>
</ul>

<p>예를 들어, 아래 그림 1에서 왼쪽 두 그래프를 데카르트적 연산하면 오른쪽 그래프의 9개 정점과 파란색 실선으로 된 간선, 텐서적 연산하면 9개 정점과 빨간색 점선으로 된 간선을 얻는다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32988.%E2%80%85%EA%B7%B8%EB%9E%98%ED%94%84%E2%80%85%EA%B3%B1%EC%85%88/144e4159.png" data-original-src="https://boja.mercury.kr/assets/problem/32988-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 700px; height: 326px;"></p>

<p style="text-align: center;">[그림 1] 데카르트적, 텐서적, 강적을 그림으로 나타낸 예시.</p>

<p>이때, 두 그래프 $A$와 $B$가 주어지면 이 그래프에 대해 다음과 같은 쿼리 $Q$개에 대한 답을 출력하는 프로그램을 구현하시오.</p>

<ul>
	<li><span style="color:#e74c3c;"><code>1 p q</code></span>: 그래프 $A$와 $B$의 데카르트적 $G$에 대해 두 정점 $G_{pq}$와 $G_{11}$ 사이의 최단경로의 길이를 출력하여라. 경로가 없다면 <span style="color:#e74c3c;"><code>-1</code></span>을 출력하여라.</li>
	<li><span style="color:#e74c3c;"><code>2 p q</code></span>: 그래프 $A$와 $B$의 텐서적 $G$에 대해 두 정점 $G_{pq}$와 $G_{11}$ 사이의 최단경로의 길이를 출력하여라. 경로가 없다면 <span style="color:#e74c3c;"><code>-1</code></span>을 출력하여라.</li>
	<li><span style="color:#e74c3c;"><code>3 p q</code></span>: 그래프 $A$와 $B$의 강적 $G$에 대해 두 정점 $G_{pq}$와 $G_{11}$ 사이의 최단경로의 길이를 출력하여라. 경로가 없다면 <code><span style="color:#e74c3c;">-1</span></code>을 출력하여라.</li>
</ul>

### 입력

<p>첫 번째 줄에 그래프 $A$의 정점의 개수 $N$과 간선의 개수 $X$가 공백으로 구분되어 주어진다.</p>

<p>두 번째 줄부터 $X$개의 줄 중 $i$번째 줄에 그래프 $A$의 $i$번째 간선이 잇는 두 정점의 번호 $u_i$와 $v_i$가 공백으로 구분되어 주어진다.</p>

<p>그다음 줄에 그래프 $B$의 정점의 개수 $M$과 간선의 개수 $Y$가 공백으로 구분되어 주어진다.</p>

<p>그다음 줄부터 $Y$개의 줄 중 $i$번째 줄에 그래프 $B$의 $i$번째 간선이 잇는 두 정점의 번호 $u'_i$와 $v'_i$가 공백으로 구분되어 주어진다.</p>

<p>그다음 줄에 쿼리의 개수 $Q$가 주어진다.</p>

<p>그다음 줄부터 $Q$개의 줄에 쿼리가 한 줄에 하나씩 주어진다. 쿼리의 형식은 지문을 참고하여라.</p>


<p>주어지는 모든 입력은 정수이다.</p>

### 출력

<p>각 $Q$개의 쿼리에 대한 답을 한 줄에 하나씩 출력하여라.</p>

### 제한

<ul>
	<li>$2 \leq N, M \leq 200\,000$</li>
	<li>$1 \leq X \leq \min\left(\cfrac{N\left(N-1\right)}{2}, 500\,000\right)$</li>
	<li>$1 \leq Y \leq \min\left(\cfrac{M\left(M-1\right)}{2}, 500\,000\right)$</li>
	<li>$1 \leq Q \leq 500\,000$</li>
	<li>각 쿼리에 대해, $1 \leq p \leq N$, $1 \leq q \leq M$</li>
	<li>$1 \leq u_i, v_i \leq N$ ($1 \leq i \leq X$)</li>
	<li>$1 \leq u'_i, v'_i \leq M$ ($1 \leq i \leq Y$)</li>
	<li>$u_i \neq v_i$ ($1 \leq i \leq X$)</li>
	<li>$u'_i \neq v'_i$ ($1 \leq i \leq Y$)</li>
	<li>$1 \leq i, j \leq X$에 대해, $i \neq j$이면 $\{u_i,v_i\} \neq \{u_j,v_j\}$</li>
	<li>$1 \leq i, j \leq Y$에 대해, $i \neq j$이면 $\{u'_i,v'_i\} \neq \{u'_j,v'_j\}$</li>
</ul>