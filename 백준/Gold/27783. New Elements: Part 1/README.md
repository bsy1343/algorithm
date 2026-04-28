# [Gold III] New Elements: Part 1 - 27783

[문제 링크](https://www.acmicpc.net/problem/27783)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 12, 정답: 9, 맞힌 사람: 9, 정답 비율: 100.000%

### 분류

(분류 없음)

### 문제 설명

<p><i>The first two paragraphs (not counting this one) of this problem and &quot;New Elements: Part 2&quot; are identical. The problems can otherwise be solved independently; you do not need to read or solve one in order to read or solve the other.</i></p>

<p>Muriel is on the path to discovering two new elements that she has named Codium and Jamarium. She has not been able to isolate them yet, but she wants to start investigating some important properties, like their atomic weights, by indirect means. Since Muriel is working with a single isotope of Codium and a single isotope of Jamarium, their atomic weights are strictly positive integers.</p>

<p>Muriel managed to create <b>N</b> different molecules, each of which contains one or more atoms of Codium and one or more atoms of Jamarium, and no other elements. For each molecule, she knows how many atoms of each element are present in it. The molecular weight of a molecule is the sum of the atomic weights of all the atoms it contains.</p>

<p>As a first step towards figuring out exact molecular weights for the molecules and atomic weights for the two elements, Muriel wants to sort the molecules by strictly increasing molecular weight. To assess the difficulty of that task, she wants to know how many orders are valid considering only the information she has right now. An ordering of the molecules is considered valid if there exist values for the atomic weights of Codium and Jamarium such that the ordering is <i>strictly</i> increasing in molecular weight.</p>

<p>To give an example, we represent each molecule by the ordered pair of the number of atoms of Codium and Jamarium it contains. If Muriel has 3 molecules represented by (1, 1), (2, 1) and (1, 2), there are two possible orderings that can be strictly increasing in molecular weight: (1, 1), (1, 2), (2, 1) and (1, 1), (2, 1), (1, 2). The first ordering is valid for any assignment of atomic weights in which Codium is the heaviest of the two elements, and the second is valid for any assignment in which Jamarium is the heaviest. The only case remaining is when both Codium and Jamarium have the same atomic weight, in which case (1, 2) and (2, 1) have the same molecular weight, so no strictly increasing ordering can be produced for that scenario.</p>

### 입력

<p>The first line of the input gives the number of test cases, <b>T</b>. <b>T</b> test cases follow. The first line of a test case contains a single integer <b>N</b>, the number of molecules. Each of the next <b>N</b> lines describes a different molecule with two integers <b>C<sub>i</sub></b> and <b>J<sub>i</sub></b> that represent the number of Codium and Jamarium atoms in the i-th molecule, respectively.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where <code>x</code> is the test case number (starting from 1) and <code>y</code> is the total number of valid orderings as defined above.</p>

### 제한

<ul>
	<li>1 &le; <b>T</b> &le; 100.</li>
	<li>1 &le; <b>C<sub>i</sub></b> &le; 10<sup>9</sup>, for all i.</li>
	<li>1 &le; <b>J<sub>i</sub></b> &le; 10<sup>9</sup>, for all i.</li>
	<li>(<b>C<sub>i</sub></b>, <b>J<sub>i</sub></b>) &ne; (<b>C<sub>j</sub></b>, <b>J<sub>j</sub></b>) for all i &ne; j. (All molecules are different.)</li>
</ul>

### 힌트

<p>Sample Case #1 is explained in the statement.</p>

<p>In Sample Case #2, the two valid orderings are (1, 2), (2, 1), (2, 4), (4, 2) and (2, 1), (1, 2), (4, 2), (2, 4). Notice that the ordering (1, 2), (2, 1), (4, 2), (2, 4) is invalid because if (1, 2) is strictly less heavy than (2, 1), then (2, 4), which is exactly twice as heavy as (1, 2), must be strictly less heavy than (4, 2), which is exactly twice as heavy as (2, 1).</p>