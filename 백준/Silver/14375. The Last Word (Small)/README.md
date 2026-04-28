# [Silver IV] The Last Word (Small) - 14375

[문제 링크](https://www.acmicpc.net/problem/14375)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 129, 정답: 104, 맞힌 사람: 100, 정답 비율: 80.645%

### 분류

그리디 알고리즘, 문자열, 브루트포스 알고리즘

### 문제 설명

<p>On the game show&nbsp;The Last Word, the host begins a round by showing the contestant a string&nbsp;S&nbsp;of uppercase English letters. The contestant has a whiteboard which is initially blank. The host will then present the contestant with the letters of&nbsp;S, one by one, in the order in which they appear in&nbsp;S. When the host presents the first letter, the contestant writes it on the whiteboard; this counts as the first&nbsp;word&nbsp;in the game (even though it is only one letter long). After that, each time the host presents a letter, the contestant must write it at the beginning or the end of the word on the whiteboard before the host moves on to the next letter (or to the end of the game, if there are no more letters).</p>

<p>For example, for&nbsp;S&nbsp;=&nbsp;<code>CAB</code>, after writing the word&nbsp;<code>C</code>&nbsp;on the whiteboard, the contestant could make one of the following four sets of choices:</p>

<ul>
	<li>put the&nbsp;<code>A</code>&nbsp;before&nbsp;<code>C</code>&nbsp;to form&nbsp;<code>AC</code>, then put the&nbsp;<code>B</code>&nbsp;before&nbsp;<code>AC</code>&nbsp;to form&nbsp;<code>BAC</code></li>
	<li>put the&nbsp;<code>A</code>&nbsp;before&nbsp;<code>C</code>&nbsp;to form&nbsp;<code>AC</code>, then put the&nbsp;<code>B</code>&nbsp;after&nbsp;<code>AC</code>&nbsp;to form&nbsp;<code>ACB</code></li>
	<li>put the&nbsp;<code>A</code>&nbsp;after&nbsp;<code>C</code>&nbsp;to form&nbsp;<code>CA</code>, then put the&nbsp;<code>B</code>&nbsp;before&nbsp;<code>CA</code>&nbsp;to form&nbsp;<code>BCA</code></li>
	<li>put the&nbsp;<code>A</code>&nbsp;after&nbsp;<code>C</code>&nbsp;to form&nbsp;<code>CA</code>, then put the&nbsp;<code>B</code>&nbsp;after&nbsp;<code>CA</code>&nbsp;to form&nbsp;<code>CAB</code></li>
</ul>

<p>The word is called the&nbsp;last word&nbsp;when the contestant finishes writing all of the letters from&nbsp;S, under the given rules. The contestant wins the game if their last word is the last of an alphabetically sorted list of all of the possible last words that could have been produced. For the example above, the winning last word is&nbsp;<code>CAB</code>&nbsp;(which happens to be the same as the original word). For a game with&nbsp;S&nbsp;=&nbsp;<code>JAM</code>, the winning last word is&nbsp;<code>MJA</code>.</p>

<p>You are the next contestant on this show, and the host has just showed you the string&nbsp;S. What&#39;s the winning last word that you should produce?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;T.&nbsp;T&nbsp;test cases follow. Each consists of one line with a string&nbsp;S.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;T&nbsp;&le; 100.</li>
	<li>1 &le; length of&nbsp;S&nbsp;&le; 15.</li>
</ul>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the winning last word, as described in the statement.</p>