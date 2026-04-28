# [Gold III] Treasure (Small) - 12342

[문제 링크](https://www.acmicpc.net/problem/12342)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 45, 정답: 20, 맞힌 사람: 18, 정답 비율: 58.065%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>Following an old map, you have stumbled upon the Dread Pirate Larry&#39;s secret treasure trove!</p>

<p>The treasure trove consists of N locked chests, each of which can only be opened by a key of a specific type. Furthermore, once a key is used to open a chest, it can never be used again. Inside every chest, you will of course find lots of treasure, and you might also find one or more keys that you can use to open other chests. A chest may contain multiple keys of the same type, and you may hold any number of keys.</p>

<p>You already have at least one key and your map says what other keys can be found inside the various chests. With all this information, can you figure out how to unlock all the chests?</p>

<p>For example, suppose the treasure trove consists of four chests as described below, and you began with exactly one key of type 1:</p>

<p>Chest Number | &nbsp;Key Type To Open Chest &nbsp;| &nbsp;Key Types Inside<br />
--------------+--------------------------+------------------<br />
1 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;| &nbsp;1 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; | &nbsp;None<br />
2 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; | &nbsp;1 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;| &nbsp;1, 3<br />
3 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; | &nbsp;2 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;&nbsp; | &nbsp;None<br />
4 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; | &nbsp;3 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; | &nbsp;2<br />
You can open all the chests in this example if you do them in the order 2, 1, 4, 3. If you start by opening chest #1 first, then you will have used up your only key, and you will be stuck.</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. Each test case begins with a single line containing two positive integers <strong>K</strong> and <strong>N</strong>, representing the number of keys you start with and the number of chests you need to open.</p>

<p>This is followed by a line containing <strong>K</strong> integers, representing the types of the keys that you start with.</p>

<p>After that, there will be <strong>N</strong> lines, each representing a single chest. Each line will begin with integers <strong>T</strong><strong><sub>i</sub></strong> and <strong>K</strong><strong><sub>i</sub></strong>, indicating the key type needed to open the chest and the number of keys inside the chest. These two integers will be followed by <strong>K</strong><strong><sub>i</sub></strong> more integers, indicating the types of the keys contained within the chest.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 25.</li>
	<li>1 &le; <strong>K</strong>.</li>
	<li>All key types will be integers between 1 and 200 inclusive.</li>
	<li>1 &le; <strong>N</strong> &le; 20.</li>
	<li>In each test case, there will be at most 400 keys altogether.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: C<sub>1</sub> C<sub>2</sub> ... C<strong><sub>N</sub></strong>&quot;, where x is the case number (starting from 1), and where C<sub>i</sub> represents the index (starting from 1) of the i<sup>th</sup> chest that you should open.</p>

<p>If there are multiple ways of opening all the chests, choose the &quot;lexicographically smallest&quot; way. In other words, you should choose to make C<sub>1</sub> as small as possible, and if there are multiple ways of making C<sub>1</sub> as small as possible, choose the one that makes C<sub>2</sub> as small as possible, and so on.</p>

<p>If there is no way to open all the chests, you should instead output one line containing &quot;Case #x: IMPOSSIBLE&quot;.</p>