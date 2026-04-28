# [Gold V] Codejamon Cipher (Small) - 14302

[문제 링크](https://www.acmicpc.net/problem/14302)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 41, 정답: 34, 맞힌 사람: 31, 정답 비율: 88.571%

### 분류

브루트포스 알고리즘, 다이나믹 프로그래밍, 문자열

### 문제 설명

<p>The&nbsp;Codejamon&nbsp;monsters talk in enciphered messages. Here is how it works:</p>

<p>Each kind of monster has its own unique&nbsp;vocabulary: a list of&nbsp;V&nbsp;different words consisting only of lowercase English letters. When a monster speaks, it first forms a sentence of words in its vocabulary; the same word may appear multiple times in a sentence. Then, it turns the sentence into an enciphered string, as follows:</p>

<ol>
	<li>Randomly shuffle each word in the sentence.</li>
	<li>Remove all spaces.</li>
</ol>

<p>Understanding the monsters can bring you huge advantages, so you are building a tool to do that. As the first step, you want to be able to take an enciphered string and determine how many possible original sentences could have generated that enciphered string. For example, if a monster&#39;s vocabulary is&nbsp;[&quot;this&quot;, &quot;is&quot;, &quot;a&quot;, &quot;monster&quot;, &quot;retsnom&quot;], and it speaks the enciphered string&nbsp;&quot;ishtsiarestmon&quot;, there are four possible original sentences:</p>

<ul>
	<li>&quot;is this a monster&quot;</li>
	<li>&quot;is this a retsnom&quot;</li>
	<li>&quot;this is a monster&quot;</li>
	<li>&quot;this is a retsnom&quot;</li>
</ul>

<p>You have&nbsp;S&nbsp;enciphered strings from the same monster. For each one, can you figure out the number of possible original sentences?</p>

<p>IMPORTANT:&nbsp;Since the output can be a really big number, we only ask you to output the remainder of dividing the result by the prime 10<sup>9</sup>&nbsp;+ 7 (1000000007).</p>

<ul>
</ul>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow. Each test case consists of one line with two integers&nbsp;V&nbsp;and&nbsp;S, the size of the monster&#39;s vocabulary and the number of enciphered strings. Then,&nbsp;V&nbsp;lines follow; each contains a single string of lowercase English letters, representing a word in the monster&#39;s vocabulary. Finally,&nbsp;Slines follow. Each contains a string consisting only of lowercase English letters, representing an enciphered sentence. It is guaranteed that all enciphered sentences are valid; that is, each one has at least one possible original sentence.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is a space separated list of of&nbsp;S&nbsp;integers: the answers (modulo 10<sup>9</sup>&nbsp;+ 7) for each enciphered sentence, in the order given in the input, as described in the problem statement.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;S&nbsp;&le; 5.</li>
	<li>1 &le; the length of each word in the monster&#39;s vocabulary &le; 5.</li>
	<li>1 &le; the length of the enciphered string &le; 50.</li>
	<li>5 &le;&nbsp;V&nbsp;&le; 10.</li>
</ul>