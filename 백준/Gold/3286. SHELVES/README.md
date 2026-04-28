# [Gold V] SHELVES - 3286

[문제 링크](https://www.acmicpc.net/problem/3286)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 17, 맞힌 사람: 15, 정답 비율: 55.556%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>A rack in a police department consists of shelves that are organised in C columns and R rows.</p>

<p>To reach an object from any shelf, a ladder must be used. A ladder can be leaned against one column of shelves only. By climbing the ladder to a certain height (row) it is possible to take any object from that column up to climbed height including any object from adjacent (left and right) columns.</p>

<p>Policemen need to take certain objects from the rack. To lower a risk of injury at work, it is necessary to find a way to take all needed objects from the rack so that total height of all climbing is minimal possible. Total height is a sum of heights of all climbings.</p>

<p>A rack with some object lying on its shelves is given.</p>

<p>Write a program that will determine minimal possible total height of climbings needed to collect all the objects from the rack.</p>

### 입력

<p>The first line of input file contains two integers C and R, 1 &le; C &le; 100, 1 &le; R &le; 100, number of columns and number of rows, separated by a space character.</p>

<p>The second line of input file contains an integer N, 1 &le; N &le; 100, number of shelves that needs to be reached.</p>

<p>Every of next N lines contains two integers A and B, 1 &le; A &le; C, 1 &le; B &le; R, separated by a space character, number of column and a row of a shelf that need to be reached.</p>

### 출력

<p>The first and only line of output file should contain minimal possible total height of climbings needed to reach all given shelves.</p>