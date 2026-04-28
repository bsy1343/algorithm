# [Gold II] SAFE - 3272

[문제 링크](https://www.acmicpc.net/problem/3272)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 24, 정답: 15, 맞힌 사람: 12, 정답 비율: 66.667%

### 분류

수학, 누적 합

### 문제 설명

<p>Mirko has decided to rob mini-safe owned by his son so that he could take away some football stickers which are missing in his big sticker collection.</p>

<p>Lock on the safe consists of N equal discs, each of them being divided in 10,000,000 equal segments numbered from 1 to 10,000,000 clockwise. In the begining, segments on discs having the same number are placed one above (beneath) the other. Discs are layed one on the other such that the segments are overlaping and each disc is missing exactly one segment that is called hole.</p>

<p>In order to unlock the lock, all holes must be one above (beneath) the other.</p>

<p>In one second, Mirko can turn one disc in one direction (clockwise or counterclockwise) for one segment.</p>

<p>Write a program which will find the minimal time that Mirko needs to open the safe.</p>

### 입력

<p>The first line of the input file contains an integer N, 2 &le; N &le; 100,000, the number of discs.</p>

<p>The next N lines contain data describing the initial positions of the holes on each disc.</p>

<p>The (i + 1)-th line contains an integer Pi , 1 &le; Pi &le; 10000000, the initial position of the hole on the i-th disc.&nbsp;</p>

### 출력

<p>The first and only line of the output file should contain the minimal time (in seconds).</p>

<p>Note: take care of the size of that number.&nbsp;</p>