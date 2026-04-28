# [Silver I] Taxing Problem - 13520

[문제 링크](https://www.acmicpc.net/problem/13520)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 52, 정답: 24, 맞힌 사람: 22, 정답 비율: 44.000%

### 분류

구현, 이분 탐색

### 문제 설명

<p>George has won the lottery and, being a nice guy, has decided to spread the wealth around.&nbsp;However, monetary gifts can be taxed once they get over a certain size&mdash;the amount of tax&nbsp;depends on how much his friends have earned that year.</p>

<p>The amount of tax paid depends on tax bands. The bands start at zero. Each one takes a certain&nbsp;cut of income from the range of pre-tax income it covers. The final tax band applies to all&nbsp;income above its lower bound.</p>

<p>George is a savvy fellow and knows the number of tax bands, the amount of money each friend&nbsp;has earned and the amount he wants each friend to walk away with.</p>

<p>How much should George give to each friend before tax?</p>

### 입력

<ul>
	<li>One line containing an integer B (1 &le; B &le; 20): the number of tax bands.</li>
	<li>B further lines, each containing two real numbers: s<sub>i</sub> (0 &lt; s<sub>i</sub> &le; 10<sup>6</sup>): the size in pounds&nbsp;of the ith tax band, and p<sub>i</sub> (0 &le; p<sub>i</sub> &le; 100): the percentage taxation for that band.</li>
	<li>One line containing a real number P (0 &le; P &le; 99.999): the percentage tax on all income&nbsp;above other bands.</li>
	<li>One line containing an integer F, (0 &lt; F &le; 20): the number of friends George wants to&nbsp;pay.</li>
	<li>F further lines, each containing two real numbers e<sub>j</sub> and m<sub>j</sub> (0 &le; e<sub>j</sub> &le; 10<sup>6</sup>, 0 &lt; m<sub>j</sub> &le;&nbsp;10<sup>6</sup>): the amount of money the jth friend has earned, and the amount of money they should&nbsp;receive after tax respectively.</li>
</ul>

<p>Tax bands will be given in increasing order.</p>

### 출력

<ul>
	<li>F lines, one for each friend specified in the input and in the same order.</li>
</ul>

<p>Each line should contain one real number: the amount of money George will give to his&nbsp;friend, in order to arrive at the correct amount after they have paid tax.<br />
All output must be accurate to an absolute or relative error of at most 10<sup>&minus;6</sup>.</p>