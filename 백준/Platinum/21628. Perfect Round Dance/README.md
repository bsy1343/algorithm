# [Platinum II] Perfect Round Dance - 21628

[문제 링크](https://www.acmicpc.net/problem/21628)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 23, 정답: 3, 맞힌 사람: 3, 정답 비율: 13.043%

### 분류

해 구성하기

### 문제 설명

<p>The kindergarten founded by Finley Marlin is attended by exactly $2n$ children. Today they have a party and the kids will dance around the large palm tree in the center of the room. There are young kids involved, so there are some restrictions on how the event would be organized.</p>

<p>For example, every kid has the best friend, and every kid is also the best friend of his best friend. If we consider pairs of best friends, they will be kids with numbers $2i - 1$ and $2i$. Kids refuses to participate in the dance if they are not standing next to their best friend.</p>

<p>The kid number $i$ came to the party wearing outfit $x_i$, but there can be some identical outfits worn by different children. So if two kids are not best friends and they wear the same outfits, they refuse to stand next to each other. Friendship is stronger than fashion, so best friends agree to stand next to each other even if they wear the same outfit.</p>

<p>Please help the tired teachers to place as much children as possible into the circle so that all the demands of children standing in circle are satisfied.</p>

### 입력

<p>The first line of input contains one integer $n$  --- the number of pairs of children ($1 \leq n \leq 300\,000$).</p>

<p>Each of the following $n$ lines contains two integers: the $i$-th line contains $x_{2i-1}$ and $x_{2i}$ --- the outfits worn by the $(2i-1)$-th and the $2i$-th kids respectively ($1 \leq x_{2i-1}, x_{2i} \leq 2n$).</p>

### 출력

<p>The first line of output must contain $k$  --- the maximum number of pairs of children that can form the circle. Even one pair can form a circle.</p>

<p>The next line should contain space-separated numbers of children in the circle in the order they are standing.</p>

<p>If there are several optimal answers output any of them.</p>