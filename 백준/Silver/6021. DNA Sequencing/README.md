# [Silver V] DNA Sequencing - 6021

[문제 링크](https://www.acmicpc.net/problem/6021)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 337, 정답: 210, 맞힌 사람: 200, 정답 비율: 64.309%

### 분류

구현, 문자열

### 문제 설명

<p>Farmer John is studying the geneology of his herd. He has M bulls (1 &lt;= M &lt;= 20) and F cows (1 &lt;= F &lt;= 20). He doesn&#39;t know, though, which bovines are potential descendants of which other bovines.</p>

<p>Farmer John does know the unique DNA sequence DNA_i of each and every cow and bull on his farm. DNA_i has length 25 characters and contains only upper-case letters &#39;A&#39;, &#39;C&#39;, &#39;G&#39;, and &#39;T&#39;. He wants to determine which bovines could possibly be children of which pairs of cows and bulls.</p>

<p>Help Farmer John make this determination. For each pair of a cow and a bull, print how many of FJ&#39;s other bovines could possibly be their children. A bovine can be a child of a given cow and bull if</p>

<ol>
	<li>it is not either of its parents (that is, a cow cannot be its own mother and a bull cannot be its own father)</li>
	<li>each position in its DNA sequence matches at least one of the characters in the same position in the two parent sequences</li>
</ol>

<p>So for example, &#39;abc&#39; could come from pair (&#39;axx&#39;, &#39;xbc&#39;), but not from the pair (&#39;aaa&#39;, &#39;bbb&#39;).</p>

<p>Consider three bulls and two cows with these DNA sequences:</p>

<pre>
       Bull 1: GTTTTTTTTTTTTTTTTTTTTTTTT
       Bull 2: AATTTTTTTTTTTTTTTTTTTTTTT
       Bull 3: GATTTTTTTTTTTTTTTTTTTTTTT
       Cow 1:  TTTTTTTTTTTTTTTTTTTTTTTTT
       Cow 2:  ATTTTTTTTTTTTTTTTTTTTTTTT</pre>

<p>Bull 2 and cow 1 could be the parents of cow 2:</p>

<pre>
       Bull 2: AATTTTTTTTTTTTTTTTTTTTTTT
       Cow 1:  TTTTTTTTTTTTTTTTTTTTTTTTT
       Cow 2:  ATTTTTTTTTTTTTTTTTTTTTTTT</pre>

<p>since cow 2&#39;s first letter &#39;A&#39; could be from Bull 2; cow 2&#39;s second letter &#39;T&#39; could come from cow 1; the remainder of the letters could come from either parent.</p>

<p>Your goal is to create a matrix of the count of possible offspring of each pairing of bulls and cows.&nbsp;</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: M and F</li>
	<li>Lines 2..M+1: Line i+1 gives the DNA sequence of bull i: DNA_i</li>
	<li>Lines M+2..M+F+1: Line j+M+1 gives the DNA sequence of cow j: DNA_j</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Lines 1..M: Line i: F space-separated integers. The jth integer is the number of bovines that could be children of the ith bull and jth cow.</li>
</ul>

<p>&nbsp;</p>

### 힌트

<p>Consider bull 1 and cow 1:</p>

<pre>
    b1: TGAAAAAAAAAAAAAAAAAAAAAAA
    c1: ATAAAAAAAAAAAAAAAAAAAAAAA</pre>

<p>One might express the important part of their DNA as {T|A} followed by {G|T}</p>

<p>Here&#39;s the &#39;matching&#39; tests for bull 0 and cow 0:</p>

<pre>
    b1: TGAAAAAAAAAAAAAAAAAAAAAAA -- parent, can&#39;t be offspring
    b2: AGAAAAAAAAAAAAAAAAAAAAAAA offspring! Matches [TA][GT]
    c1: ATAAAAAAAAAAAAAAAAAAAAAAA -- parent, can&#39;t be offspring
    c2: AAAAAAAAAAAAAAAAAAAAAAAAA -- second character is &#39;A&#39;; must be G or T
    c3: TTAAAAAAAAAAAAAAAAAAAAAAA offspring! Matches [TA][GT]</pre>

<p>Thus, the first element of the result matrix is 2. Other elements derived similarly.</p>