# [Silver III] Chairs - 22246

[문제 링크](https://www.acmicpc.net/problem/22246)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 54, 정답: 33, 맞힌 사람: 26, 정답 비율: 63.415%

### 분류

구현, 정렬, 문자열

### 문제 설명

<p>In an attempt to predict required number of chairs in the library of the Aglargond School of Magic, Ataranon, school&rsquo;s principal, ordered writing down the exact times of each person&#39;s entry and exit from the library. Write a program that counts the greatest number of people inside the library at one moment of time, if it is known that the total number of people that entered the library is N. Every person entered and exited the library during one day. The second one person enters or leaves the library is also counted as the second that person spent inside.</p>

### 입력

<p>The first line of input contains number N (0&nbsp;&le;&nbsp;N&nbsp;&le;&nbsp;1000). Next N lines contain hour, minute and second of entry and hour, minute and second of person&rsquo;s exit, separated by one space. Times are represented in the format HH:MM:SS where HH represents hours (00&nbsp;&le;&nbsp; HH&nbsp; &le;&nbsp; 23), MM (00&nbsp; &le;&nbsp; MM &le;&nbsp; 59) represents minutes and SS (00&nbsp; &le;&nbsp; SS&nbsp; &le;&nbsp; 59) represents seconds.</p>

### 출력

<p>The output has exactly one line that contains only the greatest number of people inside the library at one moment.</p>

### 힌트

<p>During the interval between 11:15:17 and 13:00:24 there were three persons inside the library.</p>