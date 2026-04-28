# [Platinum III] Trees Gump - 16698

[문제 링크](https://www.acmicpc.net/problem/16698)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 184, 정답: 72, 맞힌 사람: 36, 정답 비율: 31.579%

### 분류

애드 혹, 해 구성하기, 깊이 우선 탐색, 기하학, 그래프 이론, 그래프 탐색, 트리

### 문제 설명

<p>The huge trees in the Jumbarian jungle are strategically very important. The Jumbarian army headquarters have selected N trees which are rather close to each other, and decided that a tree house will be built on each of these trees and it will be occupied by a single army unit. Movement of people and material between the tree tops will be supported by the system of bi-directional zip lines connecting pairs of tree tops. For safety reasons, no two zip lines can cross each other (when observed from a satellite).</p>

<p>N units have already been chosen and a list of pairs of these units has been created. Units in a pair are expected to operate on the opposite ends of one zip line. The number of pairs in the list is one less than the number of units. It turns out the list ensures the connectedness of the area, i.e., after the units will be deployed to the trees, each unit will be able to reach any other unit using only zip lines that appear on the list.</p>

<p>All that remains to put this scheme to work is to install the zip lines between tree tops in such a way that will allow to deploy the units in accordance with the above rules.</p>

### 입력

<p>The first line contains a number N of tree tops and army units (1 &le; N &le; 1000). Both the tree tops and the army units are labeled 0, 1, . . . , N &minus;1. The next N &minus;1 lines contain the list of pairs of units. Each line contains labels of two units expected to operate on the opposite ends of a single zip line. The next N lines give the coordinates of the selected tree tops. The (i + 1)-th of these lines contains two numbers X<sub>i</sub> and Y<sub>i</sub> (0 &le; X<sub>i</sub>, Y<sub>i</sub> &le; 10<sup>9</sup>), the coordinates of the tree top labeled i. No three tree tops lie on a single line.</p>

### 출력

<p>Output a list of all pairs of trees which are to be connected by a zip line. The list consists of N &minus; 1 lines, each line contains two labels of different trees.</p>

<p>If there are multiple solutions to the problem, print any of them.</p>