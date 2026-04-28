# [Platinum II] Injecting DNA - 16108

[문제 링크](https://www.acmicpc.net/problem/16108)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 66, 정답: 15, 맞힌 사람: 12, 정답 비율: 25.532%

### 분류

자료 구조, 문자열, 세그먼트 트리, 접미사 배열과 LCP 배열

### 문제 설명

<p>Last year, the Mountain Pine Beetles (Dendroctonus ponderosae) devastated the local forests. While studying the beetles, Debbie has made a big scientific discovery!</p>

<p>Human DNA is made up of four primary nucleobases: adenine (A), cytosine (C), guanine (G) and thymine (T). Beetle DNA is made up of twentysix primary nucleobases, represented by the uppercase letters of the alphabet. A strand of DNA is a sequence of nucleobases, and can be represented as a string of corresponding characters. The amazing discovery that Debbie made is that certain strands of beetle DNA can be inserted into human DNA in such a way that the human becomes immune to the common cold!</p>

<p>Unfortunately, there is a drawback. The beetle DNA is somewhat toxic to humans. After months of studying Debbie has concluded that the toxicity of a strand of DNA is related to the suffixes of the strand (note that we are only interested in nonempty suffixes). You must first take all suffixes of the strand and sort them in lexicographical order. Two suffixes are out of order if the longer suffix appears before the shorter suffix in this sorted order. The toxicity of any strand is 1 unit more than the number of (unordered) pairs of suffixes that are out of order. For example, consider this strand of beetle DNA: <code>BUBBLE</code>. Here are the suffixes of the strand in sorted order:</p>

<pre style="text-align: center;">
BBLE BLE BUBBLE E LE UBBLE</pre>

<p>There are eight pairs of suffixes that are out of order, so the toxicity of <code>BUBBLE</code> is 9 (8 + 1). The out of order suffix pairs are (<code>BLE</code>, <code>E</code>), (<code>BLE</code>, <code>LE</code>), (<code>BBLE</code>, <code>E</code>), (<code>BBLE</code>, <code>LE</code>), (<code>BBLE</code>, <code>BLE</code>), (<code>BUBBLE</code>, <code>E</code>), (<code>BUBBLE</code>, <code>LE</code>) and (<code>BUBBLE</code>, <code>UBBLE</code>).</p>

<p>There is a trade-off because the longer the strand is, the better it fights the common cold. Debbie has come up with a formula for the effectiveness of a strand of DNA. Let S be a DNA strand of length n.</p>

<ul>
	<li>if toxicity(S) &le; 10<sup>8</sup>, then effectiveness(S)&nbsp;= n(n-1)/toxicity(S)</li>
	<li>otherwise, effectiveness(S) = 0</li>
</ul>

<p>Debbie has extracted a piece of beetle DNA and has determined that any suffix of this strand is capable of fighting the common cold. Help Debbie decide which suffix of the strand has the highest effectiveness. If multiple suffixes have the same effectiveness, she will choose the longer one.</p>

### 입력

<p>The input consists of a single line containing one string, which is the strand of DNA that Debbie has chosen. The string contains only uppercase letters and has length at least 1 and at most 200 000.</p>

### 출력

<p>Display the length of the strand of DNA that Debbie will choose.</p>