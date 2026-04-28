# [Platinum I] Term Generator - 3722

[문제 링크](https://www.acmicpc.net/problem/3722)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 5, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

구현, 문자열, 파싱, 재귀

### 문제 설명

<p>A formula has the syntax shown in figure 1(a). If a formula has the particular syntax given in figure 1(b) we say that the formula is in Normal Form (NF).</p>

<pre>
&lt;formula&gt;::= &lt;variable&gt; | (+&lt;formulae&gt;) | (*&lt;formulae&gt;)
&lt;variable&gt;::= a lower case letter from the English alphabet
&lt;formulae&gt;::= &lt;formula&gt; | &lt;formula&gt;&lt;formulae&gt;</pre>

<p>Figure 1. Formular syntax, Figure 1(a) The general syntax of a formula</p>

<pre>
&lt;NF_formula&gt;::= &lt;term&gt; | (+&lt;terms&gt;)
&lt;term&gt;::= &lt;variable&gt; | (*&lt;variables&gt;)
&lt;terms&gt;::= &lt;term&gt;&lt;term&gt; | &lt;term&gt;&lt;terms&gt;
&lt;variables&gt;::= &lt;variable&gt;&lt;variable&gt; | &lt;variable&gt;&lt;variables&gt;</pre>

<p>Figure 1. Formular syntax, Figure 1(b) The syntax of a NF formula</p>

<p>A formula is converted to NF according to the rewriting rules given below, where F represents a formula, S stands for a non empty sequence of formulae, and s and s&#39; denote possibly empty sequences of formulae. Applying a rewriting rule q&rarr;r on a formula F means to substitute by r a part of F that matches the pattern q, as shown in figure 2. The conversion terminates when no rewriting rule can be applied. The conversion terminates for any formula, and the result is unique regardless which rules are applied on which parts of the formula and in which order.</p>

<ol>
	<li>(+F)&rarr;F</li>
	<li>(*F)&rarr;F</li>
	<li>(+s(+S)s&#39;)&rarr;(+sSs&#39;)</li>
	<li>(*s(*S)s&#39;)&rarr;(*sSs&#39;)</li>
	<li>(*s(+FS)s&#39;)&rarr;(+(*sFs&#39;)(*s(+S)s&#39;))</li>
</ol>

<pre>
(+(*(+(*ab)(+a))b)) -1-&gt;
(+(*(+(*ab)a)b)) -5-&gt;
(+(+(*(*ab)b)(*(+a) b))) -1-&gt;
(+(+(*(*ab)b)(*ab))) -4-&gt;
(+(+(*abb)(*ab))) -1-&gt;
(+(*abb)(*ab))</pre>

<p>Figure 2. Converting a formula to NF</p>

<p>Let NF(F) be the normal form of the formula F. The problem is to write a term generator that for a given formula F and a number k outputs the next k terms from NF(F) in the order in which they appear in NF(F). If the terms are exhausted, the generator continues from the first term of NF(F). For example, consider F=(+(*(+(*ab)(+a))b)), and NF(F)=(+(*abb)(*ab)) as in figure 2. Generating the first term from NF(F) yields (*abb). Generating two more terms produces (*ab), (*abb). Notice that if NF(F) contains similar terms, as in the last example in figure 3, these terms are considered distinct.</p>

<p>Write a term generator that reads sets of data from the standard input.</p>

### 입력

<p>The content of a data set is F k<sub>1</sub>...k<sub>n</sub> 0, n&gt;0, where F is a formula, and k<sub>1</sub>...k<sub>n</sub> are long integers different than 0.</p>

<p>White spaces are used freely in the input.</p>

<p>Each formula F in the input has at most 150 characters and each term of NF(F) is at most 80 characters long, not counting white spaces.</p>

<p>The input data terminate with an end of file, and are correct.</p>

### 출력

<p>For each k<sub>i</sub>, i=1, n, the program generates the next |k<sub>i</sub>| terms from NF(F) and, if k<sub>i</sub>&nbsp;&gt; 0, prints these terms on the standard output.</p>

<p>Each printed term starts from the beginning of a line and there are no white spaces between the characters of the term.</p>

<p>The generated terms are not printed if k<sub>i</sub> &lt; 0.</p>