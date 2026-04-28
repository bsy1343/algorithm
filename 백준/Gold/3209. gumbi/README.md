# [Gold II] gumbi - 3209

[문제 링크](https://www.acmicpc.net/problem/3209)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 17, 정답: 13, 맞힌 사람: 13, 정답 비율: 86.667%

### 분류

너비 우선 탐색, 비트마스킹, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Dave has a TV that is quite old, and some of its switches are not functioning properly. Pressing a switch (while TV was new) released all the other switches thus leaving only one switch in pressed position.</p>

<p>Pressing a switch now will release some of the switches leaving the positions of other switches unchanged. Dave knows the effects of pressing every switch.</p>

<p>Write a program that will help Dave determine the length of the shortest sequence of switches that need to be pressed from their given position so that at the end only switch 3 is in pressed position and all the others are released.</p>

### 입력

<p>The first line of the input contains an integer N, 3 &le; N &le; 20, the number of TV switches.</p>

<p>The second line of input contains N binary digits separated by a space character determining the initial position of switches - 0 means that the corresponding switch is released, and 1 that it is in pressed position.</p>

<p>The next N lines of input determine the switches that are released by pressing a switch. (M+2)th line begins with a number K followed by K numbers (sorted in ascending order) - switches that are released when the switch M is pressed. (Switches are denoted by a numbers from 1 to N.) A switch cannot release itself and it is possible that a switch does not release any switch at all.</p>

<p>Note: Input data will be chosen so that a solution always exists.</p>

### 출력

<p>The first and only line of output should contain the length of the shortest sequence of switches that need to be pressed so that at the end only switch 3 is in pressed position and all the others are released.</p>