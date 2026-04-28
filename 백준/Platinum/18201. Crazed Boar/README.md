# [Platinum III] Crazed Boar - 18201

[문제 링크](https://www.acmicpc.net/problem/18201)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 154, 정답: 23, 맞힌 사람: 20, 정답 비율: 35.088%

### 분류

이분 탐색, 기하학, 스위핑

### 문제 설명

<p>A crazed boar has become lost in the forest! In its madness, it will charge in a random direction at blazing speed, until it has traveled a distance d, or until it hits a tree (in which case the boar will become dazed and end its charge), whichever comes first. Given the layout of trees around the boar, what is the probability the boar completes its wild charge without hitting a tree?</p>

<p>We will model the forest as the xy plane, with the boar a disk of radius b that begins centered at the origin (0, 0). We will also represent the trees as disks, with varying radii r<sub>i</sub> and centers (x<sub>i</sub>, y<sub>i</sub>). The boar charges by choosing a direction uniformly at random, and then translating in that direction for a distance d. The boar hits a tree and becomes dazed if, at any point during its charge, the boar&rsquo;s body has nonzero area of overlap with any tree.</p>

### 입력

<p>The first line of input contains a single integer n (0 &le; n &le; 10 000), the number of trees in the forest. n lines follow, each of which contain three integers x<sub>i</sub>, y<sub>i</sub>, and r<sub>i</sub>, denoting the position and radius of the ith tree. These inputs satisfy &minus;10<sup>6</sup> &le; x<sub>i</sub>, y<sub>i</sub> &le; 10<sup>6</sup> and 0 &lt; r<sub>i</sub> &le; 10<sup>6</sup>. The final line of input contains two integer b and d, the radius of the boar (0 &lt; b &le; 10<sup>6</sup>) and the distance that the boar will charge (0 &le; d &le; 10<sup>6</sup>). You may assume that no tree overlaps with or touches the boar at the start of its charge (but trees might overlap or touch each other).</p>

### 출력

<p>Print a single real number: the probability that the boar completes its charge without hitting any tree. Your answer will be considered correct if it has absolute or relative error at most 10<sup>&minus;6</sup>.</p>