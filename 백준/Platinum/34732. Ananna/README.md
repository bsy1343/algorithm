# [Platinum IV] Ananna - 34732

[문제 링크](https://www.acmicpc.net/problem/34732)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 2048 MB

### 통계

제출: 49, 정답: 17, 맞힌 사람: 13, 정답 비율: 32.500%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Danaland is a very typical country: it consists of $N$ cities, each identified by a distinct number. These cities are connected by $M$ unidirectional roads, where each road has a name.</p>

<p>Ananna is a bright little girl who lives in Danaland. Unfortunately, she was born with a terrible disease: she can only read backwards. After being a victim of terrible bullying by her peers, or, as Ananna calls them, sreep, she found solace in palindromes: words that are the same when read backwards.</p>

<p>Ananna’s mom, Eeve, is trying to help her with her condition. One way she helps is by taking her on road trips. A road trip is a sequence of roads that starts at some city $U$ and ends at a different city $V$; the same road may appear more than once.</p>

<p>While on a road trip, Eeve asks Ananna the first letter of each road name, so she can practice looking at the start of words. This is, obviously, a source of great anxiety to Ananna, so to avoid having a kcatta cinap, Eeve always makes sure that the sequence formed by taking the first letter of each road’s name, in the order they are traversed, is a palindrome.</p>

<p>Eeve is now looking at a map of Danaland, and she wonders: How many distinct pairs of cities $U$, $V$ exist such that Eeve can take a road trip from $U$ to $V$?</p>

### 입력

<p>The first line contains two integers $N$ and $M$ ($1 ≤ N, M ≤ 5000$), indicating respectively the number of cities and the number of roads in Danaland. Each city is identified by a distinct integer from $1$ to $N$.</p>

<p>Each of the next $M$ lines contains two integers $U$ and $V$ ($1 ≤ U, V ≤ N$) and a lowercase letter $C$, representing that there is a unidirectional road from $U$ to $V$ whose name starts with $C$. Several roads may connect the same pair of cities, and a road may connect a city to itself.</p>

### 출력

<p>Output a single line with an integer indicating the number of pairs of cities $U$, $V$ such that $U \ne V$, there is a road trip from $U$ to $V$, and the letters of the roads (in the order they are traversed) form a palindrome.</p>