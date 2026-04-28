# [Silver III] In Danger - 6537

[문제 링크](https://www.acmicpc.net/problem/6537)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 96, 정답: 64, 맞힌 사람: 47, 정답 비율: 71.212%

### 분류

수학, 역추적

### 문제 설명

<p>Flavius Josephus and 40 fellow rebels were trapped by the Romans. His companions preferred suicide to surrender, so they decided to form a circle and to kill every third person and to proceed around the circle until no one was left. Josephus was not excited by the idea of killing himself, so he calculated the position to be the last man standing (and then he did not commit suicide since nobody could watch).</p>

<p>We will consider a variant of this &quot;game&quot; where every second person leaves. And of course there will be more than 41 persons, for we now have computers. You have to calculate the safe position. Be careful because we might apply your program to calculate the winner of this contest!</p>

### 입력

<p>The input contains several test cases. Each specifies a number <em>n</em>, denoting the number of persons participating in the game. To make things more difficult, it always has the format <code>&quot;</code><em>xy</em><code>e</code><em>z</em><code>&quot;</code> with the following semantics: when <em>n</em> is written down in decimal notation, its first digit is <em>x</em>, its second digit is <em>y</em>, and then follow <em>z</em> zeros. Whereas <em>0&lt;=x,y&lt;=9</em>, the number of zeros is <em>0&lt;=z&lt;=6</em>. You may assume that <em>n&gt;0</em>. The last test case is followed by the string <code>00e0</code>.</p>

### 출력

<p>For each test case generate a line containing the position of the person who survives. Assume that the participants have serial numbers from <em>1</em> to <em>n</em> and that the counting starts with person 1, i.e., the first person leaving is the one with number 2. For example, if there are 5 persons in the circle, counting proceeds as <em>2, 4, 1, 5</em> and person <em>3</em> is staying alive.</p>