# [Platinum V] Nets of Dice - 22824

[문제 링크](https://www.acmicpc.net/problem/22824)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 12, 정답: 8, 맞힌 사람: 8, 정답 비율: 66.667%

### 분류

구현

### 문제 설명

<p>In mathematics, some plain words have special meanings. The word &quot;<i>net</i>&quot; is one of such technical terms. In mathematics, the word &quot;<i>net</i>&quot; is sometimes used to mean a plane shape which can be folded into some solid shape.</p>

<p>The following are a solid shape (Figure 1) and one of its&nbsp;<i>net</i>&nbsp;(Figure 2).</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/552de1d1-e814-426f-8d7f-93f284a12827/-/preview/" /></p>

<p style="text-align: center;">Figure 1: a prism</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/2c98a684-2450-4cef-acd4-240989e965f1/-/preview/" /></p>

<p style="text-align: center;">Figure 2: a net of a prism</p>

<p>Nets corresponding to a solid shape are not unique. For example, Figure 3 shows three of the nets of a cube.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/d03771a8-ecc7-4fe5-ad71-d37a57a5d61a/-/preview/" /></p>

<p style="text-align: center;">Figure 3: examples of nets of a cube</p>

<p>In this problem, we consider nets of dice. The definition of a die is as follows.</p>

<ol>
	<li>A die is a cube, each face marked with a number between one and six.</li>
	<li>Numbers on faces of a die are different from each other.</li>
	<li>The sum of two numbers on the opposite faces is always 7.</li>
</ol>

<p>Usually, a die is used in pair with another die. The plural form of the word &quot;die&quot; is &quot;dice&quot;.</p>

<p>Some examples of proper nets of dice are shown in Figure 4, and those of improper ones are shown in Figure 5.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/b5c83f73-84e6-4669-a58d-4b9be2ef3180/-/preview/" /></p>

<p style="text-align: center;">Figure 4: examples of proper nets of dice</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/cc281101-db7a-4783-9cf9-29ef841420ef/-/preview/" /></p>

<p style="text-align: center;">Figure 5: examples of improper nets</p>

<p>The reasons why each example in Figure 5 is improper are as follows.</p>

<ol style="list-style-type:lower-alpha;">
	<li>The sum of two numbers on the opposite faces is not always 7.</li>
	<li>Some faces are marked with the same number.</li>
	<li>This is not a net of a cube. Some faces overlap each other.</li>
	<li>This is not a net of a cube. Some faces overlap each other and one face of a cube is not covered.</li>
	<li>This is not a net of a cube. The plane shape is cut off into two parts. The face marked with &#39;2&#39; is isolated.</li>
	<li>This is not a net of a cube. The plane shape is cut off into two parts.</li>
	<li>There is an extra face marked with &#39;5&#39;.</li>
</ol>

<p>Notice that there are two kinds of dice. For example, the solid shapes formed from the first two examples in Figure 4 are mirror images of each other.</p>

<p>Any net of a die can be expressed on a sheet of 5x5 mesh like the one in Figure 6. In the figure, gray squares are the parts to be cut off. When we represent the sheet of mesh by numbers as in Figure 7, squares cut off are marked with zeros.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/450b485e-edb8-45b3-9358-0324e01db064/-/preview/" /></p>

<p style="text-align: center;">Figure 6: 5x5 mesh</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/1844b81c-bafc-4246-84a7-9469e4da1330/-/preview/" /></p>

<p style="text-align: center;">Figure 7: representation by numbers</p>

<p>Your job is to write a program which tells the proper nets of a die from the improper ones automatically.</p>

### 입력

<p>The input consists of multiple sheets of 5x5 mesh.</p>

<pre>
<i>N</i>
<i>Mesh</i><sub>0</sub>
<i>Mesh</i><sub>1</sub>
...
<i>Mesh</i><sub><i>N</i>-1</sub>
</pre>

<p><i>N</i>&nbsp;is the number of sheets of mesh. Each&nbsp;<i>Mesh<sub>i</sub></i>&nbsp;gives a sheet of mesh on which a net of a die is expressed.&nbsp;<i>Mesh<sub>i</sub></i>&nbsp;is in the following format.</p>

<p>&nbsp;</p>

<pre>
<i>F</i><sub>00</sub> <i>F</i><sub>01</sub> <i>F</i><sub>02</sub> <i>F</i><sub>03</sub> <i>F</i><sub>04
</sub><i>F</i><sub>10</sub> <i>F</i><sub>11</sub> <i>F</i><sub>12</sub> <i>F</i><sub>13</sub> <i>F</i><sub>14
</sub><i>F</i><sub>20</sub> <i>F</i><sub>21</sub> <i>F</i><sub>22</sub> <i>F</i><sub>23</sub> <i>F</i><sub>24
</sub><i>F</i><sub>30</sub> <i>F</i><sub>31</sub> <i>F</i><sub>32</sub> <i>F</i><sub>33</sub> <i>F</i><sub>34
</sub><i>F</i><sub>40</sub> <i>F</i><sub>41</sub> <i>F</i><sub>42</sub> <i>F</i><sub>43</sub> <i>F</i><sub>44</sub></pre>

<p>Each&nbsp;<i>F<sub>ij</sub></i>&nbsp;is an integer between 0 and 6. They are separated by a space character.</p>

### 출력

<p>&nbsp;</p>

<p>For each&nbsp;<i>Mesh<sub>i</sub></i>, the truth value,&nbsp;<i>true</i>&nbsp;or&nbsp;<i>false</i>, should be output, each in a separate line. When the net of a die expressed on the&nbsp;<i>Mesh<sub>i</sub></i>&nbsp;is proper, output &quot;true&quot;. Otherwise, output &quot;false&quot;.</p>