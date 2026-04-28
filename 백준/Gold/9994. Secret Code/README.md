# [Gold III] Secret Code - 9994

[문제 링크](https://www.acmicpc.net/problem/9994)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 174, 정답: 82, 맞힌 사람: 74, 정답 비율: 50.340%

### 분류

다이나믹 프로그래밍, 문자열, 분할 정복, 재귀

### 문제 설명

<p>Farmer John has secret message that he wants to hide from his cows; the message is a string of length at least 2 containing only the characters A..Z.</p>

<p>To encrypt his message, FJ applies a sequence of &quot;operations&quot; to it, where an operation applied to a string S first shortens S by removing either its first or last character, after which the original string S is attached either at the beginning or end. For example, a single operation to the string ABCD could result in four possible strings:</p>

<ul>
	<li>BCDABCD</li>
	<li>ABCABCD</li>
	<li>ABCDABC</li>
	<li>ABCDBCD</li>
</ul>

<p>Given the final encrypted string, please count the number of possible ways FJ could have produced this string using one or more repeated operations applied to some source string. Operations are treated as being distinct even if they give the same encryption of FJ&#39;s message. For example, there are four distinct separate ways to obtain AAA from AA, corresponding to the four possible operations above.</p>

### 입력

<ul>
	<li>Line 1: A string of length at most 100.</li>
</ul>

### 출력

<ul>
	<li>Line 1: The number of different ways FJ could have produced this string by applying one or more successive operations to some source string of length at least 2. If there are no such ways, output zero.</li>
</ul>

### 힌트

<h4>Output Details</h4>

<p>Here are the different ways FJ could have produced ABABA:</p>

<ol>
	<li>Start with ABA -&gt; AB+ABA</li>
	<li>Start with ABA -&gt; ABA+BA</li>
	<li>Start with AB -&gt; AB+A -&gt; AB+ABA</li>
	<li>Start with AB -&gt; AB+A -&gt; ABA+BA</li>
	<li>Start with BA -&gt; A+BA -&gt; AB+ABA</li>
	<li>Start with BA -&gt; A+BA -&gt; ABA+BA</li>
</ol>