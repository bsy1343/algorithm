# [Platinum II] 향유회 문자열 - 34565

[문제 링크](https://www.acmicpc.net/problem/34565)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 55, 정답: 20, 맞힌 사람: 19, 정답 비율: 76.000%

### 분류

누적 합, 다이나믹 프로그래밍

### 문제 설명

<p>두 문자열 $A$, $B$에 대해 $A+B$를 $A$와 $B$를 이어 붙인 문자열이라고 하자. 이때 다음과 같은 규칙으로 만들 수 있는 문자열을 향유회 문자열이라고 한다.</p>

<ul>
<li>빈 문자열은 향유회 문자열이다.</li>
<li>$A$, $B$가 향유회 문자열이라면, <span style="color:#e74c3c;"><code>H</code></span>$+\,A\,+$<span style="color:#e74c3c;"><code>Y</code></span>$+\,B\,+$<span style="color:#e74c3c;"><code>H</code></span>도 향유회 문자열이다.</li>
<li>$A$, $B$가 향유회 문자열이라면, $A+B$도 향유회 문자열이다.</li>
</ul>

<p><span style="color:#e74c3c;"><code>H</code></span>, <span style="color:#e74c3c;"><code>Y</code></span>, <span style="color:#e74c3c;"><code>?</code></span>로 이뤄진 문자열 $S$이 주어진다. $S$의 <span style="color:#e74c3c;"><code>?</code></span>를 각각 <span style="color:#e74c3c;"><code>H</code></span>또는 <span style="color:#e74c3c;"><code>Y</code></span>로 바꿔 만들 수 있는 향유회 문자열의 개수를 $10^9+7$로 나눈 나머지를 구하여라.</p>

### 입력

<p>첫째 줄에 테스트 케이스의 개수를 나타내는 정수 $T$가 주어진다. $(1 \leq T \leq 1\ 000)$</p>

<p>각 테스트 케이스의 첫째 줄에 문자열의 길이를 나타내는 정수 $N$이 주어진다. $(1 \leq N \leq 5\ 000)$</p>

<p>각 테스트 케이스의 둘째 줄에 <span style="color:#e74c3c;"><code>H</code></span>, <span style="color:#e74c3c;"><code>Y</code></span>, <span style="color:#e74c3c;"><code>?</code></span>로 이뤄진 문자열 $S$가 주어진다. $(|S|=N)$</p>

<p>모든 테스트 케이스에서 $N$의 합은 $5\ 000$ 이하이다.</p>

### 출력

<p>각 테스트 케이스마다 정답을 출력한다.</p>