# [Bronze II] Fix - 6892

[문제 링크](https://www.acmicpc.net/problem/6892)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 193, 정답: 125, 맞힌 사람: 97, 정답 비율: 61.783%

### 분류

구현, 문자열, 브루트포스 알고리즘

### 문제 설명

<p>A collection of words is <em>prefix-free</em> if no word is a prefix of any other word. A collection of words is <em>suffix-free</em> if no word is a suffix of any other word. A collection of words is fix-free if it is both prefix-free and suffix-free.</p>

<p>For this problem, a word is a sequence of lower-case letters of length between $1$ and $25$. A word $X$ is a prefix of word $Y$ if $X$ consists of the first $n$ characters of $Y$, in order, for some $n$. That is, the word <code>cat</code> has prefixes <code>c</code>, <code>ca</code>, and <code>cat</code>. Similarly, a word $X$ is a suffix of $Y$ if $X$ consists of the last $n$ characters of $Y$, in order, for some $n$.</p>

<p>Your input will be $3N+1$ lines: the first line will be the number $N$, and the remaining $3N$ lines will be the $N$ collections of $3$ words each. (That is, lines $2$, $3$, and $4$ compose the first collection, lines $5$, $6$, and $7$ compose the second collection, and so on). Your output will be $N$ lines, each line containing either <code>Yes</code> (if that collection of words is fix-free) or <code>No</code> (if that collection is not fix-free).</p>

### 입력



### 출력

