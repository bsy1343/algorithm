# [Platinum III] [X] $x_1 \lesseqgtr x_2$ - 33721

[문제 링크](https://www.acmicpc.net/problem/33721)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 79, 정답: 26, 맞힌 사람: 21, 정답 비율: 29.167%

### 분류

강한 연결 요소, 그래프 이론, 방향 비순환 그래프, 분리 집합, 위상 정렬, 자료 구조, 해 구성하기

### 문제 설명

<p>하바는 어린 시절부터 $N$개의 변수 $x_1,x_2,\ldots ,x_N$을 가지고 놀면서, 변수들 간의 크기를 비교한 결과를 적어두곤 했다.</p>

<p>물론 하바는 장난기가 넘치기 때문에, $a$와 $b$를 비교한 결과를 다음 $6$가지 중 하나로 적었다.</p>

<ul>
	<li>$a \lt b$: $a$가 $b$보다 작다.</li>
	<li>$a\le b$: $a$가 $b$보다 작거나 같다.</li>
	<li>$a&gt;b$: $a$가 $b$보다 크다.</li>
	<li>$a\ge b$: $a$가 $b$보다 크거나 같다.</li>
	<li>$a=b$: $a$와 $b$는 같다.</li>
	<li>$a\ne b$: $a$와 $b$는 다르다.</li>
</ul>

<p>변수들 간의 비교 결과가 총 $M$개 주어질 때, 하바가 가지고 있는 $N$개의 변수의 값을 추정해 보자.</p>

### 입력

<p>첫째 줄에는 하바가 가지고 있는 변수의 개수 $N$과 비교 결과의 개수 $M$이 공백으로 구분되어 주어진다. $(1\le N\le 500\, 000;0\le M\le 500\, 000)$</p>

<p>둘째 줄부터 $M$개의 줄에 걸쳐 정수 $a$, 문자열 $op$, 정수 $b$가 공백으로 구분되어 주어진다. 이는 $x_a$와 $x_b$를 비교한 결과를 의미하며, $op$는 <span style="color:#e74c3c;"><code>&lt;</code></span>, <span style="color:#e74c3c;"><code>&lt;=</code></span>, <span style="color:#e74c3c;"><code>&gt;</code></span>, <span style="color:#e74c3c;"><code>&gt;=</code></span>, <span style="color:#e74c3c;"><code>==</code></span>, <span style="color:#e74c3c;"><code>!=</code></span> 중 하나이다. $(1\le a,b\le N)$</p>

### 출력

<p>만약 비교 결과들을 모두 만족하는 $N$개의 변수의 값을 추정할 수 없다면 첫째 줄에 <span style="color:#e74c3c;"><code>NO</code></span>를 출력한다.</p>

<p>만약 비교 결과들을 모두 만족하는 $N$개의 변수의 값을 추정할 수 있다면 첫째 줄에 <span style="color:#e74c3c;"><code>YES</code></span>를 출력하고, 둘째 줄에 $x_1,x_2,\ldots ,x_N$으로 가능한 값을 공백으로 구분하여 출력한다.</p>

<p>모든 $x_i$는 $1$ 이상 $N$ 이하의 정수여야 한다. 답이 존재하는 모든 경우에 대해, 이 조건을 만족하는 답이 존재함을 보일 수 있다.</p>

<p>만약 가능한 답이 여러 가지라면, 그중 아무거나 하나를 출력한다.</p>