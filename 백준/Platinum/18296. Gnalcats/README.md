# [Platinum III] Gnalcats - 18296

[문제 링크](https://www.acmicpc.net/problem/18296)

### 성능 요약

시간 제한: 0.3 초, 메모리 제한: 512 MB

### 통계

제출: 74, 정답: 29, 맞힌 사람: 28, 정답 비율: 50.000%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 구현, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Researchers have discovered a new form of life they have named Gnalcats. Gnalcats have a very strange form of DNA and proteins but the researchers have understood how they work. They are now trying to classify species of Gnalcats by comparing their DNA.</p>

<p>A gene of their DNA is a sequence of bases. These genes operate on proteins, which are extremely long chains of amino-acids (a &minus; b &minus; c &minus; . . .). Amino-acids are either simple or complex (composed of two other amino-acids). Proteins always contain several billions of amino-acids.</p>

<p>Genes operate on proteins in the following way: the seven different bases (C, D, L, P, R, S, U) correspond to different transformations on the protein. The result of the operation of a gene on a protein is obtained as the combination of the individual transformations by each base of the gene: the first base of the gene transforms the input protein, the resulting protein is then transformed according to the second base of the gene, and so on. Life is not perfect and thus one of these transformations may fail, in which case the overall transformation fails. If, at any point in the transformation, the protein is reduced to a chain of three or fewer amino-acids (simple or complex) then the transformation fails.</p>

<p>The effect of each base is described in the following table where X denotes the tail of the protein, while a, b, and c are amino-acids (either simple or complex):</p>

<table class="table table-bordered" style="width:100%;">
	<thead>
		<tr>
			<th style="text-align: center;">base</th>
			<th style="text-align: center;">input protein</th>
			<th style="text-align: center;">output protein</th>
		</tr>
	</thead>
	<tbody>
		<tr>
			<th style="text-align: center;">C</th>
			<td style="text-align: right;">a &minus; X</td>
			<td>a &minus; a &minus; X</td>
		</tr>
		<tr>
			<th style="text-align: center;">D</th>
			<td style="text-align: right;">a &minus; X</td>
			<td>X</td>
		</tr>
		<tr>
			<th style="text-align: center;">L</th>
			<td style="text-align: right;">a &minus; X</td>
			<td>b &minus; X (if a is the complex amino-acid &lt;b, c&gt;)<br />
			fail (if a is a simple amino-acid)</td>
		</tr>
		<tr>
			<th style="text-align: center;">P</th>
			<td style="text-align: right;">a &minus; b &minus; X</td>
			<td>c &minus; X where c is the complex amino-acid &lt;a, b&gt;</td>
		</tr>
		<tr>
			<th style="text-align: center;">R</th>
			<td style="text-align: right;">a &minus; X</td>
			<td>c &minus; X (if a is the complex amino-acid &lt;b, c&gt;)<br />
			fail (if a is a simple amino-acid)</td>
		</tr>
		<tr>
			<th style="text-align: center;">S</th>
			<td style="text-align: right;">a &minus; b &minus; X</td>
			<td>b &minus; a &minus; X</td>
		</tr>
		<tr>
			<th style="text-align: center;">U</th>
			<td style="text-align: right;">a &minus; X</td>
			<td>b &minus; c &minus; X (if a is the complex amino-acid &lt;b, c&gt;)<br />
			fail (if a is a simple amino-acid)</td>
		</tr>
	</tbody>
</table>

<p>For example, the gene PSDSPCRPSDUL transforms a protein like this:</p>

<ul>
	<li>the input protein is a &minus; b &minus; c &minus; d &minus; e &minus; f &minus; . . .</li>
	<li>then applying the rule for the first P produces: &lt;a, b&gt; &minus; c &minus; d &minus; e &minus; f &minus; . . .</li>
	<li>then applying the rule for S produces: c &minus; &lt;a, b&gt; &minus; d &minus; e &minus; f &minus; . . .</li>
	<li>then D gives: &lt;a, b&gt; &minus; d &minus; e &minus; f &minus; . . .</li>
	<li>then S gives: d &minus; &lt;a, b&gt; &minus; e &minus; f &minus; . . .</li>
	<li>then P gives: &lt;d,&lt;a, b&gt;&gt; &minus; e &minus; f &minus; . . .</li>
	<li>then C gives: &lt;d,&lt;a, b&gt;&gt; &minus; &lt;d,&lt;a, b&gt;&gt;&nbsp;&minus; e &minus; f &minus; . . .</li>
	<li>then R gives: &lt;a, b&gt; &minus; &lt;d,&lt;a, b&gt;&gt; &minus; e &minus; f &minus; . . .</li>
	<li>then P gives: &lt;&lt;a, b&gt;,&lt;d,&lt;a, b&gt;&gt;&gt; &minus; e &minus; f &minus; . . .</li>
	<li>then S gives: e &minus; &lt;&lt;a, b&gt;,&lt;d,&lt;a, b&gt;&gt;&gt; &minus; f &minus; . . .</li>
	<li>then D gives: &lt;&lt;a, b&gt;,&lt;d,&lt;a, b&gt;&gt;&gt; &minus; f &minus; . . .</li>
	<li>then U gives: &lt;a, b&gt; &minus; &lt;d,&lt;a, b&gt;&gt; &minus; f &minus; . . .</li>
	<li>and finally L gives: a &minus; &lt;d,&lt;a, b&gt;&gt; &minus; f &minus; . . .</li>
</ul>

<p>You are given two genes, and you must decide whether they are equivalent. Two genes are equivalent if for every input protein composed of at least one billion of simple amino-acids, either the application of both genes produces the same output protein, or both applications fail.</p>

### 입력

<p>The input consists of two lines, each representing a Gnalcats gene.</p>

### 출력

<p>The output consists of a single word: &ldquo;True&rdquo; if the genes are equivalent, &ldquo;False&rdquo; otherwise.</p>

### 제한

<p>Each gene contains at least one base. The sum of the length of input genes is not greater than 10<sup>4</sup>.</p>