# [Gold IV] Tournament Chart - 15519

[문제 링크](https://www.acmicpc.net/problem/15519)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 96, 정답: 52, 맞힌 사람: 46, 정답 비율: 56.098%

### 분류

자료 구조, 문자열, 파싱, 분할 정복, 스택, 재귀

### 문제 설명

<p>In 21XX, an annual programming contest, Japan Algorithmist GrandPrix (JAG) has become one of the most popular mind sports events.</p>

<p>JAG is conducted as a knockout tournament. This year, contestants will compete in JAG. A tournament chart is represented as a string. &#39;<code>[[a-b]-[c-d]]</code>&#39; is an easy example. In this case, there are 4 contestants named a, b, c, and d, and all matches are described as follows:</p>

<ul>
	<li>Match 1 is the match between a and b.</li>
	<li>Match 2 is the match between c and d.</li>
	<li>Match 3 is the match between [the winner of match 1] and [the winner of match 2].</li>
</ul>

<p>More precisely, the tournament chart satisfies the following BNF:</p>

<ul>
	<li><code>&lt;winner&gt; ::= &lt;person&gt; | &quot;[&quot; &lt;winner&gt; &quot;-&quot; &lt;winner&gt; &quot;]&quot;</code></li>
	<li><code>&lt;person&gt; ::= &quot;a&quot; | &quot;b&quot; | &quot;c&quot; | ... | &quot;z&quot;</code></li>
</ul>

<p>You, the chairperson of JAG, are planning to announce the results of this year&#39;s JAG competition. However, you made a mistake and lost the results of all the matches. Fortunately, you found the tournament chart that was printed before all of the matches of the tournament. Of course, it does not contains results at all. Therefore, you asked every contestant for the number of wins in the tournament, and got <em>N</em> pieces of information in the form of &quot;The contestant <em>a<sub>i</sub></em> won <em>v<sub>i</sub></em> times&quot;.</p>

<p>Now, your job is to determine whether all of these replies can be true.</p>

### 입력

<p>The input consists of a single test case in the format below.</p>

<pre>
S
a<sub>1</sub> v<sub>1</sub>
.
.
.
a<sub>N</sub> v<sub>N</sub></pre>

<p><em>S</em> represents the tournament chart. <em>S</em> satisfies the above BNF. The following <em>N</em> lines represent the information of the number of wins. The (<em>i</em>+1)-th line consists of a lowercase letter <em>a<sub>i</sub></em> and a non-negative integer <em>v<sub>i</sub></em> (<em>v<sub>i</sub></em> &le; 26) separated by a space, and this means that the contestant <em>a<sub>i</sub></em> won <em>v<sub>i</sub></em> times. Note that <em>N</em> (2 &le; <em>N</em> &le; 26) means that the number of contestants and it can be identified by string <em>S</em>. You can assume that each letter <em>a<sub>i</sub></em> is distinct. It is guaranteed that <em>S</em> contains each <em>a<sub>i</sub></em> exactly once and doesn&#39;t contain any other lowercase letters.</p>

### 출력

<p>Print &#39;<code>Yes</code>&#39; in one line if replies are all valid for the tournament chart. Otherwise, print &#39;<code>No</code>&#39; in one line.</p>