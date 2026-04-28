# [Platinum IV] Artwork - 13354

[문제 링크](https://www.acmicpc.net/problem/13354)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 512 MB

### 통계

제출: 120, 정답: 84, 맞힌 사람: 74, 정답 비율: 76.289%

### 분류

자료 구조, 분리 집합, 오프라인 쿼리

### 문제 설명

<p>A template for an artwork is a white grid of n &times; m squares. The artwork will be created by&nbsp;painting q horizontal and vertical black strokes. A stroke starts from square (x<sub>1</sub>, y<sub>1</sub>), ends at&nbsp;square (x<sub>2</sub>, y<sub>2</sub>) (x<sub>1</sub> = x<sub>2</sub> or y<sub>1</sub> = y<sub>2</sub>) and changes the color of all squares (x, y) to black where&nbsp;x<sub>1</sub> &le; x &le; x<sub>2</sub> and y<sub>1</sub> &le; y &le; y<sub>2</sub>.</p>

<p>The beauty of an artwork is the number of regions in the grid. Each region consists of one or&nbsp;more white squares that are connected to each other using a path of white squares in the grid,&nbsp;walking horizontally or vertically but not diagonally. The initial beauty of the artwork is 1. Your&nbsp;task is to calculate the beauty after each new stroke. Figure A.1 illustrates how the beauty of the&nbsp;artwork varies in Sample Input 1.</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3.amazonaws.com/problem/13354/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202016-10-10%20%EC%98%A4%ED%9B%84%204.24.15.png" style="height:139px; width:555px" /><br />
Figure A.1: Illustration of Sample Input 1.</p>

### 입력

<p>The first line of input contains three integers n, m and q (1 &le; n, m &le; 1000, 1 &le; q &le; 10<sup>4</sup>).</p>

<p>Then follow q lines that describe the strokes. Each line consists of four integers x<sub>1</sub>, y<sub>1</sub>, x<sub>2&nbsp;</sub>and y<sub>2</sub> (1 &le; x<sub>1</sub> &le; x<sub>2</sub> &le; n, 1 &le; y<sub>1</sub> &le; y<sub>2</sub> &le; m). Either x<sub>1</sub> = x<sub>2</sub> or y<sub>1</sub> = y<sub>2</sub> (or both).</p>

### 출력

<p>For each of the q strokes, output a line containing the beauty of the artwork after the stroke.</p>