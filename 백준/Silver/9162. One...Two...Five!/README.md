# [Silver I] One...Two...Five! - 9162

[문제 링크](https://www.acmicpc.net/problem/9162)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 149, 정답: 32, 맞힌 사람: 26, 정답 비율: 21.667%

### 분류

자료 구조, 브루트포스 알고리즘, 집합과 맵, 해시를 사용한 집합과 맵, 백트래킹

### 문제 설명

<p>The set of integers has rarely been a domain of error in everyday conversation. The king, however, is &ldquo;three blind&rdquo; and cannot visualize any number containing the digit &lsquo;3&rsquo; in its base 10 representation. He does intuitively sense the number between 2 and 4 and compensates for his blindness in the following manner: whenever he wants to state any number containing the digit &lsquo;3&rsquo;, he will speak a series of numbers until they can all be combined (in the order given) via addition, subtraction, multiplication and division to produce the desired value which contains the digit &lsquo;3&rsquo;. Mathematical operators work from left to right without any other regard for order of precedence (i.e. 6 + 7 * 11 = 143 -&gt; a number with a `3&#39;).</p>

<p>For example, if the king says ``1 2 5&quot;, then a knight will say ``3&quot; using the following logic:</p>

<p>1 2 5 = 1 * 2 - 5 = 2 - 5 = | 2 - 5| = 3</p>

<p>Note that there are no negative numbers in optimistic Camelot. Every subtraction will produce a nonnegative result by what is called, in these enlightened times, the absolute value. All division is integer division, i.e. 7/5 = 1. Obviously, if the number zero appears as a divisor, then division will not be attempted.</p>

<p>The court, however, has a problem. Some of the computations produce more than 1 number containing the digit `3&#39;! You have been appointed to write a program which computes and displays the most frequently appearing number containing the digit `3&#39;. In the event of a tie, use the largest number.</p>

### 입력

<p>The input will consist of an unspecified number of lines. Each line will contain at least 1 and at most 9 integers. Every number will be nonnegative and less than 100. A line with a single &lsquo;#&rsquo; character will be the end of input.</p>

<p>&nbsp;</p>

### 출력

<p>For every line of input, print a line showing the number most probably meant by the king as described above. If there is no such number, print &ldquo;No result&rdquo;.</p>