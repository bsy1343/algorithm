# [Platinum II] Saint John Festival - 11686

[문제 링크](https://www.acmicpc.net/problem/11686)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 335, 정답: 146, 맞힌 사람: 109, 정답 비율: 42.412%

### 분류

기하학, 이분 탐색, 볼록 껍질, 볼록 다각형 내부의 점 판정

### 문제 설명

<p>Porto&rsquo;s Festa de S&atilde;o Jo&atilde;o is one of Europe&rsquo;s liveliest street festivals. Its peak is the night of 23rd to 24th of June, with dancing parties from Ribeira to Foz all night long.</p>

<p>Time to celebrate, with friends, relatives, neighbours or simply with other people in streets, armed with colored plastic hammers, huge garlic flowers or a bunch of lemongrass to gently greet passers-by. Fireworks, grilled sardines, barbecues, bonfires, potted basil plants (manjericos) and the sky covered by incandescent sky lanterns (bal&otilde;es de S.Jo&atilde;o) launched from every corner make this party unique.</p>

<p>The sky lanterns are made of thin paper and cannot be released until they are filled in with hot air. Sometimes they burn out still on ground or on the way up, if a sudden gust of wind catches them. For this reason, the successful launchers usually follow the movement of their sky lanterns, with a mixture of anxiety and joy, for as long as they can distinguish them in the sky.</p>

<p>We are not aware of any attempt to achieve a Guinness record of sky lanterns launched simultaneously (it could be dreadful night for firemen if there were).</p>

<p>Can you imagine, thousands of people preparing their sky lanterns for release at the city park, within a region of larger ones that will be launched simultaneously?</p>

<p>The large sky lanterns can be used to identify their positions in the sky afterwards, in order to count the surviving ones at an observation instant.</p>

<p>Given the positions of the large sky lanterns and the positions of the small ones, determine the number of small sky lanterns that are in the interior or on the boundary of some triangle defined by any three of the large ones.</p>

### 입력

<p>The first line has an integer L that defines the number of the large sky lanterns at the observation instant. Each of the following L lines contains a pair of integers separated by a space that gives the coordinates (x, y) of a large sky lantern. After that, there is a line with an integer S that defines the number of small sky lanterns and S lines, each defining&nbsp;the position of a small sky lantern. The height is irrelevant for us. All the given points are distinct and there are at least three points representing large sky lanterns that are not collinear.</p>

### 출력

<p>The output has a single line with the number of small sky lanterns that are in the interior or on the boundary of some triangle defined by any three of the large sky lanterns.</p>

### 제한

<ul>
	<li>3 &le; L &le; 10 000 Number of large sky lanterns.</li>
	<li>1 &le; S &le; 50 000 Number of small sky lanterns.</li>
	<li>0 &le; x, y &le; 2<sup>30</sup> Bounds for coordinates.</li>
</ul>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/11686.%E2%80%85Saint%E2%80%85John%E2%80%85Festival/6d5c1c62.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/11686.%E2%80%85Saint%E2%80%85John%E2%80%85Festival/6d5c1c62.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11686/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:290px; width:275px" /></p>