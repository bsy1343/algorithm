# [Silver III] Kick_Start - 23921

[문제 링크](https://www.acmicpc.net/problem/23921)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 64, 정답: 46, 맞힌 사람: 42, 정답 비율: 70.000%

### 분류

수학, 문자열, 조합론

### 문제 설명

<p>Ksenia is very fond of reading so she kicks off each day by reading a fragment from her favourite book before starting with the rest of her morning routine. A fragment is simply a&nbsp;<a href="https://en.wikipedia.org/wiki/Substring">substring</a>&nbsp;of the text. Ksenia is somewhat superstitious and believes that her day will be lucky if the fragment she reads starts with the string KICK, then goes on with 0 or more characters, and eventually ends with the string START, even if the overall fragment makes little sense.</p>

<p>Given the text of the book, count the number of different lucky fragments that Ksenia can read before the book gets old and she needs to buy another one. Two fragments are considered to be different if they start or end at different positions in the text, even if the fragments read the same. Also note that different lucky fragments may overlap.</p>

### 입력

<p>The first line of the input gives the number of test cases&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;lines follow, each containing a single string&nbsp;<b>S</b>&nbsp;consisting of upper case English letters only.&#39;</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is the number of different lucky fragments in the text of this test case.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;<b>T</b>&nbsp;&le; 100.</li>
	<li><b>S</b>&nbsp;consists of upper-case English letters only.</li>
</ul>

### 힌트

<p>There are three lucky fragments in the first test case, namely, KICKSTARTPROBLEMNAMEDKICKSTART and two occurrences of KICKSTART. The text in the second test case has no lucky fragments at all.</p>