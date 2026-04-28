# [Gold III] Mosaicism - 8351

[문제 링크](https://www.acmicpc.net/problem/8351)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 41, 정답: 10, 맞힌 사람: 9, 정답 비율: 47.368%

### 분류

비트마스킹, 조합론, 수학

### 문제 설명

<p>Molecular biologists have been studying genomes (i.e. sequences of genes) of particular organisms, trying to infer some conclusions about evolution of species and operation of cells and tissues. In their research they compare the structure and functions of respective genes and they identify genes very similar to each other (called&nbsp;<b>homologous genes</b>).</p>

<p>Recently, while examining viruses attacking bacteria (called&nbsp;<b>bacteriophages</b>&nbsp;or simply&nbsp;<b>phages</b>), they observed a very intriguing phenomenon. If sequences of genes of some phages are arranged one below another and homologous genes are coloured with the same colour, then a peculiar mosaic is obtained:</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/f8769804-66a4-40d7-ab38-31f719dad2a0/-/preview/" /></p>

<p>To describe the phenomenon that they discovered, scientists invented a measure that they called&nbsp;<b>the coefficient of mosaicism</b>. This coefficient can be computed for a phage only in juxtaposition with some other phages - it is then equal to the total number of points computed in the following way. For every two genes <em>A</em>, <em>B</em> from the <em>i</em>-th phage and for every two different phages <em>j</em>, <em>k</em>&nbsp;such that:</p>

<ul>
	<li>gene <em>A</em>&nbsp;has some homologous gene in the <em>j</em>-th phage and does not have homologous genes in <em>k</em>-th phage,</li>
	<li>gene <em>B</em>&nbsp;has some homologous gene in the <em>k</em>-th phage and does not have homologous genes in the <em>j</em>-th phage,</li>
</ul>

<p>the <em>i</em>-th phage (<em>i</em> &ne; <em>j</em>&nbsp;and <em>i</em> &ne; <em>k</em>) receives 1&nbsp;point. Each quadruple <em>A</em>, <em>B</em>, <em>j</em>, <em>k</em>&nbsp;is counted exactly once in the summation, i.e. quadruples <em>A</em>, <em>B</em>, <em>j</em>, <em>k</em>&nbsp;and <em>B</em>, <em>A</em>, <em>k</em>, <em>j</em>&nbsp;are considered the same.</p>

<p>In the situation illustrated in the above figure, phage number 3&nbsp;has the coefficient of mosaicism equal to 2. That is because the blue gene has a homologous gene in phage 1&nbsp;and does not have any in phage 2; on the other hand, the orange gene has a homologous gene in phage 2&nbsp;and does not have any in phage 1. A similar situation holds for genes: brown and orange. Phage number 1&nbsp;has the coefficient of mosaicism equal to 6&nbsp;- it receives points for pairs of genes: red-blue, red-brown, 2 times yellow-blue and 2 times yellow-brown.</p>

<p>Manual computation of the coefficients is quite difficult, so the biologists decided to ask you to write a program that would compute the coefficients of mosaicism of all given phages.</p>

<p>Write a program that:</p>

<ul>
	<li>reads the descriptions of pairs of homologous genes in a set of phages from the standard input,</li>
	<li>computes the coefficients of mosaicism for all phages,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>The first line of input contains one integer <em>n</em>&nbsp;(3 &le; <em>n</em> &le; 300) denoting the number of phages under consideration.</p>

<p>The <em>i</em>-th of the following <em>n</em>&nbsp;lines contains a description of the sequence of genes of the <em>i</em>-th phage. Each such description starts with a single integer <em>l<sub>i</sub></em>&nbsp;(1 &le; <em>l<sub>i</sub></em> &le; 300) denoting the number of genes in the <em>i</em>-th phage&#39;s sequence, which is followed by <em>l<sub>i</sub></em>&nbsp;integers <em>a<sub>ij</sub></em>&nbsp;(1 &le; <em>a<sub>ij</sub></em> &le; 100 000) describing its successive genes. All these numbers are separated with single spaces.</p>

<p>Two genes are considered homologous if and only if they are represented by equal numbers in the description from the input. The scientists proved that no two genes of a phage can be homologous<sup>1</sup>, so no number can appear an a description of a single phage twice.</p>

<p>&nbsp;</p>

<p><sup>1</sup>In reality, appearance of two homologous genes in a single phage is quite improbable.</p>

### 출력

<p>The output should consist of <em>n</em>&nbsp;lines. <em>i</em>-th of them should contain a single integer equal to the coefficient of mosaicism of the&nbsp;<em>i</em>-th phage.</p>