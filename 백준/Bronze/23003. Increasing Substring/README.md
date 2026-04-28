# [Bronze I] Increasing Substring - 23003

[문제 링크](https://www.acmicpc.net/problem/23003)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 227, 정답: 180, 맞힌 사람: 146, 정답 비율: 79.781%

### 분류

구현, 문자열

### 문제 설명

<p>Your friend John just came back from vacation, and he would like to share with you a new property that he learned about strings.</p>

<p>John learned that a string&nbsp;C&nbsp;of length&nbsp;L&nbsp;consisting of uppercase English characters is strictly increasing if, for every pair of indices&nbsp;i&nbsp;and&nbsp;j&nbsp;such that&nbsp;1 &le; i &lt; j &le; L (1-based), the character at position&nbsp;i&nbsp;is smaller than the character at position&nbsp;j.</p>

<p>For example, the strings&nbsp;<code>ABC</code>&nbsp;and&nbsp;<code>ADF</code>&nbsp;are strictly increasing, however the strings&nbsp;<code>ACC</code>&nbsp;and&nbsp;<code>FDA</code>&nbsp;are not.</p>

<p>Now that he taught you this new exciting property, John decided to challenge you: given a string&nbsp;S of length&nbsp;N, you have to find out, for every position&nbsp;1 &le; i &le; N, what is the length of the longest strictly increasing&nbsp;<a href="https://en.wikipedia.org/wiki/Substring">substring</a>&nbsp;that ends at position&nbsp;i.</p>

### 입력

<p>The first line of the input gives the number of test cases, T. T test cases follow.</p>

<p>Each test case consists of two lines.</p>

<p>The first line contains an integer N, representing the length of the string.</p>

<p>The second line contains a string S of length N, consisting of uppercase English characters.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y<sub>1</sub> y<sub>2</sub> ...&nbsp;y<sub>n</sub></code>, where x&nbsp;is the test case number (starting from 1) and&nbsp;y<sub>i</sub>&nbsp;is the length of the longest strictly increasing substring that ends at position&nbsp;i.</p>

### 제한

<ul>
	<li>1 &le; T &le; 100.</li>
</ul>

### 힌트

<p>In Sample Case #1, the longest strictly increasing substring ending at position&nbsp;1&nbsp;is&nbsp;<code>A</code>. The longest strictly increasing substrings ending at positions&nbsp;2,&nbsp;3&nbsp;and&nbsp;4&nbsp;are&nbsp;<code>AB</code>,&nbsp;<code>B</code>&nbsp;and&nbsp;<code>BC</code>, respectively.</p>

<p>In Sample Case #2, the longest strictly increasing substrings for each position are&nbsp;<code>A</code>,&nbsp;<code>AB</code>,&nbsp;<code>A</code>,&nbsp;<code>AC</code>,&nbsp;<code>ACD</code>&nbsp;and&nbsp;<code>A</code>.</p>