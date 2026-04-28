# [Platinum IV] $B$끼$B$끼 $A$끼$A$끼 수열 찾기 - 32229

[문제 링크](https://www.acmicpc.net/problem/32229)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 79, 정답: 20, 맞힌 사람: 19, 정답 비율: 27.941%

### 분류

해 구성하기, 오일러 경로, 그래프 이론, 그래프 탐색, 수학, 정수론

### 문제 설명

<p>양의 정수 $A$, $B$, $N$이 주어질 때 집합 $S$를 $S:=\left\{ \left( x,y \right)\in\mathbb{Z}^2\middle |y-x\in\left\{ A,B \right\}\land 1\le x&lt;y\le N \right\}$으로 정의한다.</p>

<p>아래 조건을 만족하는 수열 $P$를  <strong>$B$끼$B$끼 $A$끼$A$끼 수열</strong>이라고 한다.</p>

<ul>
	<li>$1$ 이상 $N$ 이하의 모든 정수는 $P$에 한 개 이상 존재하며, $P$는 $1$ 이상 $N$ 이하의 정수만으로 구성된다.</li>
	<li>모든 $P_i,P_{i+1}(1\le i&lt;\lvert P\rvert)$에 대하여 $Q_i:=\left( \min\left( P_i,P_{i+1} \right) ,\max\left( P_i,P_{i+1} \right) \right)$라고 할 때, 다음을 만족한다.
	<ul>
		<li>$Q_i\in S$</li>
		<li>$\forall s\in S,\exists i:Q_i=s$</li>
		<li>$i\ne j\Rightarrow Q_i\ne Q_j$</li>
	</ul>
	</li>
</ul>

<p>$B$끼$B$끼 $A$끼$A$끼 수열이 존재한다면 가능한 수열을 아무거나 하나 출력하고 그렇지 않다면 <span style="color:#e74c3c;"><code>-1</code></span>을 출력하라.</p>

<p>수열은 수를 순서대로 나열한 것으로, 순서가 상관있고, 같은 원소의 중복을 허용한다. 그리고 집합은 수가 포함되는지 여부를 판단하는 것으로, 순서가 상관없고, 같은 원소는 최대 한 번만 포함될 수 있다.</p>

### 입력

<p>첫 번째 줄에 정수 $A,B,N(1\le A,B,N\le 10^5)$이 공백으로 구분되어 주어진다.</p>

### 출력

<p>주어진 입력에 대해 $B$끼$B$끼 $A$끼$A$끼 수열이 있다면 첫 번째 줄에 수열의 길이를 출력한다. 만약 $B$끼$B$끼 $A$끼$A$끼 수열이 없다면 <span style="color:#e74c3c;"><code>-1</code></span>을 출력한다.</p>

<p>$B$끼$B$끼 $A$끼$A$끼 수열이 존재한다면 두 번째 줄에 수열의 수들을 차례대로 공백으로 구분하여 출력한다.</p>