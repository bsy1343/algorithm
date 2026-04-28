# [Bronze I] Färgrobot - 21287

[문제 링크](https://www.acmicpc.net/problem/21287)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 110, 정답: 76, 맞힌 사람: 72, 정답 비율: 71.287%

### 분류

구현, 그리디 알고리즘, 문자열

### 문제 설명

<p>A robot can move along a row of colored squares. Every square can be either red, green or blue. A command to the robot is a color. The robot responds by moving to the right until it stands on the color specified by the command. Write a program that, for a given sequence of squares and a number $N$, writes out the sequence of $N$ commands that makes the robot go as far to the right as possible.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/21287.%E2%80%85F%C3%A4rgrobot/926b9ce3.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/21287.%E2%80%85F%C3%A4rgrobot/926b9ce3.png" data-original-src="https://upload.acmicpc.net/5f47d960-bb1b-480d-b202-56fc94d8f362/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 510px; height: 97px;" /></p>

<p style="text-align: center;">Figure 1:&nbsp;An illustration of the third sample case.</p>

### 입력

<p>The first line containes an integer $N$, the number of commands to give to the robot. The second line contains a string of letters, R , G, or B, which specifies the color of each square in the row, from left to right. The string contains less than 200 characters, and is always sufficiently long that no sequence of $N$ commands may cause the robot to reach outside the row of squares.</p>

### 출력

<p>The program should output a string of $N$ characters, each being R, G, or B, which constitutes the sequence of commands you should give to the robot to make it move as far as possible along the row of squares. If there are several sequences that accomplish this, you may output anyone of them.</p>