# [Gold III] Feeding the Cows - 26976

[문제 링크](https://www.acmicpc.net/problem/26976)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 778, 정답: 341, 맞힌 사람: 289, 정답 비율: 45.227%

### 분류

그리디 알고리즘, 문자열

### 문제 설명

<p>Farmer John has $N$ ($1 \le {N} \le {10^5}$) cows, the breed of each being either a Guernsey or a Holstein. They have lined up horizontally with the cows occupying positions labeled from $1\dots N$.</p>

<p>Since all the cows are hungry, FJ decides to plant grassy patches on some of the positions $1\dots N$. Guernseys and Holsteins prefer different types of grass, so if Farmer John decides to plant grass at some location, he must choose to planting either Guernsey-preferred grass or Holstein-preferred grass --- he cannot plant both at the same location. Each patch of grass planted can feed an unlimited number of cows of the appropriate breed.</p>

<p>Each cow is willing to move a maximum of $K$ ($0 \le {K} \le N-1$) positions to reach a patch. Find the minimum number of patches needed to feed all the cows. Also, print a configuration of patches that uses the minimum amount of patches needed to feed the cows. Any configuration that satisfies the above conditions will be considered correct.</p>

### 입력

<p>each describing an arrangement of cows. The first line of input contains $T$ ($1 \le T \le 10$). Each of the $T$ test cases follow.</p>

<p>Each test case starts with a line containing $N$ and $K$. The next line will contain a string of length $N$, where each character denotes the breed of the $i$th cow (G meaning Guernsey and H meaning Holstein).</p>

### 출력

<p>For each of the $T$ test cases, please write two lines of output. For the first line, print the minimum number of patches needed to feed the cows. For the second line, print a string of length $N$ that describes a configuration that feeds all the cows with the minimum number of patches. The $i$th character, describing the $i$th position, should be a &#39;.&#39; if there is no patch, a &#39;G&#39; if there is a patch that feeds Guernseys, and a &#39;H&#39; if it feeds Holsteins. Any valid configuration will be accepted.</p>

### 힌트

<p>Note that for some test cases, there are multiple acceptable configurations that manage to feed all cows while using the minimum number of patches. For example, in the fourth test case, another acceptable answer would be:</p>

<pre>
.GH..
</pre>

<p>This corresponds to placing a patch feeding Guernseys on the 2nd position and a patch feeding Holsteins on the third position. This uses the optimal number of patches and ensures that all cows are within 3 positions of a patch they prefer.</p>