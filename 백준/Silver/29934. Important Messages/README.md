# [Silver V] Important Messages - 29934

[문제 링크](https://www.acmicpc.net/problem/29934)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 185, 정답: 151, 맞힌 사람: 121, 정답 비율: 81.757%

### 분류

자료 구조, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>These days one may get hundreds of email messages a day. Of course, nobody can read so many of them. Thus Juku wants to highlight messages whose senders are in his contact list.</p>

<p>Write a program that gets Juku&#39;s contact list and the senders of his email messages and counts, how many of those messages should be highlighted.</p>

### 입력

<p>The first line of input contains $N$, the number of entries in Juku&#39;s contact list ($1 \le N \le 1\,000$), and each of the following $N$ lines one email address of 1 to 50 characters.</p>

<p>The next line of the file contains $M$, the number of messages ($1 \le M \le 10\,000$), and each of the following $M$ lines the sender address of one message, again 1 to 50 characters.</p>

<p>The characters in an email address can be lower-case letters (<code>a</code>$\dots$<code>z</code>), digits (<code>0</code>$\dots$<code>9</code>), dots (<code>.</code>) and at-signs (<code>@</code>).</p>

### 출력

<p>The only line of output should contain one integer: the number of messages to be highlighted.</p>