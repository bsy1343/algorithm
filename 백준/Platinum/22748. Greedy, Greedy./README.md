# [Platinum III] Greedy, Greedy. - 22748

[문제 링크](https://www.acmicpc.net/problem/22748)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 62, 정답: 38, 맞힌 사람: 29, 정답 비율: 59.184%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>Once upon a time, there lived a dumb king. He always messes things up based on his whimsical ideas. This time, he decided to renew the kingdom&rsquo;s coin system. Currently the kingdom has three types of coins of values 1, 5, and 25. He is thinking of replacing these with another set of coins.</p>

<p>Yesterday, he suggested a coin set of values 7, 77, and 777. &ldquo;They look so fortunate, don&rsquo;t they?&rdquo; said he. But obviously you can&rsquo;t pay, for example, 10, using this coin set. Thus his suggestion was rejected.</p>

<p>Today, he suggested a coin set of values 1, 8, 27, and 64. &ldquo;They are all cubic numbers. How beautiful!&rdquo; But another problem arises: using this coin set, you have to be quite careful in order to make changes efficiently. Suppose you are to make changes for a value of 40. If you use a greedy algorithm, i.e. continuously take the coin with the largest value until you reach an end, you will end up with seven coins: one coin of value 27, one coin of value 8, and five coins of value 1. However, you can make changes for 40 using five coins of value 8, which is fewer. This kind of inefficiency is undesirable, and thus his suggestion was rejected again.</p>

<p>Tomorrow, he would probably make another suggestion. It&rsquo;s quite a waste of time dealing with him, so let&rsquo;s write a program that automatically examines whether the above two conditions are satisfied.</p>

### 입력

<p>The input consists of multiple test cases. Each test case is given in a line with the format</p>

<pre>
<i>n</i> <i>c</i><sub>1</sub> <i>c</i><sub>2</sub> . . . <i>c</i><sub><i>n</i></sub>
</pre>

<p>where&nbsp;<i>n</i>&nbsp;is the number of kinds of coins in the suggestion of the king, and each&nbsp;<i>c<sub>i</sub></i>&nbsp;is the coin value.</p>

<p>You may assume 1 &le;&nbsp;<i>n</i>&nbsp;&le; 50 and 0 &lt;&nbsp;<i>c</i><sub>1</sub>&nbsp;&lt;&nbsp;<i>c</i><sub>2</sub>&nbsp;&lt; . . . &lt;&nbsp;<i>c</i><sub><i>n</i></sub>&nbsp;&lt; 1000.</p>

<p>The input is terminated by a single zero.</p>

### 출력

<p>For each test case, print the answer in a line. The answer should begin with &ldquo;Case #<i>i</i>: &rdquo;, where&nbsp;<i>i</i>&nbsp;is the test case number starting from 1, followed by</p>

<ul>
	<li>&ldquo;Cannot pay some amount&rdquo; if some (positive integer) amount of money cannot be paid using the given coin set,</li>
	<li>&ldquo;Cannot use greedy algorithm&rdquo; if any amount can be paid, though not necessarily with the least possible number of coins using the greedy algorithm,</li>
	<li>&ldquo;OK&rdquo; otherwise.</li>
</ul>