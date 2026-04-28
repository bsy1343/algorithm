# [Silver IV] utrka - 3196

[문제 링크](https://www.acmicpc.net/problem/3196)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 85, 정답: 47, 맞힌 사람: 44, 정답 비율: 58.667%

### 분류

구현, 정렬, 시뮬레이션

### 문제 설명

<p>We have to write a computer program to rank the drivers during a car race.&nbsp;</p>

<p>Along the closed racetrack there are K checkpoints (designated with numbers from 1 to K) with judges at the each checkpoint. When some driver passes through the checkpoint, judge sends a message to the computer system with the number of the checkpoint and the number of the driver (drivers are designated with numbers from 1 to N).&nbsp;</p>

<p>Race starts just before the first checkpoint i.e. drivers pass through that checkpoint immediately after the start.&nbsp;</p>

<p>Write a program that will calculate the current ranking of the drivers, given all of the messages sent by the judges.&nbsp;</p>

<p>If two drivers have regularly passed the same number of checkpoints, the driver who passed the last point earlier is ranked higher.&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/3196.%E2%80%85utrka/614186ed.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/3196.%E2%80%85utrka/614186ed.png" data-original-src="https://upload.acmicpc.net/4a53e988-3d85-41e0-b91f-696b27ec2861/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 329px; height: 329px;" /></p>

<p>The figure above depicts a racetrack with five checkpoints. Drivers must pass the points in the right order. If a driver passes other points between two consecutive checkpoints, we ignore those extra passes.&nbsp;</p>

### 입력

<p>First line of input contains three integers K, N and M, 1 &le; K &le; 100, 1 &le; N &le; 100, 1 &le; M &le; 10000.&nbsp;</p>

<p>Each of the following M lines contains two integers X and Y. They represent a message from a judge saying that the driver with number X passed by the checkpoint Y. Events in the input are given in chronological order.&nbsp;</p>

<p>Note: there will always be a solution for the given test data.&nbsp;</p>

### 출력

<p>First and only line of output should contain the final ranking of drivers in the race, after all M messages from the judges have been processed.&nbsp;</p>