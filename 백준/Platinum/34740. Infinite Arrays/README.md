# [Platinum III] Infinite Arrays - 34740

[문제 링크](https://www.acmicpc.net/problem/34740)

### 성능 요약

시간 제한: 1.5 초, 메모리 제한: 2048 MB

### 통계

제출: 9, 정답: 8, 맞힌 사람: 7, 정답 비율: 100.000%

### 분류

(분류 없음)

### 문제 설명

<p>A subarray of an array $B$ is a contiguous sequence of elements taken from $B$. For example, if $B = [3, 1, 4, 1, 5]$, then $[3, 1, 4]$, $[4, 1]$, the empty array $[ ]$ and the whole array $B$ are subarrays of $B$ (among others), while $[3, 4, 5]$ and $[1, 3]$ are not subarrays of $B$.</p>

<p>We also define $C^m$ as the array obtained by the concatenation of $m$ copies of the array $C$. For example, if $C = [3, 2]$ then $C^1 = [3, 2]$, $C^2 = [3, 2, 3, 2]$ and $C^∞ = [ \dots , 3, 2, 3, 2, 3, 2, \dots]$.</p>

<p>In this problem you are given an array $P$ containing no repeated numbers, and you have to process a sequence of events that occur in order. The events can be of three types:</p>

<ul>
<li>Delete: a number present in $P$ must be deleted. For example, if $P = [2, 3, 4]$ and the number $3$ has to be deleted, once the event is processed $P$ will become $[2, 4]$.</li>
<li>Insert: a number not present in $P$ must be inserted into $P$ before some other number present in $P$. For example, if $P = [4, 3, 2, 1$] and the number $9$ must be inserted before the number $1$, once the event is processed $P$ will become $[4, 3, 2, 9, 1]$.</li>
<li>Query: the length of the longest common subarray between $P^∞$ and $A^∞$ must be computed, where $A$ is an array given in the query. For example, if $P = [1, 2, 3, 4]$ and $A = [3, 2]$, then the longest common subarray between $P^∞$ and $A^∞$ is $[2, 3]$, so the answer to the query is $2$.</li>
</ul>

<p>Are you ready for this challenge?</p>

### 입력

<p>The first line contains an integer $N$ ($1 ≤ N ≤ 5 \cdot 10^5 $) indicating the initial length of $P$.</p>

<p>The second line contains $N$ different integers $P_1, P_2, \dots , P_N$ ($1 ≤ P_i ≤ 10^6$ for $i = 1, 2, \dots , N$).</p>

<p>The third line contains an integer $E$ ($1 ≤ E ≤ 5 \cdot 10^5$) representing the number of events that need to be processed.</p>

<p>Each of the next $E$ lines describes an event, in the order they must be processed. The content of the line depends on the event, as follows:</p>

<ul>
<li>Delete: the line contains the character “<code>-</code>” (minus sign) and an integer $X$ ($1 ≤ X ≤ 10^6$, and $X \in P$), denoting that $X$ must be deleted from $P$. It is guaranteed that after the removal $P$ does not become empty.</li>
<li>Insert: the line contains the character “<code>+</code>” (plus sign) and two integers $Y$ and $Z$ ($1 ≤ Y, Z ≤ 10^6$, $Y \not\in P$, and $Z \in P$), denoting that $Y$ must be inserted into $P$ immediately to the left of $Z$.</li>
<li>Query: the line contains the character “<code>?</code>” (question mark), a positive integer $K$, and $K$ integers $A_1, A_2, \dots , A_K$ ($1 ≤ A_i ≤ 10^6$ for $i = 1, 2, \dots , K$), indicating that the length of the longest common subarray between $P^∞$ and $A^∞$ must be computed. It is guaranteed that the input contains at least one query, and the sum of $K$ across all the queries is at most $10^6$.</li>
</ul>

### 출력

<p>Output a line for each query, with an integer indicating the length of the longest common subarray between $P^∞$ and $A^∞$, or the character “<code>*</code>” (asterisk) if the length of the longest common subarray is larger than $10^{18}$.</p>