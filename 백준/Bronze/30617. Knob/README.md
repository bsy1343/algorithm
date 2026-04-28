# [Bronze III] Knob - 30617

[문제 링크](https://www.acmicpc.net/problem/30617)

### 성능 요약

시간 제한: 0.5 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 1042, 정답: 683, 맞힌 사람: 602, 정답 비율: 65.435%

### 분류

구현

### 문제 설명

<p>성우는 요즘 박자에 맞춰 두 개의 노브를 정확히 조작해야 하는 리듬 게임에 빠져 있다. 노브 시스템은 다음과 같은 특징을 가지고 있다.</p>

<ul>
	<li>노브는 <strong>왼쪽 노브</strong>와 <strong>오른쪽 노브</strong>로 $2$개가 있다.</li>
	<li>각 노브는 시계 방향 또는 반시계 방향으로 돌릴 수 있다. 노브를 돌리지 않고 가만히 둘 수도 있다.</li>
</ul>

<p>성우가 지금 플레이하는 곡의 길이는 $T$이다. 이 곡의 $t$번째 박자에서는 $l_t$의 값에 따라 왼쪽 노브를, $r_t$의 값에 따라 오른쪽 노브를 각각 다음과 같이 조작해야 한다. $(1 \leq t \leq T)$</p>

<ul>
	<li>값이 $0$인 경우, 해당하는 노브를 돌리지 않고 가만히 둬야 한다.</li>
	<li>값이 $-1$인 경우, 해당하는 노브를 반시계 방향으로 돌려야 한다. 값이 $1$인 경우에는 시계 방향으로 돌려야 한다.</li>
</ul>

<p>이때, 성우가 느끼는 곡의 <strong>재미도</strong>는 매 박자에 다음과 같이 측정된 값의 총합이다.</p>

<ul>
	<li>($2$번째 박자 또는 그 이후에) 왼쪽 노브를 돌려야 할 때, 직전 박자와 같은 방향으로 돌려야 한다면 재미도가 $1$ 오른다.</li>
	<li>($2$번째 박자 또는 그 이후에) 오른쪽 노브를 돌려야 할 때, 직전 박자와 같은 방향으로 돌려야 한다면 재미도가 $1$ 오른다.</li>
	<li>양쪽 노브를 모두 돌려야 할 때, 왼쪽과 오른쪽 노브를 같은 방향으로 돌려야 한다면 재미도가 추가로 $1$ 오른다.</li>
</ul>

<p>성우는 재미도를 계산할 여유가 없다. 여러분이 성우를 위해 이를 대신 구해주자!</p>

### 입력

<p>첫 번째 줄에 곡의 길이를 나타내는 정수 $T$가 주어진다. $(1 \leq T \leq 200\, 000)$</p>

<p>$2$번째 줄부터 $T+1$번째 줄까지, $t + 1$번째 줄에 $t$번째 박자의 노브 조작 방법을 의미하는 두 정수 $l_t,\ r_t$가 공백을 사이에 두고 주어진다. 각 수는 $-1,\ 0,\ 1$ 중 하나다.</p>

### 출력

<p>첫 번째 줄에 성우가 생각하는 곡의 재미도를 출력한다.</p>

### 힌트

<p>입출력 방식이 느리면 여러 줄을 입력받거나 출력할 때 시간 초과를 받을 수 있으므로, 언어별로 다음 방법을 사용하는 것이 권장된다.</p>

<ul>
	<li><strong>C++</strong>: <code>cin/cout</code>을 사용하고자 한다면, <code>main</code> 함수의 첫 줄에 아래 두 줄을 입력하고, 입력을 받을 때 <code>endl</code> 대신 개행 문자(<span style="color:#e74c3c;"><code>\n</code></span>)를 사용해야 한다. 단, 이렇게 하면 더 이상 <code>scanf/printf/puts/getchar/putchar</code> 등 C의 입출력 방식을 사용하면 안 된다.

	<ul>
		<li><code>cin.tie(nullptr);</code></li>
		<li><code>sync_with_stdio(false);</code></li>
	</ul>
	</li>
	<li><strong>Python</strong>: <code>input</code> 대신 아래 코드를 사용한다.
	<ul>
		<li><code>sys.stdin.readline.rstrip()</code></li>
	</ul>
	</li>
	<li><strong>Java</strong>, <strong>Kotlin</strong>: <code>Scanner</code>와 <code>System.out.println</code> 대신 <code>BufferedReader</code>와 <code>BufferedWriter</code>를 사용한다. <code>BufferedWriter.flush</code>는 프로그램 종료 전에 한 번만 하면 된다.
	<ul>
	</ul>
	</li>
</ul>