# [Gold III] A Musical Question - 27610

[문제 링크](https://www.acmicpc.net/problem/27610)

### 성능 요약

시간 제한: 11 초, 메모리 제한: 1024 MB

### 통계

제출: 47, 정답: 34, 맞힌 사람: 30, 정답 비율: 75.000%

### 분류

다이나믹 프로그래밍, 배낭 문제

### 문제 설명

<p>Bob Roberts likes to listen to music while he drives, but the car he owns is a little antiquated. No Bluetooth or USB connections here, but at least he has a CD player, so he&#39;s been transferring a lot of his music to CDs. At the moment he has only two CDs left and would like to get as much of his remaining music as possible on them. Given the capacity of the CDs and collection of songs, can you help him find the maximum number of minutes of music he can put on the two CDs?</p>

### 입력

<p>Input starts with a line containing two integers $c$ $n$, where $c$ $(1 \leq c\leq 1\,000)$ is the number of minutes of music each CD can hold, and $n$ $(1 \leq n \leq 1\,000)$ is the number of songs to select from. Following this is a single line containing $n$ positive integers indicating the length (in minutes) of each of the songs. No song will be longer than $1\,000$ minutes.</p>

### 출력

<p>Output the amount of music on each CD, in minutes, that maximizes the total amount of music that Bob can transfer to the two CDs. Display the time of the larger-filled CD first. If there is a tie, use the solution which minimizes the time difference between the two CDs.</p>