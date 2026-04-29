# [Gold III] 논리 연산과 쿼리 - 33757

[문제 링크](https://www.acmicpc.net/problem/33757)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 225, 정답: 83, 맞힌 사람: 70, 정답 비율: 53.030%

### 분류

구현, 비트마스킹, 자료 구조, 집합과 맵

### 문제 설명

<p>논리 연산이란 참을 나타내는 논리값 <strong><code>1</code></strong> 과 거짓을 나타내는 논리값 <strong><code>0</code></strong> 을 다루는 연산을 말합니다. 이 문제에서는 다음의 두 가지 논리 연산자가 등장합니다.</p>

<ul>
	<li>논리합 (<strong><code>|</code></strong>, OR): 양쪽의 두 값 중 <strong>한쪽이라도</strong> <strong><code>1</code></strong> 이라면 연산의 결과는 <strong><code>1</code></strong> 입니다. 그렇지 않다면 연산의 결과는 <strong><code>0</code></strong> 입니다. 예시는 다음과 같습니다.

	<ul>
		<li><strong><code>0|0</code></strong> = <strong><code>0</code></strong></li>
		<li><strong><code>0|1</code></strong> = <strong><code>1</code></strong></li>
		<li><strong><code>1|0</code></strong> = <strong><code>1</code></strong></li>
		<li><strong><code>1|1</code></strong> = <strong><code>1</code></strong></li>
	</ul>
	</li>
	<li>논리곱 (<strong><code>&amp;</code></strong>, AND): 양쪽의 두 값이 <strong>모두</strong> <strong><code>1</code></strong> 이라면 연산의 결과는 <strong><code>1</code></strong> 입니다. 그렇지 않다면 연산의 결과는 <strong><code>0</code></strong> 입니다. 예시는 다음과 같습니다.
	<ul>
		<li><strong><code>0&amp;0</code></strong> = <strong><code>0</code></strong></li>
		<li><strong><code>0&amp;1</code></strong> = <strong><code>0</code></strong></li>
		<li><strong><code>1&amp;0</code></strong> = <strong><code>0</code></strong></li>
		<li><strong><code>1&amp;1</code></strong> = <strong><code>1</code></strong></li>
	</ul>
	</li>
</ul>

<p>이때, 논리값 $N$개와 논리 연산자 $N-1$개가 번갈아서 등장하는 문자열을 길이 $2N-1$의 <strong>논리식</strong>이라고 부릅니다. 모든 논리식은 대응되는 <strong>하나의 논리값</strong>을 가지며, 이는 다음과 같이 구할 수 있습니다.</p>

<ol>
	<li>
	<p>먼저, 논리식에 등장하는 <strong>논리곱 연산자</strong> 각각에 대해 양쪽의 두 값과 연산자를 지우고 해당하는 연산의 결과로 교체합니다.</p>
	</li>
	<li>
	<p>다음, 논리식에 등장하는 <strong>논리합 연산자</strong> 각각에 대해 양쪽의 두 값과 연산자를 지우고 해당하는 연산의 결과로 교체합니다.</p>
	</li>
</ol>

<p>이때 하나의 논리식에 같은 논리 연산자가 여러 번 등장한다면 그중 맨 왼쪽부터 순서대로 연산을 수행합니다.</p>

<p>예를 들어 논리식 <strong><code>0&amp;1&amp;1|0|1|1&amp;1</code></strong> 에 대해 다음과 같이 대응되는 논리값을 구할 수 있습니다.</p>

<ul>
	<li><strong><code>0&amp;1&amp;1|0|1|1&amp;1</code></strong></li>
	<li><strong><code>0&amp;1|0|1|1&amp;1</code></strong> (<strong><code>0&amp;1</code></strong> 을 <strong><code>0</code></strong> 으로 교체합니다.)</li>
	<li><strong><code>0|0|1|1&amp;1</code></strong> (<strong><code>0&amp;1</code></strong> 을 <strong><code>0</code></strong> 으로 교체합니다.)</li>
	<li><strong><code>0|0|1|1</code></strong> (<strong><code>1&amp;1</code></strong> 을 <strong><code>1</code></strong> 로 교체합니다.)</li>
	<li><strong><code>0|1|1</code></strong> (<strong><code>0|0</code></strong> 을 <strong><code>0</code></strong> 으로 교체합니다.)</li>
	<li><strong><code>1|1</code></strong> (<strong><code>0|1</code></strong> 을 <strong><code>1</code></strong> 로 교체합니다.)</li>
	<li><strong><code>1</code></strong> (<strong><code>1|1</code></strong> 을 <strong><code>1</code></strong> 로 교체합니다.)</li>
</ul>

<p>따라서 <strong><code>0&amp;1&amp;1|0|1|1&amp;1</code></strong> 에 대응되는 논리값은 <strong><code>1</code></strong> 입니다.</p>

<p>여러분이 해결해야 하는 문제는 다음과 같습니다.</p>

<p>여러분에게 길이 $2N-1$의 논리식이 주어집니다. 여러분은 이 논리식에 대해 다음 동작을 $Q$번 수행해야 합니다.</p>

<ul>
	<li>$1$ 이상 $N$ 이하의 정수 $k$가 주어질 때, 논리식에 등장하는 $k$번째 논리값을 바꿉니다. $k$번째 논리값이 <strong><code>1</code></strong> 이었다면 <strong><code>0</code></strong> 으로, <strong><code>0</code></strong> 이었다면 <strong><code>1</code></strong> 로 바뀝니다.</li>
</ul>

<p>이때 각 동작 후 논리식의 상태는 유지됩니다. 예를 들어 한 번의 동작으로 논리식 <strong><code>0&amp;1&amp;1|0|1|1&amp;1</code></strong> 이 <strong><code>0&amp;1&amp;1|0|0|1&amp;1</code></strong> 으로 바뀌었을 경우 그다음 동작은 논리식 <strong><code>0&amp;1&amp;1|0|0|1&amp;1</code></strong> 에 수행합니다.</p>

<p>동작을 $Q$번 수행하면서, 각 동작을 수행한 후의 논리식에 대응되는 논리값을 구하는 프로그램을 작성해 주세요.</p>

### 입력

<p>첫 번째 줄에 두 정수 $N$과 $Q$가 공백으로 구분되어 주어집니다.</p>

<p>두 번째 줄에 길이 $2N-1$의 논리식이 공백 없이 주어집니다.</p>

<p>세 번째 줄에 수행해야 하는 동작을 나타내는 정수 $k_1,k_2,\ldots,k_Q$가 공백으로 구분되어 주어집니다.</p>

### 출력

<p>한 줄에 길이 $Q$의 문자열 $S$를 출력합니다. $i$번째 동작 후 논리식에 대응되는 논리값이 <strong><code>1</code></strong> 이라면 $S_i$는 '<code>1</code>', <strong><code>0</code></strong> 이라면 $S_i$는 '<code>0</code>'입니다.</p>

### 제한

<ul>
	<li>$1 \le N,Q \le 200\ 000$</li>
	<li>$1 \le k_i \le N$</li>
</ul>

### 힌트

<p>동작이 주어지기 전 논리식은 <strong><code>0&amp;1&amp;1|0|1|1&amp;1</code></strong> 입니다. 각 동작 후 논리식과 대응되는 논리값은 다음과 같습니다.</p>

<ol>
	<li><strong><code>0&amp;1&amp;1|0|0|1&amp;1</code></strong>: 대응되는 논리값이 <strong><code>1</code></strong> 입니다.</li>
	<li><strong><code>0&amp;0&amp;1|0|0|1&amp;1</code></strong>: 대응되는 논리값이 <strong><code>1</code></strong> 입니다.</li>
	<li><strong><code>1&amp;0&amp;1|0|0|1&amp;1</code></strong>: 대응되는 논리값이 <strong><code>1</code></strong> 입니다.</li>
	<li><strong><code>1&amp;0&amp;1|0|0|0&amp;1</code></strong>: 대응되는 논리값이 <strong><code>0</code></strong> 입니다.</li>
	<li><strong><code>1&amp;0&amp;1|0|0|0&amp;0</code></strong>: 대응되는 논리값이 <strong><code>0</code></strong> 입니다.</li>
	<li><strong><code>1&amp;1&amp;1|0|0|0&amp;0</code></strong>: 대응되는 논리값이 <strong><code>1</code></strong> 입니다.</li>
	<li><strong><code>1&amp;1&amp;1|1|0|0&amp;0</code></strong>: 대응되는 논리값이 <strong><code>1</code></strong> 입니다.</li>
</ol>