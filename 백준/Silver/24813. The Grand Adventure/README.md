# [Silver III] The Grand Adventure - 24813

[문제 링크](https://www.acmicpc.net/problem/24813)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 53, 정답: 34, 맞힌 사람: 33, 정답 비율: 64.706%

### 분류

자료 구조, 스택

### 문제 설명

<p>Our hero, Jim, is about to embark on his grand adventure. On his way, he&#39;ll encounter three different types of objects: money, incense, and gems. When he encounters an object, he will always put it into his backpack. Unfortunately, he&#39;ll also encounter villains along the way. More specifically, the Banker (who will demand money), the Trader (who demand incense), and the Jeweler (who will demand, of course, jewels). Jim must give each villain one of the kind of item they demand as he encounters them, or else he fails and his adventure is over. Unfortunately, Jim&#39;s backpack isn&#39;t very ergonomic and so he can only reach the item he most recently put in it. In other words, the items below are inaccessible until he&#39;s given away the one on top. Jim would also like arrive at his destination with no extra items in his bag. If he does have items at the end, he&#39;ll consider his adventure a failure.</p>

<p>We&#39;d like to know if Jim will be able to complete his adventure before he even starts!</p>

### 입력

<p>The first line contains a single integer $n$, $1 \le n \le 5$, the number of adventures. Each of the next $n$ lines contains a single string $a$, a sequence of $\{\$, *, |, t, j, b\}$. An example of this adventure string is:</p>

<pre>
....$...$...*..*...|...t...j..j...b..b...
</pre>

<p>where,</p>

<ul>
	<li><code>$</code> represents Money</li>
	<li><code>|</code> represents Incense</li>
	<li><code>*</code> represents Gem</li>
	<li><code>t</code> represents a Trader</li>
	<li><code>j</code> represents a Jeweler</li>
	<li><code>b</code> represents a Banker</li>
	<li><code>.</code> represents the Ground (nothing)</li>
</ul>

<p>and $1 \leq |a| \leq 100$ where $|a|$ is the length of string $a$. There is no limit on the number of items Jim may place in his backpack.</p>

### 출력

<p>Print <code>YES</code> if Jim is able to finish his adventure and print <code>NO</code> if he is unable to.</p>