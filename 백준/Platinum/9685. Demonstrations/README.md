# [Platinum III] Demonstrations - 9685

[문제 링크](https://www.acmicpc.net/problem/9685)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 16, 정답: 7, 맞힌 사람: 7, 정답 비율: 58.333%

### 분류

자료 구조, 스위핑, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>This Sunday, The Byte Day will be celebrated in Bytetown, one of the most important annual Bytelandian celebrations. However, everything indicates that this year jubilation will not only be a rural family fete.</p>

<p>Well, Bytetown citizens are strongly divided concerning one crucial matter. Some believe that in line with tradition, the byte should always be equal to eight bits. However there are progress supporters who would rather go for more capacious, 16 bit bytes. Others see the whole matter much more rigidly and would eagerly like to declare that the byte should always have only four bits. Finally there are less significant subversive movements in Bytetown, whose members advocate that the count of bits in the byte should not be the power of two, or yet it must not necessarily be an even number! All of these societies plan to hold their own manifestation in order to convince Bytetown citizens to their cases.</p>

<p>Many Bytetown citizens are afraid that such a number of demonstrations might interfere with the The Byte Day celebrations. The Lord Mayor of Bytetown sensed a significant public support could be gained, by forbidding some of the demonstrations. Due to the fact that such decisions raise controversy, the Lord Mayor decided he would only cancel two demonstrations. Additionally he would like to be able to choose such demonstrations for cancellation, that would result in the the total time taken by any other possible demonstrations taking place in the city after the cancellation, to possibly be shortest. Help The Lord Mayor and give him a clue how much time in the city without a demonstration he can achieve.</p>

### 입력

<p>The first input line contains one integer n&nbsp;(2 &le; n &le; 500,000): the number of planned demonstrations. Each of the subsequent n&nbsp;lines describes one demonstration: i-th of those lines contains two integers a<sub>i</sub>&nbsp;and b<sub>i</sub>&nbsp;(0 &le; a<sub>i</sub> &lt; b<sub>i</sub> &le; 10<sup>9</sup>), which mean that i-th demonstration begins a<sub>i</sub>&nbsp;byteminutes after sunrise and ends b<sub>i</sub>&nbsp;byteminutes after sunrise.</p>

### 출력

<p>Your program should produce exactly one non-negative integer, describing by how much time demonstrations taking place could possibly be shortened, in case The Lord Mayor of Bytetown cancels maximum two demonstrations.</p>

### 힌트

<p>Lord Mayor of Bytetown should not issue permits for the first and the fourth demonstration.</p>