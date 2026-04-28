# [Platinum I] Three towers - 18364

[문제 링크](https://www.acmicpc.net/problem/18364)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 64, 정답: 13, 맞힌 사람: 12, 정답 비율: 35.294%

### 분류

많은 조건 분기

### 문제 설명

<p>Bythony loves to play. In his room, he has arranged a row of n colored blocks. Each block is either white, gray, or black. Bythony would like to pick a contiguous segment in the row of blocks, and construct towers out of its blocks.</p>

<p>Each tower may consist of blocks of one color only, and the tower colors have to be distinct (thus, Bythony can construct at most three towers). Moreover, the heights of the towers, i.e., the numbers of blocks they consist of, also have to be unique. We assume that Bythony has to utilize all the blocks in his segment of choice. Help him out by writing a program that determines the longest contiguous segment of the row of blocks that satisfies these requirements.</p>

### 입력

<p>The first line of the standard input contains a single integer n (1 &le; n &le; 1 000 000), which specifies the number of blocks. The next line contains a string of n characters a<sub>1</sub>a<sub>2</sub> . . . a<sub>n</sub>, where a<sub>i</sub> is one of the three characters B, S, or C, and specifies the color of the i-th block in the row: B denotes white, S gray, and C black (these stand for Polish names of the colors: biały, szary, and czarny).</p>

<p>In tests worth 30% of the total score, an additional condition n &le; 2500 holds.</p>

### 출력

<p>The first and only line of the standard input should contain a single integer, equal to the number of blocks in the longest segment that satisfies Bythony&rsquo;s requirements.</p>

### 힌트

<p>Bythony can choose a segment of 6 blocks: BSSBCS, out of which he can construct a three blocks high gray tower, two blocks high white tower, and a one block high black tower.</p>