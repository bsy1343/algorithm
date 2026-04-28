# [Silver III] All Your Base (Small) - 12637

[문제 링크](https://www.acmicpc.net/problem/12637)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 118, 정답: 53, 맞힌 사람: 52, 정답 비율: 50.980%

### 분류

수학, 그리디 알고리즘, 정수론

### 문제 설명

<p>In A.D. 2100, aliens came to Earth. They wrote a message in a cryptic language, and next to it they wrote a series of symbols. We&#39;ve come to the conclusion that the symbols indicate a number: the number of seconds before war begins!</p>

<p>Unfortunately we have no idea what each symbol means. We&#39;ve decided that each symbol indicates one digit, but we aren&#39;t sure what each digit means or what base the aliens are using. For example, if they wrote &quot;ab2ac999&quot;, they could have meant &quot;31536000&quot; in base 10 -- exactly one year -- or they could have meant &quot;12314555&quot; in base 6 -- 398951 seconds, or about four and a half days. We are sure of three things: the number is positive; like us, the aliens will never start a number with a zero; and they aren&#39;t using unary (base 1).</p>

<p>Your job is to determine the minimum possible number of seconds before war begins.</p>

### 입력

<p>The first line of input contains a single integer,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case is a string on a line by itself. The line will contain only characters in the &#39;a&#39; to &#39;z&#39; and &#39;0&#39; to &#39;9&#39; ranges (with no spaces and no punctuation), representing the message the aliens left us. The test cases are independent, and can be in different bases with the symbols meaning different things.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100</li>
	<li>The answer will never exceed 10<sup>18</sup></li>
	<li>1 &le; the length of each line &lt; 10</li>
</ul>

### 출력

<p>For each test case, output a line in the following format:&nbsp;</p>

<pre>
Case #<strong>X</strong>: <strong>V</strong></pre>

<p>Where&nbsp;<strong>X</strong>&nbsp;is the case number (starting from 1) and&nbsp;<strong>V</strong>&nbsp;is the minimum number of seconds before war begins.</p>