# [Gold II] Edit Distance - 16573

[문제 링크](https://www.acmicpc.net/problem/16573)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 228, 정답: 100, 맞힌 사람: 88, 정답 비율: 47.568%

### 분류

해 구성하기

### 문제 설명

<p>A binary string is a non-empty sequence of 0&rsquo;s and 1&rsquo;s, e.g., 010110, 1, 11101, etc. The edit distance of two binary strings S and T, denoted by edit(S, T), is the minimum number of single-character edit (insert, delete, or substitute) to modify S into T. For example, the edit distance of 0011 and 1100 is 4, i.e. 0011 &rarr; 011 &rarr; 11 &rarr; 110 &rarr; 1100. The edit distance of 1100101 and 1110100 is 2, i.e. 1100101 &rarr; 1110101 &rarr; 1110100.</p>

<p>Ayu has a binary string S. She wants to find a binary string with the same length as S that maximizes the edit distance with S. Formally, she wants to find a binary string Tmax such that |S| = |Tmax| and edit(S, Tmax) &ge; edit(S, T&#39;) for all binary string T&#39;&nbsp;satisfying |S| = |T&#39;|.</p>

<p>She needs your help! However, since she wants to make your task easier, you are allowed to return any binary string T with the same length as S such that the edit distance of S and T is more than half the length of S. Formally, you must return a binary string T such that |S| = |T| and edit(S, T) &gt; |S|/2.</p>

<p>Of course, you can still return Tmax if you want, since it can be proven that edit(S, Tmax) &gt; |S|/2 for any binary string S. This also proves that there exists a solution for any binary string S. If there is more than one valid solution, you can output any of them.</p>

### 입력

<p>Input contains a binary string S (1 &le; |S| &le; 2000).</p>

### 출력

<p>Output in a line a binary string T with the same length as S that satisfies edit(S, T) &gt; |S|/2.</p>