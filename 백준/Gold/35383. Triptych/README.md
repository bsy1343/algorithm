# [Gold I] Triptych - 35383

[문제 링크](https://www.acmicpc.net/problem/35383)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

구현, 다이나믹 프로그래밍, 많은 조건 분기, 수학, 조합론, 홀짝성

### 문제 설명

<p>Donald is the curator of a museum specializing in medieval artifacts. He is especially proud of a recently acquired <em>triptych</em> (a three-paneled work of art) that is filled with religious iconography. He wants to make this triptych the main attraction in the museum's next exhibit, and he plans to highlight one of the three panels during each week of the exhibit by shining a special spotlight on it.</p>

<p>As an intern in the museum's IT department, your primary task is to program the microcontroller that operates the spotlight. For simplicity, the three panels are labelled A, B, C, from left to right, and the input to the microcontroller will be a string of these characters, specifying, in order, the panel that is to be highlighted during each week of the exhibit (which may run as long as a year). Such a string is called a <em>spotlight sequence.</em></p>

<p>In addition to programming the microcontroller, Donald has asked you to generate some possible spotlight sequences, from which he will pick one. However, not every sequence of characters from $\{ \textrm{A}, \textrm{B}, \textrm{C} \}$ is acceptable, since Donald is very strict about the following rules:</p>

<ol>
<li><em>variety</em> --- The same panel cannot be highlighted during two consecutive weeks, except for the middle panel (B), which is designed to be (literally) the center of attention; the middle panel can be highlighted during two consecutive weeks, <em>but not during three or more consecutive weeks.</em></li>
<li><em>balance</em> --- No panel should be highlighted significantly more often than any other panel. More precisely, Donald has chosen a non-negative integer, $d$, and you must ensure that any two of $a, b, c$ differ by at most $d$, where $a$, $b$, and $c$ are the numbers of occurrences of A, B, and C, respectively, in any given spotlight sequence.</li>
<li><em>aibohphobia</em> (fear of palindromes) --- Donald has an extreme aversion to palindromes (no one dares ask why), so no spotlight sequence can be a palindrome (the same forward and backward).</li>
</ol>

<p>Given the number of weeks of the exhibit, and the value of $d$, determine the total number of spotlight sequences you can generate for Donald to choose from.</p>

### 입력

<p>The input consists of a line containing two integers, $w$ $(2 \leq w \leq 52)$ and $d$ $(0 \leq d \leq 10),$ the number of weeks of the exhibit and the "maximum difference" value described above, respectively.</p>

### 출력

<p>Output a single integer: the total number of spotlight sequences of $\textrm{length } w$ you can generate that comply with all of Donald's rules.</p>