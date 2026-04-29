# [Platinum IV] ABX - 34473

[문제 링크](https://www.acmicpc.net/problem/34473)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 94, 정답: 37, 맞힌 사람: 35, 정답 비율: 42.683%

### 분류

다이나믹 프로그래밍, 역추적

### 문제 설명

<p>$N$개의 <code>A</code>와 $N$개의 <code>B</code>로 이루어진 문자열 $T$에서 <code>A</code>가 놓인 위치를 $a_1,a_2,\cdots ,a_N$, <code>B</code>가 놓인 위치를 $b_1,b_2,\cdots ,b_N$이라고 하자. 문자열 $T$의 점수 $f(T)$는 같은 문자끼리의 거리의 총합으로 정의되며, $f(T) =\sum_{i=1}^{N}\sum_{j=1}^{N}(|a_i-a_j|+|b_i-b_j|)$으로 계산한다.</p>

<p><code>A</code>, <code>B</code>, <code>X</code>로 구성된 길이가 $2N$인 문자열 $S$가 주어진다. $S$에는 <code>A</code>와 <code>B</code>가 각각 최대 $N$개 포함되어 있다. 여러분은 <code>X</code>를 <code>A</code> 또는 <code>B</code>로 적절히 바꿔서, <code>A</code>와 <code>B</code>의 개수가 각각 정확히 $N$이 되도록 만들어야 한다.</p>

<p>점수를 최소화하는 문자열과 최대화하는 문자열을 구하라.</p>

### 입력

<p>첫째 줄에 $N$이 주어진다.</p>

<p>둘째 줄에 $S$가 주어진다.</p>

### 출력

<p>$N$개의 <code>A</code>와 $N$개의 <code>B</code>로 이루어진 문자열 2개를 한 줄에 하나씩 출력한다.</p>

<p>첫째 줄에 점수를 최소화하는 문자열, 둘째 줄에 점수를 최대화하는 문자열을 출력한다. 이러한 문자열이 여러 개 존재할 경우, 그중 아무거나 출력한다.</p>

### 제한

<ul>
	<li>주어지는 모든 수는 정수이다.</li>
	<li>$1\le N\le 3\, 000$</li>
	<li>$S$는 <code>A</code>, <code>B</code>, <code>X</code>로 이루어진 길이가 $2N$인 문자열로, <code>A</code>와 <code>B</code>는 각각 최대 $N$번 등장한다.</li>
</ul>