# [Gold II] Just in Time - 13875

[문제 링크](https://www.acmicpc.net/problem/13875)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 216, 정답: 104, 맞힌 사람: 96, 정답 비율: 60.377%

### 분류

수학, 정수론, 소수 판정

### 문제 설명

<p>Hello contestant, I want to play a game. Your coach is in the contest room with a bomb about to explode in his hands. This bomb will be set to detonate in T seconds, and if it detonates in the contest room it is going to explode only your team&rsquo;s balloons.</p>

<p>I can tell you that the contest room is inside a building that contains N rooms in total. From each room there is exactly one direct tunnel to another room, which can only be used in one direction. For example if room A connects to room B, then you can walk from room A to room B, but not from room B to room A, unless of course room B has a direct tunnel to room A.</p>

<p>The bomb has a special mechanism that detects if your coach stops moving, and if so it immediately triggers the detonation taking all your team&rsquo;s balloons down. For that reason your coach will constantly walk between the rooms, taking exactly one second to move through each tunnel. The only way for your team to save its balloons is for your coach not to be in the contest room when the bomb detonates.</p>

<p>You don&rsquo;t have the building map in hand, all I can tell you is that the tunnels are chosen uniformly at random. However, I will give you the possibility to set T, which must be an integer between 2 and N inclusive. Your job is to choose T in such a way that it maximizes your balloons&rsquo; chance to survive this riddle.</p>

<p>Let the game begin.</p>

### 입력

<p>The input consists of a single line that contains one integer N, representing how many rooms there are in the building (2 &le; N &le; 10<sup>9</sup> ).</p>

### 출력

<p>Output a line with one integer representing the value of T that maximizes your balloons&rsquo; chance to survive the riddle.</p>