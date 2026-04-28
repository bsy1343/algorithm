# [Gold III] Beer Vision - 17816

[문제 링크](https://www.acmicpc.net/problem/17816)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 42, 정답: 18, 맞힌 사람: 16, 정답 비율: 40.000%

### 분류

자료 구조, 브루트포스 알고리즘, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>We are given a (drunken) image of stars as seen by a drunken man lying on his back on the grass in the vicinity of a closed pub late in the evening. His image is a blend of one original (sober) image, and a copy of the same image shifted by some fixed (X, Y ) nonzero vector. Only the resulting blended image is perceived by the drunkard. Neither the original sober image nor the shift vector are available to him and to us, unfortunately.</p>

<p>An act of humanity would be to restore his perceived image to the version seen by his sober fellow citizens.</p>

<p>Given an image, write a program which calculates how many distinct (X, Y ) vectors exist such that the drunken image can be created by merging some original sober image with its copy shifted by the vector.</p>

<p>Note that if the images of two different stars &mdash; one in the original image and the other in its shifted copy &mdash; overlap in the blended image, then the drunken image, which is also the input of the program, contains only one entry for this position.</p>

### 입력

<p>The first line of input contains an integer N (0 &lt; N &le; 1000), the number of stars in the blended (drunken) image. Next, there are N lines, each with two space-separated integers X<sub>i</sub>, Y<sub>i</sub> (&minus;1000 &le; X<sub>i</sub>, Y<sub>i</sub> &le; 1000) describing the position of a star. All stars are regarded to be points with no dimensions.</p>

### 출력

<p>Print the number of distinct vectors with non-zero length which can be applied to an unknown sober picture to produce the input drunken image. The unknown image might be different in different cases.</p>