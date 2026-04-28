# [Silver I] Gregory the Grasshopper - 6607

[문제 링크](https://www.acmicpc.net/problem/6607)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 140, 정답: 75, 맞힌 사람: 57, 정답 비율: 50.893%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Gregory is a grasshopper. His favourite food are clover leafs &mdash; he can simply never have enough of them. Whenever he spots such a leaf, he wants to eat it as quickly as possible. Gregory is also lazy, so he wants to move to the leaf with minimal effort. Your task is to help him to find the shortest way to a clover leaf.</p>

<p>For simplicity, we will assume that Gregory lives on a rectangular grid consisting of unit squares. As a grasshopper, he prefers to move by jumping (or, more exactly, hopping) from one square to the other. Each hop takes him to a square that is in the adjacent row or column in one direction, and two columns or rows away in the other direction. So, his hops resemble the moves of a knight on a chessboard.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/6607.%E2%80%85Gregory%E2%80%85the%E2%80%85Grasshopper/04d8d946.png" data-original-src="https://www.acmicpc.net/upload/images2/grass.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:248px; width:246px" /></p>

### 입력

<p>The input consists of several test cases, each of them specified by six integer numbers on one line: R, C, G<sub>R</sub>, G<sub>C</sub>, L<sub>R</sub>, and L<sub>C</sub>. R and C specify the size of the grid in unit squares, 1 &le; R, C &le; 100. Gregory cannot hop outside a rectangle of this size, because it would be too dangerous. The values of G<sub>R</sub>, G<sub>C</sub> are the coordinates of the square that Gregory is standing on, and L<sub>R</sub>, L<sub>C</sub> are the coordinates of the square with the delicious clover leaf. (1 &le; G<sub>R</sub>, L<sub>R</sub> &le; R; 1 &le; G<sub>C</sub>, L<sub>C</sub> &le; C)</p>

### 출력

<p>For each test case, print one integer number &mdash; the minimal number of hops that Gregory needs to reach the square with his beloved delicacy. If it is not possible to reach that square at all, print the word &ldquo;impossible&rdquo; instead.</p>