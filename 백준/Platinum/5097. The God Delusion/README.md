# [Platinum I] The God Delusion - 5097

[문제 링크](https://www.acmicpc.net/problem/5097)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 10, 맞힌 사람: 4, 정답 비율: 25.000%

### 분류

구현, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 중간에서 만나기, 양방향 탐색

### 문제 설명

<p>You are God, building the universe. You&#39;re up to arranging the silicon crystals when you run into a problem. The silicon crystals are complaining that the aluminium impurities are stealing their electrons and are demanding their original electrons back. Luckily you&#39;ve caught the problem early and the crystals you&#39;ve been building are still small.</p>

<p>Unfortunately you can only move electrons by moving an electron from an atom with an electron to a connected neighbouring atom which is missing an electron. This can be a slow process--and as God you don&#39;t have a lot of time to spare--so you want to do it in the minimum number of moves.</p>

<p>For the purpose of this problem, you can think of the crystal lattice as a planar rectangular grid, with each atom connected to its 4 neighbours (up, down, left, right). You will be given a series of rectangular crystals with misplaced electrons, for which you have to find solutions. The atoms are numbered 0 to n- 1 (n is the number of atoms in the lattice). Atom number i*width + j is at the position with row i and column j of the rectangular grid. The electrons are also from 1 to n-1. Your task is to move electrons to their corresponding (same number) atoms, with atom 0 ending up without an electron.</p>

### 입력

<p>Input will consist of a number of test cases. The first line of a test case will contain 2 integers h w (2 &lt;= h,w &lt;= 5, h*w &lt;= 10). The next h lines will each contain w integers, identifying the electron at that location on the crystal lattice. A 0 represents the missing electron.</p>

<p>&quot;0 0&quot; on a line by itself indicates the end of the input.</p>

### 출력

<p>For each test case, output on one line the minimum number of steps required to return all electrons to their corresponding atoms.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/5097/1.png" style="height:145px; width:284px" /></p>