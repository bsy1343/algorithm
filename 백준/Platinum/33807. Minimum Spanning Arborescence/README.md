# [Platinum III] Minimum Spanning Arborescence - 33807

[문제 링크](https://www.acmicpc.net/problem/33807)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 182, 정답: 115, 맞힌 사람: 60, 정답 비율: 57.692%

### 분류

그래프 이론, 기댓값의 선형성, 모듈로 곱셈 역원, 방향 비순환 그래프, 분할 정복을 이용한 거듭제곱, 수학, 애드 혹, 정수론, 조합론, 확률론

### 문제 설명

<p>$r$을 루트로 하는 arborescence $G = (V, E)$란 다음 조건을 만족하는 방향 그래프를 뜻한다.</p>

<ul>
	<li>다른 모든 정점 $v$에 대해, $r$에서 $v$로 가는 경로가 정확히 하나 존재한다.</li>
</ul>

<p>DAG(Directed Acyclic Graph)란 사이클이 없는 유향 그래프를 뜻한다. DAG의 각 간선에 가중치가 부여되었을 때, DAG 위에서의 minimum spanning arborescence 란 다음과 같다.</p>


<ul>
	<li>DAG위에서의 <span style="color:#c0392b;"><strong>$1$</strong></span>을 루트로 한 arborescence이다.</li>
	<li>DAG 상의 모든 정점을 포함한다.</li>
	<li>사용된 간선들의 가중치 합이 최소이다. 그런 방법이 여럿 존재한다면 모두 minimum spanning arborescence이다.</li>
</ul>

<p>정점 $N$개, 유향 간선 $M$개로 이루어진 DAG가 주어진다. $M$개의 간선에 각각 $1$이상 $K$이하의 가중치를 붙이는 $K^M$가지의 경우에 대해, minimum spanning arborescence를 구성하는 간선의 가중치 합의 기댓값을 $998\,244\,353$으로 나눈 나머지를 구하여라. 중복 간선이 있을 수 있음에 유의하라.</p>

### 입력

<p>첫 줄에 세 정수 $N, M, K$가 주어진다.</p>

<p>다음 $M$개의 줄에 걸쳐 $i+1$번째 줄에 간선을 뜻하는 두 정수 $a_i, b_i$가 주어진다. 이는 $a_i$에서 $b_i$로 가는 유향 간선이 존재함을 뜻한다.</p>

### 출력

<p>기댓값을 $998\,244\,353$으로 나눈 나머지를 출력한다.</p>

<p>즉, 기댓값이 서로소인 두 양의 정수 $a$, $b$에 대해 기약분수 $\frac{a}{b}$의 형태로 표현될 때, $b \cdot k \equiv a \pmod{998\,244\,353}$을 만족하는 유일한 정수 $k$ ($0 \le k &lt; 998\,244\,353$)를 출력한다.</p>

### 제한

<ul>
	<li>$1 \leq N, M, K \leq 10^5 $</li>
	<li>$ N-1 \leq M $</li>
	<li>모든 $1 \le i \le N$에 대하여 $ 1 \leq a_i &lt; b_i \leq N$</li>
	<li>기존 DAG에서 1번 정점에서 다른 모든 정점에 도달할 수 있다.</li>
</ul>