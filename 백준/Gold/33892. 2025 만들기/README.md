# [Gold III] 2025 만들기 - 33892

[문제 링크](https://www.acmicpc.net/problem/33892)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 272, 정답: 102, 맞힌 사람: 58, 정답 비율: 31.868%

### 분류

런타임 전의 전처리, 수학, 해 구성하기

### 문제 설명

<p>$1$부터 $N$까지의 $N$개의 정수로 이루어진 배열 $A$가 주어질 때 다음 $3$가지 연산 중 원하는 연산을 골라 시행하는 것을 $N-1$번 진행한다.</p>

<ol>
	<li>배열의 두 원소 $a$, $b$를 제거하고 $a\,+\,b$를 삽입한다.</li>
	<li>배열의 두 원소 $a$, $b$를 제거하고 $a\,-\,b$를 삽입한다.</li>
	<li>배열의 두 원소 $a$, $b$를 제거하고 $a\, \times \,b$를 삽입한다.</li>
</ol>

<p>연산을 $N-1$번 시행한 뒤 마지막으로 남은 수가 $2025$일 수 있는지와 가능한 경우 구성 방법까지 구해보자. 단, 계산 과정에서 계산 결과의 절댓값은 $10^9$를 넘으면 안 된다.</p>

### 입력

<p>첫 번째 줄에 배열의 길이 $N$이 주어진다. $(1 \le N \le 100\,000)$</p>

### 출력

<p>연산을 $N-1$번 시행한 뒤 마지막으로 남은 수가 $2025$일 수 있다면, 첫째 줄에 <span style="color:#e74c3c;"><code>YES</code></span>를 출력하고, 불가능하다면 <span style="color:#e74c3c;"><code>NO</code></span>를 출력한다.</p>

<p>마지막으로 남은 수가 $2025$일 수 있는 경우, 이후 $N-1$개의 줄에 걸쳐 마지막으로 남은 수가 $2025$가 되도록 시행할 연산을 순서대로 출력한다. 출력 형식은 구체적으로 다음과 같다.</p>

<ul>
	<li>각 줄에는 "<code><span style="color:#e74c3c;">&lt;num1&gt; &lt;op&gt; &lt;num2&gt;</span></code>" 의 형식으로 시행한 연산의 정보를 출력한다.</li>
	<li><span style="color:#e74c3c;"><code>&lt;num1&gt;</code></span>과 <span style="color:#e74c3c;"><code>&lt;num2&gt;</code></span>는 연산을 시행하기 이전 배열에 남아있는 서로 다른 두 원소이다.</li>
	<li><span style="color:#e74c3c;"><code>&lt;op&gt;</code></span>는 <span style="color:#e74c3c;"><code>+</code></span>, <span style="color:#e74c3c;"><code>-</code></span>, <span style="color:#e74c3c;"><code>*</code></span>의 세 가지 문자 중 하나이다. 각각 1번, 2번, 3번 연산의 기호를 의미한다.</li>
	<li><span style="color:#e74c3c;"><code>&lt;num1&gt;</code></span>과 <span style="color:#e74c3c;"><code>&lt;num2&gt;</code></span>가 음이 아닌 정수인 경우, 정수 앞에 부호를 붙여서 출력하면 안 된다.</li>
	<li>연산을 수행했을 때 나온 계산 결과의 절댓값은 $10^9$ 이하여야 한다.</li>
</ul>