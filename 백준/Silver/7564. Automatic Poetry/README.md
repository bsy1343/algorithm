# [Silver IV] Automatic Poetry - 7564

[문제 링크](https://www.acmicpc.net/problem/7564)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 60, 정답: 32, 맞힌 사람: 24, 정답 비율: 61.538%

### 분류

구현, 문자열, 시뮬레이션

### 문제 설명

<p>&ldquo;Oh God&rdquo;, Lara Croft exclaims, &ldquo;it&rsquo;s one of these dumb riddles again!&rdquo;</p>

<p>In Tomb Raider XIV, Lara is, as ever, gunning her way through ancient Egyptian pyramids, prehistoric caves and medival hallways. Now she is standing in front of some important Germanic looking doorway and has to solve a linguistic riddle to pass. As usual, the riddle is not very intellectually challenging.</p>

<p>This time, the riddle involves poems containing a &ldquo;Sch&uuml;ttelreim&rdquo;. An example of a Sch&uuml;ttelreim is the&nbsp;following short poem:</p>

<pre>
Ein Kind h&auml;lt seinen Schnabel nur,
wenn es h&auml;ngt an der Nabelschnur.</pre>

<p>A Sch&uuml;ttelreim seems to be a typical German invention. The funny thing about this strange type of poetry&nbsp;is that if somebody gives you the first line and the beginning of the second one, you can complete the poem yourself. Well, even a computer can do that, and your task is to write a program which completes them automatically. This will help Lara concentrate on the &ldquo;action&rdquo; part of Tomb Raider and not on the &ldquo;intellectual&rdquo; part.</p>

### 입력

<p>The input will begin with a line containing a single number n. After this line follow n pairs of lines containing Sch&uuml;ttelreims. The first line of each pair will be of the form</p>

<pre>
s1&lt;s2&gt;s3&lt;s4&gt;s5</pre>

<p>where the si are possibly empty strings of lowercase characters or blanks. The second line will be a string of lowercase characters or blanks ending with three dots &ldquo;...&rdquo;. Lines will we at most 100 characters long.</p>

### 출력

<p>For each pair of Sch&uuml;ttelreim lines l1 and l2 you are to output two lines c1 and c2 in the following way: c1 is the same as l1 only that the bracket marks &ldquo;&lt;&rdquo; and &ldquo;&gt;&rdquo; are removed. Line c2 is the same as l2, except that instead of the three dots the string</p>

<pre>
s4s3s2s5</pre>

<p>should appear.</p>