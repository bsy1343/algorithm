# [Platinum V] CPC 문제 정렬 순서 - 33683

[문제 링크](https://www.acmicpc.net/problem/33683)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 239, 정답: 56, 맞힌 사람: 46, 정답 비율: 23.232%

### 분류

그리디 알고리즘, 우선순위 큐, 자료 구조, 정렬, 집합과 맵, 해 구성하기

### 문제 설명

<p>CPC 문제 번호는 <strong><samp>A1</samp></strong>, <strong><samp>B1</samp></strong>, <strong><samp>B2</samp></strong>, <strong><samp>B3</samp></strong>, <strong><samp>C1</samp></strong>, <strong><samp>C2</samp></strong>, <strong><samp>C3</samp></strong>, <strong><samp>D1</samp></strong>, <strong><samp>D2</samp></strong>와 같이 섹션명 뒤에 숫자를 붙여 구성된다. 섹션명은 난이도 순서를 보장하지만, 같은 섹션명 내에서 숫자는 난이도 순서를 보장하지 않는다. 예를 들어 섹션명의 순서를 알파벳 사전순으로 정하였을 때 <strong><samp>C2</samp></strong>가 <strong><samp>C1</samp></strong>보다 어렵다는 보장은 없지만, <strong><samp>B2</samp></strong>는 항상 <strong><samp>A1</samp></strong>보다 어렵다.</p>

<p>CPC 운영진은 공개 이전에 문제의 난이도를 정확히 예측하기 어렵기에 다음 규칙에 따라 문제 정렬 순서를 정한다.</p>

<ul>
	<li>$N$개의 문제를 $M$개의 섹션으로 나누어야 한다.</li>
	<li>$i$번 문제는 $l_i$ 이상, $r_i$ 이하의 정수 난이도를 가질 수 있다. $(1 \le i \le N;$ $l_i$, $r_i$는 정수$)$ </li>
	<li>$j$번 섹션에 $i$번 문제를 넣을 때는 문제의 난이도를 $l_i$ 이상 $r_i$ 이하의 정수 중 하나로 결정한 후 $j$번 섹션에 넣는다. $(1 \le j \le M)$</li>
	<li>$k$번 섹션 문제 중 가장 높은 난이도의 문제의 난이도가 $k+1$번 섹션 문제 중 가장 낮은 난이도의 문제의 난이도보다 낮아야 한다. $(1 \le k \lt M)$</li>
	<li>모든 문제가 정확히 하나의 섹션에 속해야 한다.</li>
	<li>각 섹션에 문제가 하나 이상 있어야 한다.</li>
</ul>

<p>만들 수 있는 정렬 순서 중 아무거나 하나를 찾아 각 문제마다 결정한 난이도와 속한 섹션 번호를 출력하자.</p>

### 입력

<p>첫 번째 줄에 정수 $N$과 $M$이 공백으로 구분되어 주어진다.</p>

<p>두 번째 줄부터 $N$개의 줄에 걸쳐 문제 난이도 정보가 주어진다. 그중 $i$번째 줄은 정수 $l_i$, $r_i$가 공백으로 구분되어 주어진다.</p>

### 출력

<p>문제의 정보를 총 $N$개의 줄에 걸쳐 출력한다. 그중 $i$번째 줄에는 정수 $d_i$와 $s_i$를 공백으로 구분하여 출력한다. $d_i$는 $i$번 문제의 결정한 난이도, $s_i$는 $i$번 문제가 속한 섹션 번호를 의미한다. 가능한 문제 정렬 순서가 여러 가지라면 그중 아무거나 하나를 출력한다.</p>

<p>만약 $M$개의 섹션으로 나누는 게 불가능하다면 <span style="color:#e74c3c;"><code>-1</code></span>을 대신 출력한다.</p>

### 제한

<ul>
	<li>$1 \le N, M \le 400\,000$</li>
	<li>$1 \le l_i \le r_i \le 10^9$</li>
	<li>$1 \le i \le N$</li>
	<li>$l_i \le d_i \le r_i$</li>
	<li>$1 \le s_i \le M$</li>
</ul>