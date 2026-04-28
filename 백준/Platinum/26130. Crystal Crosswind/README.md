# [Platinum III] Crystal Crosswind - 26130

[문제 링크](https://www.acmicpc.net/problem/26130)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 103, 정답: 46, 맞힌 사람: 35, 정답 비율: 83.333%

### 분류

그래프 이론, 그리디 알고리즘, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>You are part of a scientific team developing a new technique to image crystal structures at the molecular level. The technique involves blowing a very fine wind over the surface of the crystal at various angles to detect boundaries (indicated by molecules that are exposed to the wind). This is repeated with different wind directions and the boundaries observed for each direction are recorded. Your team has already collected the data, but &ndash; as is often the case with applied science &ndash; now the real work, analysis, must begin.</p>

<p>For a given crystal, you will receive the directions in which wind blew over the surface, and the locations of all boundaries encountered by each of these winds. For a wind blowing in direction (w<sub>x</sub>, w<sub>y</sub>), a boundary is defined as a location (x, y) such that a molecule exists at (x, y) and no molecule exists at (x &minus; w<sub>x</sub>, y &minus; w<sub>y</sub>). Note that for technical reasons wx and wy are not necessarily relatively prime.</p>

<p>The data might not uniquely determine the structure of the crystal. You must find the two unique structures with the minimal and maximal number of molecules consistent with the observations.</p>

<p>For example, in the first sample input, nine different molecules are directly encountered by the given winds. There must be a molecule at location (3, 3) because otherwise (4, 2) would be a boundary for the third wind. For similar reasons, there must be molecules at (4, 4) and (5, 5). There cannot be any further molecules as they would result in additional observations for some of the winds.</p>

### 입력

<p>The first line of input contains three integers d<sub>x</sub>, d<sub>y</sub>, and k, where d<sub>x</sub> and d<sub>y</sub> (1 &le; d<sub>x</sub>, d<sub>y</sub> &le; 10<sup>3</sup>) are the maximum dimensions of the crystal structure, and k (1 &le; k &le; 10) is the number of times wind was blown over the crystal.</p>

<p>Each of the remaining k lines specifies the data for one wind. These lines each start with two integers w<sub>x</sub> and w<sub>y</sub> (-d<sub>x</sub> &le; w<sub>x</sub> &le; d<sub>x</sub> and -d<sub>y</sub> &le; w<sub>y</sub> &le; d<sub>y</sub>, but not both zero) denoting the direction of the wind. Then comes an integer b (0 &le; b &le; 10<sup>5</sup>) giving the number of boundaries encountered by this wind. The line finishes with b distinct pairs of integers x, y (1 &le; x &le; d<sub>x</sub> and 1 &le; y &le; d<sub>y</sub>) listing each observed boundary.</p>

<p>You may assume the input is consistent with at least one crystal and that no molecules exist outside the specified dimensions.</p>

### 출력

<p>Output two textual representations of the crystal structure separated by an empty line. Each structure has d<sub>y</sub> rows of d<sub>x</sub> characters, with the top-left corner corresponding to location (1, 1). The first is the structure with the minimal number of molecules consistent with the observations, the second is the maximal one. Use &lsquo;#&rsquo; for a location where a molecule exists and &lsquo;.&rsquo; for a location where no molecule exists.</p>