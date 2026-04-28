# [Silver II] Chat Rooms - 4248

[문제 링크](https://www.acmicpc.net/problem/4248)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 277, 정답: 58, 맞힌 사람: 22, 정답 비율: 16.296%

### 분류

구현, 문자열

### 문제 설명

<p>Suppose there are a number of good users using an Internet chat room, which is a shared text chat space. Now there are some bad guys in the Internet who would come to this room and would have no respect or interest in the topic of discussion in the group. They would start typing strings of garbage characters, start unsolicited advertisements of certain URLs or businesses, or paste same string again and again just to disturb others in the room.&nbsp;</p>

<p>When I asked about this problem to Prof Banku (naturally not as smart as Prof Shanku) he suggested the following scheme. Let us define consonants to be all letters in a-z and A-Z except a, e, i, o, u, y, A, E, I, O, U and Y.&nbsp;</p>

<p>A user should be able to send a line to the chat room unless&nbsp;</p>

<ul>
	<li>the line has more than 5 consecutive consonants, or&nbsp;</li>
	<li>the line contains at least one word which has more than 4 consecutive consonants and the user sent more than 2 such lines in last 10 lines sent, or&nbsp;</li>
	<li>the user sent the same line more than once in last 10 sentences sent.&nbsp;</li>
</ul>

### 입력

<p>Input consists of several lines. The first line contains an integer n, which is the number of lines in the shared text space. Then follow n lines each consisting of not more than 255 ASCII characters.</p>

<p>&nbsp;</p>

### 출력

<p>For each line of input print y if the line is acceptable according to the criteria set above and n otherwise in separate lines. See the sample output for example.</p>

<p>&nbsp;</p>