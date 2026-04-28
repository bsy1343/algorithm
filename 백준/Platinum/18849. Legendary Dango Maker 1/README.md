# [Platinum I] Legendary Dango Maker 1 - 18849

[문제 링크](https://www.acmicpc.net/problem/18849)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 50, 정답: 21, 맞힌 사람: 19, 정답 비율: 50.000%

### 분류

무작위화, 휴리스틱, 담금질 기법

### 문제 설명

<p>You are a professional making delicious rice dumplings, called dangos. Now you are skewering dangos with sticks.</p>

<p>Dangos are located in a rectangular grid of cells with R rows and C columns. Each cell contains one dango. The color of a dango is pink (P), white (W), or green (G). You will choose three consecutive dangos in the vertical direction (from top to bottom), the horizontal direction (from left to right), or the oblique direction (from left-top to right-bottom, or from right-top to left-bottom). Then you will take three dangos from these cells from end to end, and skewer them to a stick in order, to get a <strong>stick of dangos</strong>. For example, if you choose three consecutive dangos in the vertical direction, you can take dangos from top-middle-bottom or bottom-middle-top cells, in this order, and skewer them to a stick. You cannot take dangos from middle-bottom-top or bottom-top-middle cells. Moreover, you cannot skewer a dango to more than one stick.</p>

<p>A stick of dangos is <strong>beautiful</strong> if the colors of the dangos in the stick are pink-white-green or green-whitepink, in this order. You want to make as many beautiful sticks of dangos as possible.</p>

<p>How many beautiful sticks of dangos can you make?</p>

### 입력

<p>For this task, there is <a href="https://upload.acmicpc.net/1735771f-e169-41bc-a938-21b83c1739a0/">one input data</a>.</p>

<p>The input is given in the following format.</p>

<pre>
R C
D<sub>1</sub>
.
.
.
D<sub>R</sub></pre>

<p>Here D<sub>i</sub> (1 &le; i &le; R) is a string of length C consisting of P, W, and G. The j-th character (1 &le; j &le; C) of D<sub>i</sub> is the color of the dango in the cell located in the i-th row from the top and the j-th column from the left.</p>

### 출력

<p>The format of the output data is as follows.</p>

<pre>
S<sub>1</sub>
.
.
.
S<sub>R</sub></pre>

<p>Here S<sub>i</sub> (1 &le; i &le; R) is a string of length C consisting of <code>P</code>, <code>W</code>, <code>G</code>, <code>|</code>, <code>-</code>, <code>\</code>, and <code>/</code>. The j-th character (1 &le; j &le; C) of S<sub>i</sub> describes how to skewer the dango in the cell located in the i-th row from the top and the j-th column from the left.</p>

<ul>
	<li>The j-th character of S<sub>i</sub> is the character <code>|</code> if you will make a beautiful stick of dangos using the dangos in that cell, the adjacent cell <strong>above</strong>, and the adjacent cell <strong>below</strong>.</li>
	<li>The j-th character of S<sub>i</sub> is the character <code>-</code> if you will make a beautiful stick of dangos using the dangos in that cell, the adjacent cell to the <strong>left</strong>, and the adjacent cell to the <strong>right</strong>.</li>
	<li>The j-th character of S<sub>i</sub> is the character <code>\</code> if you will make a beautiful stick of dangos using the dangos in that cell, the touching cell <strong>left above</strong>, and the touching cell <strong>right below</strong>.</li>
	<li>The j-th character of S<sub>i</sub> is the character <code>/</code> if you will make a beautiful stick of dangos using the dangos in that cell, the touching cell <strong>right above</strong>, and the touching cell <strong>left below</strong>.</li>
	<li>Otherwise, the j-th character of S<sub>i</sub> is <code>P</code>, <code>W</code>, or <code>G</code> according the color of the dango in that cell, i.e. it is the same as the j-th character of D<sub>i</sub>.</li>
</ul>

### 제한

<ul>
	<li>3 &le; R &le; 500.</li>
	<li>3 &le; C &le; 500.</li>
	<li>D<sub>i</sub> (1 &le; i &le; R) is a string of length C consisting of P, W, and G.</li>
</ul>