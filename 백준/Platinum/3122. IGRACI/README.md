# [Platinum III] IGRACI - 3122

[문제 링크](https://www.acmicpc.net/problem/3122)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 9, 정답: 9, 맞힌 사람: 9, 정답 비율: 100.000%

### 분류

자료 구조, 세그먼트 트리, 이분 탐색, 해 구성하기, 느리게 갱신되는 세그먼트 트리

### 문제 설명

<p>A new computer game in the Star Expertise series is about to be released. Gamers have lined up in front of one store waiting for it to open.</p>

<p>While waiting, gamers exchange recent experiences from games, occasionally drifting into real-world subjects. One unavoidable topic is their computer setups. A special source of pride and arrogance is the amount of memory on the graphics card inside a computer.</p>

<p>Such discussions often become unpleasant so the store decided to disallow access to gamers they consider too arrogant. To ensure objectivity, they devised a simple mathematical model. When a new gamer tries to enter the line, his graphics card is compared with the cards of players already in line, using a simple criterion: the more memory his graphics card has, the better it is. Each of the quotients (the memory of the new gamer divided by the memory of one already in line) is rounded down, and then the total arrogance of the new gamer is estimated to be the sum of all these quotients.</p>

<p>For example, suppose there already three players in line, with 3, 1 and 2 megabytes on their graphics cards. A new gamer with 3 megabytes will have arrogance 1+3+1=5.</p>

<p>The store management will not allow a gamer to enter the line if his arrogance is greater than the number of people already in line. In the above example, the new gamer with 3 megabytes of memory and arrogance 5 would be denied access, but a gamer with 2 megabytes would be allowed, since his arrogance would be 0+2+1=3 (which is less than or equal to 3, the number of people already in line).</p>

<p>Write a program that, given the calculated arrogances of gamers in line, finds one possible sequence of memory amounts on their graphics cards.</p>

### 입력

<p>The first line contains an integer N (1 &le; N &le; 100 000), the number of players in line.</p>

<p>The second line contains N non-negative integers, the arrogances of players in line. The arrogances will be given in order in which the gamers arrived. Additionally, the arrogance of gamer k (starting from 1) will be less than k.</p>

### 출력

<p>Output N integers on a single line, for each gamer the amount of memory on his graphics card, in the same order in which the gamers&#39; arrogances were given. The amount of memory must be an integer less than 10<sup>9</sup>. The solution may not be unique, but will always exist.</p>