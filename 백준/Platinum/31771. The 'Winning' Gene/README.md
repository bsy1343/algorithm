# [Platinum I] The 'Winning' Gene - 31771

[문제 링크](https://www.acmicpc.net/problem/31771)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 38, 정답: 16, 맞힌 사람: 14, 정답 비율: 53.846%

### 분류

다이나믹 프로그래밍, 자료 구조, 스택

### 문제 설명

<p>After years of hosting games and watching Bessie get first place over and over, Farmer John has realized that this can&#39;t be accidental. Instead, he concludes that Bessie must have winning coded into her DNA so he sets out to find this &quot;winning&quot; gene.</p>

<p>He devises a process to identify possible candidates for this &quot;winning&quot; gene. He takes Bessie&#39;s genome, which is a string $S$ of length $N$ where $1 \leq N \leq 3000$. He picks some pair $(K,L)$ where $1 \leq L \leq K \leq N$ representing that the &quot;winning&quot; gene candidates will have length $L$ and will be found within a larger $K$ length substring. To identify the gene, he takes all $K$ length substrings from $S$ which we will call a $k$-mer. For a given $k$-mer, he takes all length $L$ substrings, identifies the lexicographically minimal substring as a winning gene candidate (choosing the leftmost such substring if there is a tie), and then writes down the $0$-indexed position $p_i$ where that substring starts in $S$ to a set $P$.</p>

<p>Since he hasn&#39;t picked $K$ and $L$ yet, he wants to know how many candidates there will be for every pair of $(K,L)$.</p>

<p>For each $v$ in $1\dots N$, help him determine the number of $(K,L)$ pairs with $|P|=v$.</p>

### 입력

<p>$N$ representing the length of the string. $S$ representing the given string. All characters are guaranteed to be uppercase characters where $s_i \in A-Z$ since bovine genetics are far more advanced than ours.</p>

### 출력

For each $v$ in $1\dots N$, output the number of $(K,L)$ pairs with $|P|=v$,
with each number on a separate line.