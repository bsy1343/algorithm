# [Gold IV] Light Emitting Hindenburg - 18177

[문제 링크](https://www.acmicpc.net/problem/18177)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 97, 정답: 68, 맞힌 사람: 58, 정답 비율: 80.556%

### 분류

비트마스킹, 그리디 알고리즘

### 문제 설명

<p>Lothar is organizing a concert tour of his friends&rsquo; rock band. The tour will take place in November and each day there will be at most one concert. The tour will be very representative and many musicians are willing to take part in it. The number of musicians in the tour is strictly prescribed and cannot be changed. Each concert on the tour must be attended by all the musicians taking part in the tour.</p>

<p>The good news for Lothar is that the number of candidate musicians is at least as big as the prescribed number of musicians in the tour. The bad news is that a typical musician is not available during the whole month and that various musicians&rsquo; schedules differ a lot from each other.</p>

<p>Long ago, Lothar wrote a core of a computer scheduling system, and he is exploiting it now to organize the tour. He repeatedly and somewhat randomly chooses a group of musicians of prescribed size, and lets the system calculate an acceptable tour schedule. The system depends on a very specific data format. The schedules of musicians and the tour schedules are represented as numerical codes. The days in November are labeled by their numbers in the month: 1, 2, . . . , 30.</p>

<p>For a given musician, each November day is assigned a particular numerical code. A day with label L is coded by integer 2<sup>30&minus;L</sup> if the musician is available on that day. Otherwise, the day is coded by 0. The musician schedule code is the sum of all his or her day codes.</p>

<p>For a given group of musicians, each November day is assigned a particular numerical code. A day with label L is coded by integer 2<sup>30&minus;L</sup> if all musicians in the group are available on that day. Otherwise, the day is coded by 0. The group availability code is the sum of all day codes of the group.</p>

<p>For many additional subtle reasons, Lothar thinks that the best tour would be the one with the highest possible value of the availability code of the group of musicians taking part in it.</p>

### 입력

<p>The first line contains two integers N, K (1 &le; K &le; N &le; 2 &middot; 10<sup>5</sup>). N is the number of available musicians, K is the prescribed number of musicians taking part in the tour. The next line contains a sequence of N positive integers. Each integer in the sequence represents a code of a schedule of one musician. The codes are listed in arbitrary order.</p>

### 출력

<p>Print the best possible availability code of any group of K musicians.</p>