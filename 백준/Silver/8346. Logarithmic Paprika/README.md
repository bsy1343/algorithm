# [Silver I] Logarithmic Paprika - 8346

[문제 링크](https://www.acmicpc.net/problem/8346)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 21, 맞힌 사람: 21, 정답 비율: 67.742%

### 분류

수학

### 문제 설명

<p>The best selling vegetable in Byteland is logarithmic paprika. As the name of this great vegetable suggests, the weight of each paprika is the power of 2&nbsp;grams. The lightest paprika weighs 2<sup>0</sup>&nbsp;grams, while the largest one weighs 2<em><sup>k</sup></em>&nbsp;grams.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/8346.%E2%80%85Logarithmic%E2%80%85Paprika/fe43f39a.png" data-original-src="https://upload.acmicpc.net/4a47d5b8-3f08-476f-bb85-bd8ca44d89cf/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 320px; height: 240px;" /></p>

<p>Residents of Byteland don&#39;t like buying pieces of paprika and so salesmen are forced to sell only whole paprika. What is more, bytean people are very exact and they do not tolerate situations when salesman is not able to sell the exact weight of paprika they are willing to buy. This causes stress among all salesmen of Byteland - some cases of insomnia have been observed as well. One of your friends, who owns vegetable garden, asked you to write a program which is supposed to help salesmen.</p>

<p>Write a program which:</p>

<ul>
	<li>reads a description of the current stock of paprika from the standard input,</li>
	<li>determines the smallest weight of a paprika that cannot be weighed without cutting any paprika,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>The first line of the input contains one integer <em>k</em>&nbsp;(1 &le; <em>k</em> &le; 10), meaning that weights of available paprika are from the set 2<sup>0</sup>, 2<sup>1</sup>, ..., 2<em><sup>k</sup></em>. Second line contains <em>k</em> + 1&nbsp;positive integers <em>p</em><sub>0</sub>, <em>p</em><sub>1</sub>, ..., <em>p<sub>k</sub></em>&nbsp;not greater than 1 000, separated with single spaces and representing the current stock: <em>p</em><sub>0</sub>&nbsp;paprika of weight 1&nbsp;gram,&nbsp;<em>p</em><sub>1</sub>&nbsp;- of weight 2&nbsp;grams, ...,&nbsp;<em>p<sub>k</sub></em>&nbsp;- of weight 2<em><sup>k</sup></em>&nbsp;grams.</p>

### 출력

<p>The first and only line of the output should contain one positive integer <em>x</em>&nbsp;- the smallest weight that cannot be weighed without cutting any paprika.</p>

### 힌트

<p>All weights from 1&nbsp;to 8&nbsp;can be weighed using paprika on the stock: 1 = 1, 2 = 1 + 1, 3 = 1 + 2, 4 = 4, 5 = 1 + 4, 6 = 1 + 1 + 4, 7 = 1 + 2 + 4, 8 = 1 + 1 + 2 + 4. Value 9&nbsp;can not be weighed, therefore it is the answer to the example.</p>