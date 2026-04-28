# [Gold IV] Repeated Subsequences - 22697

[문제 링크](https://www.acmicpc.net/problem/22697)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 7, 맞힌 사람: 7, 정답 비율: 30.435%

### 분류

다이나믹 프로그래밍, 문자열, 브루트포스 알고리즘, 최장 공통 부분 수열 문제

### 문제 설명

<p>You are a treasure hunter traveling around the world. Finally, you&rsquo;ve got an ancient text indicating the place where the treasure was hidden. The ancient text looks like a meaningless string of characters at first glance. Actually, the secret place is embedded as the&nbsp;<i>longest repeated subsequence</i>&nbsp;of the text.</p>

<p>Well, then, what is the&nbsp;<i>longest repeated subsequence</i>&nbsp;of a string? First, you split the given string&nbsp;<i>S</i>&nbsp;into two parts&nbsp;<i>F</i>&nbsp;and&nbsp;<i>R</i>. Then, you take the longest common subsequence&nbsp;<i>L</i>&nbsp;of&nbsp;<i>F</i>&nbsp;and&nbsp;<i>R</i>&nbsp;(longest string&nbsp;<i>L</i>&nbsp;that is a subsequence of both&nbsp;<i>F</i>&nbsp;and&nbsp;<i>R</i>). Since there are many possible ways to split&nbsp;<i>S</i>&nbsp;into two parts, there are many possible&nbsp;<i>L</i>&#39;s. The longest repeated subsequence is the longest one among them. For example, the longest repeated subsequence of &ldquo;ABCABCABAB&rdquo; is &ldquo;ABAB&rdquo;, which is obtained when you split &ldquo;ABCABCABAB&rdquo; into &ldquo;ABCABC&rdquo; and &ldquo;ABAB&rdquo;.</p>

<p>Now your task is clear. Please find the longest repeated subsequence and get the hidden treasure!</p>

### 입력

<p>The input consists of multiple data sets. Each data set comes with a single line that contains one string of up to 300 capital letters. It is guaranteed that there is at least one repeated subsequence in each string.</p>

<p>The end of input is indicated by a line that contains &ldquo;#END&rdquo;. This line should not be processed.</p>

### 출력

<p>For each data set, print the longest repeated subsequence on a line. If there are multiple longest subsequence, print any one of them.</p>