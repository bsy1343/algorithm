# [Bronze I] Speaking in Tongues (Small) - 12400

[문제 링크](https://www.acmicpc.net/problem/12400)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 906, 정답: 488, 맞힌 사람: 412, 정답 비율: 54.068%

### 분류

구현, 문자열, 애드 혹

### 문제 설명

<p>We have come up with the best possible language here at Google, called Googlerese. To translate text into Googlerese, we take any message and replace each English letter with another English letter. This mapping is&nbsp;<em>one-to-one</em>&nbsp;and&nbsp;<em>onto</em>, which means that the same input letter always gets replaced with the same output letter, and different input letters always get replaced with different output letters. A letter may be replaced by itself. Spaces are left as-is.</p>

<p>For example (and here is a hint!), our awesome translation algorithm includes the following three mappings: &#39;a&#39; -&gt; &#39;y&#39;, &#39;o&#39; -&gt; &#39;e&#39;, and &#39;z&#39; -&gt; &#39;q&#39;. This means that &quot;a zoo&quot; will become &quot;y qee&quot;.</p>

<p>Googlerese is based on the best possible replacement mapping, and we will never change it. It will always be the same. In every test case. We will not tell you the rest of our mapping because that would make the problem too easy, but there are a few examples below that may help.</p>

<p>Given some text in Googlerese, can you translate it to back to normal text?</p>

<h3>Solving this problem</h3>

<p>Usually, Google Code Jam problems have 1 Small input and 1 Large input. This problem has only&nbsp;<strong>1 Small input</strong>. Once you have solved the Small input, you have finished solving this problem.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow, one per line.</p>

<p>Each line consists of a string&nbsp;<strong>G</strong>&nbsp;in Googlerese, made up of one or more words containing the letters &#39;a&#39; - &#39;z&#39;. There will be exactly one space (&#39; &#39;) character between consecutive words and no spaces at the beginning or at the end of any line.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 30.</li>
	<li><strong>G</strong>&nbsp;contains at most 100 characters.</li>
	<li>None of the text is guaranteed to be valid English.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>X</strong>:&nbsp;<strong>S</strong>&quot; where&nbsp;<strong>X</strong>&nbsp;is the case number and&nbsp;<strong>S</strong>&nbsp;is the string that becomes&nbsp;<strong>G</strong>&nbsp;in Googlerese.</p>