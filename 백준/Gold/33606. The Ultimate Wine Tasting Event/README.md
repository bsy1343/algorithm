# [Gold II] The Ultimate Wine Tasting Event - 33606

[문제 링크](https://www.acmicpc.net/problem/33606)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 36, 정답: 23, 맞힌 사람: 20, 정답 비율: 62.500%

### 분류

그리디 알고리즘, 문자열, 애드 혹

### 문제 설명

<p>Rumors of the excellence of Gabriella’s wine tasting events have toured the world and made it to the headlines of prestigious wine magazines. Now, she has been asked to organize an event at the EUC 2025!</p>

<p>This time she selected $2n$ bottles of wine, of which exactly $n$ are of white wine, and exactly $n$ of red wine. She arranged them in a line as usual, in a predetermined order described by a string $s$ of length $2n$: for $1 ≤ i ≤ 2n$, the $i$-th bottle from the left is white wine if $s_i = $<code>W</code> and red wine if $s_i = $<code>R</code>.</p>

<p>To spice things up for the attendees (which include EUC contestants), Gabriella came up with the following wine-themed problem:</p>

<p>Consider a way of dividing the $2n$ bottles into two disjoint subsets, each containing $n$ bottles. Then, for every $1 ≤ i ≤ n$, swap the $i$-th bottle in the first subset (from the left) and the $i$-th bottle of the second subset (also from the left). Is it possible to choose the subsets so that, after this operation is done exactly once, the white wines occupy the first $n$ positions?</p>

### 입력

<p>The first line contains an integer $t$ ($1 ≤ t ≤ 500$) — the number of test cases. The descriptions of the $t$ test cases follow.</p>

<p>The first line of each test case contains an integer $n$ ($1 ≤ n ≤ 100$) — where $2n$ is the total number of bottles.</p>

<p>The second line of each test case contains a string $s$ of length $2n$, describing the bottle arrangement — the $i$-th character of $s$ ($1 ≤ i ≤ 2n$) is <code>W</code> for a white wine and <code>R</code> for a red wine.</p>

<p>It is guaranteed that $s$ contains exactly $n$ <code>W</code>’s and $n$ <code>R</code>’s.</p>

### 출력

<p>For each test case, print <code>YES</code> if it is possible to divide the bottles as explained in the statement. Otherwise, print <code>NO</code>.</p>