# [Silver III] The Repeater (Small) - 12248

[문제 링크](https://www.acmicpc.net/problem/12248)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 32, 정답: 25, 맞힌 사람: 21, 정답 비율: 75.000%

### 분류

구현, 수학, 정렬

### 문제 설명

<p>Fegla and Omar like to play games every day. But now they are bored of all games, and they would like to play a new game. So they decided to invent their own game called &quot;The Repeater&quot;.</p>

<p>They invented a 2 player game. Fegla writes down <strong>N</strong> strings. Omar&#39;s task is to make all the strings identical, if possible, using the minimum number of actions (possibly 0 actions) of the following two types:</p>

<ul>
	<li>Select any character in any of the strings and repeat it (add another instance of this character exactly after it). For example, in a single move Omar can change &quot;abc&quot; to &quot;abbc&quot; (by repeating the character &#39;b&#39;).</li>
	<li>Select any two adjacent and identical characters in any of the strings, and delete one of them. For example, in a single move Omar can change &quot;abbc&quot; to &quot;abc&quot; (delete one of the &#39;b&#39; characters), but can&#39;t convert it to &quot;bbc&quot;.</li>
</ul>

<p><span style="line-height:1.6em">The 2 actions are independent; it&#39;s not necessary that an action of the first type should be followed by an action of the second type (or vice versa).</span></p>

<p>Help Omar to win this game by writing a program to find if it is possible to make the given strings identical, and to find the minimum number of moves if it is possible.</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. Each test case starts with a line containing an integer <strong>N</strong> which is the number of strings. Followed by <strong>N</strong> lines, each line contains a non-empty string (each string will consist of lower case English characters only, from &#39;a&#39; to &#39;z&#39;).</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 100.</li>
	<li>1 &le; length of each string &le; 100.</li>
	<li><strong style="line-height:1.6em">N</strong><span style="line-height:1.6em"> = 2.</span></li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the minimum number of moves to make the strings identical. If there is no possible way to make all strings identical, print &quot;Fegla Won&quot; (quotes for clarity).</p>