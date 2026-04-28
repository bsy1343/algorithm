# [Platinum V] 문자열 조작의 달인 - 22985

[문제 링크](https://www.acmicpc.net/problem/22985)

### 성능 요약

시간 제한: 2.5 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 292, 정답: 94, 맞힌 사람: 86, 정답 비율: 42.574%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>소문자 알파벳으로 이루어진 길이 $N$의 문자열 $S$가 있다. 문자열을 자유자재로 다루는 달인 Taro는 여기에 다음과 같은 조작을 $M$번 가하려고 한다.</p>

<ul>
	<li>위치 $1 \leq i \leq N$을 하나 골라서, $S_i$를 알파벳 순서로 다음에 오는 문자로 바꾼다.
	<ul>
		<li>단, 고른 문자가 <span style="color:#e74c3c;"><code>z</code></span>라면 조작을 가하더라도 <span style="color:#e74c3c;"><code>z</code></span>가 된다.</li>
	</ul>
	</li>
</ul>

<p>예를 들어 <span style="color:#e74c3c;"><code>az</code></span>라는 문자열이 존재한다고 했을 때, $i=1$을 고르면 <span style="color:#e74c3c;"><code>bz</code></span>로 바뀌지만 $i=2$를 고르면 문자열이 바뀌지 않는다.</p>

<p>이렇게 조작을 $M$번 가했을 때 나올 수 있는 문자열의 개수를 구하자.&nbsp;</p>

### 입력

<p>다음과 같이 입력이 주어진다.</p>

<div style="background: rgb(238, 238, 238); border: 1px solid rgb(204, 204, 204); padding: 5px 10px;">$N\ M$<br />
$S$</div>

<ul>
	<li>$1 \leq N \leq 300$, $0 \leq M \leq 10^{18}$</li>
	<li>입력으로 주어지는 문자열 $S$는 알파벳 소문자만으로 이루어져 있다.</li>
</ul>

### 출력

<p>주어진 문자열에 조작을 $M$번 가했을 때 나올 수 있는 문자열의 개수를 $10^9 + 7$로 나눈 나머지를 출력한다.</p>