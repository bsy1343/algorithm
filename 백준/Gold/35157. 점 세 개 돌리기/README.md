# [Gold II] 점 세 개 돌리기 - 35157

[문제 링크](https://www.acmicpc.net/problem/35157)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 39, 정답: 30, 맞힌 사람: 25, 정답 비율: 73.529%

### 분류

구현, 누적 합, 선형대수학, 수학

### 문제 설명

<p>$3$차원 공간에 세 개의 점 $\left( 1,0,0 \right)$, $\left( 0,1,0 \right)$, $\left( 0,0,1 \right)$가 있다.</p>

<p>어떤 점 $\left( x,y,z \right)$에 대해 다음 연산들을 적용할 수 있다.</p>

<ul>
<li>$x$축 회전(<span style="color:#e74c3c;"><code>X</code></span>) : $\left( x,y,z \right)\mapsto\left( x,-z,y \right)$</li>
<li>$y$축 회전(<span style="color:#e74c3c;"><code>Y</code></span>) : $\left( x,y,z \right)\mapsto\left( z,y,-x \right)$</li>
<li>$z$축 회전(<span style="color:#e74c3c;"><code>Z</code></span>) : $\left( x,y,z \right)\mapsto\left( -y,x,z \right)$</li>
<li>$x$축 대칭(<span style="color:#e74c3c;"><code>XX</code></span>) : $\left( x,y,z \right)\mapsto\left( x,-y,-z \right)$</li>
<li>$y$축 대칭(<span style="color:#e74c3c;"><code>YY</code></span>) : $\left( x,y,z \right)\mapsto\left( -x,y,-z \right)$</li>
<li>$z$축 대칭(<span style="color:#e74c3c;"><code>ZZ</code></span>) : $\left( x,y,z \right)\mapsto\left( -x,-y,z \right)$</li>
<li>$xy$평면 대칭(<span style="color:#e74c3c;"><code>XY</code></span> 혹은 <span style="color:#e74c3c;"><code>YX</code></span>) : $\left( x,y,z \right)\mapsto\left( x,y,-z \right)$</li>
<li>$yz$평면 대칭(<span style="color:#e74c3c;"><code>YZ</code></span> 혹은 <span style="color:#e74c3c;"><code>ZY</code></span>) : $\left( x,y,z \right)\mapsto\left( -x,y,z \right)$</li>
<li>$xz$평면 대칭(<span style="color:#e74c3c;"><code>ZX</code></span> 혹은 <span style="color:#e74c3c;"><code>XZ</code></span>) : $\left( x,y,z \right)\mapsto\left( x,-y,z \right)$</li>
</ul>

<p>서현이는 $1$번부터 $N$번까지 $N$개의 연산을 가지고 있다.</p>

<p>다음과 같은 쿼리 $Q$개를 독립적으로 처리해 보자. 즉, 모든 쿼리에 대해 세 점의 초기 위치는 각각 $\left( 1,0,0 \right)$, $\left( 0,1,0 \right)$, $\left( 0,0,1 \right)$에서 시작한다.</p>

<ul>
<li>$l$ $r$: $l$번째 연산부터 $r$번째 연산까지 차례대로 세 점에 모두 적용했을 때 각 점의 좌표를 출력한다.</li>
</ul>

### 입력

<p>첫 번째 줄에 연산의 개수 $N(1\le N\le 100\, 000)$이 주어진다.</p>

<p>두 번째 줄에 $N$개의 연산 $O_1,O_2,\cdots ,O_N$이 공백으로 구분되어 주어진다. $O_i$는 <span style="color:#e74c3c;"><code>X</code></span>, <span style="color:#e74c3c;"><code>Y</code></span>, <span style="color:#e74c3c;"><code>Z</code></span>, <span style="color:#e74c3c;"><code>XX</code></span>, <span style="color:#e74c3c;"><code>YY</code></span>, <span style="color:#e74c3c;"><code>ZZ</code></span>, <span style="color:#e74c3c;"><code>XY</code></span>, <span style="color:#e74c3c;"><code>YX</code></span>, <span style="color:#e74c3c;"><code>YZ</code></span>, <span style="color:#e74c3c;"><code>ZY</code></span>, <span style="color:#e74c3c;"><code>ZX</code></span>, <span style="color:#e74c3c;"><code>XZ</code></span> 중 하나이다.</p>

<p>세 번째 줄에 쿼리의 개수 $Q(1\le Q\le 100\, 000)$가 주어진다.</p>

<p>네 번째 줄부터 $Q$줄에 걸쳐 $i$번째 쿼리를 의미하는 정수 $l_i,r_i(1\le l_i\le r_i\le N)$가 공백으로 구분되어 주어진다.</p>

### 출력

<p>첫 번째 줄부터 $3\times Q$줄에 걸쳐 각 쿼리에 대한 답을 다음과 같이 출력한다.</p>

<ul>
<li>$\left( 3i-2 \right)$번째 줄에 $i$번째 쿼리를 $\left( 1,0,0 \right)$에 적용했을 때의 좌표를 공백으로 구분하여 출력한다.</li>
<li>$\left( 3i-1 \right)$번째 줄에 $i$번째 쿼리를 $\left( 0,1,0 \right)$에 적용했을 때의 좌표를 공백으로 구분하여 출력한다.</li>
<li>$3i$번째 줄에 $i$번째 쿼리를 $\left( 0,0,1 \right)$에 적용했을 때의 좌표를 공백으로 구분하여 출력한다.</li>
</ul>