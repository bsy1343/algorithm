# [Gold IV] Alehouse - 17980

[문제 링크](https://www.acmicpc.net/problem/17980)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 32, 정답: 22, 맞힌 사람: 17, 정답 비율: 70.833%

### 분류

자료 구조, 정렬, 스위핑, 우선순위 큐

### 문제 설명

<p>Making friends can seem impossible, but going to the alehouse makes it easy &mdash; it is actually the only way to make friendships. Luckily, the alehouse is extremely good at its task: if two people are inside simultaneously, they instantly become friends. People even become friends if they meet each other in the door as one leaves and one enters the alehouse!</p>

<p>In Consistentville, each of its n residents goes to the alehouse exactly once each week, and always during the same milliseconds as the week before. This is convenient for everyone, since then nobody needs to befriend new people all the time, which can be quite exhausting.</p>

<p>You are contemplating a move to Consistentville in order to adopt their well-ordered lifestyle, and have decided that you want as many friends as possible. However, you don&rsquo;t actually enjoy ale that much, so you decide to limit your weekly visit at the alehouse to at most k milliseconds. What is the maximum number of friends you can get?</p>

### 입력

<p>The first line of input contains two positive integers n (1 &le; n &le; 100 000), and k (0 &le; k &lt; 604 800 000). The next n lines describe at which millisecond each of the original residents of Consistentville enters and leaves the alehouse every week. Specifically, the i<sup>th</sup> line consists of two integers a<sub>i</sub> and b<sub>i</sub> (0 &le; a<sub>i</sub> &le; b<sub>i</sub> &lt; 604 800 000) indicating that the i<sup>th</sup> resident enters the alehouse at millisecond a<sub>i</sub> and leaves the alehouse at millisecond b<sub>i</sub> each week.</p>

### 출력

<p>A single integer, the maximum number of friends you can get.</p>