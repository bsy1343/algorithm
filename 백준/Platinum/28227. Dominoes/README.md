# [Platinum II] Dominoes - 28227

[문제 링크](https://www.acmicpc.net/problem/28227)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 214, 정답: 25, 맞힌 사람: 9, 정답 비율: 12.857%

### 분류

수학, 자료 구조, 기하학, 스택, 미적분학, 도형에서의 불 연산

### 문제 설명

<p><img alt="" src="https://upload.acmicpc.net/5961031c-955d-4e2a-8dae-3d5f6591632f/-/preview/" style="width: 348px; height: 121px; float: right;" /> Pixar is gearing up to introduce its next animated film, Elemental, at the 2023 Cannes Film Festival. But one of the scenes needs re-rendering. In this scene, there are n dominoes in a straight line, and one of them is supposed to fall and drop a number of subsequent dominoes in a domino-like manner. Considering it is less than 1 month away from the 2023 Cannes Film Festival, Pixar asked you to write a program that calculates the cost of re-rendering the scene for n initial domino choices.</p>

<p>To simplify the calculations, we assume that the dominoes are displayed from the side like line segments with no width on the coordinate axis, and they fall to the left. They are numbered from left to right and domino i has height l<sub>i</sub> and is located at x<sub>i</sub>. The cost of re-rendering this scene is equal to the area of the moving part of the scene, i.e. the union area of quarter circles of dropped dominoes. Note that domino falling areas may overlap, and the overlapped area should be calculated only once. The picture illustrates the falling of dominoes in the first sample test, when the initial domino choice for falling is the domino number 5.</p>

### 입력

<p>The first line of input contains a positive integer n, indicating the number of dominoes. The next n lines, each consists of a pair of integers, x<sub>i</sub> and l<sub>i</sub>, indicating the location and the height of the domino number i. It is guaranteed that n ⩽ 200,000 and 1 ⩽ x<sub>i</sub>, l<sub>i</sub> ⩽ 10<sup>9</sup>. Dominoes are given from left to right; i.e. x<sub>i</sub> &lt; x<sub>i+1</sub>.</p>

### 출력

<p>Output n lines, where the i-th contains the cost of re-rendering the scene with i-th domino as the initial falling domino. All numbers must have an absolute or relative error of at most 10<sup>&minus;6</sup>.</p>