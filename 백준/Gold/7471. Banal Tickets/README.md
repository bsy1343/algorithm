# [Gold I] Banal Tickets - 7471

[문제 링크](https://www.acmicpc.net/problem/7471)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 8, 정답: 4, 맞힌 사람: 4, 정답 비율: 50.000%

### 분류

임의 정밀도 / 큰 수 연산, 다이나믹 프로그래밍

### 문제 설명

<p>Peter is fond of number theory. That&rsquo;s why he is looking for interesting bus tickets. Ticket with the number of length 2<em>N</em> is called interesting if the product of the first <em>N</em> digits of its number is equal to the product of the last <em>N</em> digits. Other tickets are called banal. Peter has found a used ticket in his pocket. Unfortunately the ticket was punched, so Peter cannot recognize some digits. He wonders whether this ticket was an interesting one. Moreover he wants to know how many different interesting and banal tickets could be punched to get this one.&nbsp;Help Peter to find answers to his questions.</p>

### 입력

<p>The first line of the input file contains an integer <em>N</em> (1 &le; <em>N</em> &le; 18). The next line contains a string representing the ticket number. If some digit is punched out it is denoted by &ldquo;<code>?</code>&rdquo; otherwise it is denoted by itself.</p>

### 출력

<p>On the first line of the output file print the number of interesting tickets. On the second line print the number of banal tickets.</p>