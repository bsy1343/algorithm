# [Silver III] Railroad sorting - 24865

[문제 링크](https://www.acmicpc.net/problem/24865)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 37, 정답: 31, 맞힌 사람: 30, 정답 비율: 83.333%

### 분류

해 구성하기, 자료 구조, 구현, 스택

### 문제 설명

<p>Arsenii works as an operator at a sorting station, the scheme of which is shown on the image.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/24865.%E2%80%85Railroad%E2%80%85sorting/0246cb07.png" data-original-src="https://upload.acmicpc.net/5adac2fa-22bc-41a0-8c99-d414711faac6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 352px; height: 91px;" /></p>

<p>The station has an input track, an output track and two dead ends. The operator can move cars between tracks and dead ends.</p>

<p>If car $x$ is the first car on the input track, this car can be moved to any dead end. Command &quot;<code>1</code>&quot; moves the car to the dead end $1$, and command &quot;<code>2</code>&quot; moves car to the dead end $2$.</p>

<p>If the car $x$ is the closest car to the exit in one of the dead ends, it can be moved to output track. Command &quot;<code>-1</code>&quot; moves the car from the dead end $1$, and command &quot;<code>-2</code>&quot; moves the car from the dead end $2$.</p>

<p>Finally, you can move cars between dead ends. If $x$ is the closest car to the exit in one of the dead ends, it can be moved to another dead end. Command &quot;<code>12</code>&quot; moves the car from the dead end $1$ to the dead end $2$, and the command &quot;<code>21</code>&quot; moves the car from the dead end $2$ to the dead end $1$.</p>

<p>Please note that cars cannot be returned to a dead end from the output track and cannot be returned from a dead end to the input track. Also, you cannot move the car directly from the input track to the output track, it is required to use a dead end. Both dead ends can contain any number of cars.</p>

<p>A train of $n$ cars arrives on the input track, each car has a unique number from $1$ to $n$.</p>

<p>Arsenii must sort the cars so that they are all on the output track and their numbers from left to right are in ascending order. Help him form a sequence of commands that will help him to achieve this. The number of commands in the sequence must not be exceed $2 \cdot 10^6$.</p>

### 입력

<p>The first line of input contains integer $n$ --- the number of cars ($1 \le n \le 1000$).</p>

<p>The second line contains $n$ different integers $a_1, a_2, \ldots, a_n$ ($1 \le a_i \le n$) --- the numbers on the cars in order from left to right on the input track.</p>

### 출력

<p>Print the sequence of commands that will cause the cars to be on the output track, and their numbers would be in ascending order. The sequence must contain no more than $2 \cdot 10^6$ command.</p>

<p>If there are multiple correct sequences, you can output any of them.</p>

<p>It is guaranteed that for any input data there is a sequence of commands containing at most $2 \cdot 10^6$ commands.</p>