# [Platinum IV] Finite automaton - 26239

[문제 링크](https://www.acmicpc.net/problem/26239)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 14, 정답: 11, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

수학, 구현, 자료 구조, 그래프 이론, 정수론, 집합과 맵, 해 구성하기

### 문제 설명

<p>Today Vasya learned what a &lt;&lt;deterministic finite automaton&gt;&gt; (DFA) is, and he&#39;s aching to tell everyone about it.</p>

<p>As it turns out, there are $N$ states in a DFA. The automaton can be in any one of these state at any given moment during its work. The input of the automaton is an arbitrary string, and after its work, the automaton tells whether the string is <em>acceptable</em>.</p>

<p>The automaton works in the following manner:</p>

<ol>
	<li>In the beginning of its work, the automaton is in the <em>start</em> state, which is always marked as such.</li>
	<li>The automaton <em>reads</em> all symbols of the string one by one from left to right. After reading each symbol, the automaton can switch to a different state (described in detail below).</li>
	<li>After the string is read completely, the automaton defines the answer based on the state in which it ended up.</li>
</ol>

<p>For each state $u$ of the automaton and each possible symbol $c$, automaton defines in which state will it be afer reading the symbol $c$, if it was in the state $u$ beforehand. This new state can either be the same state $u$ or be a different state. Moreover, for each state the automaton defines the answer it will give (whether the string is accepted or not) if it finished in that state.</p>

<p>In the first seminar on the subject, Vasya constructed all sorts of DFA&#39;s, and he was given the following problem for &lt;&lt;homework&gt;&gt;. Build a DFA which, given a non-negative integer written in the $B$-ary numeral system, accepts those and only those integers that are divisible by the given module $M$.</p>

<p>To simplify, Vasya assumes that the input number:</p>

<ul>
	<li>begins from high-order digits (they&#39;re written on the left, big-endian);</li>
	<li>can have leading zeroes;</li>
	<li>can be empty: in this case it is equal to zero and is definitely divisible by $M$.</li>
</ul>

<p>Vasya is a born perfectionist, and he wants to learn how to build DFA&#39;s that meet the problem requirements with the <strong>smallest</strong> possible number of states, He asked you to help him.</p>

### 입력

<p>The only line of the input file contains two integers: $B$ --- the base of the positional numeral system in which the input number is given and $M$ --- the module which all acceptable and only acceptable numbers must be divisible by ($2 \le B \le 16, 2 \le M \le 10^5$).</p>

### 출력

<p>Print the description of the smallest DFA meeting the problem requirements to the output file.</p>

<p>The first line of the output file must contain two integers: $N$ --- the count of states in the automaton ($N \ge 2$) and $S$ --- the start state number ($0 \le S &lt; N$). All states are numbered successively beginning from zero.</p>

<p>The second line must contain $N$ space-separated symbols. The $k$-th of these symbols defines the answer the automaton gives if it ends up in the $k$-th state upon the completion of its work ($0 \le k &lt; N$). A symbol equals &#39;<code>G</code>&#39; if the string should be deemed acceptable, and &#39;<code>B</code>&#39; otherwise.</p>

<p>There must be $N$ line following, each containing $B$ integers. The $k$-th number in the $i$-th of these lines contains the state number in which the automaton ends up after reading digit $k$, if before that it was in the state $i$ ($0 \le i &lt; N$, $0 \le k &lt; B$). This number can be any integer between $0$ and $N-1$ inclusively.</p>

### 힌트

<p>Shown below is the DFA used in the sample. The letter &quot;<code>S</code>&quot; and the number are shown near each state. Bold arrow points to the start state. Each normal arrow describes the state the DFA goes to after reading the digit written near the arrow.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26239.%E2%80%85Finite%E2%80%85automaton/04840ee9.png" data-original-src="https://upload.acmicpc.net/a704eafc-fed8-4b03-a4ab-36db21ec3f91/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 250px; height: 204px;" /></p>