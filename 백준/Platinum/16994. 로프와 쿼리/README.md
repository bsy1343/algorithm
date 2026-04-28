# [Platinum I] 로프와 쿼리 - 16994

[문제 링크](https://www.acmicpc.net/problem/16994)

### 성능 요약

시간 제한: 0.3 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 864, 정답: 445, 맞힌 사람: 314, 정답 비율: 58.692%

### 분류

자료 구조, 문자열, 트리, 스플레이 트리, 로프

### 문제 설명

<p>길이가 N인 문자열 S = S<sub>0</sub>S<sub>1</sub>...S<sub>N-1</sub>이 주어졌을 때, 다음과 같은 쿼리를 수행해보자.</p>

<ul>
	<li>1 x y: S<sub>x</sub>S<sub>x+1</sub>...S<sub>y</sub>를 문자열의 가장 앞으로 옮긴다. (0 &le; x &le; y &lt; N)</li>
	<li>2 x y: S<sub>x</sub>S<sub>x+1</sub>...S<sub>y</sub>를 문자열의 가장 뒤로 옮긴다. (0 &le; x &le; y &lt; N)</li>
	<li>3 x: S<sub>x</sub>를 출력한다. (0 &le; x &lt; N)</li>
</ul>

<p>S = &quot;abcdefgh&quot;인 경우 쿼리 1 2 5는 아래와 같이 수행된다.</p>

<pre>
&quot;ab<span style="color:#e74c3c;">cdef</span>gh&quot; &rarr; &quot;<span style="color:#e74c3c;">cdef</span>abgh&quot;
</pre>

<p>여기서 쿼리 2 4 6은 다음과 같이 수행된다.</p>

<pre>
&quot;cdef<span style="color:#e74c3c;">abg</span>h&quot; &rarr; &quot;cdefh<span style="color:#e74c3c;">abg</span>&quot;</pre>

### 입력

<p>첫째 줄에 문자열 S가 주어진다. S는 알파벳 소문자로만 이루어져 있고, 길이는 100,000을 넘지 않는다.</p>

<p>둘째 줄에는 쿼리의 개수 Q(1 &le; Q &le; 100,000)가 주어진다. 셋째 줄부터 Q개의 줄에는 쿼리가 한 줄에 하나씩 주어진다.</p>

### 출력

<p>3번 쿼리가 주어질 때마다 답을 출력한다. 3번 쿼리는 하나 이상 주어진다.</p>