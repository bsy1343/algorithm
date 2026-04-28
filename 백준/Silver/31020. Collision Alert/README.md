# [Silver IV] Collision Alert - 31020

[문제 링크](https://www.acmicpc.net/problem/31020)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 31, 정답: 24, 맞힌 사람: 9, 정답 비율: 56.250%

### 분류

구현, 많은 조건 분기

### 문제 설명

<p>You&#39;re almost free. You&#39;ve successfully fought your way out of the haunted mansion; now the only obstacle remaining is a square field. The field is completely flat, so it should be a breeze to cross it, right? Too bad the field is full of ghosts...</p>

<p>When you start (<code>time = 0 seconds</code>), you and each of the ghosts are located at some set of integer coordinates (the center of the field is <code>(0,0)</code>). No ghost can start at the same position as you or another ghost.</p>

<p>You and the ghosts can only move in straight lines parallel to the sides of the field, and you and the ghosts will not necessarily all be going in the same direction. All ghosts are the same size as you, and neither the ghosts nor you can change direction once started.</p>

<p>The ghosts will start moving at the same time you do, and you and the ghosts will all be moving at the same constant rate (<code>velocity = 1 unit per second</code>).</p>

<p>Ghosts pass through each other, and doing so does not change their speed or direction. Similarly, if a ghost runs into what would have been the field&#39;s boundary, they pass beyond it and are no longer within the field&#39;s potential collision space.</p>

<p>Given the starting positions and direction for you and each of the ghosts, find the earliest time at which you will collide with a ghost. If you will have no collisions with any ghosts, you are <code>SAFE</code>.</p>

### 입력

<p>The first line of input contains <code>T</code> (<code>1 &le; T &le; 10</code>), indicating the number of times you will try to cross the field.</p>

<p>In each of the following <code>T</code> lines, the first line contains <code>X Y DIR</code>, where <code>(X,Y)</code> is your initial position (<code>-100 &le; X, Y &le; 100</code>) and <code>DIR</code> is the direction you will move.</p>

<p><code>DIR</code> is given as <code>N</code> (north / towards positive Y), <code>S</code> (south / towards negative Y), <code>E</code> (east / towards positive X), or <code>W</code> (west / towards negative X).</p>

<p>The second line contains <code>G</code> (<code>1 &le; G &le; 2012</code>), the number of ghosts on the field. <code>G</code> lines follow, each containing <code>X Y DIR</code>, the initial position and the direction of movement for each ghost (following the same constraints for <code>X</code>, <code>Y</code>, and <code>DIR</code> as you).</p>

### 출력

<p>For each time you try to cross the field, output the earliest time in seconds (rounded to one decimal point) at which you will collide with a ghost. If you will have no collisions with any ghosts, output <code>SAFE</code>.</p>