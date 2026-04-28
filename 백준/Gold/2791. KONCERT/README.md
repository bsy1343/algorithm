# [Gold IV] KONCERT - 2791

[문제 링크](https://www.acmicpc.net/problem/2791)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 55, 정답: 17, 맞힌 사람: 13, 정답 비율: 44.828%

### 분류

구현, 그리디 알고리즘, 해 구성하기, 시뮬레이션

### 문제 설명

<p>M guys and N girls are waiting in front of a concert venue. Some of them already have a ticket, while others are hoping they can still buy one. However, news are just in that one of the performers has had to cancel his appearance. Even worse, all tickets are already sold out! The girls don&#39;t want to stay at the concert anymore since their favourite performer won&#39;t appear; however, all the guys do want to stay anyways. Tickets aren&#39;t tied to a particular person, so the guys can ask the girls who have tickets to give the tickets to them.</p>

<p>Each guy and girl have either zero or one tickets in the beginning, but they can generally carry an unlimited number of tickets. Each person who has at least one ticket can give one of their tickets to any person on the same side of the entrance (either in front of the entrance or inside the venue). Each person can enter the venue only if they have a ticket, which they keep upon entering. Each person in the venue can exit with or without a ticket, keeping any ticket upon exiting.</p>

<p>Determine a sequence of entering, exiting, and ticket giving actions, such that all girls end up outside the venue and a maximum number of guys end up inside the venue.</p>

### 입력

<p>The first line of input contains two positive integers, M (1 &le; M &le; 100 000), the number of guys, and A (1 &le; A &le; M), the number of guys owning a ticket. Each guy is identified by a unique positive integer between 1 and M.</p>

<p>The second line of input contains the identifiers of guys with tickets, sorted in ascending order.</p>

<p>The third line of input contains two positive integers, N (1 &le; N &le; 100 000), the number of girls, and B (1 &le; B &le; N), the number of girls owning a ticket. Each girl is identified by a unique positive integer between 1 and N.</p>

<p>The fourth line of input contains the identifiers of girls with tickets, sorted in ascending order.</p>

### 출력

<p>Output any sequence of actions satisfying the problem constraints, with length at most 1 000 000. Output each action in its own line. Let X and Y be numeric identifiers of guys and girls.</p>

<p>Output a guy entering the venue as ENTER GUY X, and a girl entering as ENTER GIRL X.</p>

<p>Output a guy exiting the venue as EXIT GUY X, and a girl exiting as EXIT GIRL X.</p>

<p>Output a person giving a ticket to a person as GIVE GUY X GUY Y, GIVE GUY X GIRL Y, GIVE GIRL X GUY Y or GIVE GIRL X GIRL Y.</p>