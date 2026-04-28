# [Platinum II] Find and Replace - 27558

[문제 링크](https://www.acmicpc.net/problem/27558)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 402, 정답: 95, 맞힌 사람: 89, 정답 비율: 27.301%

### 분류

그래프 이론, 애드 혹, 많은 조건 분기

### 문제 설명

<p>Bessie is using the latest and greatest innovation in text-editing software, miV! She starts with an input string consisting solely of upper and lowercase English letters and wishes to transform it into some output string. With just one keystroke, miV allows her to replace all occurrences of one English letter $c_1$ in the string with another English letter $c_2$. For example, given the string <code>aAbBa</code>, if Bessie selects $c_1$ as &#39;a&#39; and $c_2$ as &#39;B&#39;, the given string transforms into <code>BAbBB</code>.</p>

<p>Bessie is a busy cow, so for each of $T$ ($1\le T\le 10$) independent test cases, output the minimum number of keystrokes required to transform her input string into her desired output string.</p>

### 입력

<p>The first line contains $T$, the number of independent test cases.</p>

<p>The following $T$ pairs of lines contain an input and output string of equal length. All characters are upper or lowercase English letters (either A through Z or a through z). The sum of the lengths of all strings does not exceed $10^5$.</p>

### 출력

<p>For each test case, output the minimum number of keystrokes required to change the input string into the output string, or $-1$ if it is impossible to do so.</p>

### 힌트

<p>The first input string is the same as its output string, so no keystrokes are required.</p>

<p>The second input string cannot be changed into its output string because Bessie cannot change one &#39;<code>B</code>&#39; to &#39;<code>A</code>&#39; while keeping the other as &#39;<code>B</code>&#39;.</p>

<p>The third input string can be changed into its output string by changing &#39;<code>a</code>&#39; to &#39;<code>b</code>&#39;.</p>

<p>The last input string can be changed into its output string like so: <code>ABCD</code> $\rightarrow$ <code>EBCD</code> $\rightarrow$ <code>EACD</code> $\rightarrow$ <code>BACD</code>.</p>