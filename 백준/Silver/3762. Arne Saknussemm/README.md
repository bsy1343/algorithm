# [Silver III] Arne Saknussemm - 3762

[문제 링크](https://www.acmicpc.net/problem/3762)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 46, 정답: 20, 맞힌 사람: 20, 정답 비율: 45.455%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Following the account of Jules Verne, a scrambled message written by the middle age alchemist Arne Saknussemm, and deciphered by professor Lidenbrock, started the incredible travel to the center of the Earth. The scrambling procedure used by Arne is alike the procedure given below.</p>

<p>1. Take a non empty message M that contains letters from the English alphabet, digits, commas, dots, quotes (i.e. &#39;), spaces and line breaks, and whose last character is different than space. For example, consider the following message whose translation reads &quot;In Sneffels&#39;s crater descend brave traveler, and touch the center of the Earth&quot;.</p>

<pre>
In Sneffels craterem descende audas
viator, et terrestre centrum attinges.</pre>

<p>2. Choose an integral number 0&lt;K&le;length(M) and add trailing spaces to M such that the length of the resulting message, say M&#39;, is the least multiple of K. For K=19 and the message above, where length(M)=74 (including the 8 spaces and the line break that M contains), two trailing spaces are added yielding the message M&#39; with length(M&#39;)=76.</p>

<p>3. Replace all the spaces from M&#39; by the character _ (underscore) ; replace all the line breaks from M&#39; by \ (backslash), and then reverse the message. In our case:</p>

<pre>
__.segnitta_murtnec_ertserret_te_,rotaiv\sadua_ednecsed_meretarc_sleffenS_nI</pre>

<p>4. Write the message that results from step 3 in a table with length(M&#39;)/K rows and K columns. The writing is column wise. For the given example, the message is written in a table with 76/19=4 rows and 19 columns as follows:&nbsp;</p>

<table class="table table-bordered" style="width:50%">
	<tbody>
		<tr>
			<td>_</td>
			<td>e</td>
			<td>t</td>
			<td>m</td>
			<td>n</td>
			<td>e</td>
			<td>e</td>
			<td>t</td>
			<td>_</td>
			<td>t</td>
			<td>\</td>
			<td>u</td>
			<td>d</td>
			<td>s</td>
			<td>m</td>
			<td>t</td>
			<td>_</td>
			<td>f</td>
			<td>S</td>
		</tr>
		<tr>
			<td>_</td>
			<td>g</td>
			<td>t</td>
			<td>u</td>
			<td>e</td>
			<td>r</td>
			<td>r</td>
			<td>_</td>
			<td>,</td>
			<td>a</td>
			<td>s</td>
			<td>a</td>
			<td>n</td>
			<td>e</td>
			<td>e</td>
			<td>a</td>
			<td>s</td>
			<td>f</td>
			<td>_</td>
		</tr>
		<tr>
			<td>.</td>
			<td>n</td>
			<td>a</td>
			<td>r</td>
			<td>c</td>
			<td>t</td>
			<td>r</td>
			<td>t</td>
			<td>r</td>
			<td>i</td>
			<td>a</td>
			<td>_</td>
			<td>e</td>
			<td>d</td>
			<td>r</td>
			<td>r</td>
			<td>l</td>
			<td>e</td>
			<td>n</td>
		</tr>
		<tr>
			<td>s</td>
			<td>i</td>
			<td>_</td>
			<td>t</td>
			<td>_</td>
			<td>s</td>
			<td>e</td>
			<td>e</td>
			<td>o</td>
			<td>v</td>
			<td>d</td>
			<td>e</td>
			<td>c</td>
			<td>_</td>
			<td>e</td>
			<td>c</td>
			<td>e</td>
			<td>n</td>
			<td>I</td>
		</tr>
	</tbody>
</table>

<p>5. The strings of characters that correspond to the rows of the table are the fragments of the scrambled message. The 4 fragments of Arne&#39;s message given in step 1 are:</p>

<pre>
_etmneet_t\udsmt_fS _gtuerr_,asaneeasf_
.narctrtria_edrrlen si_t_seeovdec_ecenI</pre>

<p>Write a program that deciphers non empty messages scrambled as described. The length of a message, before scrambling, is at most 1000 characters, including spaces and line breaks.&nbsp;</p>

### 입력

<p>The program input is from a text file where each data set corresponds to a scrambled message. A data set starts with an integer n, that shows the number of fragments of the scrambled message, and continues with n strings of characters that designate the fragments, in the order they appear in the table from step 4 of the scrambling procedure. Input data are separated by white-spaces and terminate with an end of file.</p>

### 출력

<p>The deciphered message must be printed on the standard output, from the beginning of a line and must be followed by an empty line as shown in the input/output sample below.&nbsp;</p>