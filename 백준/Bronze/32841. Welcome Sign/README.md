# [Bronze II] Welcome Sign - 32841

[문제 링크](https://www.acmicpc.net/problem/32841)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 136, 정답: 105, 맞힌 사람: 92, 정답 비율: 76.667%

### 분류

구현

### 문제 설명

<p>Amanda is opening a new bakery in town. She will put up a fancy LED sign to show a grand opening message on the storefront window. The sign has $r$ rows and $c$ columns of display units. Each unit can display one letter or be blank.</p>

<p>Amanda has written a message consisting of exactly $r$ words. She will arrange them onto the LED sign such that each row will display one word from the message in order. Each word must be as centered as possible, which means that if the number of blanks on the left side and right side of the word are $l$ and $r$, then $|l - r|$ must be as close to zero as possible. On those rows where $l$ cannot equal $r$, Amanda would like to balance the number of blanks on the two sides. More specifically, for the first and every other such row ($1$<sup>st</sup>, $3$<sup>rd</sup>, $5$<sup>th</sup>, and so forth), she would like $l$ to be less than $r$. For the other rows ($2$<sup>nd</sup>, $4$<sup>th</sup>, $6$<sup>th</sup>, and so forth), she would like $l$ to be greater than $r$.</p>

<p>What would the sign look like after Amanda sets it up according to the above?</p>

### 입력

<p>The first line of input contains two integers $r$ and $c$ ($1 ≤ r, c ≤ 50$), the number of rows and the number of columns of display units.</p>

<p>The next $r$ lines each contain a word with at least one and at most $c$ lowercase letters (<code>a</code>-<code>z</code>), giving the words to display per row in order.</p>

### 출력

<p>Output $r$ lines. Each line must contain exactly $c$ characters representing the displayed characters on one row of the LED sign. Output a dot (<code>.</code>) for each blank display unit.</p>