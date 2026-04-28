# [Silver I] Adolescent Architecture - 20901

[문제 링크](https://www.acmicpc.net/problem/20901)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 159, 정답: 91, 맞힌 사람: 77, 정답 비율: 60.630%

### 분류

수학, 정렬, 기하학

### 문제 설명

<p>Little Peter is building a stack out of his toy blocks. He is using two kinds of blocks -- cubes and cylinders -- and wants to stack all of them into a single tower, where each block other than the topmost block has a single block standing on it. In order for the tower to be stable, the outline of each block needs to be fully contained within the outline of the block below when looking at the tower from above (the outlines are allowed to touch). Is it possible to construct such a tower, and if so, in which order do the blocks need to be stacked?</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($1 \le n \le 100$), the number of blocks.</li>
	<li>$n$ lines, each with the description of a block. The description consists of a string giving the type of block (<code>cube</code> or <code>cylinder</code>) and an integer $a$ ($1 \le a \le 1\,000$) giving the size of the block -- if the block is a cube then $a$ is its side length, and if it is a cylinder then $a$ is the radius of its base (note that the height of the cylinder does not matter).</li>
</ul>

### 출력

<p>If there is no way to construct the tower, output <code>impossible</code>. Otherwise output $n$ lines, giving the order in which to stack the blocks from top to bottom.</p>