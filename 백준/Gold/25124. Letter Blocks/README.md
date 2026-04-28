# [Gold I] Letter Blocks - 25124

[문제 링크](https://www.acmicpc.net/problem/25124)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 65, 정답: 34, 맞힌 사람: 31, 정답 비율: 53.448%

### 분류

구현, 그래프 이론, 문자열

### 문제 설명

<p>It is a rainy day, so you are indoors building towers of letter blocks. A letter block is a wooden cube that has a letter printed on one of its sides. The font used for the letters makes the blocks have a clear orientation: that is, there is only one side that can be pointed down (toward the floor) and one side that can be pointed up (toward the ceiling).</p>

<p>You have built multiple separate towers so far. Now you want to combine all of them into a single megatower by choosing one of your towers as the base, then picking up another tower (without changing the order of its blocks) and stacking the whole thing on top of that, and so on, until all towers have been used.</p>

<p>As an additional constraint for the megatower, for any two blocks that have the same letter, all blocks between them must also have that letter. That is, each letter of the alphabet that appears in the megatower needs to appear in one contiguous group (of one or more blocks).</p>

<p>For example, consider the following three possible megatowers. (These are separate examples, not built from the same original towers. Also note that the different block sizes are just for fun and are not part of the problem.)</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/25124.%E2%80%85Letter%E2%80%85Blocks/92f87c30.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/25124.%E2%80%85Letter%E2%80%85Blocks/92f87c30.png" data-original-src="https://upload.acmicpc.net/662b4473-d274-45df-8c7e-66443ae9b9e8/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>The leftmost two megatowers are valid, since each letter appears in a contiguous group. However, the rightmost megatower is not valid, because there is a <code>B</code> in between two <code>C</code>s.</p>

<p>Given the towers that you have built so far, can you stack them all up into a valid megatower?</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$. $T$ test cases follow. Each test case is described by two lines. The first line consists of a single integer $N$, the number of towers that are currently built. The second line consists of $N$ strings $S_1,S_2,\dots,S_N$ representing the towers. Each of these strings consists of only uppercase letters. The $i$-th letter of each of these strings is the letter on the $i$-th block from the bottom in the represented tower.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is a string representing a valid megatower as described above, or the word <code>IMPOSSIBLE</code> if no valid megatower can be built. (Notice that the string <code>IMPOSSIBLE</code> can never itself represent a valid megatower, since the two <code>I</code>s have other letters in between.)</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
	<li>$1&le;$ the length of $S_i&le;10$, for all $i$.</li>
</ul>

### 힌트

<p> </p>

<p>In Sample Case #1, <code>JAMMICCODEEELZZZZZ</code> and <code>ZZZZZJAMMICCODEEEL</code> are the only two valid outputs.</p>

<p>In Sample Case #2, recall that <i>all</i> towers must be used in the megatower, so even though the first five towers together would form a valid megatower (as in Sample Case #1), the additional <code>EEK</code> makes the case impossible. No matter how the <code>EEL</code> and <code>EEK</code> towers are stacked relative to each other, there will be at least two non-contiguous groups of <code>E</code>s.</p>

<p>In Sample Case #3, no matter how you stack the towers, either the two <code>O</code>s are not contiguous or the two <code>Y</code>s are not contiguous.</p>

<p>In Sample Case #4, there are non-<code>H</code> letters in between the <code>H</code>s of <code>HASH</code>, so this case is also impossible.</p>

<p>In Sample Case #5, this answer is the only valid one. Also notice that the towers are not necessarily all distinct.</p>

<p>In Sample Case #6, no matter how you stack the towers, the two <code>A</code>s cannot be contiguous.</p>