# [Gold I] Brackets sequence - 7418

[문제 링크](https://www.acmicpc.net/problem/7418)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 27, 정답: 18, 맞힌 사람: 12, 정답 비율: 75.000%

### 분류

다이나믹 프로그래밍, 해 구성하기

### 문제 설명

<p>Let us define a regular brackets sequence in the following way:</p>

<ol>
	<li>Empty sequence is a regular sequence.</li>
	<li>If S is a regular sequence, then (S) and [S] are both regular sequences.</li>
	<li>If A and B are regular sequences, then AB is a regular sequence.</li>
</ol>

<p>For example, all of the following sequences of characters are regular brackets sequences:</p>

<pre>
(), [], (()), ([]), ()[], ()[()]</pre>

<p>And all of the following character sequences are not:</p>

<pre>
(, [, ), )(, ([)], ([(]</pre>

<p>Some sequence of characters &#39;(&#39;, &#39;)&#39;, &#39;[&#39;, and &#39;]&#39; is given. You are to find the shortest possible regular brackets sequence, that contains the given character sequence as a subsequence. Here, a string a<sub>1</sub>a<sub>2</sub>...a<sub>n</sub> is called a subsequence of the string b<sub>1</sub>b<sub>2</sub>...b<sub>m</sub>, if there exist such indices 1 = i<sub>1</sub> &lt; i<sub>2</sub> &lt; ... &lt; i<sub>n</sub> = m, that a<sub>j</sub>=b<sub>ij</sub> for all 1 &le; j &le;&nbsp;n.</p>

### 입력

<p>The input file contains at most 100 brackets (characters &#39;(&#39;, &#39;)&#39;, &#39;[&#39; and &#39;]&#39;) that are situated on a single line without any other characters among them.</p>

### 출력

<p>Write to the output file a single line that contains some regular brackets sequence that has the minimal possible length and contains the given sequence as a subsequence.</p>