# [Silver III] Last Christmas - 35083

[문제 링크](https://www.acmicpc.net/problem/35083)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 29, 정답: 25, 맞힌 사람: 21, 정답 비율: 95.455%

### 분류

구현, 문자열, 정렬

### 문제 설명

<p>A Christmas market is incomplete without live music, and you will find everything from out-of-tune renditions of "Jingle Bells" on a toy xylophone to professional arrangements of Bach's Christmas Oratorio. This year, Jonathan and Merle also want to earn some money playing Christmas songs, but they cannot even agree on which artists, let alone which songs. Jonathan likes Mariah Carey best, while Merle loves the whole Christmas album by the Goo Goo Dolls.</p>

<p>They decide to settle the discussion using statistics and the following strategy. They take $n$ past Christmas top-10 lists and count how often each artist appears. Note that an artist may appear multiple times on the same list. The artist with the highest number of appearances is clearly the best! If there is a tie, they look at the artist with the highest number of number 1 hits among the artists with the highest number of appearances. If there is still a tie, they look at highest number of number 2 hits among those, and so on.</p>

<p>Who is the best artist for the Christmas season?</p>

### 입력

<p>The input consists of:</p>

<ul>
<li>One line with an integer $n$ ($1\leq n \leq 100$), the number of top-10 lists.</li>
<li>$n$ lines, each with $10$ strings $s$ ($1 \leq |s| \leq 20$), the first names of the artists of the top-10 list from $1$ to $10$. Each name only consists of English lowercase letters (<code>a-z</code>).<sup>1</sup></li>
</ul>

<hr>
<p><sup>1</sup>If Madonna does not need a last name, why would other artists need one?</p>

### 출력

<p>Output the name of the best artist according to the rules described above, or "<code>tie</code>" if there is no unique best artist.</p>