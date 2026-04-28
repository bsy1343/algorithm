# [Platinum I] Molecules - 17879

[문제 링크](https://www.acmicpc.net/problem/17879)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 19, 정답: 7, 맞힌 사람: 7, 정답 비율: 46.667%

### 분류

수학, 기하학, 선형대수학

### 문제 설명

<p>A molecule consists of atoms that are held together by chemical bonds. Each bond links two atoms together. Each atom may be linked to multiple other atoms, each with a separate chemical bond. All atoms in a molecule are connected to each other via chemical bonds, directly or indirectly.</p>

<p>The chemical properties of a molecule is determined by not only how pairs of atoms are connected by chemical bonds, but also the physical locations of the atoms within the molecule. Chemical bonds can pull atoms toward each other, so it is sometimes difficult to determine the location of the atoms given the complex interactions of all the chemical bonds in a molecule.</p>

<p>You are given the description of a molecule. Each chemical bond connects two distinct atoms, and there is at most one bond between each pair of atoms. The coordinates of some of the atoms are known and fixed, and the remaining atoms naturally move to the locations such that each atom is at the average of the locations of the connected neighboring atoms via chemical bonds. For simplicity, the atoms in the molecule are on the Cartesian xy-plane.</p>

### 입력

<p>The first line of input consists of two integers n (2 &le; n &le; 100), the number of atoms, and m (n &minus; 1 &le; m &le; n(n&minus;1)/2), the number of chemical bonds.</p>

<p>The next n lines describe the location of the atoms. The i<sup>th</sup> of which contains two integers x, y (0 &le; x, y &le; 1 000 or x = y = &minus;1), which are the x and y coordinates of the i<sup>th</sup> atom. If both coordinates are &minus;1, however, the location of this atom is not known.</p>

<p>The next m lines describe the chemical bonds. The i<sup>th</sup> of which contains two integers a and b (1 &le; a &lt; b &le; n) indicating that there is a chemical bond between atom a and atom b.</p>

<p>It is guaranteed that at least one atom has its location fixed.</p>

### 출력

<p>Display n lines that describe the final location of each atom. Specifically, on the i<sup>th</sup> such line, display two numbers x and y, the final coordinates of the i<sup>th</sup> atom. If there are multiple solutions, any of them is accepted. A solution is accepted if the coordinates of each unknown atom and the average coordinates of all its neighboring atoms via chemical bonds differ by at most 10<sup>&minus;3</sup>. Note that it is acceptable for multiple atoms to share the same coordinates.</p>