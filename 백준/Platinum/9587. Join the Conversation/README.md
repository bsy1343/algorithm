# [Platinum V] Join the Conversation - 9587

[문제 링크](https://www.acmicpc.net/problem/9587)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 151, 정답: 30, 맞힌 사람: 28, 정답 비율: 19.580%

### 분류

다이나믹 프로그래밍, 그래프 이론, 자료 구조, 문자열, 이분 탐색, 집합과 맵, 해시를 사용한 집합과 맵, 파싱, 방향 비순환 그래프

### 문제 설명

<p>Abstract Communication Mastership (ACM) is a software company that develops a unique social network called tWinter.</p>

<p>Each tWinter user has a handle that starts with a commercial at (&lsquo;@&rsquo;) character. Users of tWinter social network publish short messages to the network.</p>

<p>If a user&rsquo;s message contains another user&rsquo;s handle (preceded by a space or at the beginning of the message, and followed by a space or at the end of the message) then it is called a mention.</p>

<p>A sequence of messages is called a conversation if each message in the sequence (except the first one) contains a mention of the author of the previous message in the sequence.</p>

<p>You are hired to find the longest conversation in the given chronological log of messages.</p>

### 입력

<p>The first line of the input file contains an integer n (1 &le; n &le; 50 000) &mdash; the number of messages in the chronological log.</p>

<p>Each of the next n lines contains a message preceded by its author&rsquo;s handle, a colon (&lsquo;:&rsquo;) character, and a space.</p>

<p>Each message is at most 139 characters long. Each handle is at most 20 characters long and does not contain colons or spaces.</p>

<p>The input file contains only characters with ASCII codes between 32 and 126, inclusive, and line breaks.</p>

### 출력

<p>On the first line of the output file write the length of the longest conversation in the given log. On the second line write 1-based indices of the messages in that conversation in ascending order.</p>

<p>If there are multiple longest conversations, write any one of them.</p>