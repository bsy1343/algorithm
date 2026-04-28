# [Gold III] Splitting DNA - 18305

[문제 링크](https://www.acmicpc.net/problem/18305)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 40, 정답: 24, 맞힌 사람: 22, 정답 비율: 75.862%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You are studying a protein that splits long chains of DNA into smaller chains. This protein works in the following way: to split a long chain of DNA, the protein first &ldquo;reads&rdquo; the whole chain and cuts it into two (non-necessarily equal) parts and, then, recursively splits the two smaller chains.</p>

<p>Splitting a chain S<sub>1</sub>S<sub>2</sub> into the two parts S<sub>1</sub> and S<sub>2</sub> takes an amount of energy proportional to the length of S<sub>1</sub>S<sub>2</sub> (which is the sum of the lengths of S1 and S<sub>2</sub>). More generally, splitting a chain S<sub>1</sub> . . . S<sub>N</sub>&nbsp;(N &gt; 1) takes an energy proportional to the length of S<sub>1</sub> . . . S<sub>N</sub> to cut it into two, plus the energy required to recursively split the two smaller chains.</p>

<p>You know the original DNA chain S<sub>1</sub> . . . S<sub>N</sub> and the N fragments S<sub>1</sub>, . . . , S<sub>N</sub> obtained after the split. Since nature is usually very energy-efficient, you wonder what the minimal energy required to split the DNA chain is.</p>

<p>You noticed that the computation of this minimal energy only depends on L<sub>1</sub>, . . . , L<sub>N</sub> where L<sub>i</sub> is the length of S<sub>i</sub>. Given these N integers L<sub>1</sub>, . . . , L<sub>N</sub>, you want to compute the minimal energy required by the protein to split the long chain into these chunks.</p>

### 입력

<p>The input consists of two lines:</p>

<ul>
	<li>on the first line: the number N of strings, an integer;</li>
	<li>on the second line: N space-separated integers representing L<sub>1</sub>, . . . , L<sub>N</sub>.</li>
</ul>

### 출력

<p>The output should contain a single line with a single integer, the minimal total energy required to split the original chain.</p>

### 제한

<ul>
	<li>1 &le;&nbsp;N &le; 500;</li>
	<li>0 &le; L<sub>i</sub> &le; 10<sup>14</sup> for all 1 &le; i &le; N.</li>
</ul>