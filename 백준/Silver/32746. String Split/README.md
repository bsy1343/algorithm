# [Silver II] String Split - 32746

[문제 링크](https://www.acmicpc.net/problem/32746)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 103, 정답: 42, 맞힌 사람: 30, 정답 비율: 42.857%

### 분류

문자열, 재귀

### 문제 설명

<p>You are given two strings $s$ and $t$. In one operation, you can delete all the odd-indexed characters from $s$ or all the even-indexed characters from $s$.</p>

<p>For example, if you perform an operation on the string <code>abcdefg</code>, you could choose to turn it into <code>aceg</code> or <code>bdf</code>.</p>

<p>After performing any number of operations on $s$ (including zero), is it possible for $s$ to equal $t$?</p>

### 입력

<p>The first line of the input contains a single integer $t$ ($1 \le t \le 10^4$) --- the number of test cases. The description of the test cases follows.</p>

<p>The first line of each test case contains a string $s$ ($1 \le |s| \le 2\cdot 10^5$) of lowercase letters --- the starting string, as described above.</p>

<p>The second line of each test case contains a string $t$ ($1 \le |t| \le 2\cdot 10^5$) of lowercase letters --- the desired ending string, as described above.</p>

<p>It is guaranteed that the sum of $|s|$ over all test cases does not exceed $2\cdot 10^5$. Similarly, the sum of $|t|$ over all test cases does not exceed $2\cdot 10^5$.</p>

### 출력

<p>For each test case, print "<code>YES</code>" if it is possible to make all $s$ equal to $t$ after any number of operations, and "<code>NO</code>" otherwise.</p>

<p>You can output the answer in any case (upper or lower). For example, the strings "<code>yEs</code>", "<code>yes</code>", "<code>Yes</code>", and "<code>YES</code>" will be recognized as positive responses.</p>

### 힌트

<p>In the first test case, by removing all even-indexed characters of $s$, we obtain $s = thomas$, so we have $s = t$.</p>

<p>In the second test case, the length of $s$ is less than the length of $t$, and if we perform any operations, the length of $s$ will only decrease. Therefore, $s$ can never equal $t$.</p>

<p>In the third test case, we have $s = t$ even before performing any operations.</p>