# [Platinum IV] Subsequences - 23624

[문제 링크](https://www.acmicpc.net/problem/23624)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 15, 정답: 6, 맞힌 사람: 5, 정답 비율: 55.556%

### 분류

비트마스킹, 다이나믹 프로그래밍

### 문제 설명

<p>In the Datastring Research Corporation, the string $s$ is called <em>good</em>, if it has even number of distinct subsequences.</p>

<p>The string $t$ is called a subsequence of the string $s$, if it can be derived from $s$ by crossing out a certain set of symbols. The string $s$ and the empty string are also considered to be subsequences of $s$. In a string of the length $l$, there is a total of $2^l$ subsequences, however, some of them may coincide. For instance, a three-letter string $abb$ has only 6 distinct subsequences: empty, $a$, $b$, $ab$, $bb$, $abb$.</p>

<p>The string $s$ was lying on the String Researcher&#39;s desk, and he was trying to figure out whether it was a good one. He did realize that counting the number of distinct subsequences is a tedious task, so, instead of tackling the task right away, he went on a coffee break --- with donuts.</p>

<p>Upon his return, the String Researcher discovered that someone had made an $N-1$ cuts in the string $s$, and it fell apart into $N$ non-empty substrings $s_1, s_2, \dots, s_N$ scattered all over the table. And he absolutely does not remember the initial string $s$. However, he is curious about how many permutations $p = (p_1, \dots, p_N)$ exist, such that the recovered string $s_{p_1}s_{p_2}\dots s_{p_N}$ is good. Note that there is a total of $N!$ permutations (the factorial of $N$), and all these permutations are considered different, even if some of the substrings $s_i$ match.</p>

### 입력

<p>The first line of the input file contains a single integer $N$ --- the number of substrings ($2 \leq N \leq 20$). The $i$th of the following $N$ lines contains the substring $s_i$.</p>

<p>All of the $s_i$ strings &nbsp;are non-empty and consist exclusively of lower-case Latin letters. It is guaranteed that the sum of lengths of all the lines $s_i$ does not exceed $10^5$.</p>

### 출력

<p>In the only line of the output file, print a single integer number: the number of permutations such that the concatenation of the strings $s_i$ in the order of permutation is a good one.</p>

### 힌트

<p>The string $a + a + baa$ has 14 subsequences, the string $a + baa + a$ has 13 subsequences, and the string $baa + a + a$ has 10 subsequences. Each of these lines can be obtained with the aid of only two permutations, since there are two occurrences of the substring $a$.</p>