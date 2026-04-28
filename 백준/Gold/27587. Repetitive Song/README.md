# [Gold IV] Repetitive Song - 27587

[문제 링크](https://www.acmicpc.net/problem/27587)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 9, 맞힌 사람: 9, 정답 비율: 81.818%

### 분류

자료 구조, 그리디 알고리즘, 해시를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Your younger sibling is obsessed with a fairly repetitive song. They claim that it is not repetitive, so you decided to prove your point by finding the longest (in terms of the number of words) subsequence of the song that your sibling cannot definitively identify within the full song lyrics.</p>

<p>More formally, a length-$\ell$ subsequence of a song with $n$ words is a tuple of $\ell$ integers $1 \leq s_1 &lt; s_2 &lt; \cdots &lt; s_\ell \leq n$ identifying the words in the subsequence. The subsequence is non-identifiable if there exists a different length-$\ell$ subsequence $1 \leq t_1 &lt; t_2 &lt; \cdots &lt; t_L \leq n$ (with $s_i \neq t_i$ for at least one index $i$) where word $s_1$ in the song is identical to word $t_1$, word $s_2$ is identical to word $t_2$, etc.</p>

<p>Given the lyrics for a song, print the length of the longest non-identifiable subsequence. </p>

### 입력

<p>The first line of input contains a single integer $n$ ($1 \le n \leq 10^5$) specifying the number of words in the song lyrics.</p>

<p>Each of the next $n$ lines contains one word of the song lyrics, given in order. Each word consists of up to 20 uppercase (<code>A</code>--<code>Z</code>) and lowercase (<code>a</code>--<code>z</code>) letters. The same word may appear on multiple lines.  If two words do not match exactly (including the use of upper and lower case) then they are considered to be different words.</p>

### 출력

<p>Output a single integer $\ell$, the number of words in the longest non-identifiable song subsequence. If all of the song&#39;s subsequences are identifiable, print $0$. When determining if a subsequence is identifiable, treat two words in the lyrics as identical if each of their corresponding characters are identical (in other words, case <em>does</em> matter).</p>