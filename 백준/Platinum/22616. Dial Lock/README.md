# [Platinum V] Dial Lock - 22616

[문제 링크](https://www.acmicpc.net/problem/22616)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 11, 정답: 4, 맞힌 사람: 4, 정답 비율: 36.364%

### 분류

백트래킹, 다이나믹 프로그래밍

### 문제 설명

<p>A dial lock is a kind of lock which has some dials with printed numbers. It has a special sequence of numbers, namely an unlocking sequence, to be opened.</p>

<p>You are working at a manufacturer of dial locks. Your job is to verify that every manufactured lock is unlocked by its unlocking sequence. In other words, you have to rotate many dials of many many locks.</p>

<p>It&rsquo;s a very hard and boring task. You want to reduce time to open the locks. It&rsquo;s a good idea to rotate multiple dials at one time. It is, however, a difficult problem to find steps to open a given lock with the fewest rotations. So you decided to write a program to find such steps for given initial and unlocking sequences.</p>

<p>Your company&rsquo;s dial locks are composed of vertically stacked k (1 &le;&nbsp;<i>k</i>&nbsp;&le; 10) cylindrical dials. Every dial has 10 numbers, from 0 to 9, along the side of the cylindrical shape from the left to the right in sequence. The neighbor on the right of 9 is 0.</p>

<p>A dial points one number at a certain position. If you rotate a dial to the left by&nbsp;<i>i</i>&nbsp;digits, the dial newly points the&nbsp;<i>i</i>-th right number. In contrast, if you rotate a dial to the right by&nbsp;<i>i</i>&nbsp;digits, it points the&nbsp;<i>i</i>-th left number. For example, if you rotate a dial pointing 8 to the left by 3 digits, the dial newly points 1.</p>

<p>You can rotate more than one adjacent dial at one time. For example, consider a lock with 5 dials. You can rotate just the 2nd dial. You can rotate the 3rd, 4th and 5th dials at the same time. But you cannot rotate the 1st and 3rd dials at one time without rotating the 2nd dial. When you rotate multiple dials, you have to rotate them to the same direction by the same digits.</p>

<p>Your program is to calculate the fewest number of rotations to unlock, for given initial and unlocking sequences. Rotating one or more adjacent dials to the same direction by the same digits is counted as one rotation.</p>

### 입력

<p>The input consists of multiple datasets. Each datset consists of two lines. The first line contains an integer k. The second lines contain two strings, separated by a space, which indicate the initial and unlocking sequences.</p>

<p>The last dataset is followed by a line containing one zero. This line is not a part of any dataset and should not be processed.</p>

### 출력

<p>For each dataset, print the minimum number of rotations in one line.</p>