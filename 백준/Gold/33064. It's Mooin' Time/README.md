# [Gold IV] It's Mooin' Time - 33064

[문제 링크](https://www.acmicpc.net/problem/33064)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 361, 정답: 156, 맞힌 사람: 130, 정답 비율: 47.794%

### 분류

문자열, 브루트포스 알고리즘, 자료 구조, 집합과 맵

### 문제 설명

<p>Farmer John is trying to describe his favorite USACO contest to Elsie, but she is having trouble understanding why he likes it so much. He says "My favorite part of the contest was when Bessie said 'It's Mooin' Time' and mooed all over the contest."</p>

<p>Elsie still doesn't understand so Farmer John downloads the contest as a text file and tries to explain what he means. The contest is defined as a string of lowercase letters of length $N$ ($3 \leq N \leq 20\,000$). A moo is generally defined as the substring $c_ic_jc_j$ where some character $c_i$ followed directly by $2$ occurrences of some character $c_j$ where $c_i \neq c_j$. According to Farmer John, Bessie moos a lot, so if some moo appears at least $F$ ($1\le F\le N$) times in the contest, that might be from Bessie.</p>

<p>However, Farmer John's download might have been corrupted, and the text file might have up to one character that differs from the original file. Print all possible moos that Bessie could have made taking the potential error into account, sorted in alphabetical order.</p>

### 입력

<p>The first line contains $N$ and $F$, representing the length of the string and the frequency threshold for a moo by Bessie.</p>

<p>The second line contains a string of lowercase letters of length $N$, representing the contest.</p>

### 출력

<p>Print out the number of possible moos that Bessie makes, followed by a lexicographically sorted list of the moos. Each moo should appear on a separate line.</p>