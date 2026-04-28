# [Platinum III] PermRLE (Large) - 12710

[문제 링크](https://www.acmicpc.net/problem/12710)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 71, 정답: 24, 맞힌 사람: 21, 정답 비율: 48.837%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍, 외판원 순회 문제

### 문제 설명

<p>You&#39;ve invented a slight modification of the run-length encoding (RLE) compression algorithm, called PermRLE.</p>

<p>To compress a string, this algorithm chooses some permutation of integers between 1 and&nbsp;<strong>k</strong>, applies this permutation to the first&nbsp;<strong>k</strong>&nbsp;letters of the given string, then to the next block of&nbsp;<strong>k</strong>&nbsp;letters, and so on. The length of the string must be divisible by&nbsp;<strong>k</strong>. After permuting all blocks, the new string is compressed using RLE, which is described later.</p>

<p>To apply the given permutation&nbsp;<em>p</em>&nbsp;to a block of&nbsp;<strong>k</strong>&nbsp;letters means to place the&nbsp;<em>p[1]</em>-th of these letters in the first position, then&nbsp;<em>p[2]</em>-th of these letters in the second position, and so on. For example, applying the permutation {3,1,4,2} to the block &quot;abcd&quot; yields &quot;cadb&quot;. Applying it to the longer string &quot;abcdefghijkl&quot; in blocks yields &quot;cadbgehfkilj&quot;.</p>

<p>The permuted string is then compressed using run-length encoding. To simplify, we will consider the&nbsp;<em>compressed size</em>&nbsp;of the string to be the number of groups of consecutive equal letters. For example, the compressed size of &quot;aabcaaaa&quot; is 4; the first of the four groups is a group of two letters &quot;a&quot;, then two groups &quot;b&quot; and &quot;c&quot; each containing only one letter, and finally a longer group of letters &quot;a&quot;.</p>

<p>Obviously, the compressed size may depend on the chosen permutation. Since the goal of compression algorithms is to minimize the size of the compressed text, it is your job to choose the permutation that yields the smallest possible compressed size, and output that size.</p>

### 입력

<p>The first line of input gives the number of cases,&nbsp;<strong>N</strong>.&nbsp;<strong>N</strong>&nbsp;test cases follow.</p>

<p>The first line of each case will contain&nbsp;<strong>k</strong>. The second line will contain&nbsp;<strong>S</strong>, the string to be compressed.</p>

<p>Limits</p>

<ul>
	<li><strong>N</strong>&nbsp;= 20</li>
	<li><strong>S</strong>&nbsp;will contain only lowercase letters &#39;a&#39; through &#39;z&#39;</li>
	<li>The length of&nbsp;<strong>S</strong>&nbsp;will be divisible by&nbsp;<strong>k</strong></li>
	<li>2 &le;&nbsp;<strong>k</strong>&nbsp;&le; 16</li>
	<li>1 &le; length of&nbsp;<strong>S</strong>&nbsp;&le; 50000</li>
</ul>

### 출력

<p>For each test case you should output one line containing &quot;Case #<strong>X</strong>:&nbsp;<strong>Y</strong>&quot; (quotes for clarity) where&nbsp;<strong>X</strong>&nbsp;is the number of the test case and&nbsp;<strong>Y</strong>&nbsp;is the minimum compressed size of&nbsp;<strong>S</strong>.</p>