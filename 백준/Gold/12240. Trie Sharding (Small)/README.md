# [Gold IV] Trie Sharding (Small) - 12240

[문제 링크](https://www.acmicpc.net/problem/12240)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 12, 맞힌 사람: 12, 정답 비율: 92.308%

### 분류

자료 구조, 문자열, 브루트포스 알고리즘, 정렬, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>A set of strings <strong>S</strong> can be stored efficiently in a <em>trie</em>. A trie is a rooted tree that has one node for every prefix of every string in <strong>S</strong>, without duplicates.</p>

<p>For example, if <strong>S</strong> were &quot;AAA&quot;, &quot;AAB&quot;, &quot;AB&quot;, &quot;B&quot;, the corresponding trie would contain 7 nodes corresponding to the prefixes &quot;&quot;, &quot;A&quot;, &quot;AA&quot;, AAA&quot;, &quot;AAB&quot;, &quot;AB&quot;, and &quot;B&quot;.</p>

<p>I have a server that contains <strong>S</strong> in one big trie. Unfortunately, <strong>S</strong> has become very large, and I am having trouble fitting everything in memory on one server. To solve this problem, I want to switch to storing <strong>S</strong> across <strong>N</strong> separate servers. Specifically, <strong>S</strong> will be divided up into disjoint, non-empty subsets <strong>T</strong><strong><sub>1</sub></strong>, <strong>T</strong><strong><sub>2</sub></strong>, ..., <strong>T</strong><strong><sub>N</sub></strong>, and on each server i, I will build a trie containing just the strings in <strong>T</strong><strong><sub>i</sub></strong>. The downside of this approach is the total number of nodes across all <strong>N</strong> tries may go up. To make things worse, I can&#39;t control how the set of strings is divided up!</p>

<p>For example, suppose &quot;AAA&quot;, &quot;AAB&quot;, &quot;AB&quot;, &quot;B&quot; are split into two servers, one containing &quot;AAA&quot; and &quot;B&quot;, and the other containing &quot;AAB&quot;, &quot;AB&quot;. Then the trie on the first server would need 5 nodes (&quot;&quot;, &quot;A&quot;, &quot;AA&quot;, &quot;AAA&quot;, &quot;B&quot;), and the trie on the second server would also need 5 nodes (&quot;&quot;, &quot;A&quot;, &quot;AA&quot;, &quot;AAB&quot;, &quot;AB&quot;). In this case, I will need 10 nodes altogether across the two servers, as opposed to the 7 nodes I would need if I could put everything on just one server.</p>

<p>Given an assignment of strings to <strong>N</strong> servers, I want to compute the worst-case total number of nodes across all servers, and how likely it is to happen. I can then decide if my plan is good or too risky.</p>

<p>Given <strong>S</strong> and <strong>N</strong>, what is the largest number of nodes that I might end up with? Additionally, how many ways are there of choosing <strong>T</strong><strong><sub>1</sub></strong>, <strong>T</strong><strong><sub>2</sub></strong>, ..., <strong>T</strong><strong><sub>N</sub></strong> for which the number of nodes is maximum? Note that the <strong>N</strong> servers are different -- if a string appears in <strong>T</strong><strong><sub>i</sub></strong> in one arrangement and in <strong>T</strong><strong><sub>j</sub></strong> (<strong>i</strong> != <strong>j</strong>) in another arrangement, then the two arrangements are considered different. Print the remainder of the number of possible arrangements after division by 1,000,000,007.</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. Each test case starts with a line containing two space-separated integers: <strong>M</strong> and <strong>N</strong>. <strong>M</strong> lines follow, each containing one string in <strong>S</strong>.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 100.</li>
	<li>Strings in <strong>S</strong> will contain only upper case English letters.</li>
	<li>The strings in <strong>S</strong> will all be distinct.</li>
	<li><strong>N</strong> &le; <strong>M</strong></li>
	<li><span style="line-height:1.6em">1 &le; </span><strong style="line-height:1.6em">M</strong><span style="line-height:1.6em"> &le; 8&nbsp;</span></li>
	<li>1 &le; <strong>N</strong> &le; 4&nbsp;</li>
	<li>Each string in <strong>S</strong> will have between 1 and 10 characters, inclusive.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>i</strong>: <strong>X</strong> <strong>Y</strong>&quot;, where <strong>i</strong> is the case number (starting from 1), <strong>X</strong> is the worst-case number of nodes in all the tries combined, and <strong>Y</strong> is the number of ways (modulo 1,000,000,007) to assign strings to servers such that the number of nodes in all <strong>N</strong> servers are <strong>X</strong>.</p>